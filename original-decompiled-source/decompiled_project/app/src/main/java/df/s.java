package df;

import android.util.Log;
import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class s extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        byte[] bArr = new byte[128];
        while (true) {
            int i11 = inputStream.read();
            if (i11 == -1 || i11 == 128) {
                break;
            }
            if (i11 <= 127) {
                int i12 = i11 + 1;
                while (i12 > 0) {
                    int i13 = inputStream.read(bArr, 0, i12);
                    if (i13 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i13);
                    i12 -= i13;
                }
            } else {
                int i14 = inputStream.read();
                if (i14 == -1) {
                    break;
                }
                for (int i15 = 0; i15 < 257 - i11; i15++) {
                    outputStream.write(i14);
                }
            }
        }
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        Log.w("PdfBox-Android", "RunLengthDecodeFilter.encode is not implemented yet, skipping this stream.");
    }
}
