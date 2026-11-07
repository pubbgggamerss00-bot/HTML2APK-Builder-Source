package t0;

import android.view.View;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;
import z.b;
import z.x1;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25901a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25902b;

    static {
        new s.w(0.8f, CropImageView.DEFAULT_ASPECT_RATIO, 0.8f, 0.15f);
        float f10 = 4;
        f25901a = f10;
        f25902b = 16 - f10;
    }

    public static final void a(androidx.compose.ui.d dVar, eh.p pVar, t2.l0 l0Var, eh.p pVar2, eh.q qVar, float f10, z.u1 u1Var, lf lfVar, x0.j jVar, int i10) {
        int i11;
        eh.p pVar3;
        t2.l0 l0Var2;
        eh.p pVar4;
        x0.k kVar;
        x0.k kVarP = jVar.p(-342194911);
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
            l0Var2 = l0Var;
            i11 |= kVarP.K(l0Var2) ? 256 : 128;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.c(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            pVar4 = pVar2;
            i11 |= kVarP.l(pVar4) ? 16384 : 8192;
        } else {
            pVar4 = pVar2;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(qVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.h(f10) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i11 |= kVarP.K(u1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= kVarP.K(lfVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= kVarP.K(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            if (Float.isNaN(f10) || f10 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float fN0 = ((f3.d) kVarP.f(j2.j2.f14779h)).N0(f10);
            if (fN0 < CropImageView.DEFAULT_ASPECT_RATIO) {
                fN0 = 0.0f;
            }
            int i12 = i11 & 1879048192;
            boolean zH = (i12 == 536870912) | kVarP.h(fN0);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zH || objG == c0321a) {
                objG = new x(0);
                kVarP.C(objG);
            }
            x0.l0 l0Var3 = x0.o0.f31834a;
            kVarP.u((eh.a) objG);
            boolean z10 = i12 == 536870912;
            Object objG2 = kVarP.g();
            if (z10 || objG2 == c0321a) {
                objG2 = bg.b.d(new c0(0));
                kVarP.C(objG2);
            }
            x0.r3 r3VarA = r.g2.a(c2.n0.g(lfVar.f26394a, lfVar.f26395b, s.d0.f23705c.a(((Number) ((x0.r3) objG2).getValue()).floatValue())), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5), null, kVarP, 48, 12);
            f1.b bVarB = f1.c.b(1370231018, new b0(qVar), kVarP);
            kVarP.L(-1193605157);
            kVarP.T(false);
            kVar = kVarP;
            md.a(dVar.h(d.a.f1143b), null, ((q1.b1) r3VarA.getValue()).f21656a, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1943739546, new z(u1Var, f10, lfVar, pVar3, l0Var2, pVar4, bVarB), kVarP), kVar, 12582912, 122);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a0(dVar, pVar, l0Var, pVar2, qVar, f10, u1Var, lfVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(eh.p pVar, androidx.compose.ui.d dVar, eh.p pVar2, eh.q qVar, float f10, z.u1 u1Var, lf lfVar, x0.j jVar, int i10, int i11) {
        eh.p pVar3;
        int i12;
        eh.q qVar2;
        int i13;
        float f11;
        int i14;
        eh.p pVar4;
        eh.q qVar3;
        androidx.compose.ui.d dVar2;
        z.u1 u1Var2;
        x0.k kVar;
        float f12;
        androidx.compose.ui.d dVar3;
        eh.q qVar4;
        z.u1 u1Var3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(226148675);
        int i15 = i10 | 48;
        int i16 = i11 & 4;
        if (i16 != 0) {
            i15 = i10 | 432;
        } else {
            if ((i10 & 384) == 0) {
                pVar3 = pVar2;
                i15 |= kVarP.l(pVar3) ? 256 : 128;
            }
            i12 = i11 & 8;
            if (i12 != 0) {
                if ((i10 & 3072) == 0) {
                    qVar2 = qVar;
                    i15 |= kVarP.l(qVar2) ? 2048 : 1024;
                }
                i13 = i15 | 90112 | (kVarP.K(lfVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 12582912;
                if ((4793491 & i13) == 4793490 && kVarP.s()) {
                    kVarP.v();
                    dVar3 = dVar;
                    u1Var3 = u1Var;
                    kVar = kVarP;
                    qVar4 = qVar2;
                    f12 = f10;
                } else {
                    kVarP.r0();
                    if ((i10 & 1) != 0 || kVarP.a0()) {
                        eh.p pVar5 = i16 == 0 ? h2.f25970a : pVar3;
                        eh.q qVar5 = i12 == 0 ? h2.f25971b : qVar2;
                        f11 = mf.f26477a;
                        WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                        z.b1 b1Var = new z.b1(x1.a.c(kVarP).f34673g, hf.a.f12994e | 16);
                        i14 = i13 & (-458753);
                        pVar4 = pVar5;
                        qVar3 = qVar5;
                        dVar2 = d.a.f1143b;
                        u1Var2 = b1Var;
                    } else {
                        kVarP.v();
                        i14 = i13 & (-458753);
                        dVar2 = dVar;
                        f11 = f10;
                        u1Var2 = u1Var;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                    }
                    kVarP.U();
                    int i17 = i14 << 6;
                    kVar = kVarP;
                    a(dVar2, pVar, of.a(v0.l0.f30341c, kVarP), pVar4, qVar3, (!f3.h.a(f11, Float.NaN) || f3.h.a(f11, Float.POSITIVE_INFINITY)) ? mf.f26477a : f11, u1Var2, lfVar, kVar, (i17 & 234881024) | (57344 & i17) | 3126 | (458752 & i17) | 805306368);
                    f12 = f11;
                    dVar3 = dVar2;
                    pVar3 = pVar4;
                    qVar4 = qVar3;
                    u1Var3 = u1Var2;
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new d0(pVar, dVar3, pVar3, qVar4, f12, u1Var3, lfVar, i10, i11);
                    return;
                }
                return;
            }
            i15 |= 3072;
            qVar2 = qVar;
            i13 = i15 | 90112 | (kVarP.K(lfVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 12582912;
            if ((4793491 & i13) == 4793490) {
                kVarP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    f11 = mf.f26477a;
                    WeakHashMap<View, z.x1> weakHashMap2 = z.x1.f34666v;
                    z.b1 b1Var2 = new z.b1(x1.a.c(kVarP).f34673g, hf.a.f12994e | 16);
                    i14 = i13 & (-458753);
                    pVar4 = pVar5;
                    qVar3 = qVar5;
                    dVar2 = d.a.f1143b;
                    u1Var2 = b1Var2;
                    kVarP.U();
                    if (f3.h.a(f11, Float.NaN)) {
                        int i172 = i14 << 6;
                        kVar = kVarP;
                        a(dVar2, pVar, of.a(v0.l0.f30341c, kVarP), pVar4, qVar3, (!f3.h.a(f11, Float.NaN) || f3.h.a(f11, Float.POSITIVE_INFINITY)) ? mf.f26477a : f11, u1Var2, lfVar, kVar, (i172 & 234881024) | (57344 & i172) | 3126 | (458752 & i172) | 805306368);
                        f12 = f11;
                        dVar3 = dVar2;
                        pVar3 = pVar4;
                        qVar4 = qVar3;
                        u1Var3 = u1Var2;
                    }
                }
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        pVar3 = pVar2;
        i12 = i11 & 8;
        if (i12 != 0) {
        }
        qVar2 = qVar;
        i13 = i15 | 90112 | (kVarP.K(lfVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 12582912;
        if ((4793491 & i13) == 4793490) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    public static final void c(androidx.compose.ui.d dVar, ta taVar, long j10, long j11, long j12, eh.p pVar, t2.l0 l0Var, b.l lVar, b.e eVar, eh.p pVar2, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        x0.k kVar;
        long j13 = j12;
        f1.b bVar2 = bVar;
        x0.k kVarP = jVar.p(-742442296);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? kVarP.K(taVar) : kVarP.l(taVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.j(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.j(j11) ? 2048 : 1024;
        }
        int i16 = i12;
        if ((i10 & 24576) == 0) {
            i13 = i16 | (kVarP.j(j13) ? 16384 : 8192);
        } else {
            i13 = i16;
        }
        if ((i10 & 196608) == 0) {
            i14 = i13 | (kVarP.l(pVar) ? 131072 : 65536);
        } else {
            i14 = i13;
        }
        if ((i10 & 1572864) == 0) {
            i14 |= kVarP.K(l0Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i14 |= kVarP.h(1.0f) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i14 |= kVarP.K(lVar) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i14 |= kVarP.K(eVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 6) == 0) {
            i15 = i11 | (kVarP.i(0) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            i15 |= kVarP.c(false) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i15 |= kVarP.l(pVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= kVarP.l(bVar2) ? 2048 : 1024;
        }
        int i17 = i15;
        if ((i14 & 306783379) == 306783378 && (i17 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            boolean z10 = ((i14 & 112) == 32 || ((i14 & 64) != 0 && kVarP.l(taVar))) | ((i14 & 1879048192) == 536870912) | ((i14 & 234881024) == 67108864) | ((i17 & 14) == 4);
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                objG = new e0(taVar, eVar, lVar);
                kVarP.C(objG);
            }
            g2.l0 l0Var2 = (g2.l0) objG;
            int i18 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar3 = g.a.f13867f;
            ph.v1.j(bVar3, l0Var2, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i18))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i18, kVarP, i18, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar2, "navigationIcon");
            float f10 = f25901a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(dVarB, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int i19 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar3, l0VarD, kVarP);
            ph.v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i19))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i19, kVarP, i19, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            x0.m0 m0Var = p2.f26666a;
            x0.y.a(com.android.aapt.a.b(j10, m0Var), pVar2, kVarP, ((i17 >> 3) & 112) | 8);
            kVarP.T(true);
            androidx.compose.ui.d dVarB2 = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.f.j(androidx.compose.ui.layout.a.b(aVar2, "title"), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2).h(aVar2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, false, 131067);
            g2.l0 l0VarD2 = z.g.d(fVar, false);
            int i20 = kVarP.P;
            x0.a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar3, l0VarD2, kVarP);
            ph.v1.j(dVar2, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i20))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i20, kVarP, i20, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVarP);
            int i21 = i14 >> 9;
            u0.v0.a(j11, l0Var, pVar, kVarP, (i21 & 14) | ((i14 >> 15) & 112) | (i21 & 896));
            kVar = kVarP;
            kVar.T(true);
            androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.f.l(androidx.compose.ui.layout.a.b(aVar2, "actionIcons"), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            g2.l0 l0VarD3 = z.g.d(fVar, false);
            int i22 = kVar.P;
            x0.a2 a2VarP4 = kVar.P();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarL2, kVar);
            kVar.r();
            if (kVar.O) {
                kVar.w(aVar);
            } else {
                kVar.z();
            }
            ph.v1.j(bVar3, l0VarD3, kVar);
            ph.v1.j(dVar2, a2VarP4, kVar);
            if (kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i22))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i22, kVar, i22, c0128a);
            }
            ph.v1.j(cVar, dVarC4, kVar);
            j13 = j12;
            bVar2 = bVar;
            x0.y.a(m0Var.a(new q1.b1(j13)), bVar2, kVar, 8 | ((i17 >> 6) & 112));
            kVar.T(true);
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f0(dVar, taVar, j10, j11, j13, pVar, l0Var, lVar, eVar, pVar2, bVar2, i10, i11);
        }
    }
}
