package {{packageName}}

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.TextUtils
import android.util.TypedValue
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File
import java.io.InputStream
import kotlin.math.roundToInt

/**
 * The full reader screen: a title bar with reading progress, a floating page dock that a tap on
 * the page hides, a page overview with thumbnails and bookmarks, and a go-to-page dialog with a
 * slider. Same layout as the HTML to APK app's own reader, built from plain views so generated
 * apps carry no Compose runtime.
 *
 * With [PdfReaderOptions.showToolbar] off only the pages (and the optional page chip) are shown.
 */
class PdfReaderLayout @JvmOverloads constructor(
    context: Context,
    val options: PdfReaderOptions = PdfReaderOptions(),
    stateKey: String? = null,
    /** Shows a back arrow in the title bar; it calls [onBack]. */
    showBack: Boolean = false,
    /** Pads the bars for an edge-to-edge window; off when the host already insets this view. */
    fitSystemBars: Boolean = false,
    /** Off when the host shows its own title bar: the reader's actions then move into the dock. */
    showTopBar: Boolean = true
) : FrameLayout(context) {
    private val chrome = options.showToolbar
    private val topBarShown = chrome && showTopBar
    val document = PdfDocumentView(
        context,
        if (chrome) options.copy(showToolbar = false, showPageIndicator = false) else options,
        stateKey
    )

    var onBack: (() -> Unit)? = null
    var onReady: (() -> Unit)? = null
    var onError: (() -> Unit)? = null

    /** True when the bars are dark; hosts match their system bar icons to it. */
    val isDark: Boolean get() = document.darkChrome
    val isReady: Boolean get() = ready

    private val density = resources.displayMetrics.density
    private val accent = options.accentColor
    private val palette = ReaderPalette(document.darkChrome)
    private var ready = false
    private var failed = false
    private var chromeVisible = true
    private var thumbnails: PdfThumbnailLoader? = null
    private var overview: PdfPageOverview? = null

    private val content = FrameLayout(context)
    private var title: TextView? = null
    private var subtitle: TextView? = null
    private var progressLine: ReadingProgress? = null
    private var pagesButton: ImageButton? = null
    private var moreButton: ImageButton? = null
    private var dock: LinearLayout? = null
    private var pageLabel: TextView? = null
    private var previousButton: ImageButton? = null
    private var nextButton: ImageButton? = null
    private var bookmarkButton: ImageButton? = null
    private var nightButton: ImageButton? = null
    private var errorCard: View? = null

    init {
        updateBackground()
        val column = LinearLayout(context).apply { orientation = LinearLayout.VERTICAL }
        val topBar = if (topBarShown) buildTopBar(showBack) else null
        topBar?.let { column.addView(it, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)) }
        content.addView(document, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        if (chrome) {
            val bar = buildDock()
            dock = bar
            content.addView(bar, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,
                Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL).apply { bottomMargin = dp(20) })
        }
        column.addView(content, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 0, 1f))
        addView(column, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))

        if (fitSystemBars) {
            ViewCompat.setOnApplyWindowInsetsListener(this) { _, insets ->
                val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout())
                if (topBar != null) {
                    topBar.setPadding(0, bars.top, 0, 0)
                    content.setPadding(bars.left, 0, bars.right, bars.bottom)
                } else {
                    content.setPadding(bars.left, bars.top, bars.right, bars.bottom)
                }
                topBar?.getChildAt(0)?.setPadding(bars.left + dp(4), 0, bars.right + dp(4), 0)
                WindowInsetsCompat.CONSUMED
            }
        }

        document.onReady = {
            ready = true
            // A restored night mode is applied while opening; follow it.
            updateBackground()
            updateNightButton()
            updatePage()
            progressLine?.loading = false
            dock?.visibility = if (chromeVisible) View.VISIBLE else View.INVISIBLE
            pagesButton?.visibility = View.VISIBLE
            moreButton?.visibility = View.VISIBLE
            onReady?.invoke()
        }
        document.onError = {
            failed = true
            progressLine?.loading = false
            subtitle?.setText(R.string.pdf_document_failed_short)
            showError()
            onError?.invoke()
        }
        document.onPageChanged = { updatePage() }
        document.onSingleTap = { if (chrome && ready) setChromeVisible(!chromeVisible) }
    }

    // region Opening and lifecycle

    fun openAsset(path: String) = document.openAsset(path)
    fun openFile(file: File) = document.openFile(file)
    fun openDocument(input: () -> InputStream) = document.openDocument(input)

    /** Back press handling: a zoomed page zooms out first. */
    fun handleBack(): Boolean = document.handleBack()

    fun saveState(state: Bundle) {
        document.saveState(state)
        state.putBoolean(KEY_CHROME, chromeVisible)
    }

    fun restoreState(state: Bundle?) {
        document.restoreState(state)
        if (state != null && !state.getBoolean(KEY_CHROME, true)) chromeVisible = false
    }

    fun release() {
        overview?.dismiss()
        overview = null
        thumbnails?.close()
        thumbnails = null
        progressLine?.loading = false
        document.release()
    }

    // endregion

    // region Building

    private fun dp(value: Int) = (value * density).roundToInt()
    private fun dp(value: Float) = value * density

    private fun updateBackground() {
        setBackgroundColor(if (document.darkChrome || document.isNight) Color.rgb(31, 32, 36) else Color.rgb(235, 237, 241))
    }

    private fun selectableBorderless() = TypedValue().let { value ->
        context.theme.resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, value, true)
        if (value.resourceId != 0) context.getDrawable(value.resourceId) else null
    }

    private fun iconButton(icon: Int, description: Int, tint: Int = palette.onSurface, action: () -> Unit) = ImageButton(context).apply {
        setImageResource(icon)
        imageTintList = ColorStateList.valueOf(tint)
        background = selectableBorderless()
        contentDescription = context.getString(description)
        layoutParams = LinearLayout.LayoutParams(dp(48), dp(48))
        setOnClickListener { action() }
    }

    private fun rounded(color: Int, radius: Float) = GradientDrawable().apply {
        cornerRadius = radius
        setColor(color)
    }

    private fun buildTopBar(showBack: Boolean): LinearLayout {
        val bar = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(palette.surface)
            elevation = dp(3f)
            isClickable = true // taps on the bar must not reach the pages underneath
        }
        val row = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            minimumHeight = dp(64)
            setPadding(dp(4), 0, dp(4), 0)
        }
        if (showBack) {
            row.addView(iconButton(R.drawable.pdf_ic_arrow_back, R.string.pdf_document_back) { onBack?.invoke() })
        } else {
            row.addView(View(context), LinearLayout.LayoutParams(dp(12), 1))
        }
        val badge = FrameLayout(context).apply { background = rounded(ColorUtils.setAlphaComponent(accent, 36), dp(10f)) }
        badge.addView(ImageView(context).apply {
            setImageResource(R.drawable.pdf_ic_document)
            imageTintList = ColorStateList.valueOf(accent)
        }, LayoutParams(dp(20), dp(20), Gravity.CENTER))
        row.addView(badge, LinearLayout.LayoutParams(dp(36), dp(36)))
        val texts = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(12), 0, dp(4), 0)
        }
        title = TextView(context).apply {
            text = options.title
            setTextColor(palette.onSurface)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
            typeface = android.graphics.Typeface.create("sans-serif-medium", android.graphics.Typeface.NORMAL)
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        texts.addView(title)
        subtitle = TextView(context).apply {
            setText(R.string.pdf_document_loading)
            setTextColor(palette.onSurfaceVariant)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
            maxLines = 1
        }
        texts.addView(subtitle)
        row.addView(texts, LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))
        pagesButton = iconButton(R.drawable.pdf_ic_grid, R.string.pdf_document_pages, palette.onSurfaceVariant) { showPages() }
            .apply { visibility = View.GONE }
        row.addView(pagesButton)
        moreButton = iconButton(R.drawable.pdf_ic_more, R.string.pdf_document_more, palette.onSurfaceVariant) { }
            .apply {
                visibility = View.GONE
                setOnClickListener { showMenu(this) }
            }
        row.addView(moreButton)
        bar.addView(row, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
        progressLine = ReadingProgress(context, accent, ColorUtils.setAlphaComponent(palette.outlineVariant, 102)).apply { loading = true }
        bar.addView(progressLine, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, dp(2)))
        return bar
    }

    private fun buildDock(): LinearLayout {
        val bar = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dp(4), dp(4), dp(4), dp(4))
            background = rounded(palette.containerHigh, dp(28f)).apply {
                setStroke(dp(1), ColorUtils.setAlphaComponent(palette.outlineVariant, 128))
            }
            elevation = dp(10f)
            visibility = View.INVISIBLE
            isClickable = true
        }
        val horizontal = options.isHorizontal
        previousButton = iconButton(
            if (horizontal) R.drawable.pdf_ic_chevron_left else R.drawable.pdf_ic_arrow_up, R.string.pdf_document_previous
        ) { goTo(document.currentPage - 1) }
        bar.addView(previousButton)
        pageLabel = TextView(context).apply {
            setTextColor(palette.onSurface)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
            typeface = android.graphics.Typeface.create("sans-serif-medium", android.graphics.Typeface.NORMAL)
            gravity = Gravity.CENTER
            minWidth = dp(84)
            setPadding(dp(14), dp(10), dp(14), dp(10))
            background = android.graphics.drawable.RippleDrawable(
                ColorStateList.valueOf(ColorUtils.setAlphaComponent(palette.onSurface, 31)),
                rounded(palette.containerHighest, dp(20f)), null
            )
            contentDescription = context.getString(R.string.pdf_document_go_to_page)
            setOnClickListener { document.showGoToPageDialog() }
        }
        bar.addView(pageLabel)
        nextButton = iconButton(
            if (horizontal) R.drawable.pdf_ic_chevron_right else R.drawable.pdf_ic_arrow_down, R.string.pdf_document_next
        ) { goTo(document.currentPage + 1) }
        bar.addView(nextButton)
        bar.addView(View(context).apply { setBackgroundColor(palette.outlineVariant) },
            LinearLayout.LayoutParams(dp(1), dp(24)).apply { marginStart = dp(4); marginEnd = dp(4) })
        if (options.bookmarks) {
            bookmarkButton = iconButton(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add) {
                document.toggleBookmark()
                updatePage()
            }
            bar.addView(bookmarkButton)
        }
        if (topBarShown) {
            nightButton = iconButton(R.drawable.pdf_ic_dark_mode, R.string.pdf_document_night_mode) { toggleNight() }
            bar.addView(nightButton)
            updateNightButton()
        } else {
            // No title bar: the overview and the menu (with night mode) live in the dock.
            bar.addView(iconButton(R.drawable.pdf_ic_grid, R.string.pdf_document_pages) { showPages() })
            val more = iconButton(R.drawable.pdf_ic_more, R.string.pdf_document_more) { }
            more.setOnClickListener { showMenu(more) }
            bar.addView(more)
        }
        return bar
    }

    private fun showError() {
        document.visibility = View.INVISIBLE
        dock?.visibility = View.GONE
        if (errorCard != null) return
        val card = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(dp(24), dp(24), dp(24), dp(24))
            background = rounded(palette.containerHigh, dp(24f))
            elevation = dp(2f)
        }
        val icon = FrameLayout(context).apply {
            background = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(ColorUtils.setAlphaComponent(accent, 36))
            }
        }
        icon.addView(ImageView(context).apply {
            setImageResource(R.drawable.pdf_ic_error)
            imageTintList = ColorStateList.valueOf(accent)
        }, LayoutParams(dp(28), dp(28), Gravity.CENTER))
        card.addView(icon, LinearLayout.LayoutParams(dp(56), dp(56)))
        card.addView(TextView(context).apply {
            setText(R.string.pdf_document_error)
            setTextColor(palette.onSurface)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
            gravity = Gravity.CENTER
            setPadding(0, dp(16), 0, 0)
        }, LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        val back = onBack
        if (back != null) {
            card.addView(Button(context, null, android.R.attr.borderlessButtonStyle).apply {
                setText(R.string.pdf_document_close)
                isAllCaps = false
                setTextColor(accent)
                background = android.graphics.drawable.RippleDrawable(
                    ColorStateList.valueOf(ColorUtils.setAlphaComponent(accent, 61)),
                    rounded(ColorUtils.setAlphaComponent(accent, 36), dp(20f)), null
                )
                setPadding(dp(24), 0, dp(24), 0)
                setOnClickListener { back() }
            }, LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, dp(40)).apply { topMargin = dp(16) })
        }
        errorCard = card
        content.addView(card, LayoutParams(dp(360).coerceAtMost(resources.displayMetrics.widthPixels - dp(48)),
            LayoutParams.WRAP_CONTENT, Gravity.CENTER))
    }

    // endregion

    // region Actions

    private fun goTo(page: Int) {
        if (!ready) return
        document.scrollToPage(page)
    }

    private fun toggleNight() {
        document.setNight(!document.isNight)
        updateBackground()
        updateNightButton()
    }

    private fun updateNightButton() {
        val button = nightButton ?: return
        val night = document.isNight
        button.setImageResource(if (night) R.drawable.pdf_ic_light_mode else R.drawable.pdf_ic_dark_mode)
        button.imageTintList = ColorStateList.valueOf(if (night) accent else palette.onSurface)
        button.background = if (night) {
            GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(ColorUtils.setAlphaComponent(accent, 41))
            }
        } else selectableBorderless()
    }

    private fun setChromeVisible(visible: Boolean) {
        val bar = dock ?: return
        chromeVisible = visible
        bar.animate().cancel()
        if (visible) {
            bar.visibility = View.VISIBLE
            bar.animate().translationY(0f).alpha(1f).setDuration(200).start()
        } else {
            val distance = (bar.height + (bar.layoutParams as MarginLayoutParams).bottomMargin).toFloat()
            bar.animate().translationY(distance).alpha(0f).setDuration(200)
                .withEndAction { if (!chromeVisible) bar.visibility = View.INVISIBLE }.start()
        }
    }

    private fun updatePage() {
        if (!ready) return
        val page = document.currentPage
        val count = document.pageCount
        subtitle?.text = context.getString(R.string.pdf_document_page, page + 1, count)
        progressLine?.fraction = if (count > 0) (page + 1f) / count else 0f
        pageLabel?.text = context.getString(R.string.pdf_document_page_short, page + 1, count)
        previousButton?.let { it.isEnabled = page > 0; it.alpha = if (page > 0) 1f else 0.38f }
        nextButton?.let { it.isEnabled = page + 1 < count; it.alpha = if (page + 1 < count) 1f else 0.38f }
        bookmarkButton?.let { button ->
            val marked = page in document.bookmarkedPages
            button.setImageResource(if (marked) R.drawable.pdf_ic_bookmark else R.drawable.pdf_ic_bookmark_border)
            button.imageTintList = ColorStateList.valueOf(if (marked) accent else palette.onSurface)
            button.contentDescription = context.getString(
                if (marked) R.string.pdf_document_bookmark_remove else R.string.pdf_document_bookmark_add
            )
        }
    }

    private fun showMenu(anchor: View) {
        if (!ready) return
        // Host themes (e.g. the shell's) can pair a dark popup with dark text; use the reader's own.
        val themed = ContextThemeWrapper(context,
            if (document.darkChrome) android.R.style.Theme_Material else android.R.style.Theme_Material_Light)
        val menu = PopupMenu(themed, anchor)
        menu.menu.add(0, MENU_GO_TO, 0, R.string.pdf_document_go_to_page)
        if (!topBarShown) menu.menu.add(0, MENU_NIGHT, 1, R.string.pdf_document_night_mode).setCheckable(true).isChecked = document.isNight
        if (document.zoom > 1.01f) menu.menu.add(0, MENU_RESET_ZOOM, 2, R.string.pdf_document_reset_zoom)
        if (options.allowExport && document.documentFile != null) {
            if (document.onShare != null) menu.menu.add(1, MENU_SHARE, 3, R.string.pdf_document_share)
            if (document.onSave != null) menu.menu.add(1, MENU_SAVE, 4, R.string.pdf_document_save)
            if (document.onPrint != null) menu.menu.add(1, MENU_PRINT, 5, R.string.pdf_document_print)
        }
        menu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                MENU_GO_TO -> document.showGoToPageDialog()
                MENU_NIGHT -> toggleNight()
                MENU_RESET_ZOOM -> document.handleBack()
                MENU_SHARE -> document.documentFile?.let { document.onShare?.invoke(it) }
                MENU_SAVE -> document.documentFile?.let { document.onSave?.invoke(it) }
                MENU_PRINT -> document.documentFile?.let { document.onPrint?.invoke(it) }
            }
            true
        }
        menu.show()
    }

    /** Thumbnail grid of all (or only bookmarked) pages; created on first use, once the file exists. */
    fun showPages() {
        if (!ready || overview?.isShowing == true) return
        val file = document.documentFile ?: return
        val loader = thumbnails ?: PdfThumbnailLoader(file).also { thumbnails = it }
        overview = PdfPageOverview(
            context = context,
            palette = palette,
            accent = accent,
            pageCount = document.pageCount,
            currentPage = document.currentPage,
            bookmarks = if (options.bookmarks) document.bookmarkedPages else null,
            night = document.isNight,
            fileSize = file.length(),
            loader = loader,
            onPick = { page -> goTo(page) }
        ).also { it.show() }
    }

    // endregion

    /** Neutral Material-like surfaces; the accent comes from the app author. */
    internal class ReaderPalette(val dark: Boolean) {
        val surface = if (dark) 0xFF1E1F23.toInt() else Color.WHITE
        val onSurface = if (dark) 0xFFE8EAED.toInt() else 0xFF1F2024.toInt()
        val onSurfaceVariant = if (dark) 0xFFB4B8BF.toInt() else 0xFF5F6368.toInt()
        val containerHigh = if (dark) 0xFF2B2D32.toInt() else 0xFFF1F3F5.toInt()
        val containerHighest = if (dark) 0xFF363940.toInt() else 0xFFE3E6EB.toInt()
        val outlineVariant = if (dark) 0xFF45484F.toInt() else 0xFFD3D6DC.toInt()
    }

    /** Thin reading-progress line; while loading a short segment sweeps across instead. */
    private class ReadingProgress(context: Context, accent: Int, private val track: Int) : View(context) {
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = accent }
        private var sweep = 0f
        private var animator: ValueAnimator? = null

        var fraction = 0f
            set(value) {
                field = value.coerceIn(0f, 1f)
                invalidate()
            }

        var loading = false
            set(value) {
                if (field == value) return
                field = value
                if (value) start() else stop()
                invalidate()
            }

        private fun start() {
            if (!isAttachedToWindow || animator != null) return
            animator = ValueAnimator.ofFloat(0f, 1f).apply {
                duration = 1200
                repeatCount = ValueAnimator.INFINITE
                interpolator = LinearInterpolator()
                addUpdateListener {
                    sweep = it.animatedValue as Float
                    invalidate()
                }
                start()
            }
        }

        private fun stop() {
            animator?.cancel()
            animator = null
        }

        override fun onAttachedToWindow() {
            super.onAttachedToWindow()
            if (loading) start()
        }

        override fun onDetachedFromWindow() {
            stop()
            super.onDetachedFromWindow()
        }

        override fun onDraw(canvas: Canvas) {
            val w = width.toFloat()
            val h = height.toFloat()
            if (loading) {
                val segment = w * 0.3f
                val left = -segment + (w + segment) * sweep
                canvas.drawRect(left.coerceAtLeast(0f), 0f, (left + segment).coerceAtMost(w), h, paint)
                return
            }
            if (fraction <= 0f) return
            canvas.drawColor(track)
            canvas.drawRect(0f, 0f, w * fraction, h, paint)
        }
    }

    private companion object {
        const val KEY_CHROME = "pdf_reader_layout_chrome"
        const val MENU_GO_TO = 1
        const val MENU_NIGHT = 2
        const val MENU_RESET_ZOOM = 3
        const val MENU_SHARE = 4
        const val MENU_SAVE = 5
        const val MENU_PRINT = 6
    }
}
