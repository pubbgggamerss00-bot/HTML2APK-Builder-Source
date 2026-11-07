package ve;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class j0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f30833a;

    public j0(h0 h0Var) {
        this.f30833a = h0Var;
    }

    @Override // ve.k0
    public final long N() throws IOException {
        return this.f30833a.N();
    }

    @Override // ve.k0
    public final short Z() throws IOException {
        return this.f30833a.Z();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // ve.k0
    public final long h() throws IOException {
        return this.f30833a.h();
    }

    @Override // ve.k0
    public final int i0() throws IOException {
        return this.f30833a.i0();
    }

    @Override // ve.k0
    public final InputStream l() throws IOException {
        return this.f30833a.l();
    }

    @Override // ve.k0
    public final long p() {
        return this.f30833a.p();
    }

    @Override // ve.k0
    public final int read() throws IOException {
        return this.f30833a.read();
    }

    @Override // ve.k0
    public final void seek(long j10) throws IOException {
        this.f30833a.seek(j10);
    }

    @Override // ve.k0
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f30833a.read(bArr, i10, i11);
    }
}
