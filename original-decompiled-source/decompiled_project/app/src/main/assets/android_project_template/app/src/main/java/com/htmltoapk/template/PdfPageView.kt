package {{packageName}}

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Outline
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import android.view.ViewOutlineProvider
import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * One PDF page: a small base raster stretched over the page box, plus an optional sharp tile
 * covering only the zoomed, visible part. Bitmaps are owned (and recycled) by the reader.
 */
internal class PdfPageView(context: Context) : View(context) {
    var ratio = sqrt(2.0)
        set(value) {
            if (field == value) return
            field = value
            updatePageBox()
        }
    var fitWholePage = false
        set(value) {
            field = value
            updatePageBox()
        }
    var night = false
        set(value) {
            if (field == value) return
            field = value
            val filter = if (value) NIGHT_FILTER else null
            bitmapPaint.colorFilter = filter
            paperPaint.colorFilter = filter
            invalidate()
        }
    var base: Bitmap? = null
        private set
    var detail: Bitmap? = null
        private set
    /** Detail tile bounds in this view's coordinates, and the zoom it was rendered for. */
    val detailBox = RectF()
    var detailZoom = 0f
        private set
    /** Page area inside the view (equals the view bounds unless the whole page is fitted). */
    val pageBox = RectF()

    private val bitmapPaint = Paint(Paint.FILTER_BITMAP_FLAG or Paint.DITHER_FLAG)
    private val paperPaint = Paint().apply { color = Color.WHITE }

    init {
        outlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) {
                outline.setRect(pageBox.left.roundToInt(), pageBox.top.roundToInt(),
                    pageBox.right.roundToInt(), pageBox.bottom.roundToInt())
            }
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updatePageBox()
    }

    private fun updatePageBox() {
        val box = PdfReaderMath.pageBox(width, height, ratio, fitWholePage)
        pageBox.set(box.left, box.top, box.right, box.bottom)
        invalidateOutline()
        invalidate()
    }

    /** Returns the previous bitmap so the caller can recycle it after it is no longer drawn. */
    fun swapBase(bitmap: Bitmap?): Bitmap? {
        val old = base
        base = bitmap
        invalidate()
        return old
    }

    fun swapDetail(bitmap: Bitmap?, box: RectF? = null, zoom: Float = 0f): Bitmap? {
        val old = detail
        detail = bitmap
        if (bitmap != null && box != null) detailBox.set(box) else detailBox.setEmpty()
        detailZoom = if (bitmap != null) zoom else 0f
        invalidate()
        return old
    }

    override fun onDraw(canvas: Canvas) {
        if (pageBox.isEmpty) return
        canvas.drawRect(pageBox, paperPaint)
        base?.takeUnless { it.isRecycled }?.let { canvas.drawBitmap(it, null, pageBox, bitmapPaint) }
        detail?.takeUnless { it.isRecycled }?.let { canvas.drawBitmap(it, null, detailBox, bitmapPaint) }
    }

    companion object {
        /** Inverts luminance into dark grey paper with light text, softer than pure black. */
        val NIGHT_FILTER: ColorFilter = ColorMatrixColorFilter(ColorMatrix(floatArrayOf(
            -0.85f, 0f, 0f, 0f, 240f,
            0f, -0.85f, 0f, 0f, 240f,
            0f, 0f, -0.85f, 0f, 240f,
            0f, 0f, 0f, 1f, 0f
        )))
    }
}
