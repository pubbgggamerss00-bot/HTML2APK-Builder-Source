package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class id {

    /* renamed from: d, reason: collision with root package name */
    public static final float f26115d;

    /* renamed from: f, reason: collision with root package name */
    public static final float f26117f;

    /* renamed from: a, reason: collision with root package name */
    public static final float f26112a = 600;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26113b = 30;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26114c = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26116e = 6;

    static {
        float f10 = 8;
        f26115d = f10;
        f26117f = f10;
    }

    public static final void a(androidx.compose.ui.d dVar, eh.p pVar, eh.p pVar2, q1.f2 f2Var, long j10, long j11, long j12, long j13, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        eh.p pVar3;
        int i12;
        f1.b bVar2;
        x0.k kVarP = jVar.p(-1235788955);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            pVar3 = pVar;
            i11 |= kVarP.l(pVar3) ? 32 : 16;
        } else {
            pVar3 = pVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.c(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.K(f2Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.j(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.j(j11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i11 |= kVarP.j(j12) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((100663296 & i10) == 0) {
            i12 = i13 | (kVarP.j(j13) ? 67108864 : 33554432);
        } else {
            i12 = i13;
        }
        if ((805306368 & i10) == 0) {
            bVar2 = bVar;
            i12 |= kVarP.l(bVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            bVar2 = bVar;
        }
        int i14 = i12;
        if ((306783379 & i14) == 306783378 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            float f10 = v0.g0.f30284a;
            f1.b bVarB = f1.c.b(-1829663446, new zc(pVar3, bVar2, pVar2, j12, j13), kVarP);
            int i15 = i14 >> 9;
            md.a(dVar, f2Var, j10, j11, CropImageView.DEFAULT_ASPECT_RATIO, f10, null, bVarB, kVarP, (i14 & 14) | 12779520 | (i15 & 112) | (i15 & 896) | (i15 & V4Signature.MAX_SIGNING_INFOS_SIZE), 80);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new ad(dVar, pVar, pVar2, f2Var, j10, j11, j12, j13, bVar, i10);
        }
    }

    public static final void b(ic icVar, androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, long j11, long j12, long j13, long j14, x0.j jVar, int i10) {
        int i11;
        long jE;
        androidx.compose.ui.d dVar2;
        q1.f2 f2Var2;
        int i12;
        long j15;
        long j16;
        long j17;
        long j18;
        x0.k kVar;
        androidx.compose.ui.d dVar3;
        long j19;
        q1.f2 f2Var3;
        long j20;
        long j21;
        long j22;
        long j23;
        x0.k kVarP = jVar.p(274621471);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(icVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1456;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= 33554432;
        }
        if ((38347923 & i13) == 38347922 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            f2Var3 = f2Var;
            j20 = j10;
            j21 = j11;
            j19 = j12;
            j22 = j13;
            j23 = j14;
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                q1.f2 f2VarA = ab.a(v0.g0.f30285b, kVarP);
                long jE2 = f2.e(v0.d.f30240d, kVarP);
                long jE3 = f2.e(v0.g0.f30287d, kVarP);
                v0.d dVar4 = v0.d.f30239c;
                jE = f2.e(dVar4, kVarP);
                long jE4 = f2.e(dVar4, kVarP);
                long jE5 = f2.e(v0.g0.f30286c, kVarP);
                dVar2 = d.a.f1143b;
                f2Var2 = f2VarA;
                i12 = i13 & (-268434433);
                j15 = jE2;
                j16 = jE3;
                j17 = jE4;
                j18 = jE5;
            } else {
                kVarP.v();
                i12 = i13 & (-268434433);
                dVar2 = dVar;
                f2Var2 = f2Var;
                j15 = j10;
                j16 = j11;
                jE = j12;
                j17 = j13;
                j18 = j14;
            }
            kVarP.U();
            String strB = icVar.b().b();
            kVarP.L(1561344786);
            f1.b bVarB = strB != null ? f1.c.b(-1378313599, new fd(jE, icVar, strB), kVarP) : null;
            kVarP.T(false);
            kVarP.L(1561358724);
            f1.b bVarB2 = icVar.b().c() ? f1.c.b(-1812633777, new hd(icVar), kVarP) : null;
            kVarP.T(false);
            kVar = kVarP;
            a(androidx.compose.foundation.layout.f.h(dVar2, 12), bVarB, bVarB2, f2Var2, j15, j16, j17, j18, f1.c.b(-1266389126, new bd(icVar), kVarP), kVar, ((i12 << 3) & V4Signature.MAX_SIGNING_INFOS_SIZE) | 805306368);
            dVar3 = dVar2;
            j19 = jE;
            f2Var3 = f2Var2;
            j20 = j15;
            j21 = j16;
            j22 = j17;
            j23 = j18;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new cd(icVar, dVar3, f2Var3, j20, j21, j19, j22, j23, i10);
        }
    }

    public static final void c(f1.b bVar, eh.p pVar, eh.p pVar2, t2.l0 l0Var, long j10, long j11, x0.j jVar, int i10) {
        int i11;
        eh.p pVar3;
        t2.l0 l0Var2;
        int i12;
        eh.p pVar4;
        long j12;
        boolean z10;
        x0.k kVarP = jVar.p(-903235475);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(l0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.j(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.j(j11) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            pVar3 = pVar;
            pVar4 = pVar2;
            l0Var2 = l0Var;
            j12 = j11;
        } else {
            float f10 = pVar2 == null ? f26115d : 0;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar, f26114c, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new wc();
                kVarP.C(objG);
            }
            g2.l0 l0Var3 = (g2.l0) objG;
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            int i14 = i11;
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, l0Var3, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.ui.layout.a.b(aVar, "text"), CropImageView.DEFAULT_ASPECT_RATIO, f26116e, 1);
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int i15 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar2, l0VarD, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            bVar.invoke(kVarP, Integer.valueOf(i14 & 14));
            kVarP.T(true);
            kVarP.L(-904778058);
            if (pVar != null) {
                androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar, "action");
                g2.l0 l0VarD2 = z.g.d(fVar, false);
                int i16 = kVarP.P;
                x0.a2 a2VarP3 = kVarP.P();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, kVarP);
                kVarP.r();
                i12 = 8;
                if (kVarP.O) {
                    kVarP.w(aVar2);
                } else {
                    kVarP.z();
                }
                ph.v1.j(bVar2, l0VarD2, kVarP);
                ph.v1.j(dVar, a2VarP3, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                }
                ph.v1.j(cVar, dVarC3, kVarP);
                l0Var2 = l0Var;
                pVar3 = pVar;
                x0.y.b(new x0.f2[]{com.android.aapt.a.b(j10, p2.f26666a), ff.f25892a.a(l0Var2)}, pVar3, kVarP, 8 | (i14 & 112));
                kVarP.T(true);
            } else {
                pVar3 = pVar;
                l0Var2 = l0Var;
                i12 = 8;
            }
            kVarP.T(false);
            kVarP.L(-904766579);
            if (pVar2 != null) {
                androidx.compose.ui.d dVarB2 = androidx.compose.ui.layout.a.b(aVar, "dismissAction");
                g2.l0 l0VarD3 = z.g.d(fVar, false);
                int i17 = kVarP.P;
                x0.a2 a2VarP4 = kVarP.P();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB2, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar2);
                } else {
                    kVarP.z();
                }
                ph.v1.j(bVar2, l0VarD3, kVarP);
                ph.v1.j(dVar, a2VarP4, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
                }
                ph.v1.j(cVar, dVarC4, kVarP);
                j12 = j11;
                pVar4 = pVar2;
                x0.y.a(com.android.aapt.a.b(j12, p2.f26666a), pVar4, kVarP, i12 | ((i14 >> 3) & 112));
                z10 = true;
                kVarP.T(true);
            } else {
                pVar4 = pVar2;
                j12 = j11;
                z10 = true;
            }
            kVarP.T(false);
            kVarP.T(z10);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new xc(bVar, pVar3, pVar4, l0Var2, j10, j12, i10);
        }
    }
}
