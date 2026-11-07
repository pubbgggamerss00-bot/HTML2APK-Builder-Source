package z;

import androidx.compose.ui.d;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f34491q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34492r;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34493a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f34493a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f34493a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, g2.p pVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f34491q) : pVar.O(i10);
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, g2.p pVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f34491q) : pVar.J(i10);
    }

    public final long T1(long j10, boolean z10) {
        int iRound;
        int iH = f3.b.h(j10);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH * this.f34491q)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.b(iRound, iH, j10)) {
            return (iRound << 32) | (iH & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    public final long U1(long j10, boolean z10) {
        int iRound;
        int i10 = f3.b.i(j10);
        if (i10 == Integer.MAX_VALUE || (iRound = Math.round(i10 / this.f34491q)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.b(i10, iRound, j10)) {
            return (i10 << 32) | (iRound & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    public final long V1(long j10, boolean z10) {
        int iJ = f3.b.j(j10);
        int iRound = Math.round(iJ * this.f34491q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.b(iRound, iJ, j10)) {
            return (iRound << 32) | (iJ & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    public final long W1(long j10, boolean z10) {
        int iK = f3.b.k(j10);
        int iRound = Math.round(iK / this.f34491q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.b(iK, iRound, j10)) {
            return (iK << 32) | (iRound & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        long jT1;
        if (this.f34492r) {
            jT1 = T1(j10, true);
            if (f3.p.b(jT1, 0L)) {
                jT1 = U1(j10, true);
                if (f3.p.b(jT1, 0L)) {
                    jT1 = V1(j10, true);
                    if (f3.p.b(jT1, 0L)) {
                        jT1 = W1(j10, true);
                        if (f3.p.b(jT1, 0L)) {
                            jT1 = T1(j10, false);
                            if (f3.p.b(jT1, 0L)) {
                                jT1 = U1(j10, false);
                                if (f3.p.b(jT1, 0L)) {
                                    jT1 = V1(j10, false);
                                    if (f3.p.b(jT1, 0L)) {
                                        jT1 = W1(j10, false);
                                        if (f3.p.b(jT1, 0L)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jT1 = U1(j10, true);
            if (f3.p.b(jT1, 0L)) {
                jT1 = T1(j10, true);
                if (f3.p.b(jT1, 0L)) {
                    jT1 = W1(j10, true);
                    if (f3.p.b(jT1, 0L)) {
                        jT1 = V1(j10, true);
                        if (f3.p.b(jT1, 0L)) {
                            jT1 = U1(j10, false);
                            if (f3.p.b(jT1, 0L)) {
                                jT1 = T1(j10, false);
                                if (f3.p.b(jT1, 0L)) {
                                    jT1 = W1(j10, false);
                                    if (f3.p.b(jT1, 0L)) {
                                        jT1 = V1(j10, false);
                                        if (f3.p.b(jT1, 0L)) {
                                            jT1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!f3.p.b(jT1, 0L)) {
            int i10 = (int) (jT1 >> 32);
            int i11 = (int) (BodyPartID.bodyIdMax & jT1);
            if (!((i10 >= 0) & (i11 >= 0))) {
                f3.l.a("width and height must be >= 0");
            }
            j10 = f3.c.h(i10, i10, i11, i11);
        }
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, g2.p pVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f34491q) : pVar.z(i10);
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, g2.p pVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f34491q) : pVar.b0(i10);
    }
}
