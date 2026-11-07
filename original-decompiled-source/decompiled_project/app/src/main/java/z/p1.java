package z;

import androidx.compose.ui.d;
import g2.g1;

/* loaded from: classes.dex */
public final class p1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f34607q;

    /* renamed from: r, reason: collision with root package name */
    public float f34608r;

    /* renamed from: s, reason: collision with root package name */
    public float f34609s;

    /* renamed from: t, reason: collision with root package name */
    public float f34610t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34611v;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f34612a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f34612a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, g2.p pVar, int i10) {
        long jT1 = T1(l0Var);
        if (f3.b.g(jT1)) {
            return f3.b.i(jT1);
        }
        if (!this.f34611v) {
            i10 = f3.c.f(i10, jT1);
        }
        return f3.c.g(pVar.O(i10), jT1);
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, g2.p pVar, int i10) {
        long jT1 = T1(l0Var);
        if (f3.b.g(jT1)) {
            return f3.b.i(jT1);
        }
        if (!this.f34611v) {
            i10 = f3.c.f(i10, jT1);
        }
        return f3.c.g(pVar.J(i10), jT1);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long T1(g2.o0 o0Var) {
        int iB1;
        int iB12;
        int iB13;
        int i10 = 0;
        if (Float.isNaN(this.f34609s)) {
            iB1 = Integer.MAX_VALUE;
        } else {
            iB1 = o0Var.b1(this.f34609s);
            if (iB1 < 0) {
                iB1 = 0;
            }
        }
        if (Float.isNaN(this.f34610t)) {
            iB12 = Integer.MAX_VALUE;
        } else {
            iB12 = o0Var.b1(this.f34610t);
            if (iB12 < 0) {
                iB12 = 0;
            }
        }
        if (Float.isNaN(this.f34607q)) {
            iB13 = 0;
        } else {
            iB13 = o0Var.b1(this.f34607q);
            if (iB13 < 0) {
                iB13 = 0;
            }
            if (iB13 > iB1) {
                iB13 = iB1;
            }
            if (iB13 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.f34608r)) {
            int iB14 = o0Var.b1(this.f34608r);
            if (iB14 < 0) {
                iB14 = 0;
            }
            if (iB14 > iB12) {
                iB14 = iB12;
            }
            if (iB14 != Integer.MAX_VALUE) {
                i10 = iB14;
            }
        }
        return f3.c.a(iB13, iB1, i10, iB12);
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        int iK;
        int i10;
        int iJ;
        int iH;
        long jA;
        long jT1 = T1(o0Var);
        if (this.f34611v) {
            jA = f3.c.e(j10, jT1);
        } else {
            if (Float.isNaN(this.f34607q)) {
                iK = f3.b.k(j10);
                int i11 = f3.b.i(jT1);
                if (iK > i11) {
                    iK = i11;
                }
            } else {
                iK = f3.b.k(jT1);
            }
            if (Float.isNaN(this.f34609s)) {
                i10 = f3.b.i(j10);
                int iK2 = f3.b.k(jT1);
                if (i10 < iK2) {
                    i10 = iK2;
                }
            } else {
                i10 = f3.b.i(jT1);
            }
            if (Float.isNaN(this.f34608r)) {
                iJ = f3.b.j(j10);
                int iH2 = f3.b.h(jT1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = f3.b.j(jT1);
            }
            if (Float.isNaN(this.f34610t)) {
                iH = f3.b.h(j10);
                int iJ2 = f3.b.j(jT1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = f3.b.h(jT1);
            }
            jA = f3.c.a(iK, i10, iJ, iH);
        }
        g2.g1 g1VarP = k0Var.P(jA);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, g2.p pVar, int i10) {
        long jT1 = T1(l0Var);
        if (f3.b.f(jT1)) {
            return f3.b.h(jT1);
        }
        if (!this.f34611v) {
            i10 = f3.c.g(i10, jT1);
        }
        return f3.c.f(pVar.z(i10), jT1);
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, g2.p pVar, int i10) {
        long jT1 = T1(l0Var);
        if (f3.b.f(jT1)) {
            return f3.b.h(jT1);
        }
        if (!this.f34611v) {
            i10 = f3.c.g(i10, jT1);
        }
        return f3.c.f(pVar.b0(i10), jT1);
    }
}
