package df;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import cf.t;
import cf.x;
import com.gemalto.jp2.JP2Decoder;
import com.gemalto.jp2.JP2Encoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class o extends k {
    public static Bitmap e(InputStream inputStream, j jVar) throws ClassNotFoundException, IOException {
        try {
            Class.forName("com.gemalto.jp2.JP2Decoder");
            Bitmap bitmapDecode = new JP2Decoder(inputStream).decode();
            cf.d dVar = jVar.f7968a;
            if (!dVar.i0(cf.l.f5451b1)) {
                dVar.L0(cf.l.f5469g0);
            }
            dVar.N0(cf.l.E2, bitmapDecode.getWidth());
            dVar.N0(cf.l.T0, bitmapDecode.getHeight());
            if (!dVar.f5423b.containsKey(cf.l.T)) {
                bitmapDecode.getColorSpace();
            }
            return bitmapDecode;
        } catch (ClassNotFoundException unused) {
            throw new q("Cannot read JPX image: JP2Android is not installed.");
        }
    }

    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        return b(inputStream, outputStream, tVar, i10);
    }

    @Override // df.k
    public final j b(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws ClassNotFoundException, IOException {
        cf.d dVar = new cf.d();
        j jVar = new j(dVar);
        dVar.g0(tVar);
        Bitmap bitmapE = e(inputStream, jVar);
        int height = bitmapE.getHeight() * bitmapE.getWidth();
        int[] iArr = new int[height];
        bitmapE.getPixels(iArr, 0, bitmapE.getWidth(), 0, 0, bitmapE.getWidth(), bitmapE.getHeight());
        byte[] bArr = new byte[3072];
        int i11 = 0;
        for (int i12 = 0; i12 < height; i12++) {
            if (i11 + 3 >= 3072) {
                outputStream.write(bArr, 0, i11);
                i11 = 0;
            }
            int i13 = iArr[i12];
            bArr[i11] = (byte) Color.red(i13);
            bArr[i11 + 1] = (byte) Color.green(i13);
            bArr[i11 + 2] = (byte) Color.blue(i13);
            i11 += 3;
        }
        outputStream.write(bArr, 0, i11);
        return jVar;
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        ef.a.c(new ByteArrayInputStream(new JP2Encoder(BitmapFactory.decodeStream(dVar)).encode()), outputStream);
        outputStream.flush();
    }
}
