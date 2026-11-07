package {{packageName}}

import java.io.ByteArrayInputStream
import java.io.InputStream
import java.io.SequenceInputStream
import java.util.Collections

/** Reads a bounded prefix and leaves the rest of even very large HTML assets as a stream. */
internal object HtmlScriptInjector {
    private const val PREFIX_BYTES = 64 * 1024
    private val head = Regex("<head(?:\\s[^>]*)?>", RegexOption.IGNORE_CASE)

    fun inject(input: InputStream, scriptTag: String): InputStream {
        val prefix = ByteArray(PREFIX_BYTES)
        var length = 0
        while (length < prefix.size) {
            val read = input.read(prefix, length, prefix.size - length)
            if (read < 0) break
            if (read == 0) {
                val next = input.read()
                if (next < 0) break
                prefix[length++] = next.toByte()
            } else length += read
        }
        // Latin-1 preserves byte offsets, including when a UTF-8 character crosses the prefix boundary.
        val match = head.find(String(prefix, 0, length, Charsets.ISO_8859_1))
        val insertion = match?.range?.last?.plus(1) ?: if (
            length >= 3 && prefix[0] == 0xef.toByte() && prefix[1] == 0xbb.toByte() && prefix[2] == 0xbf.toByte()
        ) 3 else 0
        return SequenceInputStream(Collections.enumeration(listOf(
            ByteArrayInputStream(prefix, 0, insertion),
            scriptTag.byteInputStream(Charsets.UTF_8),
            ByteArrayInputStream(prefix, insertion, length - insertion),
            input
        )))
    }
}
