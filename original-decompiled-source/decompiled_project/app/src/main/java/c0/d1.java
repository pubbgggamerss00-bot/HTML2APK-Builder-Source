package c0;

import com.yalantis.ucrop.view.CropImageView;
import d0.d1;
import d0.d2;
import g2.i1;
import h1.h;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.l<Float, Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f4372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(w0 w0Var) {
        super(1);
        this.f4372a = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0241  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Float invoke(Float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        int iG;
        int index;
        boolean z10;
        h1.h hVarA;
        eh.l<Object, pg.f0> lVarE;
        h1.h hVarB;
        char c10;
        int iG2;
        int index2;
        boolean z11;
        long j10;
        l0 l0Var;
        float fFloatValue = f10.floatValue();
        w0 w0Var = this.f4372a;
        y0 y0Var = w0Var.f4520p;
        a aVar = w0Var.f4505a;
        boolean z12 = w0Var.f4513i;
        float f15 = -fFloatValue;
        float f16 = CropImageView.DEFAULT_ASPECT_RATIO;
        if ((f15 >= CropImageView.DEFAULT_ASPECT_RATIO || w0Var.d()) && (f15 <= CropImageView.DEFAULT_ASPECT_RATIO || w0Var.b())) {
            if (Math.abs(w0Var.f4511g) > 0.5f) {
                y.c.c("entered drag with non-zero pending scroll");
            }
            float f17 = w0Var.f4511g + f15;
            w0Var.f4511g = f17;
            if (Math.abs(f17) > 0.5f) {
                float f18 = w0Var.f4511g;
                int iB = gh.a.b(f18);
                l0 l0VarJ = ((l0) w0Var.f4509e.getValue()).j(iB, !w0Var.f4506b);
                if (l0VarJ != null && (l0Var = w0Var.f4507c) != null) {
                    l0 l0VarJ2 = l0Var.j(iB, true);
                    if (l0VarJ2 != null) {
                        w0Var.f4507c = l0VarJ2;
                    } else {
                        l0VarJ = null;
                    }
                }
                if (l0VarJ != null) {
                    f13 = 0.5f;
                    w0Var.f(l0VarJ, w0Var.f4506b, true);
                    d2.b(w0Var.f4522r);
                    float f19 = f18 - w0Var.f4511g;
                    if (z12) {
                        z0.b<d1.b> bVar = aVar.f4336b;
                        if (l0VarJ.i().isEmpty()) {
                            f11 = f15;
                            f12 = 0.0f;
                        } else {
                            boolean z13 = f19 < CropImageView.DEFAULT_ASPECT_RATIO;
                            if (z13) {
                                o oVar = (o) qg.x.J(l0VarJ.i());
                                c10 = ' ';
                                iG2 = (l0VarJ.getOrientation() == v.t0.f30083a ? oVar.g() : oVar.m()) + 1;
                                index2 = ((o) qg.x.J(l0VarJ.i())).getIndex() + 1;
                            } else {
                                c10 = ' ';
                                o oVar2 = (o) qg.x.B(l0VarJ.i());
                                iG2 = (l0VarJ.getOrientation() == v.t0.f30083a ? oVar2.g() : oVar2.m()) - 1;
                                index2 = ((o) qg.x.B(l0VarJ.i())).getIndex() - 1;
                            }
                            if (index2 >= 0 && index2 < l0VarJ.f()) {
                                if (iG2 == aVar.f4335a || iG2 < 0) {
                                    f11 = f15;
                                    f12 = 0.0f;
                                    z11 = z13;
                                    j10 = BodyPartID.bodyIdMax;
                                } else {
                                    if (aVar.f4337c != z13) {
                                        d1.b[] bVarArr = bVar.f34700a;
                                        int i10 = bVar.f34702c;
                                        j10 = BodyPartID.bodyIdMax;
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            bVarArr[i11].cancel();
                                        }
                                    } else {
                                        j10 = BodyPartID.bodyIdMax;
                                    }
                                    aVar.f4337c = z13;
                                    aVar.f4335a = iG2;
                                    bVar.g();
                                    y0Var.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    w0 w0Var2 = y0Var.f4545a;
                                    hVarA = h.a.a();
                                    lVarE = hVarA != null ? hVarA.e() : null;
                                    hVarB = h.a.b(hVarA);
                                    try {
                                        l0 l0Var2 = w0Var2.f4506b ? w0Var2.f4507c : (l0) w0Var2.f4509e.getValue();
                                        if (l0Var2 != null) {
                                            List<pg.n<Integer, f3.b>> listInvoke = l0Var2.f4423k.invoke(Integer.valueOf(iG2));
                                            int size = listInvoke.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                float f20 = f16;
                                                pg.n<Integer, f3.b> nVar = listInvoke.get(i12);
                                                arrayList.add(w0Var2.f4519o.a(nVar.f21469a.intValue(), nVar.f21470b.f8811a));
                                                i12++;
                                                listInvoke = listInvoke;
                                                f16 = f20;
                                                f15 = f15;
                                                z13 = z13;
                                            }
                                            f11 = f15;
                                            f12 = f16;
                                            z11 = z13;
                                            pg.f0 f0Var = pg.f0.f21461a;
                                        } else {
                                            f11 = f15;
                                            f12 = 0.0f;
                                            z11 = z13;
                                        }
                                        h.a.d(hVarA, hVarB, lVarE);
                                        bVar.c(bVar.f34702c, arrayList);
                                    } finally {
                                    }
                                }
                                if (z11) {
                                    o oVar3 = (o) qg.x.J(l0VarJ.i());
                                    if (((p5.o.c(oVar3, l0VarJ.getOrientation()) + ((int) (l0VarJ.getOrientation() == v.t0.f30083a ? oVar3.a() & j10 : oVar3.a() >> c10))) + l0VarJ.g()) - l0VarJ.e() < (-f19)) {
                                        d1.b[] bVarArr2 = bVar.f34700a;
                                        int i13 = bVar.f34702c;
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            bVarArr2[i14].a();
                                        }
                                    }
                                } else if (l0VarJ.h() - p5.o.c((o) qg.x.B(l0VarJ.i()), l0VarJ.getOrientation()) < f19) {
                                    d1.b[] bVarArr3 = bVar.f34700a;
                                    int i15 = bVar.f34702c;
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        bVarArr3[i16].a();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    f11 = f15;
                    f12 = 0.0f;
                    f13 = 0.5f;
                    i1 i1Var = w0Var.f4514j;
                    if (i1Var != null) {
                        i1Var.h();
                    }
                    float f21 = f18 - w0Var.f4511g;
                    f0 f0VarI = w0Var.i();
                    if (z12) {
                        z0.b<d1.b> bVar2 = aVar.f4336b;
                        if (!f0VarI.i().isEmpty()) {
                            boolean z14 = f21 < CropImageView.DEFAULT_ASPECT_RATIO;
                            if (z14) {
                                o oVar4 = (o) qg.x.J(f0VarI.i());
                                iG = (f0VarI.getOrientation() == v.t0.f30083a ? oVar4.g() : oVar4.m()) + 1;
                                index = ((o) qg.x.J(f0VarI.i())).getIndex() + 1;
                            } else {
                                o oVar5 = (o) qg.x.B(f0VarI.i());
                                iG = (f0VarI.getOrientation() == v.t0.f30083a ? oVar5.g() : oVar5.m()) - 1;
                                index = ((o) qg.x.B(f0VarI.i())).getIndex() - 1;
                            }
                            if (index >= 0 && index < f0VarI.f()) {
                                if (iG == aVar.f4335a || iG < 0) {
                                    z10 = z14;
                                } else {
                                    if (aVar.f4337c != z14) {
                                        d1.b[] bVarArr4 = bVar2.f34700a;
                                        int i17 = bVar2.f34702c;
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            bVarArr4[i18].cancel();
                                        }
                                    }
                                    aVar.f4337c = z14;
                                    aVar.f4335a = iG;
                                    bVar2.g();
                                    y0Var.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    w0 w0Var3 = y0Var.f4545a;
                                    hVarA = h.a.a();
                                    lVarE = hVarA != null ? hVarA.e() : null;
                                    hVarB = h.a.b(hVarA);
                                    try {
                                        l0 l0Var3 = w0Var3.f4506b ? w0Var3.f4507c : (l0) w0Var3.f4509e.getValue();
                                        if (l0Var3 != null) {
                                            List<pg.n<Integer, f3.b>> listInvoke2 = l0Var3.f4423k.invoke(Integer.valueOf(iG));
                                            int size2 = listInvoke2.size();
                                            int i19 = 0;
                                            while (i19 < size2) {
                                                pg.n<Integer, f3.b> nVar2 = listInvoke2.get(i19);
                                                arrayList2.add(w0Var3.f4519o.a(nVar2.f21469a.intValue(), nVar2.f21470b.f8811a));
                                                i19++;
                                                z14 = z14;
                                                listInvoke2 = listInvoke2;
                                            }
                                            z10 = z14;
                                            pg.f0 f0Var2 = pg.f0.f21461a;
                                        } else {
                                            z10 = z14;
                                        }
                                        h.a.d(hVarA, hVarB, lVarE);
                                        bVar2.c(bVar2.f34702c, arrayList2);
                                    } finally {
                                    }
                                }
                                if (z10) {
                                    o oVar6 = (o) qg.x.J(f0VarI.i());
                                    if (((p5.o.c(oVar6, f0VarI.getOrientation()) + ((int) (f0VarI.getOrientation() == v.t0.f30083a ? oVar6.a() & BodyPartID.bodyIdMax : oVar6.a() >> 32))) + f0VarI.g()) - f0VarI.e() < (-f21)) {
                                        d1.b[] bVarArr5 = bVar2.f34700a;
                                        int i20 = bVar2.f34702c;
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            bVarArr5[i21].a();
                                        }
                                    }
                                } else if (f0VarI.h() - p5.o.c((o) qg.x.B(f0VarI.i()), f0VarI.getOrientation()) < f21) {
                                    d1.b[] bVarArr6 = bVar2.f34700a;
                                    int i22 = bVar2.f34702c;
                                    for (int i23 = 0; i23 < i22; i23++) {
                                        bVarArr6[i23].a();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                f11 = f15;
                f12 = 0.0f;
                f13 = 0.5f;
            }
            if (Math.abs(w0Var.f4511g) <= f13) {
                f14 = f11;
            } else {
                f14 = f11 - w0Var.f4511g;
                w0Var.f4511g = f12;
            }
        } else {
            f14 = 0.0f;
        }
        return Float.valueOf(-f14);
    }
}
