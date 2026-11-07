package t0;

import android.view.View;
import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26944a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26945b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26946c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26947d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26948e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f26949f;

    static {
        float f10 = v0.u.f30480a;
        f26944a = v0.u.f30482c;
        f26945b = 8;
        f26946c = 4;
        float f11 = v0.u.f30481b;
        float f12 = v0.u.f30483d;
        float f13 = 2;
        f26947d = (f11 - f12) / f13;
        f26948e = (v0.u.f30480a - f12) / f13;
        f26949f = 12;
    }

    public static final void a(androidx.compose.ui.d dVar, long j10, long j11, float f10, z.u1 u1Var, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        long j12;
        z.u1 b1Var;
        f1.b bVar2;
        z.u1 u1Var2;
        x0.k kVarP = jVar.p(1596802123);
        int i12 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | 8320;
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
            j12 = j11;
            u1Var2 = u1Var;
            bVar2 = bVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                long jA = f2.a((e2) kVarP.f(f2.f25858a), j10);
                int i13 = z7.f27526a;
                WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                i11 = i12 & (-58241);
                j12 = jA;
                b1Var = new z.b1(x1.a.c(kVarP).f34673g, 32 | hf.a.f12994e);
            } else {
                kVarP.v();
                i11 = i12 & (-58241);
                j12 = j11;
                b1Var = u1Var;
            }
            kVarP.U();
            bVar2 = bVar;
            md.a(dVar, null, j10, j12, f10, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(105663120, new c8(b1Var, bVar2), kVarP), kVarP, ((i11 << 3) & 896) | (i11 & 14) | 12582912 | 24576, 98);
            u1Var2 = b1Var;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d8(dVar, j10, j12, f10, u1Var2, bVar2, i10);
        }
    }

    public static final void b(z.n1 n1Var, boolean z10, eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, boolean z11, eh.p pVar, boolean z12, a8 a8Var, x0.j jVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        boolean z13;
        boolean z14;
        a8 a8Var2;
        androidx.compose.ui.d dVar3;
        x0.k kVar;
        boolean z15;
        boolean z16;
        x0.k kVarP = jVar.p(-663510974);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(n1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        int i12 = i11 | 221184;
        if ((1572864 & i10) == 0) {
            i12 |= kVarP.l(pVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i13 = i12 | 12582912;
        if ((100663296 & i10) == 0) {
            i13 |= kVarP.K(a8Var) ? 67108864 : 33554432;
        }
        int i14 = i13 | 805306368;
        if ((306783379 & i14) == 306783378 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            z16 = z11;
            z15 = z12;
            kVar = kVarP;
            a8Var2 = a8Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                dVar2 = d.a.f1143b;
                z13 = true;
                z14 = true;
            } else {
                kVarP.v();
                dVar2 = dVar;
                z13 = z11;
                z14 = z12;
            }
            kVarP.U();
            kVarP.L(-103236853);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new x.n();
                kVarP.C(objG);
            }
            x.m mVar = (x.m) objG;
            kVarP.T(false);
            boolean z17 = z14;
            f1.b bVarB = f1.c.b(-1419576100, new l8(a8Var, z10, z13, pVar, z14, bVar), kVarP);
            kVarP.L(-103210706);
            f1.b bVarB2 = pVar == null ? null : f1.c.b(1644987592, new m8(a8Var, z10, z13, pVar), kVarP);
            kVarP.T(false);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new x0.v1(0);
                kVarP.C(objG2);
            }
            x0.l1 l1Var = (x0.l1) objG2;
            boolean z18 = z13;
            a8Var2 = a8Var;
            androidx.compose.ui.d dVar4 = dVar2;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.selection.a.a(dVar4, z10, mVar, null, z18, new q2.i(4), aVar);
            dVar3 = dVar4;
            androidx.compose.ui.d dVarA2 = n1Var.a(androidx.compose.foundation.layout.g.b(dVarA, CropImageView.DEFAULT_ASPECT_RATIO, f26944a, 1), 1.0f);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                objG3 = new e8(l1Var);
                kVarP.C(objG3);
            }
            androidx.compose.ui.d dVarA3 = androidx.compose.ui.layout.d.a(dVarA2, (eh.l) objG3);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, true);
            int i15 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA3, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            x0.r3 r3VarB = s.g.b(z10 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO, s.m.d(100, 0, null, 6), null, kVarP, 48, 28);
            long jA = p1.d.a((l1Var.g() - r2.b1(v0.u.f30481b)) / 2, ((f3.d) kVarP.f(j2.j2.f14779h)).N0(f26949f));
            pg.f0 f0Var = pg.f0.f21461a;
            boolean zK = kVarP.K(mVar) | kVarP.j(jA);
            Object objG4 = kVarP.g();
            if (zK || objG4 == obj) {
                objG4 = new u0.q0(mVar, jA);
                kVarP.C(objG4);
            }
            f1.b bVarB3 = f1.c.b(691730997, new i8((u0.q0) objG4), kVarP);
            f1.b bVarB4 = f1.c.b(-474426875, new h8(r3VarB, a8Var2), kVarP);
            boolean zK2 = kVarP.K(r3VarB);
            Object objG5 = kVarP.g();
            if (zK2 || objG5 == obj) {
                objG5 = new f8(r3VarB);
                kVarP.C(objG5);
            }
            c(bVarB3, bVarB4, bVarB, bVarB2, z17, (eh.a) objG5, kVarP, ((i14 >> 9) & 57344) | 438);
            kVar = kVarP;
            kVar.T(true);
            z15 = z17;
            z16 = z18;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new j8(n1Var, z10, aVar, bVar, dVar3, z16, pVar, z15, a8Var2, i10);
        }
    }

    public static final void c(f1.b bVar, f1.b bVar2, f1.b bVar3, eh.p pVar, boolean z10, eh.a aVar, x0.j jVar, int i10) {
        int i11;
        boolean z11;
        eh.a aVar2;
        boolean z12;
        eh.p pVar2 = pVar;
        x0.k kVarP = jVar.p(-1427075886);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(bVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(bVar3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.c(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(aVar) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            z11 = z10;
            aVar2 = aVar;
        } else {
            int i12 = 458752 & i11;
            int i13 = 57344 & i11;
            boolean z13 = ((i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | (i12 == 131072) | (i13 == 16384);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z13 || objG == c0321a) {
                objG = new o8(aVar, pVar2, z10);
                kVarP.C(objG);
            }
            g2.l0 l0Var = (g2.l0) objG;
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar3, kVarP);
            i2.g.f13861o.getClass();
            int i15 = i11;
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            g.a.b bVar4 = g.a.f13867f;
            ph.v1.j(bVar4, l0Var, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            bVar.invoke(kVarP, Integer.valueOf(i15 & 14));
            bVar2.invoke(kVarP, Integer.valueOf((i15 >> 3) & 14));
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar3, "icon");
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int i16 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar4, l0VarD, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            bVar3.invoke(kVarP, Integer.valueOf((i15 >> 6) & 14));
            kVarP.T(true);
            kVarP.L(1087196576);
            if (pVar != null) {
                androidx.compose.ui.d dVarB2 = androidx.compose.ui.layout.a.b(aVar3, AnnotatedPrivateKey.LABEL);
                boolean z14 = (i13 == 16384) | (i12 == 131072);
                Object objG2 = kVarP.g();
                if (z14 || objG2 == c0321a) {
                    z11 = z10;
                    aVar2 = aVar;
                    objG2 = new n8(aVar2, z11);
                    kVarP.C(objG2);
                } else {
                    z11 = z10;
                    aVar2 = aVar;
                }
                androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarB2, (eh.l) objG2);
                g2.l0 l0VarD2 = z.g.d(fVar, false);
                int i17 = kVarP.P;
                x0.a2 a2VarP3 = kVarP.P();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar4);
                } else {
                    kVarP.z();
                }
                ph.v1.j(bVar4, l0VarD2, kVarP);
                ph.v1.j(dVar, a2VarP3, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
                }
                ph.v1.j(cVar, dVarC3, kVarP);
                pVar2 = pVar;
                pVar2.invoke(kVarP, Integer.valueOf((i15 >> 9) & 14));
                z12 = true;
                kVarP.T(true);
            } else {
                pVar2 = pVar;
                z11 = z10;
                aVar2 = aVar;
                z12 = true;
            }
            kVarP.T(false);
            kVarP.T(z12);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p8(bVar, bVar2, bVar3, pVar2, z11, aVar2, i10);
        }
    }
}
