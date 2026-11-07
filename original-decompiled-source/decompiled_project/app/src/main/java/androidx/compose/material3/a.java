package androidx.compose.material3;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.selection.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.n0;
import com.android.apksig.internal.apk.v4.V4Signature;
import eh.l;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.provider.digest.e;
import ph.v1;
import q1.b1;
import q2.i;
import s.b0;
import s.j1;
import s.m2;
import t.o;
import t0.ab;
import t0.e2;
import t0.f2;
import t0.ha;
import t0.sd;
import t0.ud;
import t0.vd;
import t0.w4;
import v0.c0;
import v0.i0;
import x.m;
import x.n;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.s3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1126a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1127b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1128c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1129d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1130e;

    /* renamed from: f, reason: collision with root package name */
    public static final j1<Float> f1131f;

    /* renamed from: g, reason: collision with root package name */
    public static final m2<Float> f1132g;

    static {
        float f10 = i0.f30306b;
        f1126a = f10;
        f1127b = i0.f30311g;
        f1128c = i0.f30310f;
        float f11 = i0.f30308d;
        f1129d = f11;
        f1130e = (f11 - f10) / 2;
        f1131f = new j1<>(0);
        f1132g = new m2<>(100, (b0) null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, l lVar, d dVar, boolean z11, sd sdVar, j jVar, int i10, int i11) {
        int i12;
        boolean z12;
        sd sdVar2;
        int i13;
        int i14;
        d dVarA;
        sd sdVar3;
        boolean z13;
        int i15;
        d dVar2;
        sd sdVar4;
        int i16;
        Object objG;
        d dVar3;
        h2 h2VarV;
        k kVarP = jVar.p(1580463220);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(lVar) ? 32 : 16;
        }
        int i17 = i12 | 3456;
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                z12 = z11;
                i17 |= kVarP.c(z12) ? 16384 : 8192;
            }
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    sdVar2 = sdVar;
                    int i19 = kVarP.K(sdVar2) ? 131072 : 65536;
                    i17 |= i19;
                } else {
                    sdVar2 = sdVar;
                }
                i17 |= i19;
            } else {
                sdVar2 = sdVar;
            }
            i13 = i17 | 1572864;
            if ((599187 & i13) == 599186 || !kVarP.s()) {
                kVarP.r0();
                i14 = i10 & 1;
                dVarA = d.a.f1143b;
                if (i14 != 0 || kVarP.a0()) {
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 32) == 0) {
                        e2 e2Var = (e2) kVarP.f(f2.f25858a);
                        sd sdVar5 = e2Var.f25756c0;
                        long j10 = e2Var.f25770p;
                        if (sdVar5 == null) {
                            float f10 = i0.f30305a;
                            long jD = f2.d(e2Var, v0.d.f30241e);
                            long jD2 = f2.d(e2Var, v0.d.f30248m);
                            long j11 = b1.f21653g;
                            long jD3 = f2.d(e2Var, v0.d.f30242f);
                            v0.d dVar4 = v0.d.f30246k;
                            long jD4 = f2.d(e2Var, dVar4);
                            v0.d dVar5 = v0.d.f30256w;
                            long jD5 = f2.d(e2Var, dVar5);
                            long jD6 = f2.d(e2Var, dVar4);
                            long jD7 = f2.d(e2Var, dVar5);
                            long jF = n0.f(b1.c(1.0f, f2.d(e2Var, v0.d.f30253s)), j10);
                            v0.d dVar6 = v0.d.f30244h;
                            i16 = -458753;
                            sdVar3 = new sd(jD, jD2, j11, jD3, jD4, jD5, jD6, jD7, jF, n0.f(b1.c(0.12f, f2.d(e2Var, dVar6)), j10), j11, n0.f(b1.c(0.38f, f2.d(e2Var, dVar6)), j10), n0.f(b1.c(0.38f, f2.d(e2Var, dVar6)), j10), n0.f(b1.c(0.12f, f2.d(e2Var, dVar5)), j10), n0.f(b1.c(0.12f, f2.d(e2Var, dVar6)), j10), n0.f(b1.c(0.38f, f2.d(e2Var, dVar5)), j10));
                            e2Var.f25756c0 = sdVar3;
                        } else {
                            i16 = -458753;
                            sdVar3 = sdVar5;
                        }
                        i13 &= i16;
                    } else {
                        sdVar3 = sdVar2;
                    }
                    z13 = z12;
                    i15 = i13;
                    dVar2 = dVarA;
                    sdVar4 = sdVar3;
                } else {
                    kVarP.v();
                    if ((i11 & 32) != 0) {
                        i13 &= -458753;
                    }
                    dVar2 = dVar;
                    z13 = z12;
                    i15 = i13;
                    sdVar4 = sdVar2;
                }
                kVarP.U();
                kVarP.L(783532531);
                objG = kVarP.g();
                if (objG == j.a.f31715a) {
                    objG = new n();
                    kVarP.C(objG);
                }
                m mVar = (m) objG;
                kVarP.T(false);
                if (lVar != null) {
                    s3 s3Var = w4.f27281a;
                    dVarA = b.a(MinimumInteractiveModifier.f1120b, z10, mVar, null, z13, new i(2), lVar);
                }
                d dVarK = g.k(g.u(dVar2.h(dVarA), d.a.f14606e), f1128c, f1129d);
                float f11 = i0.f30305a;
                int i20 = i15 << 3;
                int i21 = i15 >> 6;
                b(dVarK, z10, z13, sdVar4, mVar, ab.a(c0.f30231d, kVarP), kVarP, (i20 & 112) | (i21 & 896) | (i21 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i20 & 57344));
                dVar3 = dVar2;
                sdVar2 = sdVar4;
            } else {
                kVarP.v();
                dVar3 = dVar;
                z13 = z12;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new ud(z10, lVar, dVar3, z13, sdVar2, i10, i11);
                return;
            }
            return;
        }
        i17 = i12 | 28032;
        z12 = z11;
        if ((196608 & i10) != 0) {
        }
        i13 = i17 | 1572864;
        if ((599187 & i13) == 599186) {
            kVarP.r0();
            i14 = i10 & 1;
            dVarA = d.a.f1143b;
            if (i14 != 0) {
                if (i18 != 0) {
                }
                if ((i11 & 32) == 0) {
                }
                z13 = z12;
                i15 = i13;
                dVar2 = dVarA;
                sdVar4 = sdVar3;
                kVarP.U();
                kVarP.L(783532531);
                objG = kVarP.g();
                if (objG == j.a.f31715a) {
                }
                m mVar2 = (m) objG;
                kVarP.T(false);
                if (lVar != null) {
                }
                androidx.compose.ui.d dVarK2 = g.k(g.u(dVar2.h(dVarA), d.a.f14606e), f1128c, f1129d);
                float f112 = i0.f30305a;
                int i202 = i15 << 3;
                int i212 = i15 >> 6;
                b(dVarK2, z10, z13, sdVar4, mVar2, ab.a(c0.f30231d, kVarP), kVarP, (i202 & 112) | (i212 & 896) | (i212 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i202 & 57344));
                dVar3 = dVar2;
                sdVar2 = sdVar4;
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(androidx.compose.ui.d dVar, boolean z10, boolean z11, sd sdVar, x.l lVar, q1.f2 f2Var, j jVar, int i10) {
        int i11;
        long j10;
        long j11;
        k kVarP = jVar.p(-1594099146);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.c(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(sdVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.K(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.K(f2Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i11 & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            long j12 = z11 ? z10 ? sdVar.f26987b : sdVar.f26991f : z10 ? sdVar.f26995j : sdVar.f26999n;
            long j13 = z11 ? z10 ? sdVar.f26986a : sdVar.f26990e : z10 ? sdVar.f26994i : sdVar.f26998m;
            float f10 = i0.f30305a;
            q1.f2 f2VarA = ab.a(c0.f30231d, kVarP);
            float f11 = i0.f30309e;
            if (z11) {
                j10 = j12;
                j11 = z10 ? sdVar.f26988c : sdVar.f26992g;
            } else {
                j10 = j12;
                j11 = z10 ? sdVar.f26996k : sdVar.f27000o;
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(o.a(dVar, f11, j11, f2VarA), j10, f2VarA);
            l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, l0VarD, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i12))) {
                e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.e.a(androidx.compose.foundation.layout.b.f961a.b(d.a.f1143b, d.a.f14605d).h(new ThumbElement(lVar, z10)), lVar, ha.a(false, i0.f30307c / 2, 0L, kVarP, 54, 4)), j13, f2Var);
            l0 l0VarD2 = z.g.d(d.a.f14606e, false);
            int i13 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = c.c(dVarB2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(bVar, l0VarD2, kVarP);
            v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i13))) {
                e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            kVarP.L(1163457794);
            kVarP.T(false);
            kVarP.T(true);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new vd(dVar, z10, z11, sdVar, lVar, f2Var, i10);
        }
    }
}
