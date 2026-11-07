package {{packageName}}

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.VelocityTracker
import android.view.ViewConfiguration
import android.view.animation.DecelerateInterpolator
import android.widget.OverScroller
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.abs

/**
 * RecyclerView drawn through a zoom/pan transform. At 1x it scrolls normally; while zoomed it
 * owns every drag so the finger tracks the content 1:1, and in continuous mode pan overflow on
 * the scroll axis becomes list scrolling.
 */
internal class ZoomRecyclerView(context: Context) : RecyclerView(context) {
    var zoomEnabled = true
    var vertical = true
    /** Paged lists keep a zoomed gesture on the current page instead of scrolling. */
    var continuous = true
    var onSingleTap: (() -> Unit)? = null
    var onTransformChanged: (() -> Unit)? = null
    var onTransformSettled: (() -> Unit)? = null

    var zoom = 1f
        private set
    var panX = 0f
        private set
    var panY = 0f
        private set
    val isZoomed: Boolean get() = zoom > 1.01f

    private val scroller = OverScroller(context)
    private var flinging = false
    private var velocity: VelocityTracker? = null
    private var owning = false
    private var lastX = 0f
    private var lastY = 0f
    private var scrollRemainder = 0f
    private var animator: ValueAnimator? = null
    private val minFling = ViewConfiguration.get(context).scaledMinimumFlingVelocity
    private val maxFling = ViewConfiguration.get(context).scaledMaximumFlingVelocity.toFloat()

    private val scaleDetector = ScaleGestureDetector(context, object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScaleBegin(detector: ScaleGestureDetector) = zoomEnabled
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            zoomAround(zoom * detector.scaleFactor, detector.focusX, detector.focusY)
            return true
        }
    }).apply { isQuickScaleEnabled = false }

    private val gestures = GestureDetector(context, object : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
            onSingleTap?.invoke()
            return true
        }

        override fun onDoubleTap(e: MotionEvent): Boolean {
            if (!zoomEnabled) return false
            animateZoom(if (isZoomed) 1f else PdfReaderMath.DOUBLE_TAP_ZOOM, e.x, e.y)
            return true
        }
    })

    override fun dispatchDraw(canvas: Canvas) {
        if (zoom == 1f && panX == 0f && panY == 0f) {
            super.dispatchDraw(canvas)
            return
        }
        val save = canvas.save()
        canvas.translate(panX, panY)
        canvas.scale(zoom, zoom)
        super.dispatchDraw(canvas)
        canvas.restoreToCount(save)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (oldw != 0 && (w != oldw || h != oldh)) resetZoom()
    }

    override fun onInterceptTouchEvent(e: MotionEvent): Boolean {
        if (isZoomed || e.pointerCount > 1) return true
        return super.onInterceptTouchEvent(e)
    }

    override fun onTouchEvent(e: MotionEvent): Boolean {
        if (e.actionMasked == MotionEvent.ACTION_DOWN) {
            animator?.cancel()
            if (!scroller.isFinished) scroller.forceFinished(true)
            flinging = false
        }
        gestures.onTouchEvent(e)
        if (zoomEnabled) scaleDetector.onTouchEvent(e)
        if (!owning && (isZoomed || scaleDetector.isInProgress || e.pointerCount > 1)) {
            // Hand the gesture over: RecyclerView must not keep dragging underneath the pan.
            val cancel = MotionEvent.obtain(e).apply { action = MotionEvent.ACTION_CANCEL }
            super.onTouchEvent(cancel)
            cancel.recycle()
            stopScroll()
            owning = true
            velocity?.recycle()
            velocity = VelocityTracker.obtain()
            focus(e).let { lastX = it.first; lastY = it.second }
        }
        if (!owning) return super.onTouchEvent(e)
        handleOwned(e)
        return true
    }

    private fun focus(e: MotionEvent): Pair<Float, Float> {
        val skip = if (e.actionMasked == MotionEvent.ACTION_POINTER_UP) e.actionIndex else -1
        var x = 0f
        var y = 0f
        var count = 0
        for (index in 0 until e.pointerCount) {
            if (index == skip) continue
            x += e.getX(index)
            y += e.getY(index)
            count++
        }
        return if (count == 0) lastX to lastY else x / count to y / count
    }

    private fun handleOwned(e: MotionEvent) {
        velocity?.addMovement(e)
        val (x, y) = focus(e)
        when (e.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN, MotionEvent.ACTION_POINTER_UP -> {
                lastX = x
                lastY = y
            }
            MotionEvent.ACTION_MOVE -> {
                panBy(x - lastX, y - lastY)
                lastX = x
                lastY = y
            }
            MotionEvent.ACTION_UP -> {
                val tracker = velocity
                tracker?.computeCurrentVelocity(1000, maxFling)
                val vx = tracker?.xVelocity ?: 0f
                val vy = tracker?.yVelocity ?: 0f
                endOwnership()
                if (!flingOwned(vx, vy)) onTransformSettled?.invoke()
            }
            MotionEvent.ACTION_CANCEL -> {
                endOwnership()
                onTransformSettled?.invoke()
            }
        }
    }

    private fun endOwnership() {
        owning = false
        velocity?.recycle()
        velocity = null
    }

    private fun flingOwned(vx: Float, vy: Float): Boolean {
        if (abs(vx) < minFling && abs(vy) < minFling) return false
        var panVx = vx
        var panVy = vy
        if (continuous) {
            if (vertical) {
                fling(0, (-vy / zoom).toInt())
                panVy = 0f
            } else {
                fling((-vx / zoom).toInt(), 0)
                panVx = 0f
            }
        }
        if (!isZoomed || (panVx == 0f && panVy == 0f)) return false
        scroller.fling(panX.toInt(), panY.toInt(), panVx.toInt(), panVy.toInt(),
            (width * (1f - zoom)).toInt(), 0, (height * (1f - zoom)).toInt(), 0)
        flinging = true
        postInvalidateOnAnimation()
        return true
    }

    override fun computeScroll() {
        super.computeScroll()
        if (!flinging) return
        if (scroller.computeScrollOffset()) {
            panX = PdfReaderMath.clampPan(scroller.currX.toFloat(), width, zoom)
            panY = PdfReaderMath.clampPan(scroller.currY.toFloat(), height, zoom)
            onTransformChanged?.invoke()
            postInvalidateOnAnimation()
        } else {
            flinging = false
            onTransformSettled?.invoke()
        }
    }

    private fun panBy(dx: Float, dy: Float) {
        val newX = PdfReaderMath.clampPan(panX + dx, width, zoom)
        val newY = PdfReaderMath.clampPan(panY + dy, height, zoom)
        val restX = dx - (newX - panX)
        val restY = dy - (newY - panY)
        panX = newX
        panY = newY
        if (continuous) {
            val rest = if (vertical) restY else restX
            if (rest != 0f) {
                scrollRemainder += -rest / zoom
                val whole = scrollRemainder.toInt()
                if (whole != 0) {
                    scrollRemainder -= whole
                    if (vertical) scrollBy(0, whole) else scrollBy(whole, 0)
                }
            }
        }
        invalidate()
        onTransformChanged?.invoke()
    }

    fun zoomAround(target: Float, focusX: Float, focusY: Float) {
        val newZoom = target.coerceIn(PdfReaderMath.MIN_ZOOM, PdfReaderMath.MAX_ZOOM)
        panX = PdfReaderMath.panForZoom(panX, zoom, newZoom, focusX, width)
        panY = PdfReaderMath.panForZoom(panY, zoom, newZoom, focusY, height)
        zoom = newZoom
        invalidate()
        onTransformChanged?.invoke()
    }

    fun animateZoom(target: Float, focusX: Float = width / 2f, focusY: Float = height / 2f) {
        animator?.cancel()
        val start = zoom
        animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 220
            interpolator = DecelerateInterpolator()
            addUpdateListener { zoomAround(start + (target - start) * it.animatedFraction, focusX, focusY) }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    if (animator === animation) animator = null
                    onTransformSettled?.invoke()
                }
            })
            start()
        }
    }

    fun resetZoom() {
        animator?.cancel()
        scroller.forceFinished(true)
        flinging = false
        if (zoom == 1f && panX == 0f && panY == 0f) return
        zoom = 1f
        panX = 0f
        panY = 0f
        invalidate()
        onTransformChanged?.invoke()
        onTransformSettled?.invoke()
    }

    /** Puts the top of the zoomed window back at the list top, e.g. after jumping to a page. */
    fun resetPanAlongScroll() {
        if (vertical) panY = 0f else panX = 0f
        invalidate()
    }

    fun visibleWindow() = PdfReaderMath.visibleWindow(width, height, zoom, panX, panY)

    override fun onDetachedFromWindow() {
        animator?.cancel()
        super.onDetachedFromWindow()
    }
}
