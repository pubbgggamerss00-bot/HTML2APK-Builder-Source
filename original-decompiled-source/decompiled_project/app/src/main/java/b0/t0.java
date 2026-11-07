package b0;

import com.yalantis.ucrop.view.CropImageView;
import d0.d1;
import d0.d2;
import g2.i1;
import h1.h;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.s implements eh.l<Float, Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f3435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(m0 m0Var) {
        super(1);
        this.f3435a = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Float invoke(Float f10) {
        boolean z10;
        d1.b bVar;
        d1.b bVar2;
        h1.h hVarA;
        eh.l<Object, pg.f0> lVarE;
        h1.h hVarB;
        d1.b bVar3;
        d1.b bVar4;
        d1.b bVar5;
        d1.b bVar6;
        f0 f0Var;
        float fFloatValue = f10.floatValue();
        m0 m0Var = this.f3435a;
        o0 o0Var = m0Var.f3397p;
        a aVar = m0Var.f3382a;
        boolean z11 = m0Var.f3390i;
        float f11 = -fFloatValue;
        if ((f11 >= CropImageView.DEFAULT_ASPECT_RATIO || m0Var.d()) && (f11 <= CropImageView.DEFAULT_ASPECT_RATIO || m0Var.b())) {
            if (Math.abs(m0Var.f3388g) > 0.5f) {
                y.c.c("entered drag with non-zero pending scroll");
            }
            float f12 = m0Var.f3388g + f11;
            m0Var.f3388g = f12;
            if (Math.abs(f12) > 0.5f) {
                float f13 = m0Var.f3388g;
                int iRound = Math.round(f13);
                f0 f0VarJ = ((f0) m0Var.f3386e.getValue()).j(iRound, !m0Var.f3383b);
                if (f0VarJ != null && (f0Var = m0Var.f3384c) != null) {
                    f0 f0VarJ2 = f0Var.j(iRound, true);
                    if (f0VarJ2 != null) {
                        m0Var.f3384c = f0VarJ2;
                    } else {
                        f0VarJ = null;
                    }
                }
                if (f0VarJ != null) {
                    m0Var.f(f0VarJ, m0Var.f3383b, true);
                    d2.b(m0Var.f3402u);
                    float f14 = f13 - m0Var.f3388g;
                    if (z11) {
                        aVar.getClass();
                        if (!f0VarJ.i().isEmpty()) {
                            z10 = f14 < CropImageView.DEFAULT_ASPECT_RATIO;
                            int index = z10 ? ((n) qg.x.J(f0VarJ.i())).getIndex() + 1 : ((n) qg.x.B(f0VarJ.i())).getIndex() - 1;
                            if (index >= 0 && index < f0VarJ.f()) {
                                if (index != aVar.f3283a) {
                                    if (aVar.f3285c != z10 && (bVar6 = aVar.f3284b) != null) {
                                        bVar6.cancel();
                                    }
                                    aVar.f3285c = z10;
                                    aVar.f3283a = index;
                                    m0 m0Var2 = o0Var.f3411a;
                                    hVarA = h.a.a();
                                    lVarE = hVarA != null ? hVarA.e() : null;
                                    hVarB = h.a.b(hVarA);
                                    try {
                                        long j10 = ((f0) m0Var2.f3386e.getValue()).f3328j;
                                        h.a.d(hVarA, hVarB, lVarE);
                                        aVar.f3284b = m0Var2.f3396o.a(index, j10);
                                    } finally {
                                    }
                                }
                                if (z10) {
                                    n nVar = (n) qg.x.J(f0VarJ.i());
                                    if (((nVar.getSize() + nVar.getOffset()) + f0VarJ.g()) - f0VarJ.e() < (-f14) && (bVar5 = aVar.f3284b) != null) {
                                        bVar5.a();
                                    }
                                } else if (f0VarJ.h() - ((n) qg.x.B(f0VarJ.i())).getOffset() < f14 && (bVar4 = aVar.f3284b) != null) {
                                    bVar4.a();
                                }
                            }
                        }
                    }
                } else {
                    i1 i1Var = m0Var.f3391j;
                    if (i1Var != null) {
                        i1Var.h();
                    }
                    float f15 = f13 - m0Var.f3388g;
                    z zVarI = m0Var.i();
                    if (z11) {
                        aVar.getClass();
                        if (!zVarI.i().isEmpty()) {
                            z10 = f15 < CropImageView.DEFAULT_ASPECT_RATIO;
                            int index2 = z10 ? ((n) qg.x.J(zVarI.i())).getIndex() + 1 : ((n) qg.x.B(zVarI.i())).getIndex() - 1;
                            if (index2 >= 0 && index2 < zVarI.f()) {
                                if (index2 != aVar.f3283a) {
                                    if (aVar.f3285c != z10 && (bVar3 = aVar.f3284b) != null) {
                                        bVar3.cancel();
                                    }
                                    aVar.f3285c = z10;
                                    aVar.f3283a = index2;
                                    m0 m0Var3 = o0Var.f3411a;
                                    hVarA = h.a.a();
                                    lVarE = hVarA != null ? hVarA.e() : null;
                                    hVarB = h.a.b(hVarA);
                                    try {
                                        long j11 = ((f0) m0Var3.f3386e.getValue()).f3328j;
                                        h.a.d(hVarA, hVarB, lVarE);
                                        aVar.f3284b = m0Var3.f3396o.a(index2, j11);
                                    } finally {
                                    }
                                }
                                if (z10) {
                                    n nVar2 = (n) qg.x.J(zVarI.i());
                                    if (((nVar2.getSize() + nVar2.getOffset()) + zVarI.g()) - zVarI.e() < (-f15) && (bVar2 = aVar.f3284b) != null) {
                                        bVar2.a();
                                    }
                                } else if (zVarI.h() - ((n) qg.x.B(zVarI.i())).getOffset() < f15 && (bVar = aVar.f3284b) != null) {
                                    bVar.a();
                                }
                            }
                        }
                    }
                }
            }
            if (Math.abs(m0Var.f3388g) > 0.5f) {
                f11 -= m0Var.f3388g;
                m0Var.f3388g = CropImageView.DEFAULT_ASPECT_RATIO;
            }
        } else {
            f11 = 0.0f;
        }
        return Float.valueOf(-f11);
    }
}
