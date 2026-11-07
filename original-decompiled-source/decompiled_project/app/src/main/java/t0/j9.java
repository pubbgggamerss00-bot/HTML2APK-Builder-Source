package t0;

import android.view.View;
import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.WeakHashMap;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26151a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26152b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26153c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26154d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26155e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f26156f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f26157g;

    static {
        float f10 = 4;
        f26151a = f10;
        float f11 = v0.v.f30487a;
        f26152b = v0.v.f30489c;
        float f12 = v0.v.f30494h;
        f26153c = f12;
        f26154d = f10;
        float f13 = v0.v.f30488b;
        float f14 = v0.v.f30490d;
        float f15 = 2;
        f26155e = (f13 - f14) / f15;
        f26156f = (v0.v.f30487a - f14) / f15;
        f26157g = (f12 - f14) / f15;
    }

    public static final void a(androidx.compose.ui.d dVar, long j10, long j11, z.u1 u1Var, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        long j12;
        z.u1 b1Var;
        f1.b bVar2;
        z.u1 u1Var2;
        x0.k kVarP = jVar.p(118552648);
        int i12 = i10 | (kVarP.j(j10) ? 32 : 16) | 11392;
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
            j12 = j11;
            u1Var2 = u1Var;
            bVar2 = bVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                long jB = f2.b(j10, kVarP);
                WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                i11 = i12 & (-58241);
                j12 = jB;
                b1Var = new z.b1(x1.a.c(kVarP).f34673g, hf.a.f12995f | hf.a.f12990a);
            } else {
                kVarP.v();
                i11 = i12 & (-58241);
                j12 = j11;
                b1Var = u1Var;
            }
            kVarP.U();
            bVar2 = bVar;
            md.a(dVar, null, j10, j12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-2092683357, new v8(b1Var, bVar2), kVarP), kVarP, 12582918 | ((i11 << 3) & 896), 114);
            u1Var2 = b1Var;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new w8(dVar, j10, j12, u1Var2, bVar2, i10);
        }
    }

    public static final void b(boolean z10, eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, boolean z11, eh.p pVar, boolean z12, t8 t8Var, x0.j jVar, int i10) {
        androidx.compose.ui.d dVar2;
        boolean z13;
        boolean z14;
        t8 t8Var2;
        androidx.compose.ui.d dVar3;
        q1.f2 f2VarA;
        boolean z15;
        x0.k kVar;
        boolean z16;
        boolean z17;
        x0.k kVarP = jVar.p(-1533971045);
        if (((i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | 1600512 | (kVarP.K(t8Var) ? 8388608 : 4194304) | 100663296) & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            z17 = z11;
            kVar = kVarP;
            t8Var2 = t8Var;
            z16 = z12;
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
            kVarP.L(-782588008);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new x.n();
                kVarP.C(objG);
            }
            x.m mVar = (x.m) objG;
            kVarP.T(false);
            boolean z18 = z14;
            f1.b bVarB = f1.c.b(-1023357515, new c9(t8Var, z10, z13, pVar, z14, bVar), kVarP);
            kVarP.L(-782561860);
            f1.b bVarB2 = pVar == null ? null : f1.c.b(-105269599, new d9(t8Var, z10, z13, pVar), kVarP);
            kVarP.T(false);
            boolean z19 = z13;
            t8Var2 = t8Var;
            dVar3 = dVar2;
            androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.g.b(androidx.compose.foundation.selection.a.a(dVar3, z10, mVar, null, z19, new q2.i(4), aVar), CropImageView.DEFAULT_ASPECT_RATIO, f26153c, 1), f26152b, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, true);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarS, kVarP);
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            x0.r3 r3VarB = s.g.b(z10 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO, s.m.d(150, 0, null, 6), null, kVarP, 48, 28);
            f3.d dVar4 = (f3.d) kVarP.f(j2.j2.f14779h);
            long jA = p1.d.a((dVar4.b1(r3) - dVar4.b1(v0.v.f30488b)) / 2, CropImageView.DEFAULT_ASPECT_RATIO);
            pg.f0 f0Var = pg.f0.f21461a;
            boolean zK = kVarP.K(mVar) | kVarP.j(jA);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                objG2 = new u0.q0(mVar, jA);
                kVarP.C(objG2);
            }
            u0.q0 q0Var = (u0.q0) objG2;
            if (pVar != null) {
                kVarP.L(585295320);
                f2VarA = ab.a(v0.c0.f30231d, kVarP);
                kVarP.T(false);
            } else {
                kVarP.L(585379857);
                f2VarA = ab.a(v0.v.f30495i, kVarP);
                kVarP.T(false);
            }
            f1.b bVarB3 = f1.c.b(211026382, new z8(f2VarA, q0Var), kVarP);
            f1.b bVarB4 = f1.c.b(-1862011490, new y8(r3VarB, t8Var2, f2VarA), kVarP);
            boolean zK2 = kVarP.K(r3VarB);
            Object objG3 = kVarP.g();
            if (zK2 || objG3 == obj) {
                z15 = true;
                objG3 = new j2.e1(r3VarB, 1);
                kVarP.C(objG3);
            } else {
                z15 = true;
            }
            c(bVarB3, bVarB4, bVarB, bVarB2, z18, (eh.a) objG3, kVarP, 25014);
            kVar = kVarP;
            kVar.T(z15);
            z16 = z18;
            z17 = z19;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a9(z10, aVar, bVar, dVar3, z17, pVar, z16, t8Var2, i10);
        }
    }

    public static final void c(f1.b bVar, f1.b bVar2, f1.b bVar3, eh.p pVar, boolean z10, eh.a aVar, x0.j jVar, int i10) {
        int i11;
        boolean z11;
        eh.a aVar2;
        boolean z12;
        eh.p pVar2 = pVar;
        x0.k kVarP = jVar.p(1498399348);
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
                objG = new f9(aVar, pVar2, z10);
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
            kVarP.L(2145400941);
            if (pVar != null) {
                androidx.compose.ui.d dVarB2 = androidx.compose.ui.layout.a.b(aVar3, AnnotatedPrivateKey.LABEL);
                boolean z14 = (i13 == 16384) | (i12 == 131072);
                Object objG2 = kVarP.g();
                if (z14 || objG2 == c0321a) {
                    z11 = z10;
                    aVar2 = aVar;
                    objG2 = new e9(aVar2, z11);
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
            h2VarV.f31703d = new g9(bVar, bVar2, bVar3, pVar2, z11, aVar2, i10);
        }
    }
}
