package {{packageName}}

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.GradientDrawable
import android.graphics.pdf.PdfRenderer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.ParcelFileDescriptor
import android.text.InputType
import android.util.Log
import android.util.SparseArray
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import java.io.File
import java.io.InputStream
import java.util.TreeSet
import java.util.concurrent.Future
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * Native PDF reader: continuous vertical scrolling or book-like horizontal paging, pinch and
 * double-tap zoom with sharp viewport tiles, fast scrolling, go-to-page, bookmarks, night mode,
 * remembered reading position and optional share/save/print.
 *
 * Only attached pages keep a (bounded) raster, and the document is read from a seekable file,
 * so large PDFs never become one big byte array on the heap.
 */
class PdfDocumentView @JvmOverloads constructor(
    context: Context,
    val options: PdfReaderOptions = PdfReaderOptions(),
    stateKey: String? = null
) : FrameLayout(context) {
    private val main = Handler(Looper.getMainLooper())
    private val worker = ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, LinkedBlockingQueue())
    private val store = PdfReaderStore(context, stateKey)
    private val density = resources.displayMetrics.density
    private val horizontalMode = options.isHorizontal
    private val systemNight = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    internal val darkChrome = when (options.colorMode) {
        "dark" -> true
        "light" -> false
        else -> systemNight
    }
    private val chromeBackground = if (darkChrome) Color.argb(240, 32, 33, 36) else Color.argb(245, 255, 255, 255)
    private val chromeForeground = if (darkChrome) Color.WHITE else Color.rgb(32, 33, 36)

    private val list = ZoomRecyclerView(context)
    private val manager = LinearLayoutManager(context, if (horizontalMode) RecyclerView.HORIZONTAL else RecyclerView.VERTICAL, false)
    private val pageAdapter = Pages()
    private val ratios = SparseArray<Double>()
    private var defaultRatio = sqrt(2.0)
    private val holders = mutableSetOf<PageHolder>()
    private var renderer: PdfRenderer? = null // worker only
    private var descriptor: ParcelFileDescriptor? = null
    private var temporary: File? = null
    @Volatile private var released = false
    private var opened = false
    private var restoredPage = -1
    private var restoredFraction = 0f
    private var restoredNight: Boolean? = null
    private var lastReportedPage = -1
    private var chromeVisible = true
    private val bookmarks = TreeSet<Int>()

    private val loading = LinearLayout(context)
    private val status = TextView(context)
    private val progress = ProgressBar(context)
    private val pageChip = TextView(context)
    private val fastScroller: PdfFastScroller? =
        if (options.fastScroll && !horizontalMode) PdfFastScroller(context, options.accentColor) else null
    private var toolbar: LinearLayout? = null
    private var pageLabel: TextView? = null
    private var previousButton: ImageButton? = null
    private var nextButton: ImageButton? = null
    private var bookmarkButton: ImageButton? = null
    private val hideChip = Runnable { pageChip.animate().alpha(0f).setDuration(250).start() }
    private val detailRunnable = Runnable { refreshDetails() }

    /** The seekable file being displayed; valid until [release]. */
    var documentFile: File? = null
        private set
    var pageCount = 0
        private set
    var isNight = false
        private set
    var onReady: (() -> Unit)? = null
    var onError: (() -> Unit)? = null
    var onPageChanged: ((Int) -> Unit)? = null
    /** A confirmed single tap on the pages (not a double-tap zoom); hosts toggle their own chrome with it. */
    var onSingleTap: (() -> Unit)? = null
    /** Export actions appear only when [PdfReaderOptions.allowExport] is set and a handler exists. */
    var onShare: ((File) -> Unit)? = null
    var onSave: ((File) -> Unit)? = null
    var onPrint: ((File) -> Unit)? = null

    val pageList: RecyclerView get() = list
    val zoom: Float get() = list.zoom
    val renderedPageCount: Int get() = holders.count { it.page.base != null }
    val detailTileCount: Int get() = holders.count { it.page.detail != null }
    val bookmarkedPages: List<Int> get() = bookmarks.toList()

    val currentPage: Int
        get() {
            if (pageCount == 0) return 0
            val window = list.visibleWindow()
            if (!horizontalMode && !list.canScrollVertically(1) && list.panY <= list.height * (1f - list.zoom) + 1f) {
                return manager.findLastVisibleItemPosition().takeIf { it != RecyclerView.NO_POSITION } ?: 0
            }
            val x = (window.left + window.right) / 2f
            val y = if (horizontalMode) (window.top + window.bottom) / 2f else window.top + window.height * 0.25f
            return pageAt(x, y) ?: manager.findFirstVisibleItemPosition().coerceAtLeast(0)
        }

    init {
        isNight = store.night ?: when (options.nightMode) {
            PdfReaderOptions.NIGHT_ON -> true
            PdfReaderOptions.NIGHT_SYSTEM -> systemNight
            else -> false
        }
        updateBackground()

        list.layoutManager = manager
        list.adapter = pageAdapter
        list.itemAnimator = null
        list.setItemViewCacheSize(0)
        list.recycledViewPool.setMaxRecycledViews(0, 4)
        list.vertical = !horizontalMode
        list.continuous = !horizontalMode
        list.zoomEnabled = options.zoomEnabled
        list.overScrollMode = View.OVER_SCROLL_NEVER
        if (horizontalMode) PagerSnapHelper().attachToRecyclerView(list)
        list.onSingleTap = {
            toggleChrome()
            onSingleTap?.invoke()
        }
        list.onTransformChanged = { onViewportMoved() }
        list.onTransformSettled = {
            scheduleDetail()
            savePosition()
        }
        list.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dx != 0 || dy != 0) onViewportMoved()
            }

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    scheduleDetail()
                    savePosition()
                    updatePageUi()
                }
            }
        })
        addView(list, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))

        fastScroller?.let { scroller ->
            scroller.label = { fraction ->
                context.getString(R.string.pdf_document_page_short, PdfReaderMath.pageForFraction(fraction, pageCount) + 1, pageCount)
            }
            scroller.onScrub = { fraction -> jumpTo(PdfReaderMath.pageForFraction(fraction, pageCount)) }
            scroller.onScrubEnd = { savePosition() }
            addView(scroller, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        }

        pageChip.apply {
            setTextColor(chromeForeground)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f)
            setPadding(dp(12), dp(6), dp(12), dp(6))
            background = GradientDrawable().apply {
                cornerRadius = dp(16).toFloat()
                setColor(chromeBackground)
            }
            elevation = dp(3).toFloat()
            alpha = 0f
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        addView(pageChip, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,
            Gravity.TOP or Gravity.CENTER_HORIZONTAL).apply { topMargin = dp(12) })

        loading.orientation = LinearLayout.VERTICAL
        loading.gravity = Gravity.CENTER
        loading.setPadding(dp(32), dp(32), dp(32), dp(32))
        progress.isIndeterminate = true
        progress.indeterminateTintList = ColorStateList.valueOf(options.accentColor)
        loading.addView(progress, LinearLayout.LayoutParams(dp(40), dp(40)))
        status.text = context.getString(R.string.pdf_document_loading)
        status.setTextColor(if (darkChrome || isNight) Color.WHITE else Color.rgb(32, 33, 36))
        status.gravity = Gravity.CENTER
        status.setPadding(0, dp(12), 0, 0)
        loading.addView(status, LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        addView(loading, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, Gravity.CENTER))

        if (options.showToolbar) buildToolbar()
    }

    private fun dialogTheme() =
        if (darkChrome) android.R.style.Theme_Material_Dialog_Alert else android.R.style.Theme_Material_Light_Dialog_Alert

    private fun dp(value: Int) = (value * density).roundToInt()
    private fun gap() = dp(8)

    private fun updateBackground() {
        setBackgroundColor(if (darkChrome || isNight) Color.rgb(31, 32, 36) else Color.rgb(235, 237, 241))
    }

    // region Chrome

    private fun buildToolbar() {
        val bar = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dp(4), 0, dp(4), 0)
            setBackgroundColor(chromeBackground)
            elevation = dp(6).toFloat()
            minimumHeight = dp(52)
            visibility = View.GONE
            isClickable = true // taps on the bar must not toggle the chrome underneath
        }
        previousButton = iconButton(R.drawable.pdf_ic_chevron_left, R.string.pdf_document_previous) { turnPage(-1) }
        bar.addView(previousButton)
        pageLabel = TextView(context).apply {
            setTextColor(chromeForeground)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f)
            gravity = Gravity.CENTER
            minWidth = dp(72)
            setPadding(dp(8), dp(12), dp(8), dp(12))
            background = selectable(false)
            contentDescription = context.getString(R.string.pdf_document_go_to_page)
            setOnClickListener { showGoToPageDialog() }
        }
        bar.addView(pageLabel)
        nextButton = iconButton(R.drawable.pdf_ic_chevron_right, R.string.pdf_document_next) { turnPage(1) }
        bar.addView(nextButton)
        bar.addView(View(context), LinearLayout.LayoutParams(0, 1, 1f))
        if (options.bookmarks) {
            bookmarkButton = iconButton(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add) { toggleBookmark() }
            bar.addView(bookmarkButton)
        }
        val more = iconButton(R.drawable.pdf_ic_more, R.string.pdf_document_more) { }
        more.setOnClickListener { showMenu(more) }
        bar.addView(more)
        toolbar = bar
        addView(bar, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, Gravity.BOTTOM))
    }

    private fun selectable(borderless: Boolean) = TypedValue().let { value ->
        context.theme.resolveAttribute(
            if (borderless) android.R.attr.selectableItemBackgroundBorderless else android.R.attr.selectableItemBackground,
            value, true)
        if (value.resourceId != 0) context.getDrawable(value.resourceId) else null
    }

    private fun iconButton(icon: Int, description: Int, action: () -> Unit) = ImageButton(context).apply {
        setImageResource(icon)
        imageTintList = ColorStateList.valueOf(chromeForeground)
        background = selectable(true)
        contentDescription = context.getString(description)
        layoutParams = LinearLayout.LayoutParams(dp(48), dp(48))
        setOnClickListener { action() }
    }

    private fun toggleChrome() {
        val bar = toolbar
        if (bar == null || pageCount == 0) {
            showChip()
            return
        }
        chromeVisible = !chromeVisible
        bar.animate().cancel()
        if (chromeVisible) {
            bar.visibility = View.VISIBLE
            bar.animate().translationY(0f).alpha(1f).setDuration(180).start()
            main.removeCallbacks(hideChip)
            pageChip.animate().alpha(0f).setDuration(150).start()
        } else {
            bar.animate().translationY(bar.height.toFloat()).alpha(0f).setDuration(180)
                .withEndAction { if (!chromeVisible) bar.visibility = View.INVISIBLE }.start()
        }
    }

    private fun showChip() {
        if (!options.showPageIndicator || pageCount == 0) return
        if (toolbar != null && chromeVisible) return
        main.removeCallbacks(hideChip)
        pageChip.animate().cancel()
        pageChip.alpha = 1f
        main.postDelayed(hideChip, 1500)
    }

    private fun onViewportMoved() {
        if (pageCount == 0) return
        updatePageUi()
        showChip()
        fastScroller?.let { scroller ->
            if (!scroller.dragging) {
                val range = list.computeVerticalScrollRange() - list.computeVerticalScrollExtent()
                scroller.fraction = if (range > 0) list.computeVerticalScrollOffset().toFloat() / range else 0f
                scroller.reveal()
            }
        }
    }

    private fun updatePageUi() {
        if (pageCount == 0) return
        val page = currentPage
        val label = context.getString(R.string.pdf_document_page_short, page + 1, pageCount)
        pageChip.text = label
        pageLabel?.text = label
        previousButton?.isEnabled = page > 0
        previousButton?.alpha = if (page > 0) 1f else 0.38f
        nextButton?.isEnabled = page + 1 < pageCount
        nextButton?.alpha = if (page + 1 < pageCount) 1f else 0.38f
        bookmarkButton?.let { button ->
            val marked = page in bookmarks
            button.setImageResource(if (marked) R.drawable.pdf_ic_bookmark else R.drawable.pdf_ic_bookmark_border)
            button.imageTintList = ColorStateList.valueOf(if (marked) options.accentColor else chromeForeground)
            button.contentDescription = context.getString(if (marked) R.string.pdf_document_bookmark_remove else R.string.pdf_document_bookmark_add)
        }
        if (page != lastReportedPage) {
            lastReportedPage = page
            onPageChanged?.invoke(page)
        }
    }

    private fun showMenu(anchor: View) {
        if (pageCount == 0) return
        // Host themes (e.g. the shell's) can pair a dark popup with dark text; use the reader's own.
        val themed = android.view.ContextThemeWrapper(context,
            if (darkChrome) android.R.style.Theme_Material else android.R.style.Theme_Material_Light)
        val menu = PopupMenu(themed, anchor)
        menu.menu.add(0, MENU_GO_TO, 0, R.string.pdf_document_go_to_page)
        if (options.bookmarks) menu.menu.add(0, MENU_BOOKMARKS, 1, R.string.pdf_document_bookmarks)
        menu.menu.add(0, MENU_FIRST, 2, R.string.pdf_document_first_page)
        menu.menu.add(0, MENU_LAST, 3, R.string.pdf_document_last_page)
        menu.menu.add(0, MENU_NIGHT, 4, R.string.pdf_document_night_mode).setCheckable(true).isChecked = isNight
        if (list.isZoomed) menu.menu.add(0, MENU_RESET_ZOOM, 5, R.string.pdf_document_reset_zoom)
        if (options.allowExport && documentFile != null) {
            if (onShare != null) menu.menu.add(1, MENU_SHARE, 6, R.string.pdf_document_share)
            if (onSave != null) menu.menu.add(1, MENU_SAVE, 7, R.string.pdf_document_save)
            if (onPrint != null) menu.menu.add(1, MENU_PRINT, 8, R.string.pdf_document_print)
        }
        menu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                MENU_GO_TO -> showGoToPageDialog()
                MENU_BOOKMARKS -> showBookmarksDialog()
                MENU_FIRST -> scrollToPage(0)
                MENU_LAST -> scrollToPage(pageCount - 1)
                MENU_NIGHT -> setNight(!isNight)
                MENU_RESET_ZOOM -> list.animateZoom(1f)
                MENU_SHARE -> documentFile?.let { onShare?.invoke(it) }
                MENU_SAVE -> documentFile?.let { onSave?.invoke(it) }
                MENU_PRINT -> documentFile?.let { onPrint?.invoke(it) }
            }
            true
        }
        menu.show()
    }

    /** Number field plus a slider and first/last shortcuts, in the reader's own light/dark dialog theme. */
    fun showGoToPageDialog() {
        if (pageCount == 0) return
        val themed = android.view.ContextThemeWrapper(context, dialogTheme())
        val input = EditText(themed).apply {
            inputType = InputType.TYPE_CLASS_NUMBER
            imeOptions = EditorInfo.IME_ACTION_GO
            hint = context.getString(R.string.pdf_document_page_short, 1, pageCount)
            setText((currentPage + 1).toString())
            selectAll()
        }
        val container = LinearLayout(themed).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(24), dp(8), dp(24), 0)
            addView(input)
        }
        var dialog: AlertDialog? = null
        if (pageCount > 1) {
            var syncing = false
            val slider = SeekBar(themed).apply {
                max = pageCount - 1
                progress = currentPage
                progressTintList = ColorStateList.valueOf(options.accentColor)
                thumbTintList = ColorStateList.valueOf(options.accentColor)
                setPadding(dp(8), dp(16), dp(8), dp(8))
                setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(bar: SeekBar, value: Int, fromUser: Boolean) {
                        if (!fromUser || syncing) return
                        syncing = true
                        input.setText((value + 1).toString())
                        input.setSelection(input.text.length)
                        input.error = null
                        syncing = false
                    }
                    override fun onStartTrackingTouch(bar: SeekBar) = Unit
                    override fun onStopTrackingTouch(bar: SeekBar) = Unit
                })
            }
            input.addTextChangedListener(object : android.text.TextWatcher {
                override fun afterTextChanged(text: android.text.Editable) {
                    if (syncing) return
                    PdfReaderMath.parsePageInput(text.toString(), pageCount)?.let {
                        syncing = true
                        slider.progress = it
                        syncing = false
                    }
                }
                override fun beforeTextChanged(text: CharSequence, start: Int, count: Int, after: Int) = Unit
                override fun onTextChanged(text: CharSequence, start: Int, before: Int, count: Int) = Unit
            })
            container.addView(slider)
            val shortcuts = LinearLayout(themed).apply { orientation = LinearLayout.HORIZONTAL }
            fun shortcut(label: Int, page: Int) = android.widget.Button(themed, null, android.R.attr.borderlessButtonStyle).apply {
                setText(label)
                setTextColor(options.accentColor)
                isAllCaps = false
                setOnClickListener {
                    scrollToPage(page)
                    dialog?.dismiss()
                }
            }
            shortcuts.addView(shortcut(R.string.pdf_document_first_page, 0))
            shortcuts.addView(View(themed), LinearLayout.LayoutParams(0, 1, 1f))
            shortcuts.addView(shortcut(R.string.pdf_document_last_page, pageCount - 1))
            container.addView(shortcuts)
        }
        val created = AlertDialog.Builder(context, dialogTheme())
            .setTitle(R.string.pdf_document_go_to_page)
            .setView(container)
            .setPositiveButton(R.string.pdf_document_go, null)
            .setNegativeButton(R.string.pdf_document_cancel, null)
            .create()
        dialog = created
        val submit = {
            val page = PdfReaderMath.parsePageInput(input.text.toString(), pageCount)
            if (page == null) {
                input.error = context.getString(R.string.pdf_document_invalid_page, pageCount)
            } else {
                scrollToPage(page)
                created.dismiss()
            }
        }
        input.setOnEditorActionListener { _, action, _ ->
            if (action == EditorInfo.IME_ACTION_GO) {
                submit()
                true
            } else false
        }
        created.setOnShowListener {
            created.getButton(AlertDialog.BUTTON_POSITIVE).apply {
                setTextColor(options.accentColor)
                setOnClickListener { submit() }
            }
            created.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(options.accentColor)
        }
        created.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
        created.show()
    }

    fun showBookmarksDialog() {
        if (bookmarks.isEmpty()) {
            Toast.makeText(context, R.string.pdf_document_no_bookmarks, Toast.LENGTH_LONG).show()
            return
        }
        val pages = bookmarks.toList()
        AlertDialog.Builder(context, dialogTheme())
            .setTitle(R.string.pdf_document_bookmarks)
            .setItems(pages.map { context.getString(R.string.pdf_document_page_number, it + 1) }.toTypedArray()) { _, which ->
                scrollToPage(pages[which])
            }
            .setNegativeButton(R.string.pdf_document_close, null)
            .show()
    }

    fun toggleBookmark() {
        if (pageCount == 0) return
        val page = currentPage
        if (!bookmarks.remove(page)) {
            bookmarks += page
            Toast.makeText(context, context.getString(R.string.pdf_document_bookmark_added, page + 1), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, R.string.pdf_document_bookmark_removed, Toast.LENGTH_SHORT).show()
        }
        store.saveBookmarks(bookmarks)
        updatePageUi()
    }

    fun setNight(enabled: Boolean) {
        isNight = enabled
        holders.forEach { it.page.night = enabled }
        updateBackground()
        store.saveNight(enabled)
    }

    /** Wires share and print to [PdfExport]; saving needs the host's document launcher. */
    fun useDefaultExport(activity: Activity, save: ((File) -> Unit)?) {
        val title = options.title.ifBlank { "document" }
        onShare = { PdfExport.share(activity, it, title) }
        onPrint = { PdfExport.print(activity, it, title) }
        onSave = save
    }

    /** Back press handling: a zoomed page zooms out first. */
    fun handleBack(): Boolean {
        if (!list.isZoomed) return false
        list.animateZoom(1f)
        return true
    }

    // endregion

    // region Opening

    /** Copies with a bound to a private seekable file; PDF bytes never become one large array. */
    fun openDocument(input: () -> InputStream) = open {
        val file = File.createTempFile("pdf_document_", ".pdf", context.cacheDir)
        temporary = file
        copyBounded(input, file)
        file
    }

    /** Opens an existing local file in place (it is neither copied nor deleted). */
    fun openFile(file: File) = open { file }

    /**
     * Opens a PDF bundled in assets. It is extracted once per app install/update into private
     * storage, so later launches open instantly instead of copying the document again.
     */
    fun openAsset(path: String) = open {
        val directory = File(context.filesDir, "pdfviewer").apply { mkdirs() }
        @Suppress("DEPRECATION")
        val stamp = try {
            context.packageManager.getPackageInfo(context.packageName, 0).lastUpdateTime
        } catch (_: Exception) { 0L }
        val name = "asset_${Integer.toHexString(path.hashCode())}_$stamp.pdf"
        val target = File(directory, name)
        if (!(target.isFile && target.length() > 0)) {
            directory.listFiles()?.filter { it.name.startsWith("asset_") }?.forEach { it.delete() }
            val partial = File(directory, "$name.part")
            copyBounded({ context.assets.open(path) }, partial)
            check(partial.renameTo(target)) { "Cannot store PDF" }
        }
        target
    }

    private fun copyBounded(input: () -> InputStream, file: File) {
        input().use { source ->
            file.outputStream().use { target ->
                val buffer = ByteArray(64 * 1024)
                var total = 0L
                while (true) {
                    check(!released) { "cancelled" }
                    val count = source.read(buffer)
                    if (count < 0) break
                    total += count
                    require(total <= MAX_PDF_BYTES) { "PDF exceeds 100 MB" }
                    target.write(buffer, 0, count)
                }
            }
        }
    }

    private fun open(source: () -> File) {
        check(!opened) { "Document is already open" }
        opened = true
        worker.execute {
            try {
                val file = source()
                check(!released) { "cancelled" }
                val pfd = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
                descriptor = pfd
                val pdf = PdfRenderer(pfd)
                renderer = pdf
                val count = pdf.pageCount
                require(count > 0) { "Empty PDF" }
                // Real page shapes up front keep the scroll extent and restored offsets stable.
                val known = SparseArray<Double>()
                for (index in 0 until min(count, PRECOMPUTED_RATIOS)) {
                    check(!released) { "cancelled" }
                    pdf.openPage(index).use { known.put(index, it.height.toDouble() / it.width.coerceAtLeast(1)) }
                }
                main.post { if (!released) onOpened(file, count, known) }
            } catch (failure: Exception) {
                Log.w(TAG, "Cannot open PDF", failure)
                main.post { if (!released) showError() }
            }
        }
    }

    private fun onOpened(file: File, count: Int, known: SparseArray<Double>) {
        documentFile = file
        pageCount = count
        for (index in 0 until known.size()) ratios.put(known.keyAt(index), known.valueAt(index))
        defaultRatio = known[0] ?: defaultRatio
        bookmarks.clear()
        bookmarks += store.bookmarks(count)
        val (page, fraction) = when {
            restoredPage >= 0 -> restoredPage to restoredFraction
            options.rememberPage && store.hasPosition -> store.page to store.pageFraction
            else -> (options.startPage - 1) to 0f
        }
        restoredNight?.let { if (it != isNight) setNight(it) }
        loading.visibility = View.GONE
        toolbar?.visibility = View.VISIBLE
        fastScroller?.pageCount = count
        pageAdapter.notifyDataSetChanged()
        val start = page.coerceIn(0, count - 1)
        if (list.width > 0) scrollToAnchor(start, fraction) else list.addOnLayoutChangeListener(object : OnLayoutChangeListener {
            override fun onLayoutChange(v: View, l: Int, t: Int, r: Int, b: Int, oldL: Int, oldT: Int, oldR: Int, oldB: Int) {
                if (r - l <= 0) return
                list.removeOnLayoutChangeListener(this)
                // Scrolling inside a layout pass asks for another layout that older Android drops,
                // leaving a restored reader on page 1; run it after this pass instead.
                list.post { if (!released) scrollToAnchor(start, fraction) }
            }
        })
        list.post {
            if (released) return@post
            updatePageUi()
            onReady?.invoke()
        }
    }

    private fun showError() {
        progress.visibility = View.GONE
        status.setText(R.string.pdf_document_error)
        loading.visibility = View.VISIBLE
        onError?.invoke()
    }

    // endregion

    // region Navigation and state

    private fun pageAt(x: Float, y: Float): Int? {
        val bounds = Rect()
        for (index in 0 until list.childCount) {
            val child = list.getChildAt(index)
            manager.getDecoratedBoundsWithMargins(child, bounds)
            if (x >= bounds.left && x < bounds.right && y >= bounds.top && y < bounds.bottom) {
                return list.getChildAdapterPosition(child).takeIf { it != RecyclerView.NO_POSITION }
            }
        }
        return null
    }

    /** Page under the top of the visible window and how far into it the reader has scrolled. */
    private fun anchor(): Pair<Int, Float> {
        if (horizontalMode) return currentPage to 0f
        val window = list.visibleWindow()
        val bounds = Rect()
        for (index in 0 until list.childCount) {
            val child = list.getChildAt(index)
            manager.getDecoratedBoundsWithMargins(child, bounds)
            if (window.top >= bounds.top && window.top < bounds.bottom) {
                val position = list.getChildAdapterPosition(child)
                if (position == RecyclerView.NO_POSITION) continue
                return position to ((window.top - bounds.top) / bounds.height().coerceAtLeast(1)).coerceIn(0f, 1f)
            }
        }
        return currentPage to 0f
    }

    private fun estimatedHeight(page: Int) = (pageWidth() * (ratios[page] ?: defaultRatio)).toInt() + gap() * 2

    private fun scrollToAnchor(page: Int, fraction: Float) {
        if (horizontalMode) manager.scrollToPosition(page)
        else manager.scrollToPositionWithOffset(page, -(fraction * estimatedHeight(page)).toInt())
    }

    fun scrollToPage(page: Int) {
        if (pageCount == 0) return
        if (horizontalMode) list.resetZoom() else list.resetPanAlongScroll()
        manager.scrollToPositionWithOffset(page.coerceIn(0, pageCount - 1), 0)
        list.post {
            updatePageUi()
            savePosition()
            scheduleDetail()
        }
    }

    private fun jumpTo(page: Int) {
        manager.scrollToPositionWithOffset(page.coerceIn(0, pageCount - 1), 0)
        pageLabel?.text = context.getString(R.string.pdf_document_page_short, page + 1, pageCount)
    }

    private fun turnPage(delta: Int) {
        if (pageCount == 0) return
        val target = (currentPage + delta).coerceIn(0, pageCount - 1)
        if (abs(target - currentPage) > 1 || list.isZoomed) {
            scrollToPage(target)
            return
        }
        val scroller = object : LinearSmoothScroller(context) {
            override fun getVerticalSnapPreference() = SNAP_TO_START
            override fun getHorizontalSnapPreference() = SNAP_TO_START
        }
        scroller.targetPosition = target
        manager.startSmoothScroll(scroller)
    }

    private fun savePosition() {
        if (!options.rememberPage || pageCount == 0 || released) return
        val (page, fraction) = anchor()
        store.savePosition(page, fraction)
    }

    fun saveState(state: Bundle) {
        if (pageCount == 0) {
            if (restoredPage >= 0) state.putInt("pdf_document_page", restoredPage)
            return
        }
        val (page, fraction) = anchor()
        state.putInt("pdf_document_page", page)
        state.putFloat("pdf_document_fraction", fraction)
        state.putBoolean("pdf_document_night", isNight)
    }

    fun restoreState(state: Bundle?) {
        if (state == null || !state.containsKey("pdf_document_page")) return
        restoredPage = state.getInt("pdf_document_page")
        restoredFraction = state.getFloat("pdf_document_fraction")
        if (state.containsKey("pdf_document_night")) restoredNight = state.getBoolean("pdf_document_night")
    }

    /** Test/automation hook: zooms around the centre without a gesture. */
    fun zoomTo(target: Float) {
        list.zoomAround(target, list.width / 2f, list.height / 2f)
        scheduleDetail()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        val keep = if (pageCount > 0 && oldw > 0) anchor() else null
        super.onSizeChanged(w, h, oldw, oldh)
        if (keep != null && (w != oldw || h != oldh)) {
            main.post {
                if (released) return@post
                holders.forEach { it.clear() }
                pageAdapter.notifyDataSetChanged()
                scrollToAnchor(keep.first, keep.second)
            }
        }
    }

    fun release() {
        if (released) return
        savePosition()
        released = true
        main.removeCallbacks(detailRunnable)
        main.removeCallbacks(hideChip)
        holders.forEach { it.clear() }
        holders.clear()
        list.adapter = null
        worker.queue.clear()
        worker.execute {
            runCatching { renderer?.close() }
            runCatching { descriptor?.close() }
            temporary?.delete()
        }
        worker.shutdown()
    }

    // endregion

    // region Rendering

    private fun pageWidth() = (list.width - gap() * 2).coerceAtLeast(1)
    private fun pageHeight() = (list.height - gap() * 2).coerceAtLeast(1)

    private inner class PageHolder(val page: PdfPageView) : RecyclerView.ViewHolder(page) {
        var index = -1
        @Volatile var token = 0
        @Volatile var detailToken = 0
        var future: Future<*>? = null
        var detailFuture: Future<*>? = null

        fun clearDetail() {
            detailToken++
            detailFuture?.cancel(false)
            detailFuture = null
            page.swapDetail(null)?.recycle()
        }

        fun clear() {
            token++
            future?.cancel(false)
            future = null
            clearDetail()
            worker.purge()
            page.swapBase(null)?.recycle()
        }
    }

    private inner class Pages : RecyclerView.Adapter<PageHolder>() {
        override fun getItemCount() = pageCount

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder {
            val page = PdfPageView(context).apply {
                fitWholePage = horizontalMode
                elevation = 2 * density
            }
            return PageHolder(page).also { holders += it }
        }

        override fun onBindViewHolder(holder: PageHolder, position: Int) {
            holders += holder
            holder.clear()
            holder.index = position
            val ratio = ratios[position] ?: defaultRatio
            holder.page.ratio = ratio
            holder.page.night = isNight
            holder.page.layoutParams = if (horizontalMode) {
                RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            } else {
                RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (pageWidth() * ratio).toInt().coerceIn(1, 100_000))
            }.apply { setMargins(gap(), gap(), gap(), gap()) }
            holder.page.contentDescription = context.getString(R.string.pdf_document_page, position + 1, pageCount)
            render(holder)
        }

        override fun onViewAttachedToWindow(holder: PageHolder) {
            if (holder.page.base == null && holder.future == null) render(holder)
        }

        override fun onViewDetachedFromWindow(holder: PageHolder) {
            holder.clear()
        }

        override fun onViewRecycled(holder: PageHolder) {
            holder.clear()
            holder.index = -1
            holders -= holder
        }
    }

    private fun render(holder: PageHolder) {
        if (released || list.width <= 0 || holder.index < 0) return
        val token = holder.token
        val index = holder.index
        val itemWidth = pageWidth()
        val itemHeight = pageHeight()
        holder.future = worker.submit {
            var rendered: Bitmap? = null
            try {
                if (released || holder.token != token) return@submit
                val pdf = renderer ?: return@submit
                var ratio = defaultRatio
                pdf.openPage(index).use { page ->
                    ratio = page.height.toDouble() / page.width.coerceAtLeast(1)
                    val target = if (horizontalMode) PdfReaderMath.pageBox(itemWidth, itemHeight, ratio, true).width.toInt() else itemWidth
                    val (width, height) = PdfReaderMath.baseRasterSize(target, ratio)
                    rendered = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888).apply { eraseColor(Color.WHITE) }
                    page.render(rendered!!, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                }
                val ready = rendered!!
                main.post {
                    if (released || holder.token != token || holder.index != index) {
                        ready.recycle()
                        return@post
                    }
                    holder.future = null
                    if (ratios[index] != ratio) {
                        ratios.put(index, ratio)
                        holder.page.ratio = ratio
                        if (!horizontalMode) {
                            holder.page.layoutParams = holder.page.layoutParams.apply {
                                height = (itemWidth * ratio).toInt().coerceIn(1, 100_000)
                            }
                        }
                    }
                    holder.page.swapBase(ready)?.recycle()
                    if (list.isZoomed) scheduleDetail()
                }
            } catch (failure: Throwable) {
                if (failure !is Exception && failure !is OutOfMemoryError) throw failure
                Log.w(TAG, "Cannot render PDF page $index", failure)
                rendered?.recycle()
                main.post { if (holder.token == token) holder.future = null }
            }
        }
    }

    private fun scheduleDetail() {
        main.removeCallbacks(detailRunnable)
        main.postDelayed(detailRunnable, 120)
    }

    /** Renders the zoomed, visible part of each page at screen resolution. */
    private fun refreshDetails() {
        if (released || pageCount == 0) return
        if (!list.isZoomed) {
            holders.forEach { it.clearDetail() }
            return
        }
        if (list.scrollState != RecyclerView.SCROLL_STATE_IDLE) return
        val window = list.visibleWindow()
        val zoom = list.zoom
        for (index in 0 until list.childCount) {
            val child = list.getChildAt(index) as? PdfPageView ?: continue
            val holder = list.getChildViewHolder(child) as? PageHolder ?: continue
            if (holder.index < 0) continue
            val box = child.pageBox
            val visible = PdfReaderMath.intersect(window, PdfReaderMath.Box(
                child.left + box.left, child.top + box.top, child.left + box.right, child.top + box.bottom))
            if (visible.isEmpty) {
                holder.clearDetail()
                continue
            }
            val local = RectF(visible.left - child.left, visible.top - child.top, visible.right - child.left, visible.bottom - child.top)
            if (child.detail != null && child.detailZoom == zoom && child.detailBox.contains(local)) continue
            renderDetail(holder, local, RectF(box), zoom)
        }
    }

    private fun renderDetail(holder: PageHolder, local: RectF, pageBox: RectF, zoom: Float) {
        holder.detailToken++
        holder.detailFuture?.cancel(false)
        val token = holder.detailToken
        val index = holder.index
        val width = (local.width() * zoom).roundToInt().coerceAtLeast(1)
        val height = (local.height() * zoom).roundToInt().coerceAtLeast(1)
        if (width.toLong() * height > MAX_DETAIL_PIXELS) return
        holder.detailFuture = worker.submit {
            var rendered: Bitmap? = null
            try {
                if (released || holder.detailToken != token) return@submit
                val pdf = renderer ?: return@submit
                pdf.openPage(index).use { page ->
                    val scale = pageBox.width() / page.width.coerceAtLeast(1) * zoom
                    val transform = Matrix().apply {
                        setScale(scale, scale)
                        postTranslate(-(local.left - pageBox.left) * zoom, -(local.top - pageBox.top) * zoom)
                    }
                    rendered = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888).apply { eraseColor(Color.WHITE) }
                    page.render(rendered!!, null, transform, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                }
                val ready = rendered!!
                main.post {
                    if (released || holder.detailToken != token || holder.index != index || list.zoom != zoom) {
                        ready.recycle()
                        return@post
                    }
                    holder.detailFuture = null
                    holder.page.swapDetail(ready, local, zoom)?.recycle()
                }
            } catch (failure: Throwable) {
                if (failure !is Exception && failure !is OutOfMemoryError) throw failure
                Log.w(TAG, "Cannot render PDF detail $index", failure)
                rendered?.recycle()
            }
        }
    }

    // endregion

    companion object {
        const val MAX_PDF_BYTES = 100L * 1024 * 1024
        private const val TAG = "PdfDocumentView"
        private const val PRECOMPUTED_RATIOS = 300
        private const val MAX_DETAIL_PIXELS = 12_000_000L
        private const val MENU_GO_TO = 1
        private const val MENU_BOOKMARKS = 2
        private const val MENU_FIRST = 3
        private const val MENU_LAST = 4
        private const val MENU_NIGHT = 5
        private const val MENU_RESET_ZOOM = 6
        private const val MENU_SHARE = 7
        private const val MENU_SAVE = 8
        private const val MENU_PRINT = 9

    }
}
