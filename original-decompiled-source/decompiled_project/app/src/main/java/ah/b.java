package ah;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class b {
    public static final long a(InputStream inputStream, OutputStream out, int i10) throws IOException {
        r.e(inputStream, "<this>");
        r.e(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static final byte[] b(InputStream inputStream) throws IOException {
        r.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        r.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
