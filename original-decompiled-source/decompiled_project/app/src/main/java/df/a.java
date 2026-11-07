package df;

import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class a extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(inputStream);
            try {
                ef.a.c(bVar2, outputStream);
                outputStream.flush();
                ef.a.b(bVar2);
                return new j(tVar);
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                ef.a.b(bVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        c cVar = new c(outputStream);
        cVar.f7910a = 72;
        cVar.f7914e = 72;
        cVar.f7911b = 0;
        cVar.f7912c = new byte[4];
        cVar.f7913d = new byte[5];
        cVar.f7915f = true;
        cVar.f7916g = '~';
        ef.a.c(dVar, cVar);
        cVar.close();
        outputStream.flush();
    }
}
