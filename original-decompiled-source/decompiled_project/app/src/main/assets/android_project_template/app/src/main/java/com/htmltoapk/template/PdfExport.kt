package {{packageName}}

import android.app.Activity
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.CancellationSignal
import android.os.Handler
import android.os.Looper
import android.os.ParcelFileDescriptor
import android.print.PageRange
import android.print.PrintAttributes
import android.print.PrintDocumentAdapter
import android.print.PrintDocumentInfo
import android.print.PrintManager
import android.util.Log
import android.widget.Toast
import java.io.File
import java.io.FileOutputStream

/** Share / save / print for the document file the reader has open. Copies run off the UI thread. */
object PdfExport {
    private val main = Handler(Looper.getMainLooper())

    fun fileName(title: String): String {
        val base = title.replace(Regex("[\\\\/:*?\"<>|\\p{Cntrl}]"), "_").trim().trim('.').take(80)
            .removeSuffix(".pdf").removeSuffix(".PDF").ifBlank { "document" }
        return "$base.pdf"
    }

    /** Shares a copy named after [title] through the app's `<package>.fileprovider`. */
    fun share(activity: Activity, file: File, title: String) {
        Thread {
            try {
                val directory = File(activity.cacheDir, "pdf_share").apply { deleteRecursively(); mkdirs() }
                val copy = File(directory, fileName(title))
                file.copyTo(copy, overwrite = true)
                val uri = androidx.core.content.FileProvider.getUriForFile(activity, "${activity.packageName}.fileprovider", copy)
                main.post {
                    if (activity.isFinishing || activity.isDestroyed) return@post
                    val send = Intent(Intent.ACTION_SEND).apply {
                        type = "application/pdf"
                        putExtra(Intent.EXTRA_STREAM, uri)
                        putExtra(Intent.EXTRA_TITLE, copy.name)
                        clipData = ClipData.newRawUri(copy.name, uri)
                        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    }
                    try {
                        activity.startActivity(Intent.createChooser(send, activity.getString(R.string.pdf_document_share)))
                    } catch (failure: Exception) {
                        failed(activity, failure)
                    }
                }
            } catch (failure: Exception) {
                main.post { failed(activity, failure) }
            }
        }.start()
    }

    /** Copies the document to a location picked with ACTION_CREATE_DOCUMENT. */
    fun saveTo(context: Context, file: File, target: Uri) {
        val app = context.applicationContext
        Thread {
            val ok = try {
                app.contentResolver.openOutputStream(target, "w")?.use { output -> file.inputStream().use { it.copyTo(output, 64 * 1024) } } != null
            } catch (failure: Exception) {
                Log.w("PdfExport", "Save failed", failure)
                false
            }
            main.post {
                Toast.makeText(app, if (ok) R.string.pdf_document_saved else R.string.pdf_document_export_failed, Toast.LENGTH_SHORT).show()
            }
        }.start()
    }

    fun print(activity: Activity, file: File, title: String) {
        try {
            val manager = activity.getSystemService(Context.PRINT_SERVICE) as PrintManager
            manager.print(fileName(title).removeSuffix(".pdf"), FilePrintAdapter(file, fileName(title)), PrintAttributes.Builder().build())
        } catch (failure: Exception) {
            failed(activity, failure)
        }
    }

    private fun failed(context: Context, failure: Exception) {
        Log.w("PdfExport", "Export failed", failure)
        Toast.makeText(context, R.string.pdf_document_export_failed, Toast.LENGTH_SHORT).show()
    }

    private class FilePrintAdapter(private val file: File, private val name: String) : PrintDocumentAdapter() {
        override fun onLayout(oldAttributes: PrintAttributes?, newAttributes: PrintAttributes, cancellationSignal: CancellationSignal,
                              callback: LayoutResultCallback, extras: Bundle?) {
            if (cancellationSignal.isCanceled) {
                callback.onLayoutCancelled()
                return
            }
            callback.onLayoutFinished(PrintDocumentInfo.Builder(name)
                .setContentType(PrintDocumentInfo.CONTENT_TYPE_DOCUMENT).build(), oldAttributes == null)
        }

        override fun onWrite(pages: Array<out PageRange>, destination: ParcelFileDescriptor, cancellationSignal: CancellationSignal,
                             callback: WriteResultCallback) {
            Thread {
                try {
                    FileOutputStream(destination.fileDescriptor).use { output ->
                        file.inputStream().use { input ->
                            val buffer = ByteArray(64 * 1024)
                            while (true) {
                                if (cancellationSignal.isCanceled) {
                                    main.post { callback.onWriteCancelled() }
                                    return@Thread
                                }
                                val count = input.read(buffer)
                                if (count < 0) break
                                output.write(buffer, 0, count)
                            }
                        }
                    }
                    main.post { callback.onWriteFinished(arrayOf(PageRange.ALL_PAGES)) }
                } catch (failure: Exception) {
                    main.post { callback.onWriteFailed(failure.message) }
                }
            }.start()
        }
    }
}
