package x0;

/* loaded from: classes.dex */
public class g3 extends h1.j0 implements m1, h1.t<Long> {

    /* renamed from: b, reason: collision with root package name */
    public a f31697b;

    public static final class a extends h1.k0 {

        /* renamed from: c, reason: collision with root package name */
        public long f31698c;

        public a(long j10, long j11) {
            super(j10);
            this.f31698c = j11;
        }

        @Override // h1.k0
        public final void a(h1.k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f31698c = ((a) k0Var).f31698c;
        }

        @Override // h1.k0
        public final h1.k0 b() {
            return c(h1.n.k().g());
        }

        @Override // h1.k0
        public final h1.k0 c(long j10) {
            return new a(j10, this.f31698c);
        }
    }

    @Override // h1.t
    public final i3<Long> a() {
        return u3.f31923a;
    }

    @Override // x0.m1
    public final long b() {
        return ((a) h1.n.t(this.f31697b, this)).f31698c;
    }

    @Override // h1.i0
    public final h1.k0 c() {
        return this.f31697b;
    }

    @Override // x0.m1
    public final void h(long j10) {
        h1.h hVarK;
        a aVar = (a) h1.n.i(this.f31697b);
        if (aVar.f31698c != j10) {
            a aVar2 = this.f31697b;
            synchronized (h1.n.f12160c) {
                hVarK = h1.n.k();
                ((a) h1.n.o(aVar2, this, hVarK, aVar)).f31698c = j10;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            h1.n.n(hVarK, this);
        }
    }

    @Override // h1.i0
    public final void k(h1.k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f31697b = (a) k0Var;
    }

    @Override // h1.i0
    public final h1.k0 m(h1.k0 k0Var, h1.k0 k0Var2, h1.k0 k0Var3) {
        if (((a) k0Var2).f31698c == ((a) k0Var3).f31698c) {
            return k0Var2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) h1.n.i(this.f31697b)).f31698c + ")@" + hashCode();
    }
}
