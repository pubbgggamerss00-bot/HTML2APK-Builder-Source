package df;

import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class i extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        ef.a.c(inputStream, outputStream);
        return new j(tVar);
    }

    @Override // df.k
    public final j b(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        ef.a.c(inputStream, outputStream);
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        throw new UnsupportedOperationException("DCTFilter encoding not implemented, use the JPEGFactory methods instead");
    }
}
