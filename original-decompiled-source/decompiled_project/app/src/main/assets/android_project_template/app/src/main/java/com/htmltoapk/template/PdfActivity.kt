package {{packageName}}

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.webkit.CookieManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.addCallback
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import {{packageName}}.PdfExport
import {{packageName}}.PdfReaderLayout
import {{packageName}}.PdfReaderOptions
import java.io.File
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

/** Opens PDFs linked from web content with the same native reader used by PDF projects. */
class PdfActivity : ComponentActivity() {
    private lateinit var reader: PdfReaderLayout
    @Volatile private var connection: HttpURLConnection? = null
    private var pendingSave: File? = null
    private val saveLauncher = registerForActivityResult(ActivityResultContracts.CreateDocument("application/pdf")) { target ->
        val file = pendingSave
        pendingSave = null
        if (target != null && file != null) PdfExport.saveTo(this, file, target)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val uri = intent.data
        val title = uri?.lastPathSegment?.substringAfterLast('/')?.takeIf { it.isNotBlank() } ?: getString(R.string.pdf_loading)
        // A document the page linked to is already the reader's own download: allow keeping it.
        val options = PdfReaderOptions(
            allowExport = true,
            title = title,
            accentColor = intent.getIntExtra(EXTRA_ACCENT, PdfReaderOptions.DEFAULT_ACCENT),
            colorMode = intent.getStringExtra(EXTRA_COLOR_MODE) ?: "auto"
        )
        val systemDark = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
        val dark = when (options.colorMode) {
            "dark" -> true
            "light" -> false
            else -> systemDark
        }
        // Bars are drawn by the reader itself; icons follow its light or dark chrome.
        val bars = if (dark) SystemBarStyle.dark(Color.TRANSPARENT) else SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT)
        enableEdgeToEdge(bars, bars)
        super.onCreate(savedInstanceState)
        reader = PdfReaderLayout(this, options, showBack = true, fitSystemBars = true)
        reader.onBack = { finish() }
        reader.document.useDefaultExport(this) { file ->
            pendingSave = file
            try {
                saveLauncher.launch(PdfExport.fileName(title))
            } catch (_: Exception) {
                pendingSave = null
                Toast.makeText(this, {{packageName}}.R.string.pdf_document_export_failed, Toast.LENGTH_SHORT).show()
            }
        }
        reader.restoreState(savedInstanceState)
        setContentView(reader)
        onBackPressedDispatcher.addCallback(this) {
            if (!reader.handleBack()) finish()
        }
        val cookie = uri?.let { CookieManager.getInstance().getCookie(it.toString()) }
        reader.openDocument {
            try {
                input(requireNotNull(uri), cookie)
            } catch (failure: Exception) {
                connection?.disconnect()
                throw failure
            }
        }
    }

    private fun input(uri: Uri, cookie: String?): InputStream = when {
        uri.scheme == "content" -> contentResolver.openInputStream(uri) ?: error("Cannot open PDF")
        uri.scheme == "https" && uri.host == "appassets.androidplatform.net" && uri.path?.startsWith("/assets/www/") == true -> {
            val path = uri.path!!.removePrefix("/assets/")
            require(path.split('/').none { it == ".." })
            assets.open(path)
        }
        uri.scheme in listOf("https", "http") -> {
            val remote = URL(uri.toString()).openConnection() as HttpURLConnection
            connection = remote
            remote.connectTimeout = 15_000
            remote.readTimeout = 20_000
            if (!cookie.isNullOrBlank()) remote.setRequestProperty("Cookie", cookie)
            remote.inputStream
        }
        else -> error("Unsupported PDF address")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        reader.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        connection?.disconnect()
        reader.release()
        super.onDestroy()
    }

    companion object {
        private const val EXTRA_ACCENT = "pdf_accent"
        private const val EXTRA_COLOR_MODE = "pdf_color_mode"

        fun isPdf(uri: Uri?): Boolean = uri?.path?.endsWith(".pdf", ignoreCase = true) == true
        fun open(context: Context, uri: Uri, accentColor: Int = PdfReaderOptions.DEFAULT_ACCENT, colorMode: String = "auto"): Boolean {
            if (uri.scheme !in listOf("content", "https", "http")) return false
            context.startActivity(Intent(context, PdfActivity::class.java).apply {
                data = uri
                putExtra(EXTRA_ACCENT, accentColor)
                putExtra(EXTRA_COLOR_MODE, colorMode)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                if (context !is Activity) addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            })
            return true
        }
    }
}
