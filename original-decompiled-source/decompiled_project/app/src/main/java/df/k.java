package df;

import android.util.Log;
import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class k {
    public static cf.d d(t tVar, int i10) {
        cf.b bVarY0 = tVar.y0(cf.l.A0, cf.l.B0);
        cf.b bVarY02 = tVar.y0(cf.l.f5507q0, cf.l.f5473h0);
        if ((bVarY0 instanceof cf.l) && (bVarY02 instanceof cf.d)) {
            return (cf.d) bVarY02;
        }
        boolean z10 = bVarY0 instanceof cf.a;
        if (z10 && (bVarY02 instanceof cf.a)) {
            cf.a aVar = (cf.a) bVarY02;
            if (i10 < aVar.f5416b.size()) {
                cf.b bVarL0 = aVar.l0(i10);
                if (bVarL0 instanceof cf.d) {
                    return (cf.d) bVarL0;
                }
            }
        } else if (bVarY02 != null && !z10 && !(bVarY02 instanceof cf.a)) {
            Log.e("PdfBox-Android", "Expected DecodeParams to be an Array or Dictionary but found ".concat(bVarY02.getClass().getName()));
        }
        return new cf.d();
    }

    public abstract j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException;

    public j b(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        return a(inputStream, outputStream, tVar, i10);
    }

    public abstract void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException;
}
