package df;

import android.util.Log;
import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p.i0;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7917a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        int i11;
        while (true) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                break;
            }
            while (true) {
                if (i12 != 0 && i12 != 9 && i12 != 10 && i12 != 12 && i12 != 13 && i12 != 32) {
                    break;
                }
                i12 = inputStream.read();
            }
            if (i12 == -1 || i12 == 62) {
                break;
            }
            int[] iArr = f7917a;
            if (iArr[i12] == -1) {
                StringBuilder sbB = i0.b(i12, "Invalid hex, int: ", " char: ");
                sbB.append((char) i12);
                Log.e("PdfBox-Android", sbB.toString());
            }
            i11 = iArr[i12] * 16;
            int i13 = inputStream.read();
            if (i13 == -1 || i13 == 62) {
                break;
            }
            if (iArr[i13] == -1) {
                StringBuilder sbB2 = i0.b(i13, "Invalid hex, int: ", " char: ");
                sbB2.append((char) i13);
                Log.e("PdfBox-Android", sbB2.toString());
            }
            outputStream.write(i11 + iArr[i13]);
        }
        outputStream.write(i11);
        outputStream.flush();
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        while (true) {
            int i10 = dVar.read();
            if (i10 == -1) {
                outputStream.flush();
                return;
            }
            wf.b.b((byte) i10, outputStream);
        }
    }
}
