package {{packageName}}

import android.content.Context

/** Per-document reading position, bookmarks and night toggle. A null key keeps nothing. */
internal class PdfReaderStore(context: Context, key: String?) {
    private val prefs = key?.let {
        context.getSharedPreferences("pdfviewer_" + it.replace(Regex("[^A-Za-z0-9_.-]"), "_").take(80), Context.MODE_PRIVATE)
    }

    val hasPosition: Boolean get() = prefs?.contains("page") == true
    val page: Int get() = prefs?.getInt("page", 0) ?: 0
    val pageFraction: Float get() = prefs?.getFloat("pageFraction", 0f) ?: 0f

    fun savePosition(page: Int, fraction: Float) {
        prefs?.edit()?.putInt("page", page)?.putFloat("pageFraction", fraction.coerceIn(0f, 1f))?.apply()
    }

    fun bookmarks(pageCount: Int): List<Int> = PdfReaderMath.decodeBookmarks(prefs?.getString("bookmarks", null), pageCount)

    fun saveBookmarks(pages: Collection<Int>) {
        prefs?.edit()?.putString("bookmarks", PdfReaderMath.encodeBookmarks(pages))?.apply()
    }

    /** null when the reader never toggled night mode, so the author's default applies. */
    val night: Boolean? get() = prefs?.takeIf { it.contains("night") }?.getBoolean("night", false)

    fun saveNight(enabled: Boolean) {
        prefs?.edit()?.putBoolean("night", enabled)?.apply()
    }
}
