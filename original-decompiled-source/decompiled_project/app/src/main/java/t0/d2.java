package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x.o;
import x0.j;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25637a;

    /* renamed from: b, reason: collision with root package name */
    public static final z.g1 f25638b;

    /* renamed from: c, reason: collision with root package name */
    public static final z.g1 f25639c;

    static {
        float f10 = 8;
        f25637a = f10;
        androidx.compose.foundation.layout.f.c(f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        f25638b = androidx.compose.foundation.layout.f.c(f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        f25639c = androidx.compose.foundation.layout.f.c(f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static final void a(androidx.compose.ui.d dVar, eh.a aVar, boolean z10, f1.b bVar, t2.l0 l0Var, long j10, eh.p pVar, q1.f2 f2Var, o1 o1Var, r1 r1Var, t.v vVar, float f10, z.f1 f1Var, x0.j jVar, int i10, int i11) {
        int i12;
        int i13;
        x0.n1 n1Var;
        x.m mVar;
        s.b bVar2;
        int i14;
        boolean z11;
        s.n nVar;
        ?? r92;
        x0.k kVarP = jVar.p(1400504719);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.K(l0Var) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= kVarP.j(j10) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= kVarP.l(pVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= kVarP.l(null) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= kVarP.K(f2Var) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= kVarP.K(o1Var) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.K(r1Var) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.K(vVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.h(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.K(f1Var) ? 2048 : 1024;
        }
        int i15 = i12;
        if ((i11 & 24576) == 0) {
            i13 |= kVarP.K(null) ? 16384 : 8192;
        }
        int i16 = i13;
        if ((i15 & 306783379) == 306783378 && (i16 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(1985614987);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new x.n();
                kVarP.C(objG);
            }
            x.m mVar2 = (x.m) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarA = q2.q.a(dVar, false, s1.f26935a);
            long j11 = z10 ? o1Var.f26565a : o1Var.f26569e;
            kVarP.L(1985624506);
            if (r1Var == null) {
                mVar = mVar2;
                i14 = i15;
                nVar = null;
                r92 = 0;
            } else {
                int i17 = ((i15 >> 6) & 14) | ((i16 << 6) & 896);
                Object objG2 = kVarP.g();
                if (objG2 == obj) {
                    objG2 = new h1.u();
                    kVarP.C(objG2);
                }
                h1.u uVar = (h1.u) objG2;
                Object objG3 = kVarP.g();
                if (objG3 == obj) {
                    objG3 = bg.b.h(null);
                    kVarP.C(objG3);
                }
                x0.n1 n1Var2 = (x0.n1) objG3;
                boolean zK = kVarP.K(mVar2);
                Object objG4 = kVarP.g();
                if (zK || objG4 == obj) {
                    n1Var = n1Var2;
                    objG4 = new p1(mVar2, uVar, null);
                    kVarP.C(objG4);
                } else {
                    n1Var = n1Var2;
                }
                x0.o0.d((eh.p) objG4, mVar2, kVarP);
                x.k kVar = (x.k) qg.x.K(uVar);
                float f11 = !z10 ? r1Var.f26845f : kVar instanceof o.b ? r1Var.f26841b : kVar instanceof x.i ? r1Var.f26843d : kVar instanceof x.e ? r1Var.f26842c : kVar instanceof x.b ? r1Var.f26844e : r1Var.f26840a;
                Object objG5 = kVarP.g();
                if (objG5 == obj) {
                    mVar = mVar2;
                    objG5 = new s.b(new f3.h(f11), s.p2.f23870c, null, 12);
                    kVarP.C(objG5);
                } else {
                    mVar = mVar2;
                }
                s.b bVar3 = (s.b) objG5;
                f3.h hVar = new f3.h(f11);
                boolean zL = kVarP.l(bVar3) | kVarP.h(f11) | ((((i17 & 14) ^ 6) > 4 && kVarP.c(z10)) || (i17 & 6) == 4) | kVarP.l(kVar);
                Object objG6 = kVarP.g();
                if (zL || objG6 == obj) {
                    bVar2 = bVar3;
                    i14 = i15;
                    z11 = false;
                    q1 q1Var = new q1(bVar2, f11, z10, kVar, n1Var, null);
                    kVarP.C(q1Var);
                    objG6 = q1Var;
                } else {
                    bVar2 = bVar3;
                    i14 = i15;
                    z11 = false;
                }
                x0.o0.d((eh.p) objG6, hVar, kVarP);
                nVar = bVar2.f23654c;
                r92 = z11;
            }
            kVarP.T(r92);
            md.b(aVar, dVarA, z10, f2Var, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, nVar != null ? ((f3.h) nVar.f23843b.getValue()).f8817a : (float) r92, vVar, mVar, f1.c.b(-1985962652, new t1(bVar, l0Var, j10, pVar, o1Var, z10, f10, f1Var), kVarP), kVarP, ((i14 >> 15) & V4Signature.MAX_SIGNING_INFOS_SIZE) | ((i14 >> 3) & 14) | (i14 & 896) | ((i16 << 21) & 234881024), 96);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u1(dVar, aVar, z10, bVar, l0Var, j10, pVar, f2Var, o1Var, r1Var, vVar, f10, f1Var, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z10, eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, boolean z11, eh.p pVar, q1.f2 f2Var, ua uaVar, xa xaVar, t.v vVar, x0.j jVar, int i10, int i11) {
        eh.p pVar2;
        ua uaVarB;
        int i12;
        int i13;
        androidx.compose.ui.d dVar2;
        eh.p pVar3;
        t.v vVar2;
        boolean z12;
        xa xaVar2;
        int i14;
        ua uaVar2;
        q1.f2 f2Var2;
        t.v vVar3;
        androidx.compose.ui.d dVar3;
        boolean z13;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1711985619);
        int i15 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16);
        int i16 = i15 | 27648;
        int i17 = i11 & 32;
        if (i17 != 0) {
            i16 = i15 | 224256;
        } else {
            if ((i10 & 196608) == 0) {
                pVar2 = pVar;
                i16 |= kVarP.l(pVar2) ? 131072 : 65536;
            }
            int i18 = i16 | 5767168;
            if ((i11 & 256) != 0) {
                uaVarB = uaVar;
                int i19 = kVarP.K(uaVarB) ? 67108864 : 33554432;
                i12 = i18 | i19 | 268435456;
                if ((306783379 & i12) == 306783378 && kVarP.s()) {
                    kVarP.v();
                    dVar3 = dVar;
                    z13 = z11;
                    xaVar2 = xaVar;
                    vVar3 = vVar;
                    pVar3 = pVar2;
                    uaVar2 = uaVarB;
                    f2Var2 = f2Var;
                } else {
                    kVarP.r0();
                    if ((i10 & 1) != 0 || kVarP.a0()) {
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        float f10 = v3.f27221a;
                        float f11 = v0.p.f30419a;
                        q1.f2 f2VarA = ab.a(v0.c0.f30235h, kVarP);
                        int i20 = i12 & (-29360129);
                        if ((i11 & 256) != 0) {
                            uaVarB = v3.b((e2) kVarP.f(f2.f25858a));
                            i20 = i12 & (-264241153);
                        }
                        float f12 = v0.p.f30421c;
                        xa xaVar3 = new xa(f12, v0.p.f30430l, v0.p.f30427i, v0.p.f30428j, v0.p.f30420b, f12);
                        int i21 = i20 & (-1879048193);
                        long jE = f2.e(v0.p.f30431m, kVarP);
                        long j10 = q1.b1.f21653g;
                        i13 = 224256;
                        q1.b1.c(v0.p.f30425g, f2.e(v0.p.f30424f, kVarP));
                        float f13 = v0.p.f30432n;
                        float f14 = v0.p.f30429k;
                        if (z10) {
                            jE = j10;
                        }
                        if (z10) {
                            f13 = f14;
                        }
                        t.v vVarA = a9.d2.a(f13, jE);
                        dVar2 = d.a.f1143b;
                        pVar3 = pVar2;
                        vVar2 = vVarA;
                        z12 = true;
                        xaVar2 = xaVar3;
                        i14 = i21;
                        uaVar2 = uaVarB;
                        f2Var2 = f2VarA;
                    } else {
                        kVarP.v();
                        int i22 = i12 & (-29360129);
                        if ((i11 & 256) != 0) {
                            i22 = i12 & (-264241153);
                        }
                        i14 = i22 & (-1879048193);
                        dVar2 = dVar;
                        z12 = z11;
                        xaVar2 = xaVar;
                        i13 = 224256;
                        uaVar2 = uaVarB;
                        f2Var2 = f2Var;
                        pVar3 = pVar2;
                        vVar2 = vVar;
                    }
                    kVarP.U();
                    int i23 = i14 << 3;
                    androidx.compose.ui.d dVar4 = dVar2;
                    vVar3 = vVar2;
                    c(z10, dVar4, aVar, z12, bVar, of.a(v0.p.f30433o, kVarP), pVar3, f2Var2, uaVar2, xaVar2, vVar3, v3.f27221a, f25638b, kVarP, 100663296 | (i14 & 14) | 12582960 | (i23 & 896) | 27648 | (i23 & 3670016), ((i14 >> 24) & 14) | i13);
                    dVar3 = dVar4;
                    z13 = z12;
                }
                h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new y1(z10, aVar, bVar, dVar3, z13, pVar3, f2Var2, uaVar2, xaVar2, vVar3, i10, i11);
                    return;
                }
                return;
            }
            uaVarB = uaVar;
            i12 = i18 | i19 | 268435456;
            if ((306783379 & i12) == 306783378) {
                kVarP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                    }
                    float f102 = v3.f27221a;
                    float f112 = v0.p.f30419a;
                    q1.f2 f2VarA2 = ab.a(v0.c0.f30235h, kVarP);
                    int i202 = i12 & (-29360129);
                    if ((i11 & 256) != 0) {
                    }
                    float f122 = v0.p.f30421c;
                    xa xaVar32 = new xa(f122, v0.p.f30430l, v0.p.f30427i, v0.p.f30428j, v0.p.f30420b, f122);
                    int i212 = i202 & (-1879048193);
                    long jE2 = f2.e(v0.p.f30431m, kVarP);
                    long j102 = q1.b1.f21653g;
                    i13 = 224256;
                    q1.b1.c(v0.p.f30425g, f2.e(v0.p.f30424f, kVarP));
                    float f132 = v0.p.f30432n;
                    float f142 = v0.p.f30429k;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    t.v vVarA2 = a9.d2.a(f132, jE2);
                    dVar2 = d.a.f1143b;
                    pVar3 = pVar2;
                    vVar2 = vVarA2;
                    z12 = true;
                    xaVar2 = xaVar32;
                    i14 = i212;
                    uaVar2 = uaVarB;
                    f2Var2 = f2VarA2;
                    kVarP.U();
                    int i232 = i14 << 3;
                    androidx.compose.ui.d dVar42 = dVar2;
                    vVar3 = vVar2;
                    c(z10, dVar42, aVar, z12, bVar, of.a(v0.p.f30433o, kVarP), pVar3, f2Var2, uaVar2, xaVar2, vVar3, v3.f27221a, f25638b, kVarP, 100663296 | (i14 & 14) | 12582960 | (i232 & 896) | 27648 | (i232 & 3670016), ((i14 >> 24) & 14) | i13);
                    dVar3 = dVar42;
                    z13 = z12;
                }
            }
            h2VarV = kVarP.V();
            if (h2VarV != null) {
            }
        }
        pVar2 = pVar;
        int i182 = i16 | 5767168;
        if ((i11 & 256) != 0) {
        }
        i12 = i182 | i19 | 268435456;
        if ((306783379 & i12) == 306783378) {
        }
        h2VarV = kVarP.V();
        if (h2VarV != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public static final void c(boolean z10, androidx.compose.ui.d dVar, eh.a aVar, boolean z11, f1.b bVar, t2.l0 l0Var, eh.p pVar, q1.f2 f2Var, ua uaVar, xa xaVar, t.v vVar, float f10, z.f1 f1Var, x0.j jVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        x.m mVar;
        x0.n1 n1Var;
        s.b bVar2;
        long j10;
        boolean z12;
        s.n nVar;
        ?? r12;
        x0.k kVar;
        x0.k kVarP = jVar.p(402951308);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.l(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.c(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.l(bVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= kVarP.K(l0Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= kVarP.l(pVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= kVarP.l(null) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= kVarP.l(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= kVarP.K(f2Var) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.K(uaVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.K(xaVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.K(vVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.h(f10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= kVarP.K(f1Var) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 = i12;
            i13 |= kVarP.K(null) ? 131072 : 65536;
        } else {
            i14 = i12;
        }
        if ((i14 & 306783379) == 306783378 && (i13 & 74899) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(2072749057);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new x.n();
                kVarP.C(objG);
            }
            x.m mVar2 = (x.m) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarA = q2.q.a(dVar, false, z1.f27508a);
            long j11 = !z11 ? z10 ? uaVar.f27158j : uaVar.f27153e : !z10 ? uaVar.f27149a : uaVar.f27157i;
            kVarP.L(2072762384);
            if (xaVar == null) {
                mVar = mVar2;
                j10 = j11;
                r12 = 0;
                nVar = null;
            } else {
                long j12 = j11;
                int i15 = ((i13 << 3) & 896) | ((i14 >> 9) & 14);
                Object objG2 = kVarP.g();
                if (objG2 == obj) {
                    objG2 = new h1.u();
                    kVarP.C(objG2);
                }
                h1.u uVar = (h1.u) objG2;
                Object objG3 = kVarP.g();
                if (objG3 == obj) {
                    objG3 = bg.b.h(null);
                    kVarP.C(objG3);
                }
                x0.n1 n1Var2 = (x0.n1) objG3;
                boolean zK = kVarP.K(mVar2);
                Object objG4 = kVarP.g();
                if (zK || objG4 == obj) {
                    objG4 = new va(mVar2, uVar, null);
                    kVarP.C(objG4);
                }
                x0.o0.d((eh.p) objG4, mVar2, kVarP);
                x.k kVar2 = (x.k) qg.x.K(uVar);
                float f11 = !z11 ? xaVar.f27408f : kVar2 instanceof o.b ? xaVar.f27404b : kVar2 instanceof x.i ? xaVar.f27406d : kVar2 instanceof x.e ? xaVar.f27405c : kVar2 instanceof x.b ? xaVar.f27407e : xaVar.f27403a;
                Object objG5 = kVarP.g();
                if (objG5 == obj) {
                    mVar = mVar2;
                    n1Var = n1Var2;
                    objG5 = new s.b(new f3.h(f11), s.p2.f23870c, null, 12);
                    kVarP.C(objG5);
                } else {
                    mVar = mVar2;
                    n1Var = n1Var2;
                }
                s.b bVar3 = (s.b) objG5;
                f3.h hVar = new f3.h(f11);
                boolean zL = kVarP.l(bVar3) | kVarP.h(f11) | ((((i15 & 14) ^ 6) > 4 && kVarP.c(z11)) || (i15 & 6) == 4) | kVarP.l(kVar2);
                Object objG6 = kVarP.g();
                if (zL || objG6 == obj) {
                    bVar2 = bVar3;
                    j10 = j12;
                    z12 = false;
                    wa waVar = new wa(bVar2, f11, z11, kVar2, n1Var, null);
                    kVarP.C(waVar);
                    objG6 = waVar;
                } else {
                    bVar2 = bVar3;
                    j10 = j12;
                    z12 = false;
                }
                x0.o0.d((eh.p) objG6, hVar, kVarP);
                nVar = bVar2.f23654c;
                r12 = z12;
            }
            kVarP.T(r12);
            float f12 = nVar != null ? ((f3.h) nVar.f23843b.getValue()).f8817a : (float) r12;
            int i16 = r12;
            f1.b bVarB = f1.c.b(-577614814, new a2(uaVar, z11, z10, bVar, l0Var, pVar, f10, f1Var), kVarP);
            x0.m0 m0Var = md.f26474a;
            long jB = f2.b(j10, kVarP);
            x0.m0 m0Var2 = md.f26474a;
            float f13 = ((f3.h) kVarP.f(m0Var2)).f8817a + i16;
            kVar = kVarP;
            x0.y.b(new x0.f2[]{com.android.aapt.a.b(jB, p2.f26666a), m0Var2.a(new f3.h(f13))}, f1.c.b(-1164547968, new rd(dVarA, f2Var, j10, f13, vVar, z10, mVar, z11, aVar, f12, bVarB), kVar), kVar, 56);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b2(z10, dVar, aVar, z11, bVar, l0Var, pVar, f2Var, uaVar, xaVar, vVar, f10, f1Var, i10, i11);
        }
    }

    public static final void d(eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, boolean z10, eh.p pVar, q1.f2 f2Var, o1 o1Var, r1 r1Var, t.v vVar, x0.j jVar, int i10) {
        int i11;
        boolean z11;
        androidx.compose.ui.d dVar2;
        t.v vVar2;
        o1 o1Var2;
        r1 r1Var2;
        boolean z12;
        o1 o1Var3;
        r1 r1Var3;
        t.v vVar3;
        androidx.compose.ui.d dVar3;
        x0.k kVarP = jVar.p(-1700130831);
        int i12 = i10 | (kVarP.l(aVar) ? 4 : 2) | 3456 | (kVarP.K(f2Var) ? 131072 : 65536) | 843579392;
        if ((306783379 & i12) == 306783378 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            z12 = z10;
            o1Var3 = o1Var;
            r1Var3 = r1Var;
            vVar3 = vVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                float f10 = ld.f26392a;
                e2 e2Var = (e2) kVarP.f(f2.f25858a);
                o1 o1Var4 = e2Var.Q;
                if (o1Var4 == null) {
                    long j10 = q1.b1.f21653g;
                    long jD = f2.d(e2Var, v0.h0.f30299h);
                    long jD2 = f2.d(e2Var, v0.h0.f30303l);
                    long j11 = q1.b1.f21654h;
                    o1Var4 = new o1(j10, jD, jD2, j11, j10, q1.b1.c(0.38f, f2.d(e2Var, v0.d.f30244h)), q1.b1.c(v0.h0.f30302k, f2.d(e2Var, v0.h0.f30301j)), j11);
                    e2Var.Q = o1Var4;
                }
                float f11 = v0.h0.f30294c;
                r1 r1Var4 = new r1(f11, f11, f11, f11, v0.h0.f30293b, f11);
                long jE = f2.e(v0.h0.f30297f, kVarP);
                q1.b1.c(v0.h0.f30296e, f2.e(v0.h0.f30295d, kVarP));
                t.v vVarA = a9.d2.a(v0.h0.f30298g, jE);
                i11 = i12 & (-267911169);
                z11 = true;
                dVar2 = d.a.f1143b;
                vVar2 = vVarA;
                o1Var2 = o1Var4;
                r1Var2 = r1Var4;
            } else {
                kVarP.v();
                i11 = i12 & (-267911169);
                dVar2 = dVar;
                z11 = z10;
                o1Var2 = o1Var;
                r1Var2 = r1Var;
                vVar2 = vVar;
            }
            kVarP.U();
            t2.l0 l0VarA = of.a(v0.h0.f30300i, kVarP);
            androidx.compose.ui.d dVar4 = dVar2;
            a(dVar4, aVar, z11, bVar, l0VarA, z11 ? o1Var2.f26566b : o1Var2.f26570f, pVar, f2Var, o1Var2, r1Var2, vVar2, ld.f26392a, f25639c, kVarP, ((i11 << 3) & 112) | 14159238 | ((i11 << 9) & 234881024), 28032);
            z12 = z11;
            o1Var3 = o1Var2;
            r1Var3 = r1Var2;
            vVar3 = vVar2;
            dVar3 = dVar4;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c2(aVar, bVar, dVar3, z12, pVar, f2Var, o1Var3, r1Var3, vVar3, i10);
        }
    }

    public static final void e(f1.b bVar, t2.l0 l0Var, long j10, eh.p pVar, long j11, long j12, float f10, z.f1 f1Var, x0.j jVar, int i10) {
        f1.b bVar2;
        int i11;
        eh.p pVar2;
        long j13;
        long j14;
        z.f1 f1Var2;
        x0.k kVarP = jVar.p(-782878228);
        if ((i10 & 6) == 0) {
            bVar2 = bVar;
            i11 = (kVarP.l(bVar2) ? 4 : 2) | i10;
        } else {
            bVar2 = bVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.j(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            pVar2 = pVar;
            i11 |= kVarP.l(pVar2) ? 2048 : 1024;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(null) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            j13 = j11;
            i11 |= kVarP.j(j13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            j13 = j11;
        }
        if ((12582912 & i10) == 0) {
            j14 = j12;
            i11 |= kVarP.j(j14) ? 8388608 : 4194304;
        } else {
            j14 = j12;
        }
        if ((100663296 & i10) == 0) {
            i11 |= kVarP.h(f10) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            f1Var2 = f1Var;
            i11 |= kVarP.K(f1Var2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            f1Var2 = f1Var;
        }
        if ((i11 & 306783379) == 306783378 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.y.b(new x0.f2[]{com.android.aapt.a.b(j10, p2.f26666a), ff.f25892a.a(l0Var)}, f1.c.b(1748799148, new w1(f10, f1Var2, pVar2, j13, bVar2, j14), kVarP), kVarP, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new x1(bVar, l0Var, j10, pVar, j11, j12, f10, f1Var, i10);
        }
    }
}
