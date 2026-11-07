package j7;

import hi.b0;
import j7.q;
import pg.f0;

/* loaded from: classes.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    public final hi.n f15244a;

    /* renamed from: b, reason: collision with root package name */
    public final q.a f15245b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15246c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f15247d;

    /* renamed from: e, reason: collision with root package name */
    public final hi.i f15248e;

    public t(hi.i iVar, hi.n nVar, q.a aVar) {
        this.f15244a = nVar;
        this.f15245b = aVar;
        this.f15248e = iVar;
    }

    @Override // j7.q
    public final q.a c() {
        return this.f15245b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15246c) {
            this.f15247d = true;
            hi.i iVar = this.f15248e;
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            }
            f0 f0Var = f0.f21461a;
        }
    }

    @Override // j7.q
    public final hi.n getFileSystem() {
        return this.f15244a;
    }

    @Override // j7.q
    public final b0 j0() {
        synchronized (this.f15246c) {
            if (this.f15247d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // j7.q
    public final hi.i s0() {
        hi.i iVar;
        synchronized (this.f15246c) {
            try {
                if (this.f15247d) {
                    throw new IllegalStateException("closed");
                }
                iVar = this.f15248e;
                if (iVar == null) {
                    hi.n nVar = this.f15244a;
                    kotlin.jvm.internal.r.b(null);
                    nVar.g0(null);
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
