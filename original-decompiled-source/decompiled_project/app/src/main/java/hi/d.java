package hi;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class d implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f13049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f13050b;

    public d(k0 k0Var, a0 a0Var) {
        this.f13049a = k0Var;
        this.f13050b = a0Var;
    }

    @Override // hi.j0
    public final m0 b() {
        return this.f13049a;
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a0 a0Var = this.f13050b;
        k0 k0Var = this.f13049a;
        k0Var.h();
        try {
            a0Var.close();
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

    @Override // hi.j0, java.io.Flushable
    public final void flush() throws IOException {
        a0 a0Var = this.f13050b;
        k0 k0Var = this.f13049a;
        k0Var.h();
        try {
            a0Var.flush();
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

    @Override // hi.j0
    public final void j(long j10, g source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        b.b(source.f13061b, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            g0 g0Var = source.f13060a;
            kotlin.jvm.internal.r.b(g0Var);
            while (true) {
                if (j11 >= 65536) {
                    break;
                }
                j11 += g0Var.f13065c - g0Var.f13064b;
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                } else {
                    g0Var = g0Var.f13068f;
                    kotlin.jvm.internal.r.b(g0Var);
                }
            }
            a0 a0Var = this.f13050b;
            k0 k0Var = this.f13049a;
            k0Var.h();
            try {
                try {
                    a0Var.j(j11, source);
                    pg.f0 f0Var = pg.f0.f21461a;
                    if (k0Var.i()) {
                        throw k0Var.k(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!k0Var.i()) {
                        throw e10;
                    }
                    throw k0Var.k(e10);
                }
            } catch (Throwable th2) {
                k0Var.i();
                throw th2;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f13050b + ')';
    }
}
