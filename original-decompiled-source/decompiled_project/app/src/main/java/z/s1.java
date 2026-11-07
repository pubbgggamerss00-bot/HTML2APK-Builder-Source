package z;

import androidx.compose.ui.d;
import g2.g1;

/* loaded from: classes.dex */
public final class s1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f34631q;

    /* renamed from: r, reason: collision with root package name */
    public float f34632r;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f34633a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f34633a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, g2.p pVar, int i10) {
        int iO = pVar.O(i10);
        int iB1 = !Float.isNaN(this.f34631q) ? l0Var.b1(this.f34631q) : 0;
        return iO < iB1 ? iB1 : iO;
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, g2.p pVar, int i10) {
        int iJ = pVar.J(i10);
        int iB1 = !Float.isNaN(this.f34631q) ? l0Var.b1(this.f34631q) : 0;
        return iJ < iB1 ? iB1 : iJ;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        int iK;
        int iJ;
        if (Float.isNaN(this.f34631q) || f3.b.k(j10) != 0) {
            iK = f3.b.k(j10);
        } else {
            int iB1 = o0Var.b1(this.f34631q);
            iK = f3.b.i(j10);
            if (iB1 < 0) {
                iB1 = 0;
            }
            if (iB1 <= iK) {
                iK = iB1;
            }
        }
        int i10 = f3.b.i(j10);
        if (Float.isNaN(this.f34632r) || f3.b.j(j10) != 0) {
            iJ = f3.b.j(j10);
        } else {
            int iB12 = o0Var.b1(this.f34632r);
            iJ = f3.b.h(j10);
            int i11 = iB12 >= 0 ? iB12 : 0;
            if (i11 <= iJ) {
                iJ = i11;
            }
        }
        g2.g1 g1VarP = k0Var.P(f3.c.a(iK, i10, iJ, f3.b.h(j10)));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, g2.p pVar, int i10) {
        int iZ = pVar.z(i10);
        int iB1 = !Float.isNaN(this.f34632r) ? l0Var.b1(this.f34632r) : 0;
        return iZ < iB1 ? iB1 : iZ;
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, g2.p pVar, int i10) {
        int iB0 = pVar.b0(i10);
        int iB1 = !Float.isNaN(this.f34632r) ? l0Var.b1(this.f34632r) : 0;
        return iB0 < iB1 ? iB1 : iB0;
    }
}
