package x0;

/* loaded from: classes.dex */
public class f3 extends h1.j0 implements l1, h1.t<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public a f31678b;

    public static final class a extends h1.k0 {

        /* renamed from: c, reason: collision with root package name */
        public int f31679c;

        public a(int i10, long j10) {
            super(j10);
            this.f31679c = i10;
        }

        @Override // h1.k0
        public final void a(h1.k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f31679c = ((a) k0Var).f31679c;
        }

        @Override // h1.k0
        public final h1.k0 b() {
            return c(h1.n.k().g());
        }

        @Override // h1.k0
        public final h1.k0 c(long j10) {
            return new a(this.f31679c, j10);
        }
    }

    @Override // h1.t
    public final i3<Integer> a() {
        return u3.f31923a;
    }

    @Override // h1.i0
    public final h1.k0 c() {
        return this.f31678b;
    }

    @Override // x0.l1
    public final void f(int i10) {
        h1.h hVarK;
        a aVar = (a) h1.n.i(this.f31678b);
        if (aVar.f31679c != i10) {
            a aVar2 = this.f31678b;
            synchronized (h1.n.f12160c) {
                hVarK = h1.n.k();
                ((a) h1.n.o(aVar2, this, hVarK, aVar)).f31679c = i10;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            h1.n.n(hVarK, this);
        }
    }

    @Override // x0.l1
    public final int g() {
        return ((a) h1.n.t(this.f31678b, this)).f31679c;
    }

    @Override // h1.i0
    public final void k(h1.k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f31678b = (a) k0Var;
    }

    @Override // h1.i0
    public final h1.k0 m(h1.k0 k0Var, h1.k0 k0Var2, h1.k0 k0Var3) {
        if (((a) k0Var2).f31679c == ((a) k0Var3).f31679c) {
            return k0Var2;
        }
        return null;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((a) h1.n.i(this.f31678b)).f31679c + ")@" + hashCode();
    }
}
