package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26032a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26033b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26034c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26035d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26036e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f26037f;

    static {
        float f10 = v0.z.f30526a;
        f26032a = v0.z.f30529d;
        f26033b = 72;
        f26034c = 16;
        f26035d = 14;
        f26036e = 6;
        f26037f = f3.u.c(20);
    }

    public static final void a(boolean z10, eh.a aVar, androidx.compose.ui.d dVar, boolean z11, long j10, long j11, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-202735880);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.c(z10) ? 4 : 2) | i10;
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
            i11 |= kVarP.c(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.j(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.j(j11) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.K(null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i11 |= kVarP.l(bVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            int i12 = i11 >> 12;
            c(j10, j11, z10, f1.c.b(-551896140, new ae(dVar, z10, ha.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j10, kVarP, ((i11 >> 6) & 896) | 6, 2), z11, aVar, bVar), kVarP), kVarP, (i12 & 112) | (i12 & 14) | 3072 | ((i11 << 6) & 896));
            kVarP = kVarP;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new be(z10, aVar, dVar, z11, j10, j11, bVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z10, eh.a aVar, androidx.compose.ui.d dVar, boolean z11, eh.p pVar, eh.p pVar2, long j10, long j11, x0.j jVar, int i10, int i11) {
        eh.p pVar3;
        long j12;
        long j13;
        int i12;
        boolean z12;
        f1.b bVarB;
        long j14;
        long j15;
        androidx.compose.ui.d dVar2;
        x0.k kVar;
        androidx.compose.ui.d dVar3;
        boolean z13;
        long j16;
        long j17;
        x0.h2 h2VarV;
        int i13;
        x0.k kVarP = jVar.p(-350627181);
        int i14 = i10 | (kVarP.c(z10) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i14 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i15 = i14 | 3456;
        int i16 = i11 & 32;
        if (i16 != 0) {
            i15 = 200064 | i14;
        } else {
            if ((i10 & 196608) == 0) {
                pVar3 = pVar2;
                i15 |= kVarP.l(pVar3) ? 131072 : 65536;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (kVarP.j(j12)) {
                        i13 = PKIFailureInfo.badCertTemplate;
                    }
                    i15 |= i13;
                } else {
                    j12 = j10;
                }
                i13 = PKIFailureInfo.signerNotTrusted;
                i15 |= i13;
            } else {
                j12 = j10;
            }
            if ((i11 & 128) != 0) {
                j13 = j11;
                int i17 = kVarP.j(j13) ? 8388608 : 4194304;
                i12 = i15 | i17 | 100663296;
                if ((38347923 & i12) == 38347922 && kVarP.s()) {
                    kVarP.v();
                    dVar3 = dVar;
                    z13 = z11;
                    kVar = kVarP;
                    j17 = j13;
                    j16 = j12;
                } else {
                    kVarP.r0();
                    if ((i10 & 1) != 0 || kVarP.a0()) {
                        if (i16 != 0) {
                            pVar3 = null;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = ((q1.b1) kVarP.f(p2.f26666a)).f21656a;
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j13 = j12;
                        }
                        z12 = true;
                        bVarB = null;
                        j14 = j12;
                        j15 = j13;
                        dVar2 = d.a.f1143b;
                    } else {
                        kVarP.v();
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        dVar2 = dVar;
                        j14 = j12;
                        j15 = j13;
                        bVarB = null;
                        z12 = z11;
                    }
                    kVarP.U();
                    kVarP.L(79583089);
                    if (pVar != null) {
                        bVarB = f1.c.b(708874428, new ce(pVar), kVarP);
                    }
                    kVarP.T(false);
                    f1.b bVarB2 = f1.c.b(1540996038, new yd(pVar3, bVarB), kVarP);
                    int i18 = (i12 & 14) | 12582912 | (i12 & 112) | 3456;
                    int i19 = i12 >> 6;
                    kVar = kVarP;
                    a(z10, aVar, dVar2, z12, j14, j15, bVarB2, kVar, (i19 & 458752) | i18 | (57344 & i19) | 1572864);
                    dVar3 = dVar2;
                    z13 = z12;
                    j16 = j14;
                    j17 = j15;
                }
                eh.p pVar4 = pVar3;
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new zd(z10, aVar, dVar3, z13, pVar, pVar4, j16, j17, i10, i11);
                    return;
                }
                return;
            }
            j13 = j11;
            i12 = i15 | i17 | 100663296;
            if ((38347923 & i12) == 38347922) {
                kVarP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                    }
                    if ((i11 & 64) != 0) {
                    }
                    if ((i11 & 128) != 0) {
                    }
                    z12 = true;
                    bVarB = null;
                    j14 = j12;
                    j15 = j13;
                    dVar2 = d.a.f1143b;
                    kVarP.U();
                    kVarP.L(79583089);
                    if (pVar != null) {
                    }
                    kVarP.T(false);
                    f1.b bVarB22 = f1.c.b(1540996038, new yd(pVar3, bVarB), kVarP);
                    int i182 = (i12 & 14) | 12582912 | (i12 & 112) | 3456;
                    int i192 = i12 >> 6;
                    kVar = kVarP;
                    a(z10, aVar, dVar2, z12, j14, j15, bVarB22, kVar, (i192 & 458752) | i182 | (57344 & i192) | 1572864);
                    dVar3 = dVar2;
                    z13 = z12;
                    j16 = j14;
                    j17 = j15;
                }
            }
            eh.p pVar42 = pVar3;
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        pVar3 = pVar2;
        if ((i10 & 1572864) != 0) {
        }
        if ((i11 & 128) != 0) {
        }
        i12 = i15 | i17 | 100663296;
        if ((38347923 & i12) == 38347922) {
        }
        eh.p pVar422 = pVar3;
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(long j10, long j11, boolean z10, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        long j12;
        x0.k kVarP = jVar.p(735731848);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j12 = j11;
            i11 |= kVarP.j(j12) ? 32 : 16;
        } else {
            j12 = j11;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            int i12 = i11 >> 6;
            s.y1 y1VarE = s.c2.e(Boolean.valueOf(z10), null, kVarP, i12 & 14, 2);
            x0.x1 x1Var = y1VarE.f24004d;
            boolean zBooleanValue = ((Boolean) x1Var.getValue()).booleanValue();
            kVarP.L(-1997025499);
            long j13 = zBooleanValue ? j10 : j12;
            kVarP.T(false);
            r1.c cVarG = q1.b1.g(j13);
            boolean zK = kVarP.K(cVarG);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = (s.n2) r.m0.f22884a.invoke(cVarG);
                kVarP.C(objG);
            }
            s.n2 n2Var = (s.n2) objG;
            boolean zBooleanValue2 = ((Boolean) y1VarE.f24001a.V()).booleanValue();
            kVarP.L(-1997025499);
            long j14 = zBooleanValue2 ? j10 : j12;
            kVarP.T(false);
            q1.b1 b1Var = new q1.b1(j14);
            boolean zBooleanValue3 = ((Boolean) x1Var.getValue()).booleanValue();
            kVarP.L(-1997025499);
            long j15 = zBooleanValue3 ? j10 : j12;
            kVarP.T(false);
            x0.y.a(com.android.aapt.a.b(((q1.b1) s.c2.c(y1VarE, b1Var, new q1.b1(j15), ge.f25947a.b(y1VarE.f(), kVarP, 0), n2Var, kVarP, 0).f24031k.getValue()).f21656a, p2.f26666a), bVar, kVarP, (i12 & 112) | 8);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new fe(j10, j12, z10, bVar, i10);
        }
    }

    public static final void d(eh.p pVar, eh.p pVar2, x0.j jVar, int i10) {
        int i11;
        int i12;
        boolean z10;
        x0.k kVarP = jVar.p(514131524);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            int i13 = i11 & 14;
            boolean z11 = (i13 == 4) | ((i11 & 112) == 32);
            Object objG = kVarP.g();
            if (z11 || objG == j.a.f31715a) {
                objG = new de(pVar, pVar2);
                kVarP.C(objG);
            }
            g2.l0 l0Var = (g2.l0) objG;
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, l0Var, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            kVarP.L(871566271);
            j1.f fVar = d.a.f14602a;
            if (pVar != null) {
                i12 = i11;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.ui.layout.a.b(aVar, "text"), f26034c, CropImageView.DEFAULT_ASPECT_RATIO, 2);
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
                ph.v1.j(bVar, l0VarD, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                pVar.invoke(kVarP, Integer.valueOf(i13));
                kVarP.T(true);
            } else {
                i12 = i11;
            }
            boolean z12 = false;
            kVarP.T(false);
            kVarP.L(871570579);
            if (pVar2 != null) {
                androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar, "icon");
                g2.l0 l0VarD2 = z.g.d(fVar, false);
                int i16 = kVarP.P;
                x0.a2 a2VarP3 = kVarP.P();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar2);
                } else {
                    kVarP.z();
                }
                ph.v1.j(bVar, l0VarD2, kVarP);
                ph.v1.j(dVar, a2VarP3, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                }
                ph.v1.j(cVar, dVarC3, kVarP);
                pVar2.invoke(kVarP, Integer.valueOf((i12 >> 3) & 14));
                z10 = true;
                kVarP.T(true);
                z12 = false;
            } else {
                z10 = true;
            }
            kVarP.T(z12);
            kVarP.T(z10);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new ee(pVar, pVar2, i10);
        }
    }
}
