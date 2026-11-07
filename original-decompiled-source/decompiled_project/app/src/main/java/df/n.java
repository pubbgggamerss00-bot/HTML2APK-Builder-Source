package df;

import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class n extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        ef.a.c(inputStream, outputStream);
        outputStream.flush();
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        ef.a.c(dVar, outputStream);
        outputStream.flush();
    }
}
