package j7;

import hi.b0;
import hi.f0;
import j7.q;

/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f15235a;

    /* renamed from: b, reason: collision with root package name */
    public final hi.n f15236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15237c;

    /* renamed from: d, reason: collision with root package name */
    public final AutoCloseable f15238d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15239e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f15240f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f15241g;

    public p(b0 b0Var, hi.n nVar, String str, AutoCloseable autoCloseable) {
        this.f15235a = b0Var;
        this.f15236b = nVar;
        this.f15237c = str;
        this.f15238d = autoCloseable;
    }

    @Override // j7.q
    public final q.a c() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.f15239e) {
            this.f15240f = true;
            f0 f0Var = this.f15241g;
            if (f0Var != null) {
                try {
                    f0Var.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
                autoCloseable = this.f15238d;
                if (autoCloseable != null) {
                    try {
                        androidx.documentfile.provider.a.a(autoCloseable);
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                    }
                }
                pg.f0 f0Var2 = pg.f0.f21461a;
            } else {
                autoCloseable = this.f15238d;
                if (autoCloseable != null) {
                }
                pg.f0 f0Var22 = pg.f0.f21461a;
            }
        }
    }

    @Override // j7.q
    public final hi.n getFileSystem() {
        return this.f15236b;
    }

    @Override // j7.q
    public final b0 j0() {
        b0 b0Var;
        synchronized (this.f15239e) {
            if (this.f15240f) {
                throw new IllegalStateException("closed");
            }
            b0Var = this.f15235a;
        }
        return b0Var;
    }

    @Override // j7.q
    public final hi.i s0() {
        synchronized (this.f15239e) {
            if (this.f15240f) {
                throw new IllegalStateException("closed");
            }
            f0 f0Var = this.f15241g;
            if (f0Var != null) {
                return f0Var;
            }
            f0 f0VarB = hi.x.b(this.f15236b.g0(this.f15235a));
            this.f15241g = f0VarB;
            return f0VarB;
        }
    }
}
