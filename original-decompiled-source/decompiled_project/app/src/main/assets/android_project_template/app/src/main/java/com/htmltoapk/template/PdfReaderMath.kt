package {{packageName}}

import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/** Plain-number geometry shared by the reader; kept free of Android types for JVM tests. */
internal object PdfReaderMath {
    const val MIN_ZOOM = 1f
    const val MAX_ZOOM = 5f
    const val DOUBLE_TAP_ZOOM = 2.5f
    /** Base rasters stay small; zoomed sharpness comes from viewport-sized detail tiles. */
    const val BASE_MAX_PIXELS = 2_000_000.0
    const val BASE_MAX_WIDTH = 1600

    data class Box(val left: Float, val top: Float, val right: Float, val bottom: Float) {
        val width get() = right - left
        val height get() = bottom - top
        val isEmpty get() = width <= 0f || height <= 0f
    }

    /** Translation range keeping a [size]-wide viewport filled at [zoom]. */
    fun clampPan(pan: Float, size: Int, zoom: Float): Float = pan.coerceIn(size * (1f - zoom), 0f)

    /** New pan after zooming to [newZoom] so the content under [focus] stays under it. */
    fun panForZoom(pan: Float, oldZoom: Float, newZoom: Float, focus: Float, size: Int): Float {
        val content = (focus - pan) / oldZoom
        return clampPan(focus - content * newZoom, size, newZoom)
    }

    /** Part of the list (unscaled coordinates) visible through the zoom transform. */
    fun visibleWindow(width: Int, height: Int, zoom: Float, panX: Float, panY: Float) =
        Box(-panX / zoom, -panY / zoom, (width - panX) / zoom, (height - panY) / zoom)

    fun intersect(a: Box, b: Box) = Box(max(a.left, b.left), max(a.top, b.top), min(a.right, b.right), min(a.bottom, b.bottom))

    /** Page rectangle inside an item: full width for scrolling, centred "fit page" for paging. */
    fun pageBox(itemWidth: Int, itemHeight: Int, ratio: Double, fitWholePage: Boolean): Box {
        if (!fitWholePage || itemWidth <= 0 || itemHeight <= 0) return Box(0f, 0f, itemWidth.toFloat(), itemHeight.toFloat())
        var width = itemWidth.toFloat()
        var height = (width * ratio).toFloat()
        if (height > itemHeight) {
            height = itemHeight.toFloat()
            width = (height / ratio).toFloat()
        }
        val left = (itemWidth - width) / 2f
        val top = (itemHeight - height) / 2f
        return Box(left, top, left + width, top + height)
    }

    /** Base raster size for a page drawn [targetWidth] px wide, bounded in width and pixel count. */
    fun baseRasterSize(targetWidth: Int, ratio: Double): Pair<Int, Int> {
        val safeRatio = ratio.coerceIn(0.05, 20.0)
        val width = minOf(targetWidth.coerceAtLeast(1), BASE_MAX_WIDTH, sqrt(BASE_MAX_PIXELS / safeRatio).toInt().coerceAtLeast(1))
        val height = (width * safeRatio).toInt().coerceIn(1, 4096)
        return width to height
    }

    /** 0-based page from a fast-scroll fraction. */
    fun pageForFraction(fraction: Float, pageCount: Int): Int {
        if (pageCount <= 1) return 0
        return (fraction.coerceIn(0f, 1f) * (pageCount - 1) + 0.5f).toInt().coerceIn(0, pageCount - 1)
    }

    fun fractionForPage(page: Int, pageCount: Int): Float =
        if (pageCount <= 1) 0f else page.coerceIn(0, pageCount - 1).toFloat() / (pageCount - 1)

    /** Parses "Go to page" input; null when it is not a page of the document. */
    fun parsePageInput(input: String, pageCount: Int): Int? =
        input.trim().toIntOrNull()?.takeIf { it in 1..pageCount }?.minus(1)

    fun encodeBookmarks(pages: Collection<Int>): String = pages.filter { it >= 0 }.distinct().sorted().joinToString(",")

    fun decodeBookmarks(value: String?, pageCount: Int = Int.MAX_VALUE): List<Int> =
        value.orEmpty().split(',').mapNotNull { it.trim().toIntOrNull() }
            .filter { it in 0 until pageCount }.distinct().sorted()
}
