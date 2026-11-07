package t0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class s4 {
    public static final void a(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, j4 j4Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        f1.b bVar2;
        x0.k kVar;
        boolean z13;
        x0.k kVarP = jVar.p(1594730011);
        int i13 = i10 | (kVarP.l(aVar) ? 4 : 2);
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 = i13 | 384;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i13 | (kVarP.c(z11) ? 256 : 128);
        }
        int i15 = i12 | (kVarP.K(f2Var) ? 2048 : 1024) | (kVarP.K(j4Var) ? 16384 : 8192) | 196608;
        if ((599187 & i15) == 599186 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            z13 = z11;
            bVar2 = bVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                z12 = i14 != 0 ? true : z11;
            } else {
                kVarP.v();
                z12 = z11;
            }
            kVarP.U();
            bVar2 = bVar;
            kVar = kVarP;
            md.b(aVar, q2.q.a(dVar, false, l4.f26357a), z12, f2Var, z12 ? j4Var.f26133a : j4Var.f26135c, z12 ? j4Var.f26134b : j4Var.f26136d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, null, f1.c.b(-1560623888, new m4(bVar2), kVarP), kVar, (i15 & 8078) | 805306368, 448);
            z13 = z12;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n4(aVar, dVar, z13, f2Var, j4Var, bVar2, i10, i11);
        }
    }

    public static final void b(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, j4 j4Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        boolean z11;
        int i13;
        androidx.compose.ui.d dVar3;
        int i14;
        q1.f2 f2VarA;
        x0.k kVar;
        androidx.compose.ui.d dVar4;
        boolean z12;
        q1.f2 f2Var2;
        x0.k kVarP = jVar.p(-783937767);
        int i15 = i10 | (kVarP.l(aVar) ? 4 : 2);
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 = i15 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i12 = i15 | (kVarP.K(dVar2) ? 32 : 16);
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i13 = i12 | 384;
            z11 = z10;
        } else {
            z11 = z10;
            i13 = i12 | (kVarP.c(z11) ? 256 : 128);
        }
        int i18 = i13 | 1024 | (kVarP.K(j4Var) ? 16384 : 8192) | 196608;
        if ((599187 & i18) == 599186 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            dVar4 = dVar2;
            z12 = z11;
            f2Var2 = f2Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                dVar3 = i16 != 0 ? d.a.f1143b : dVar2;
                if (i17 != 0) {
                    z11 = true;
                }
                float f10 = v0.m.f30345a;
                i14 = i18 & (-7169);
                f2VarA = ab.a(v0.c0.f30231d, kVarP);
            } else {
                kVarP.v();
                i14 = i18 & (-7169);
                f2VarA = f2Var;
                dVar3 = dVar2;
            }
            boolean z13 = z11;
            kVarP.U();
            kVar = kVarP;
            md.b(aVar, q2.q.a(dVar3, false, o4.f26584a), z13, f2VarA, z13 ? j4Var.f26133a : j4Var.f26135c, z13 ? j4Var.f26134b : j4Var.f26136d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, null, f1.c.b(-1772884636, new p4(bVar), kVarP), kVar, (i14 & 8078) | 805306368, 448);
            dVar4 = dVar3;
            z12 = z13;
            f2Var2 = f2VarA;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new q4(aVar, dVar4, z12, f2Var2, j4Var, bVar, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, j4 j4Var, eh.p pVar, x0.j jVar, int i10, int i11) {
        eh.a aVar2;
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        j4 j4VarC;
        int i14;
        boolean z12;
        int i15;
        int i16;
        g.a.C0128a c0128a;
        j4 j4Var2;
        androidx.compose.ui.d dVar3;
        boolean z13;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1142896114);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i12 = (kVarP.l(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    i12 |= kVarP.c(z11) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j4VarC = j4Var;
                        int i18 = kVarP.K(j4VarC) ? 2048 : 1024;
                        i12 |= i18;
                    } else {
                        j4VarC = j4Var;
                    }
                    i12 |= i18;
                } else {
                    j4VarC = j4Var;
                }
                i14 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    i14 |= kVarP.l(pVar) ? 131072 : 65536;
                }
                if ((74899 & i14) == 74898 && kVarP.s()) {
                    kVarP.v();
                    dVar3 = dVar2;
                    z13 = z11;
                    j4Var2 = j4VarC;
                } else {
                    kVarP.r0();
                    if ((i10 & 1) != 0 || kVarP.a0()) {
                        androidx.compose.ui.d dVar4 = i17 == 0 ? d.a.f1143b : dVar2;
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i14 &= -7169;
                            j4VarC = k4.c(kVarP);
                        }
                        dVar2 = dVar4;
                        z12 = z11;
                        i15 = i14;
                    } else {
                        kVarP.v();
                        if ((i11 & 8) != 0) {
                            i14 &= -7169;
                        }
                        i15 = i14;
                        z12 = z11;
                    }
                    j4 j4Var3 = j4VarC;
                    kVarP.U();
                    x0.s3 s3Var = w4.f27281a;
                    androidx.compose.ui.d dVarH = dVar2.h(MinimumInteractiveModifier.f1120b);
                    float f10 = v0.q.f30456b;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(dVarH, f10), ab.a(v0.c0.f30231d, kVarP)), !z12 ? j4Var3.f26133a : j4Var3.f26135c, q1.y1.f21750a), null, ha.a(false, f10 / 2, 0L, kVarP, 54, 4), z12, new q2.i(0), aVar2, 8);
                    g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                    i16 = kVarP.P;
                    x0.a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar3);
                    }
                    ph.v1.j(g.a.f13867f, l0VarD, kVarP);
                    ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                    c0128a = g.a.f13868g;
                    if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                    }
                    ph.v1.j(g.a.f13865d, dVarC, kVarP);
                    x0.y.a(com.android.aapt.a.b(!z12 ? j4Var3.f26134b : j4Var3.f26136d, p2.f26666a), pVar, kVarP, ((i15 >> 12) & 112) | 8);
                    kVarP.T(true);
                    androidx.compose.ui.d dVar5 = dVar2;
                    j4Var2 = j4Var3;
                    dVar3 = dVar5;
                    z13 = z12;
                }
                h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new r4(aVar, dVar3, z13, j4Var2, pVar, i10, i11);
                    return;
                }
                return;
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            i14 = i12 | 24576;
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i14) == 74898) {
                kVarP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if ((i11 & 8) != 0) {
                    }
                    dVar2 = dVar4;
                    z12 = z11;
                    i15 = i14;
                    j4 j4Var32 = j4VarC;
                    kVarP.U();
                    x0.s3 s3Var2 = w4.f27281a;
                    androidx.compose.ui.d dVarH2 = dVar2.h(MinimumInteractiveModifier.f1120b);
                    float f102 = v0.q.f30456b;
                    androidx.compose.ui.d dVarB2 = androidx.compose.foundation.b.b(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(dVarH2, f102), ab.a(v0.c0.f30231d, kVarP)), !z12 ? j4Var32.f26133a : j4Var32.f26135c, q1.y1.f21750a), null, ha.a(false, f102 / 2, 0L, kVarP, 54, 4), z12, new q2.i(0), aVar2, 8);
                    g2.l0 l0VarD2 = z.g.d(d.a.f14606e, false);
                    i16 = kVarP.P;
                    x0.a2 a2VarP2 = kVarP.P();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB2, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar32 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                    }
                    ph.v1.j(g.a.f13867f, l0VarD2, kVarP);
                    ph.v1.j(g.a.f13866e, a2VarP2, kVarP);
                    c0128a = g.a.f13868g;
                    if (!kVarP.O) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                        ph.v1.j(g.a.f13865d, dVarC2, kVarP);
                        x0.y.a(com.android.aapt.a.b(!z12 ? j4Var32.f26134b : j4Var32.f26136d, p2.f26666a), pVar, kVarP, ((i15 >> 12) & 112) | 8);
                        kVarP.T(true);
                        androidx.compose.ui.d dVar52 = dVar2;
                        j4Var2 = j4Var32;
                        dVar3 = dVar52;
                        z13 = z12;
                    }
                }
            }
            h2VarV = kVarP.V();
            if (h2VarV != null) {
            }
        }
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 != 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        i14 = i12 | 24576;
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i14) == 74898) {
        }
        h2VarV = kVarP.V();
        if (h2VarV != null) {
        }
    }
}
