package {{packageName}}

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.MotionEvent
import android.view.View

/**
 * Draggable thumb on the right edge for long documents. It only claims touches that start in
 * its strip while visible, so everything else still reaches the page list underneath.
 */
internal class PdfFastScroller(context: Context, accent: Int) : View(context) {
    var pageCount = 0
    var fraction = 0f
        set(value) {
            field = value.coerceIn(0f, 1f)
            invalidate()
        }
    var label: (Float) -> String = { "" }
    var onScrub: ((Float) -> Unit)? = null
    var onScrubEnd: (() -> Unit)? = null
    var dragging = false
        private set

    private val density = resources.displayMetrics.density
    private val thumbWidth = 6 * density
    private val thumbHeight = 52 * density
    private val touchStrip = 44 * density
    private val edge = 4 * density
    private val thumbPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = accent }
    private val bubblePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = accent }
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 16 * density
        isFakeBoldText = true
        textAlign = Paint.Align.CENTER
    }
    private val rect = RectF()
    private val hide = Runnable { if (!dragging) animate().alpha(0f).setDuration(250).start() }

    init {
        alpha = 0f
    }

    fun reveal() {
        if (pageCount < 2) return
        removeCallbacks(hide)
        if (alpha < 1f) animate().alpha(1f).setDuration(120).start()
        postDelayed(hide, 1500)
    }

    private fun thumbTop() = fraction * (height - thumbHeight).coerceAtLeast(0f)

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (alpha < 0.2f || pageCount < 2 || event.x < width - touchStrip) return false
                val top = thumbTop()
                if (event.y < top - touchStrip || event.y > top + thumbHeight + touchStrip) return false
                dragging = true
                parent?.requestDisallowInterceptTouchEvent(true)
                removeCallbacks(hide)
                animate().cancel()
                alpha = 1f
                scrubTo(event.y)
                return true
            }
            MotionEvent.ACTION_MOVE -> if (dragging) scrubTo(event.y)
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> if (dragging) {
                dragging = false
                invalidate()
                onScrubEnd?.invoke()
                postDelayed(hide, 1200)
            }
        }
        return dragging
    }

    private fun scrubTo(y: Float) {
        val travel = (height - thumbHeight).coerceAtLeast(1f)
        fraction = (y - thumbHeight / 2f) / travel
        onScrub?.invoke(fraction)
    }

    override fun onDraw(canvas: Canvas) {
        if (pageCount < 2) return
        val top = thumbTop()
        val right = width - edge
        rect.set(right - thumbWidth, top, right, top + thumbHeight)
        canvas.drawRoundRect(rect, thumbWidth, thumbWidth, thumbPaint)
        if (dragging) {
            val text = label(fraction)
            val bubbleWidth = textPaint.measureText(text) + 28 * density
            val bubbleHeight = 40 * density
            val centerY = (top + thumbHeight / 2f).coerceIn(bubbleHeight / 2f, height - bubbleHeight / 2f)
            rect.set(right - thumbWidth - 16 * density - bubbleWidth, centerY - bubbleHeight / 2f,
                right - thumbWidth - 16 * density, centerY + bubbleHeight / 2f)
            canvas.drawRoundRect(rect, bubbleHeight / 2f, bubbleHeight / 2f, bubblePaint)
            canvas.drawText(text, rect.centerX(), centerY - (textPaint.ascent() + textPaint.descent()) / 2f, textPaint)
        }
    }

    override fun onDetachedFromWindow() {
        removeCallbacks(hide)
        super.onDetachedFromWindow()
    }
}
