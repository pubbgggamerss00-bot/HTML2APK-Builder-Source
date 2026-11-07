package {{packageName}}

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.pdf.PdfRenderer
import android.os.Handler
import android.os.Looper
import android.os.ParcelFileDescriptor
import android.util.Log
import android.util.LruCache
import java.io.File
import java.util.concurrent.Executors
import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * Small page previews for the page overview. Uses its own renderer on its own thread
 * (PdfRenderer serialises pdfium calls process-wide since API 26), so the reader's page
 * rendering is never blocked or reordered. Bitmaps are bounded by an LRU cache.
 */
internal class PdfThumbnailLoader(private val file: File) {
    private val main = Handler(Looper.getMainLooper())
    private val executor = Executors.newSingleThreadExecutor()
    private var descriptor: ParcelFileDescriptor? = null // executor only
    private var renderer: PdfRenderer? = null // executor only
    @Volatile private var closed = false
    private val cache = object : LruCache<Int, Bitmap>(CACHE_BYTES) {
        override fun sizeOf(key: Int, value: Bitmap) = value.allocationByteCount
    }

    fun cached(page: Int): Bitmap? = cache.get(page)

    /** [onLoaded] runs on the main thread, and not at all once the loader is closed. */
    fun load(page: Int, onLoaded: (Bitmap) -> Unit) {
        cache.get(page)?.let { return onLoaded(it) }
        if (closed) return
        executor.execute {
            val bitmap = cache.get(page) ?: render(page)?.also { cache.put(page, it) } ?: return@execute
            main.post { if (!closed) onLoaded(bitmap) }
        }
    }

    private fun render(page: Int): Bitmap? {
        if (closed) return null
        return try {
            val pdf = renderer ?: PdfRenderer(
                ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY).also { descriptor = it }
            ).also { renderer = it }
            pdf.openPage(page).use { source ->
                val ratio = source.height.toFloat() / source.width.coerceAtLeast(1)
                var width = WIDTH
                if (width * width * ratio > MAX_PIXELS) width = sqrt(MAX_PIXELS / ratio).toInt().coerceAtLeast(1)
                val height = (width * ratio).roundToInt().coerceIn(1, width * 4)
                Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888).apply {
                    eraseColor(Color.WHITE)
                    source.render(this, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                }
            }
        } catch (failure: Exception) {
            Log.w(TAG, "Cannot render page $page", failure)
            null
        }
    }

    fun close() {
        if (closed) return
        closed = true
        main.removeCallbacksAndMessages(null)
        executor.execute {
            runCatching { renderer?.close() }
            runCatching { descriptor?.close() }
            cache.evictAll()
        }
        executor.shutdown()
    }

    private companion object {
        const val TAG = "PdfThumbnailLoader"
        const val WIDTH = 240
        const val CACHE_BYTES = 16 * 1024 * 1024
        const val MAX_PIXELS = 1_000_000f
    }
}
