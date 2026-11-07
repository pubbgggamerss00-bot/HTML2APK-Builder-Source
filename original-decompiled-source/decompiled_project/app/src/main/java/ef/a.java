package ef;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class a {
    public static IOException a(Closeable closeable, String str, IOException iOException) throws IOException {
        try {
            closeable.close();
            return iOException;
        } catch (IOException e10) {
            Log.w("PdfBox-Android", "Error closing ".concat(str), e10);
            return iOException == null ? e10 : iOException;
        }
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }
}
