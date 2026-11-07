package x0;

/* loaded from: classes.dex */
public class e3 extends h1.j0 implements k1, h1.t<Float> {

    /* renamed from: b, reason: collision with root package name */
    public a f31669b;

    public static final class a extends h1.k0 {

        /* renamed from: c, reason: collision with root package name */
        public float f31670c;

        public a(float f10, long j10) {
            super(j10);
            this.f31670c = f10;
        }

        @Override // h1.k0
        public final void a(h1.k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f31670c = ((a) k0Var).f31670c;
        }

        @Override // h1.k0
        public final h1.k0 b() {
            return c(h1.n.k().g());
        }

        @Override // h1.k0
        public final h1.k0 c(long j10) {
            return new a(this.f31670c, j10);
        }
    }

    @Override // h1.t
    public final i3<Float> a() {
        return u3.f31923a;
    }

    @Override // h1.i0
    public final h1.k0 c() {
        return this.f31669b;
    }

    @Override // x0.k1
    public final void e(float f10) {
        h1.h hVarK;
        a aVar = (a) h1.n.i(this.f31669b);
        if (aVar.f31670c == f10) {
            return;
        }
        a aVar2 = this.f31669b;
        synchronized (h1.n.f12160c) {
            hVarK = h1.n.k();
            ((a) h1.n.o(aVar2, this, hVarK, aVar)).f31670c = f10;
            pg.f0 f0Var = pg.f0.f21461a;
        }
        h1.n.n(hVarK, this);
    }

    @Override // x0.k1
    public final float getFloatValue() {
        return ((a) h1.n.t(this.f31669b, this)).f31670c;
    }

    @Override // h1.i0
    public final void k(h1.k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f31669b = (a) k0Var;
    }

    @Override // h1.i0
    public final h1.k0 m(h1.k0 k0Var, h1.k0 k0Var2, h1.k0 k0Var3) {
        if (((a) k0Var2).f31670c == ((a) k0Var3).f31670c) {
            return k0Var2;
        }
        return null;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((a) h1.n.i(this.f31669b)).f31670c + ")@" + hashCode();
    }
}
