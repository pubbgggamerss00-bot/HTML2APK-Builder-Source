package i3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class f {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream, boolean z6) throws IOException {
        byte[] bArr = new byte[1024];
        long j6 = 0;
        while (true) {
            try {
                int i6 = inputStream.read(bArr, 0, 1024);
                if (i6 == -1) {
                    break;
                }
                j6 += i6;
                outputStream.write(bArr, 0, i6);
            } catch (Throwable th) {
                if (z6) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z6) {
            a(inputStream);
            a(outputStream);
        }
        return j6;
    }
}
