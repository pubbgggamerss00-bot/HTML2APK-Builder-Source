package df;

import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class h extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        cf.l lVar = (cf.l) tVar.v0(cf.l.f5531w1);
        if (lVar == null || lVar.equals(cf.l.X0)) {
            new n().a(inputStream, outputStream, tVar, i10);
            return new j(tVar);
        }
        throw new IOException("Unsupported crypt filter " + lVar.f5545b);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        cf.l lVar = (cf.l) xVar.v0(cf.l.f5531w1);
        if (lVar == null || lVar.equals(cf.l.X0)) {
            new n().c(dVar, outputStream, xVar);
        } else {
            throw new IOException("Unsupported crypt filter " + lVar.f5545b);
        }
    }
}
