package {{packageName}}

import android.app.Dialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.text.format.Formatter
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.roundToInt

/** Bottom sheet with page thumbnails; the bookmark filter is shown only when bookmarks are enabled. */
internal class PdfPageOverview(
    context: Context,
    private val palette: PdfReaderLayout.ReaderPalette,
    private val accent: Int,
    private val pageCount: Int,
    private val currentPage: Int,
    /** Null when the author turned bookmarks off. */
    private val bookmarks: List<Int>?,
    private val night: Boolean,
    private val fileSize: Long,
    private val loader: PdfThumbnailLoader,
    private val onPick: (Int) -> Unit
) : Dialog(context) {
    private val density = context.resources.displayMetrics.density
    private val bookmarked = bookmarks.orEmpty().toSet()
    private var bookmarksOnly = false
    private val grid = RecyclerView(context)
    private val empty = LinearLayout(context)
    private val adapter = Thumbnails()
    private var allChip: TextView? = null
    private var bookmarksChip: TextView? = null

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setCanceledOnTouchOutside(true)
        setContentView(buildContent())
        window?.apply {
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setGravity(Gravity.BOTTOM)
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, (context.resources.displayMetrics.heightPixels * 0.85f).roundToInt())
            setWindowAnimations(android.R.style.Animation_InputMethod)
        }
    }

    private fun dp(value: Int) = (value * density).roundToInt()

    private fun buildContent(): View {
        val sheet = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            background = GradientDrawable().apply {
                setColor(palette.surface)
                val r = dp(28).toFloat()
                cornerRadii = floatArrayOf(r, r, r, r, 0f, 0f, 0f, 0f)
            }
        }
        sheet.addView(View(context).apply {
            background = GradientDrawable().apply {
                cornerRadius = dp(2).toFloat()
                setColor(palette.outlineVariant)
            }
        }, LinearLayout.LayoutParams(dp(32), dp(4)).apply {
            gravity = Gravity.CENTER_HORIZONTAL
            topMargin = dp(16)
            bottomMargin = dp(12)
        })
        val header = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), 0, dp(20), 0)
        }
        header.addView(TextView(context).apply {
            setText(R.string.pdf_document_pages)
            setTextColor(palette.onSurface)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 22f)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        header.addView(TextView(context).apply {
            text = buildString {
                append(context.resources.getQuantityString(R.plurals.pdf_document_page_count, pageCount, pageCount))
                if (fileSize > 0) append(" · ").append(Formatter.formatShortFileSize(context, fileSize))
            }
            setTextColor(palette.onSurfaceVariant)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
        })
        if (bookmarks != null) {
            val chips = LinearLayout(context).apply {
                orientation = LinearLayout.HORIZONTAL
                setPadding(0, dp(12), 0, dp(4))
            }
            allChip = chip(context.getString(R.string.pdf_document_all_pages), R.drawable.pdf_ic_grid) { select(false) }
            chips.addView(allChip)
            bookmarksChip = chip(context.getString(R.string.pdf_document_bookmarks_count, bookmarks.size), R.drawable.pdf_ic_bookmark) {
                select(true)
            }
            chips.addView(bookmarksChip, LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, dp(32)).apply { marginStart = dp(8) })
            header.addView(chips)
        }
        sheet.addView(header)

        val body = FrameLayout(context)
        val span = ((context.resources.displayMetrics.widthPixels - dp(32)) / dp(108)).coerceAtLeast(3)
        grid.layoutManager = GridLayoutManager(context, span)
        grid.adapter = adapter
        grid.clipToPadding = false
        grid.setPadding(dp(16), dp(8), dp(16), dp(24))
        grid.overScrollMode = View.OVER_SCROLL_NEVER
        body.addView(grid, FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))

        empty.apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(dp(32), dp(48), dp(32), dp(48))
            visibility = View.GONE
            addView(ImageView(context).apply {
                setImageResource(R.drawable.pdf_ic_bookmark_border)
                imageTintList = ColorStateList.valueOf(palette.onSurfaceVariant)
            }, LinearLayout.LayoutParams(dp(40), dp(40)))
            addView(TextView(context).apply {
                setText(R.string.pdf_document_no_bookmarks)
                setTextColor(palette.onSurfaceVariant)
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
                gravity = Gravity.CENTER
                setPadding(0, dp(12), 0, 0)
            })
        }
        body.addView(empty, FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        sheet.addView(body, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

        // Edge-to-edge dialog windows would put the last row under the navigation bar.
        ViewCompat.setOnApplyWindowInsetsListener(sheet) { _, insets ->
            val bottom = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
            grid.setPadding(dp(16), dp(8), dp(16), dp(24) + bottom)
            insets
        }
        select(false)
        grid.scrollToPosition(currentPage.coerceIn(0, (pageCount - 1).coerceAtLeast(0)))
        return sheet
    }

    private fun chip(label: String, icon: Int, onClick: () -> Unit) = TextView(context).apply {
        text = label
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        gravity = Gravity.CENTER_VERTICAL
        setPadding(dp(8), 0, dp(16), 0)
        compoundDrawablePadding = dp(8)
        context.getDrawable(icon)?.mutate()?.let {
            it.setBounds(0, 0, dp(18), dp(18))
            setCompoundDrawablesRelative(it, null, null, null)
        }
        minHeight = dp(32)
        setOnClickListener { onClick() }
    }

    private fun styleChip(chip: TextView?, selected: Boolean) {
        chip ?: return
        val color = if (selected) accent else palette.onSurfaceVariant
        chip.setTextColor(if (selected) accent else palette.onSurface)
        chip.compoundDrawableTintList = ColorStateList.valueOf(color)
        chip.background = GradientDrawable().apply {
            cornerRadius = dp(8).toFloat()
            if (selected) setColor(ColorUtils.setAlphaComponent(accent, 41))
            else setStroke(dp(1), palette.outlineVariant)
        }
        chip.isSelected = selected
    }

    private fun select(onlyBookmarks: Boolean) {
        bookmarksOnly = onlyBookmarks
        styleChip(allChip, !onlyBookmarks)
        styleChip(bookmarksChip, onlyBookmarks)
        adapter.pages = if (onlyBookmarks) bookmarks.orEmpty() else null
        val isEmpty = onlyBookmarks && bookmarks.isNullOrEmpty()
        empty.visibility = if (isEmpty) View.VISIBLE else View.GONE
        grid.visibility = if (isEmpty) View.INVISIBLE else View.VISIBLE
        grid.scrollToPosition(if (onlyBookmarks) 0 else currentPage.coerceAtLeast(0))
    }

    /** Fixed page aspect so the grid does not jump while thumbnails arrive. */
    private class AspectFrame(context: Context) : FrameLayout(context) {
        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            val width = MeasureSpec.getSize(widthMeasureSpec)
            super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec((width / 0.72f).roundToInt(), MeasureSpec.EXACTLY))
        }
    }

    private class Holder(
        root: View,
        val frame: AspectFrame,
        val image: ImageView,
        val mark: ImageView,
        val number: TextView
    ) : RecyclerView.ViewHolder(root) {
        var page = -1
    }

    private inner class Thumbnails : RecyclerView.Adapter<Holder>() {
        /** Null = every page. */
        var pages: List<Int>? = null
            set(value) {
                field = value
                @Suppress("NotifyDataSetChanged")
                notifyDataSetChanged()
            }

        private val invert = ColorMatrixColorFilter(ColorMatrix(floatArrayOf(
            -1f, 0f, 0f, 0f, 255f,
            0f, -1f, 0f, 0f, 255f,
            0f, 0f, -1f, 0f, 255f,
            0f, 0f, 0f, 1f, 0f
        )))

        override fun getItemCount() = pages?.size ?: pageCount

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            val column = LinearLayout(parent.context).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER_HORIZONTAL
                setPadding(dp(4), dp(4), dp(4), dp(4))
                val value = TypedValue()
                context.theme.resolveAttribute(android.R.attr.selectableItemBackground, value, true)
                if (value.resourceId != 0) foreground = context.getDrawable(value.resourceId)
                layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                    .apply { setMargins(dp(2), dp(4), dp(2), dp(4)) }
            }
            val frame = AspectFrame(parent.context)
            val image = ImageView(parent.context).apply {
                scaleType = ImageView.ScaleType.FIT_CENTER
                clipToOutline = true
                background = GradientDrawable().apply {
                    cornerRadius = dp(8).toFloat()
                    setColor(palette.containerHighest)
                }
            }
            frame.addView(image, FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
            val mark = ImageView(parent.context).apply {
                setImageResource(R.drawable.pdf_ic_bookmark)
                imageTintList = ColorStateList.valueOf(accent)
            }
            frame.addView(mark, FrameLayout.LayoutParams(dp(20), dp(20), Gravity.TOP or Gravity.END).apply { setMargins(dp(4), dp(4), dp(4), dp(4)) })
            column.addView(frame, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
            val number = TextView(parent.context).apply {
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                gravity = Gravity.CENTER
                setPadding(0, dp(6), 0, 0)
            }
            column.addView(number)
            return Holder(column, frame, image, mark, number)
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            val page = pages?.getOrNull(position) ?: position
            holder.page = page
            val current = page == currentPage
            holder.frame.background = GradientDrawable().apply {
                cornerRadius = dp(10).toFloat()
                setStroke(if (current) (2.5f * density).roundToInt() else dp(1), if (current) accent else palette.outlineVariant)
            }
            val inset = if (current) dp(3) else dp(1)
            holder.frame.setPadding(inset, inset, inset, inset)
            holder.mark.visibility = if (page in bookmarked) View.VISIBLE else View.GONE
            holder.number.text = (page + 1).toString()
            holder.number.setTextColor(if (current) accent else palette.onSurfaceVariant)
            holder.number.typeface = if (current) Typeface.DEFAULT_BOLD else Typeface.DEFAULT
            holder.itemView.contentDescription = context.getString(R.string.pdf_document_page_number, page + 1)
            holder.itemView.setOnClickListener {
                onPick(page)
                dismiss()
            }
            val cached = loader.cached(page)
            if (cached != null) showBitmap(holder, cached) else {
                holder.image.colorFilter = null
                holder.image.setImageResource(R.drawable.pdf_ic_document)
                holder.image.imageTintList = ColorStateList.valueOf(ColorUtils.setAlphaComponent(palette.onSurfaceVariant, 89))
                holder.image.scaleType = ImageView.ScaleType.CENTER
                loader.load(page) { bitmap -> if (holder.page == page) showBitmap(holder, bitmap) }
            }
        }

        private fun showBitmap(holder: Holder, bitmap: android.graphics.Bitmap) {
            holder.image.imageTintList = null
            holder.image.scaleType = ImageView.ScaleType.FIT_CENTER
            holder.image.setImageBitmap(bitmap)
            holder.image.colorFilter = if (night) invert else null
        }

        override fun onViewRecycled(holder: Holder) {
            holder.page = -1
            holder.image.setImageDrawable(null)
        }
    }
}
