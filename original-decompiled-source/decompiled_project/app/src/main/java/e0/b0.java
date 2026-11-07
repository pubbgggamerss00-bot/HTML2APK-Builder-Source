package e0;

import com.yalantis.ucrop.view.CropImageView;
import e0.o;
import j1.d;
import j1.f;
import j2.j2;
import r.n2;
import s.d3;
import s.l1;
import t.k1;
import v.e2;
import w.n;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class b0 {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f10, int i10, int i11, int i12, androidx.compose.ui.d dVar, b2.a aVar, b bVar, o oVar, f1.b bVar2, d.c cVar, t.i1 i1Var, e2 e2Var, w.n nVar, x0.j jVar, z.f1 f1Var, boolean z10) {
        z.f1 f1Var2;
        int i13;
        o oVar2;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        x0.k kVar;
        d.c cVar2;
        e2 e2Var2;
        w.n nVar2;
        boolean z11;
        o oVar3;
        int i19;
        float f12;
        t.i1 i1Var2;
        z.f1 f1Var3;
        b2.a aVar2;
        h2 h2VarV;
        z.f1 g1Var;
        e2 e2Var3;
        int i20;
        z.f1 f1Var4;
        float f13;
        t.i1 i1Var3;
        int i21;
        w.n nVar3;
        boolean z12;
        o oVar4;
        b2.a aVar3;
        d.c cVar3;
        x0.k kVarP = jVar.p(-1372972868);
        int i22 = (kVarP.K(bVar) ? 4 : 2) | i11 | (kVarP.K(dVar) ? 32 : 16);
        int i23 = i12 & 4;
        if (i23 != 0) {
            i13 = i22 | 384;
            f1Var2 = f1Var;
        } else {
            f1Var2 = f1Var;
            i13 = i22 | (kVarP.K(f1Var2) ? 256 : 128);
        }
        int i24 = i12 & 8;
        if (i24 != 0) {
            i14 = i13 | 3072;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i14 = i13 | (kVarP.K(oVar2) ? 2048 : 1024);
        }
        int i25 = i12 & 16;
        if (i25 == 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                i14 |= kVarP.i(i15) ? 16384 : 8192;
            }
            i16 = i12 & 32;
            if (i16 == 0) {
                i17 = i14 | 196608;
                f11 = f10;
            } else {
                f11 = f10;
                i17 = i14 | (kVarP.h(f11) ? 131072 : 65536);
            }
            i18 = i17 | 911736832;
            if (kVarP.A(i18 & 1, (306783379 & i18) == 306783378)) {
                kVar = kVarP;
                kVar.v();
                cVar2 = cVar;
                e2Var2 = e2Var;
                nVar2 = nVar;
                z11 = z10;
                oVar3 = oVar2;
                i19 = i15;
                f12 = f11;
                i1Var2 = i1Var;
                f1Var3 = f1Var2;
                aVar2 = aVar;
            } else {
                kVarP.r0();
                if ((i11 & 1) == 0 || kVarP.a0()) {
                    if (i23 != 0) {
                        float f14 = 0;
                        g1Var = new z.g1(f14, f14, f14, f14);
                    } else {
                        g1Var = f1Var2;
                    }
                    o oVar5 = i24 != 0 ? o.a.f8249a : oVar2;
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    float f15 = i16 != 0 ? 0 : f11;
                    int i26 = (i18 & 14) | 196608;
                    t0 t0Var = new t0();
                    s.y yVarA = n2.a(kVarP);
                    Object obj = d3.f23710a;
                    l1 l1VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    f3.d dVar2 = (f3.d) kVarP.f(j2.f14779h);
                    f3.r rVar = (f3.r) kVarP.f(j2.f14785n);
                    boolean zK = ((((i26 & 14) ^ 6) > 4 && kVarP.K(bVar)) || (i26 & 6) == 4) | kVarP.K(yVarA) | kVarP.K(l1VarC) | kVarP.K(t0Var) | kVarP.K(dVar2) | kVarP.K(rVar);
                    Object objG = kVarP.g();
                    Object obj2 = j.a.f31715a;
                    Object obj3 = objG;
                    if (zK || objG == obj2) {
                        w.c cVar4 = new w.c(bVar, new r(bVar, rVar), t0Var);
                        float f16 = w.m.f31029a;
                        Object hVar = new w.h(cVar4, yVarA, l1VarC);
                        kVarP.C(hVar);
                        obj3 = hVar;
                    }
                    w.h hVar2 = (e2) obj3;
                    int i27 = i18 & (-29360129);
                    v.t0 t0Var2 = v.t0.f30083a;
                    int i28 = (i18 & 14) | 432;
                    boolean z13 = (((i28 & 14) ^ 6) > 4 && kVarP.K(bVar)) || (i28 & 6) == 4;
                    Object objG2 = kVarP.g();
                    if (z13 || objG2 == obj2) {
                        objG2 = new a(bVar);
                        kVarP.C(objG2);
                    }
                    t.i1 i1VarA = k1.a(kVarP);
                    f.b bVar3 = d.a.f14612k;
                    e2Var3 = hVar2;
                    i20 = i27;
                    f1Var4 = g1Var;
                    f13 = f15;
                    i1Var3 = i1VarA;
                    i21 = i15;
                    nVar3 = n.a.f31030a;
                    z12 = true;
                    oVar4 = oVar5;
                    aVar3 = (a) objG2;
                    cVar3 = bVar3;
                } else {
                    kVarP.v();
                    i20 = i18 & (-29360129);
                    cVar3 = cVar;
                    e2Var3 = e2Var;
                    nVar3 = nVar;
                    z12 = z10;
                    f1Var4 = f1Var2;
                    i21 = i15;
                    f13 = f11;
                    i1Var3 = i1Var;
                    oVar4 = oVar2;
                    aVar3 = aVar;
                }
                kVarP.U();
                v.t0 t0Var3 = v.t0.f30083a;
                int i29 = i20 << 12;
                kVar = kVarP;
                k.a(f13, i21, (i29 & 1879048192) | ((i20 >> 3) & 14) | 24576 | ((i20 << 3) & 112) | (i20 & 896) | 1575936 | (234881024 & i29), ((i20 >> 9) & 14) | 1797504, dVar, aVar3, bVar, oVar4, bVar2, cVar3, i1Var3, e2Var3, nVar3, kVar, f1Var4, z12);
                f12 = f13;
                i19 = i21;
                aVar2 = aVar3;
                oVar3 = oVar4;
                cVar2 = cVar3;
                i1Var2 = i1Var3;
                e2Var2 = e2Var3;
                nVar2 = nVar3;
                f1Var3 = f1Var4;
                z11 = z12;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new t(f12, i19, i11, i12, dVar, aVar2, bVar, oVar3, bVar2, cVar2, i1Var2, e2Var2, nVar2, f1Var3, z11);
                return;
            }
            return;
        }
        i14 |= 24576;
        i15 = i10;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        i18 = i17 | 911736832;
        if (kVarP.A(i18 & 1, (306783379 & i18) == 306783378)) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
