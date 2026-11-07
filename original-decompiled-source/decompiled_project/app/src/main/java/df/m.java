package df;

import android.util.Log;
import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class m extends k {
    public static void e(InputStream inputStream, OutputStream outputStream) throws DataFormatException, IOException {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int i10 = inputStream.read(bArr);
        if (i10 > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, i10);
            byte[] bArr2 = new byte[1024];
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        int iInflate = inflater.inflate(bArr2);
                        if (iInflate == 0) {
                            if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                break;
                            } else {
                                inflater.setInput(bArr, 0, inputStream.read(bArr));
                            }
                        } else {
                            outputStream.write(bArr2, 0, iInflate);
                            z10 = true;
                        }
                    } catch (DataFormatException e10) {
                        if (!z10) {
                            throw e10;
                        }
                        Log.w("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        try {
            e(inputStream, r.a(outputStream, k.d(tVar, i10)));
            return new j(tVar);
        } catch (DataFormatException e10) {
            Log.e("PdfBox-Android", "FlateFilter: stop reading corrupt stream due to a DataFormatException");
            throw new IOException(e10);
        }
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws NumberFormatException, IOException {
        int i10;
        try {
            i10 = Integer.parseInt(System.getProperty("com.tom_roush.pdfbox.filter.deflatelevel", "-1"));
        } catch (NumberFormatException e10) {
            Log.w("PdfBox-Android", e10.getMessage(), e10);
            i10 = -1;
        }
        Deflater deflater = new Deflater(Math.max(-1, Math.min(9, i10)));
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
        ef.a.c(dVar, deflaterOutputStream);
        deflaterOutputStream.close();
        outputStream.flush();
        deflater.end();
    }
}
