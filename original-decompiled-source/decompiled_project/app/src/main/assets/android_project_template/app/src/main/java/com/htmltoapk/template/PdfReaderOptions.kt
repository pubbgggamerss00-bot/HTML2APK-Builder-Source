package {{packageName}}

import android.os.Bundle
import org.json.JSONObject

/**
 * Reader behaviour chosen by the app author. Strings instead of enums: the template shell is
 * repackaged at DEX level and synthetic enum array descriptors are not moved with it.
 */
data class PdfReaderOptions(
    /** "vertical" = continuous scroll, "horizontal" = one page per swipe like a book. */
    val scrollMode: String = SCROLL_VERTICAL,
    /** "off", "on" or "system": inverts page colours for reading in the dark. */
    val nightMode: String = NIGHT_OFF,
    /** "auto", "dark" or "light": colour of the reader chrome around the pages. */
    val colorMode: String = "auto",
    val rememberPage: Boolean = true,
    val showToolbar: Boolean = true,
    val showPageIndicator: Boolean = true,
    val fastScroll: Boolean = true,
    val zoomEnabled: Boolean = true,
    val bookmarks: Boolean = true,
    /** Lets readers share, save and print the embedded document. */
    val allowExport: Boolean = false,
    /** 1-based page shown on first launch (and whenever the last page is not remembered). */
    val startPage: Int = 1,
    val accentColor: Int = DEFAULT_ACCENT,
    val title: String = ""
) {
    val isHorizontal: Boolean get() = scrollMode == SCROLL_HORIZONTAL

    fun toBundle(): Bundle = Bundle().apply {
        putString("scrollMode", scrollMode)
        putString("nightMode", nightMode)
        putString("colorMode", colorMode)
        putBoolean("rememberPage", rememberPage)
        putBoolean("showToolbar", showToolbar)
        putBoolean("showPageIndicator", showPageIndicator)
        putBoolean("fastScroll", fastScroll)
        putBoolean("zoomEnabled", zoomEnabled)
        putBoolean("bookmarks", bookmarks)
        putBoolean("allowExport", allowExport)
        putInt("startPage", startPage)
        putInt("accentColor", accentColor)
        putString("title", title)
    }

    companion object {
        const val SCROLL_VERTICAL = "vertical"
        const val SCROLL_HORIZONTAL = "horizontal"
        const val NIGHT_OFF = "off"
        const val NIGHT_ON = "on"
        const val NIGHT_SYSTEM = "system"
        const val DEFAULT_ACCENT = 0xFF2196F3.toInt()

        fun normalizedScrollMode(value: String?) =
            if (value == SCROLL_HORIZONTAL) SCROLL_HORIZONTAL else SCROLL_VERTICAL

        fun normalizedNightMode(value: String?) =
            if (value == NIGHT_ON || value == NIGHT_SYSTEM) value else NIGHT_OFF

        fun fromJson(json: JSONObject?, accentColor: Int = DEFAULT_ACCENT, colorMode: String = "auto", title: String = ""): PdfReaderOptions {
            val defaults = PdfReaderOptions()
            if (json == null) return defaults.copy(accentColor = accentColor, colorMode = colorMode, title = title)
            return PdfReaderOptions(
                scrollMode = normalizedScrollMode(json.optString("scrollMode")),
                nightMode = normalizedNightMode(json.optString("nightMode")),
                colorMode = colorMode,
                rememberPage = json.optBoolean("rememberPage", defaults.rememberPage),
                showToolbar = json.optBoolean("showToolbar", defaults.showToolbar),
                showPageIndicator = json.optBoolean("showPageIndicator", defaults.showPageIndicator),
                fastScroll = json.optBoolean("fastScroll", defaults.fastScroll),
                zoomEnabled = json.optBoolean("zoomEnabled", defaults.zoomEnabled),
                bookmarks = json.optBoolean("bookmarks", defaults.bookmarks),
                allowExport = json.optBoolean("allowExport", defaults.allowExport),
                startPage = json.optInt("startPage", 1).coerceAtLeast(1),
                accentColor = accentColor,
                title = title
            )
        }

        fun fromBundle(bundle: Bundle?): PdfReaderOptions {
            val defaults = PdfReaderOptions()
            if (bundle == null) return defaults
            return PdfReaderOptions(
                scrollMode = normalizedScrollMode(bundle.getString("scrollMode")),
                nightMode = normalizedNightMode(bundle.getString("nightMode")),
                colorMode = bundle.getString("colorMode") ?: defaults.colorMode,
                rememberPage = bundle.getBoolean("rememberPage", defaults.rememberPage),
                showToolbar = bundle.getBoolean("showToolbar", defaults.showToolbar),
                showPageIndicator = bundle.getBoolean("showPageIndicator", defaults.showPageIndicator),
                fastScroll = bundle.getBoolean("fastScroll", defaults.fastScroll),
                zoomEnabled = bundle.getBoolean("zoomEnabled", defaults.zoomEnabled),
                bookmarks = bundle.getBoolean("bookmarks", defaults.bookmarks),
                allowExport = bundle.getBoolean("allowExport", defaults.allowExport),
                startPage = bundle.getInt("startPage", 1).coerceAtLeast(1),
                accentColor = bundle.getInt("accentColor", DEFAULT_ACCENT),
                title = bundle.getString("title") ?: ""
            )
        }
    }
}
