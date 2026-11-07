package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.y1;
import x0.j;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f27518a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f27519b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f27520c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f27521d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f27522e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f27523f = 280;

    static {
        float f10 = 48;
        f27518a = f10;
        f27519b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(androidx.compose.ui.d dVar, s.s0 s0Var, x0.n1 n1Var, t.u1 u1Var, q1.f2 f2Var, long j10, float f10, float f11, t.v vVar, f1.b bVar, x0.j jVar, int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-151448888);
        int i11 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(s0Var) ? 32 : 16) | (kVarP.K(u1Var) ? 2048 : 1024) | (kVarP.K(f2Var) ? 16384 : 8192) | (kVarP.j(j10) ? 131072 : 65536) | (kVarP.h(f10) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.h(f11) ? 8388608 : 4194304) | (kVarP.K(vVar) ? 67108864 : 33554432) | (kVarP.l(bVar) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if ((i11 & 306783379) == 306783378 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            s.y1 y1VarD = s.c2.d(s0Var, "DropDownMenu", kVarP, (((i11 >> 3) & 14) | 48) & 126);
            s.o2 o2Var = s.p2.f23868a;
            c2.g0 g0Var = y1VarD.f24001a;
            x0.x1 x1Var = y1VarD.f24004d;
            boolean zBooleanValue = ((Boolean) g0Var.V()).booleanValue();
            kVarP.L(2139028452);
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            kVarP.T(false);
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) x1Var.getValue()).booleanValue();
            kVarP.L(2139028452);
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            kVarP.T(false);
            y1.d dVarC = s.c2.c(y1VarD, fValueOf, Float.valueOf(f13), t5.f27051a.b(y1VarD.f(), kVarP, 0), o2Var, kVarP, 0);
            boolean zBooleanValue3 = ((Boolean) y1VarD.f24001a.V()).booleanValue();
            kVarP.L(-249413128);
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            kVarP.T(false);
            Float fValueOf2 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) x1Var.getValue()).booleanValue();
            kVarP.L(-249413128);
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            kVarP.T(false);
            boolean z10 = false;
            y1.d dVarC2 = s.c2.c(y1VarD, fValueOf2, Float.valueOf(f15), s5.f26939a.b(y1VarD.f(), kVarP, 0), o2Var, kVarP, 0);
            boolean zBooleanValue5 = ((Boolean) kVarP.f(j2.d3.f14698a)).booleanValue();
            boolean zC = kVarP.c(zBooleanValue5) | kVarP.K(dVarC);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            boolean zK = zC | z10 | kVarP.K(dVarC2);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                p5 p5Var = new p5(zBooleanValue5, s0Var, n1Var, dVarC, dVarC2);
                kVarP.C(p5Var);
                objG = p5Var;
            }
            int i12 = i11 >> 9;
            int i13 = i11 >> 6;
            md.a(androidx.compose.ui.graphics.a.a(d.a.f1143b, (eh.l) objG), f2Var, j10, 0L, f10, f11, vVar, f1.c.b(1573559053, new q5(dVar, u1Var, bVar), kVarP), kVarP, (i12 & 896) | (i12 & 112) | 12582912 | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 8);
            kVar = kVarP;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r5(dVar, s0Var, n1Var, u1Var, f2Var, j10, f10, f11, vVar, bVar, i10);
        }
    }

    public static final void b(eh.p pVar, eh.a aVar, androidx.compose.ui.d dVar, eh.p pVar2, eh.p pVar3, boolean z10, o5 o5Var, z.f1 f1Var, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.K(o5Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i11 |= kVarP.K(f1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= kVarP.K(null) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.q(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.b.b(dVar, null, ha.a(true, CropImageView.DEFAULT_ASPECT_RATIO, 0L, kVarP, 6, 6), z10, null, aVar, 24), 1.0f), f27522e, f27523f, 8), f1Var);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            ff.a(((nf) kVarP.f(of.f26647a)).f26550m, f1.c.b(1065051884, new x5(pVar2, o5Var, z10, pVar3, pVar), kVarP), kVarP, 48);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new y5(pVar, aVar, dVar, pVar2, pVar3, z10, o5Var, f1Var, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(f3.n nVar, f3.n nVar2) {
        float fMin;
        int i10 = nVar2.f8822a;
        int i11 = nVar2.f8825d;
        int i12 = nVar2.f8822a;
        int i13 = nVar2.f8824c;
        int i14 = nVar2.f8823b;
        int i15 = nVar.f8824c;
        int i16 = nVar.f8823b;
        int i17 = nVar.f8825d;
        int i18 = nVar.f8822a;
        float fMin2 = 1.0f;
        if (i10 < i15) {
            if (i13 <= i18) {
                fMin = 1.0f;
            } else if (nVar2.d() == 0) {
                fMin = 0.0f;
            } else {
                fMin = (((Math.min(nVar.f8824c, i13) + Math.max(i18, i12)) / 2) - i12) / nVar2.d();
            }
        }
        if (i14 < i17) {
            if (i11 > i16) {
                if (nVar2.b() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(i17, i11) + Math.max(i16, i14)) / 2) - i14) / nVar2.b();
                }
            }
        }
        return b3.e.a(fMin, fMin2);
    }
}
