package hi;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class e implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f13054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13055b;

    public e(k0 k0Var, t tVar) {
        this.f13054a = k0Var;
        this.f13055b = tVar;
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13054a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        t tVar = this.f13055b;
        k0 k0Var = this.f13054a;
        k0Var.h();
        try {
            tVar.close();
            pg.f0 f0Var = pg.f0.f21461a;
            if (k0Var.i()) {
                throw k0Var.k(null);
            }
        } catch (IOException e10) {
            if (!k0Var.i()) {
                throw e10;
            }
            throw k0Var.k(e10);
        } finally {
            k0Var.i();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f13055b + ')';
    }

    @Override // hi.l0
    public final long y(long j10, g sink) throws IOException {
        kotlin.jvm.internal.r.e(sink, "sink");
        t tVar = this.f13055b;
        k0 k0Var = this.f13054a;
        k0Var.h();
        try {
            long jY = tVar.y(j10, sink);
            if (k0Var.i()) {
                throw k0Var.k(null);
            }
            return jY;
        } catch (IOException e10) {
            if (k0Var.i()) {
                throw k0Var.k(e10);
            }
            throw e10;
        } finally {
            k0Var.i();
        }
    }
}
