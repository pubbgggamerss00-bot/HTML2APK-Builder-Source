package z;

import androidx.compose.ui.d;
import g2.g1;

/* loaded from: classes.dex */
public final class y extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public w f34688q;

    /* renamed from: r, reason: collision with root package name */
    public float f34689r;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f34690a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f34690a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        int iK;
        int i10;
        int iH;
        int iH2;
        if (!f3.b.e(j10) || this.f34688q == w.f34654a) {
            iK = f3.b.k(j10);
            i10 = f3.b.i(j10);
        } else {
            int iRound = Math.round(f3.b.i(j10) * this.f34689r);
            int iK2 = f3.b.k(j10);
            iK = f3.b.i(j10);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i10 = iK;
        }
        if (!f3.b.d(j10) || this.f34688q == w.f34655b) {
            int iJ = f3.b.j(j10);
            iH = f3.b.h(j10);
            iH2 = iJ;
        } else {
            int iRound2 = Math.round(f3.b.h(j10) * this.f34689r);
            int iJ2 = f3.b.j(j10);
            iH2 = f3.b.h(j10);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH2) {
                iH2 = iRound2;
            }
            iH = iH2;
        }
        g2.g1 g1VarP = k0Var.P(f3.c.a(iK, i10, iH2, iH));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }
}
