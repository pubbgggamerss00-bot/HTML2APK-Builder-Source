package h9;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import f9.x8;
import f9.y8;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import q1.y1;
import t0.ff;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class v3 {
    public static final void a(final String str, boolean z10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        final boolean z11 = z10;
        x0.k kVarP = jVar.p(-653939939);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z11) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), h0.f.a(12));
            kVarP.L(-1414660797);
            long jC = z11 ? q1.b1.c(0.15f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a) : q1.b1.f21653g;
            kVarP.T(false);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD, jC, q1.y1.f21750a), false, null, null, aVar, 7), 16, 14);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, kVarP, 54);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
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
            t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26547j;
            x0.s3 s3Var = t0.f2.f25858a;
            long j10 = ((t0.e2) kVarP.f(s3Var)).f25771q;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            ff.b(str, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i11 & 14, 0, 65528);
            kVarP = kVarP;
            kVarP.L(141241532);
            z11 = z10;
            if (z11) {
                p1.d.b(androidx.compose.foundation.layout.g.n(aVar2, 8), kVarP);
                t4.b(p0.n1.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 20), ((t0.e2) kVarP.f(s3Var)).f25751a, kVarP, 432, 0);
            }
            kVarP.T(false);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z11, aVar, i10) { // from class: h9.w1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12840a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f12841b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f12842c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v3.a(this.f12840a, this.f12841b, this.f12842c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(717889655);
        if (i10 == 0 && kVarP.s()) {
            kVarP.v();
        } else {
            z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1), ((t0.e2) kVarP.f(t0.f2.f25858a)).G, q1.y1.f21750a), kVarP, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new z1(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final w1.d dVar, final String str, final String str2, boolean z10, boolean z11, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i10, final int i11) {
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        int i14;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar2;
        int i15;
        boolean z14;
        int i16;
        int i17;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar3;
        x0.s3 s3Var;
        boolean z15;
        final boolean z16;
        final boolean z17;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(805250740);
        int i18 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128);
        int i19 = i11 & 8;
        if (i19 != 0) {
            i18 |= 3072;
        } else {
            if ((i10 & 3072) == 0) {
                z12 = z10;
                i18 |= kVarP.c(z12) ? 2048 : 1024;
            }
            i12 = i11 & 16;
            if (i12 == 0) {
                i13 = i18 | 24576;
                z13 = z11;
            } else {
                z13 = z11;
                i13 = i18 | (kVarP.c(z13) ? 16384 : 8192);
            }
            i14 = i11 & 32;
            if (i14 != 0) {
                if ((i10 & 196608) == 0) {
                    pVar2 = pVar;
                    i13 |= kVarP.l(pVar2) ? 131072 : 65536;
                }
                i15 = i13 | (kVarP.l(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                if ((i15 & 599187) == 599186 && kVarP.s()) {
                    kVarP.v();
                    z16 = z12;
                    z17 = z13;
                } else {
                    boolean z18 = i19 == 0 ? true : z12;
                    if (i12 != 0) {
                        z13 = true;
                    }
                    eh.p<? super x0.j, ? super Integer, pg.f0> pVar4 = i14 == 0 ? null : pVar2;
                    d.a aVar2 = d.a.f1143b;
                    boolean z19 = z13;
                    float f10 = 16;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), z19, null, null, aVar, 6), f10, 14);
                    z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, kVarP, 54);
                    int i20 = kVarP.P;
                    x0.a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar3);
                    }
                    g.a.b bVar = g.a.f13867f;
                    ph.v1.j(bVar, m1VarA, kVarP);
                    g.a.d dVar2 = g.a.f13866e;
                    ph.v1.j(dVar2, a2VarP, kVarP);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (kVarP.O) {
                        z14 = 14;
                        if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i20))) {
                        }
                        g.a.c cVar = g.a.f13865d;
                        ph.v1.j(cVar, dVarC, kVarP);
                        androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 40), h0.f.a(12));
                        x0.s3 s3Var2 = t0.f2.f25858a;
                        androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, ((t0.e2) kVarP.f(s3Var2)).G, q1.y1.f21750a);
                        g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                        i16 = kVarP.P;
                        x0.a2 a2VarP2 = kVarP.P();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
                        kVarP.r();
                        if (kVarP.O) {
                            kVarP.w(aVar3);
                        } else {
                            kVarP.z();
                        }
                        ph.v1.j(bVar, l0VarD, kVarP);
                        ph.v1.j(dVar2, a2VarP2, kVarP);
                        if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                        }
                        ph.v1.j(cVar, dVarC2, kVarP);
                        eh.p<? super x0.j, ? super Integer, pg.f0> pVar5 = pVar4;
                        t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar2, 22), ((t0.e2) kVarP.f(s3Var2)).f25751a, kVarP, (i15 & 14) | 432, 0);
                        kVarP.T(true);
                        if (1.0f <= 0.0d) {
                            a0.a.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                        i17 = kVarP.P;
                        x0.a2 a2VarP3 = kVarP.P();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
                        kVarP.r();
                        if (kVarP.O) {
                            kVarP.z();
                        } else {
                            kVarP.w(aVar3);
                        }
                        ph.v1.j(bVar, qVarA, kVarP);
                        ph.v1.j(dVar2, a2VarP3, kVarP);
                        if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
                        }
                        ph.v1.j(cVar, dVarC3, kVarP);
                        x0.s3 s3Var3 = of.f26647a;
                        ff.b(str, null, ((t0.e2) kVarP.f(s3Var2)).f25771q, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var3)).f26547j, kVarP, ((i15 >> 3) & 14) | 196608, 0, 65498);
                        kVarP = kVarP;
                        kVarP.L(499163345);
                        if (str2 != null) {
                            pVar3 = pVar5;
                            s3Var = s3Var2;
                            z15 = false;
                        } else {
                            pVar3 = pVar5;
                            s3Var = s3Var2;
                            ff.b(str2, null, ((t0.e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var3)).f26549l, kVarP, 0, 0, 65530);
                            kVarP = kVarP;
                            pg.f0 f0Var = pg.f0.f21461a;
                            z15 = false;
                        }
                        kVarP.T(z15);
                        kVarP.T(true);
                        kVarP.L(-1124593863);
                        pVar2 = pVar3;
                        if (pVar2 != null) {
                            pVar2.invoke(kVarP, Integer.valueOf((i15 >> 15) & 14));
                            pg.f0 f0Var2 = pg.f0.f21461a;
                        }
                        kVarP.T(z15);
                        kVarP.L(-1124593033);
                        if (z18) {
                            t4.b(n0.e.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 20), ((t0.e2) kVarP.f(s3Var)).f25773s, kVarP, 432, 0);
                        }
                        kVarP.T(z15);
                        kVarP.T(true);
                        z16 = z18;
                        z17 = z19;
                    } else {
                        z14 = 14;
                    }
                    org.bouncycastle.jcajce.provider.digest.e.a(i20, kVarP, i20, c0128a);
                    g.a.c cVar2 = g.a.f13865d;
                    ph.v1.j(cVar2, dVarC, kVarP);
                    androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 40), h0.f.a(12));
                    x0.s3 s3Var22 = t0.f2.f25858a;
                    androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(dVarD2, ((t0.e2) kVarP.f(s3Var22)).G, q1.y1.f21750a);
                    g2.l0 l0VarD2 = z.g.d(d.a.f14606e, false);
                    i16 = kVarP.P;
                    x0.a2 a2VarP22 = kVarP.P();
                    androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarB2, kVarP);
                    kVarP.r();
                    if (kVarP.O) {
                    }
                    ph.v1.j(bVar, l0VarD2, kVarP);
                    ph.v1.j(dVar2, a2VarP22, kVarP);
                    if (kVarP.O) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                        ph.v1.j(cVar2, dVarC22, kVarP);
                        eh.p<? super x0.j, ? super Integer, pg.f0> pVar52 = pVar4;
                        t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar2, 22), ((t0.e2) kVarP.f(s3Var22)).f25751a, kVarP, (i15 & 14) | 432, 0);
                        kVarP.T(true);
                        if (1.0f <= 0.0d) {
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                        z.q qVarA2 = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                        i17 = kVarP.P;
                        x0.a2 a2VarP32 = kVarP.P();
                        androidx.compose.ui.d dVarC32 = androidx.compose.ui.c.c(layoutWeightElement2, kVarP);
                        kVarP.r();
                        if (kVarP.O) {
                        }
                        ph.v1.j(bVar, qVarA2, kVarP);
                        ph.v1.j(dVar2, a2VarP32, kVarP);
                        if (!kVarP.O) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
                            ph.v1.j(cVar2, dVarC32, kVarP);
                            x0.s3 s3Var32 = of.f26647a;
                            ff.b(str, null, ((t0.e2) kVarP.f(s3Var22)).f25771q, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var32)).f26547j, kVarP, ((i15 >> 3) & 14) | 196608, 0, 65498);
                            kVarP = kVarP;
                            kVarP.L(499163345);
                            if (str2 != null) {
                            }
                            kVarP.T(z15);
                            kVarP.T(true);
                            kVarP.L(-1124593863);
                            pVar2 = pVar3;
                            if (pVar2 != null) {
                            }
                            kVarP.T(z15);
                            kVarP.L(-1124593033);
                            if (z18) {
                            }
                            kVarP.T(z15);
                            kVarP.T(true);
                            z16 = z18;
                            z17 = z19;
                        }
                    }
                }
                final eh.p<? super x0.j, ? super Integer, pg.f0> pVar6 = pVar2;
                h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p() { // from class: h9.a2
                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            v3.c(dVar, str, str2, z16, z17, pVar6, aVar, (x0.j) obj, f3.i.n(i10 | 1), i11);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            i13 |= 196608;
            pVar2 = pVar;
            i15 = i13 | (kVarP.l(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            if ((i15 & 599187) == 599186) {
                if (i19 == 0) {
                }
                if (i12 != 0) {
                }
                if (i14 == 0) {
                }
                d.a aVar22 = d.a.f1143b;
                boolean z192 = z13;
                float f102 = 16;
                androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar22, 1.0f), z192, null, null, aVar, 6), f102, 14);
                z.m1 m1VarA2 = z.k1.a(z.b.h(f102), d.a.f14612k, kVarP, 54);
                int i202 = kVarP.P;
                x0.a2 a2VarP4 = kVarP.P();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarI2, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar32 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                }
                g.a.b bVar2 = g.a.f13867f;
                ph.v1.j(bVar2, m1VarA2, kVarP);
                g.a.d dVar22 = g.a.f13866e;
                ph.v1.j(dVar22, a2VarP4, kVarP);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (kVarP.O) {
                }
                org.bouncycastle.jcajce.provider.digest.e.a(i202, kVarP, i202, c0128a2);
                g.a.c cVar22 = g.a.f13865d;
                ph.v1.j(cVar22, dVarC4, kVarP);
                androidx.compose.ui.d dVarD22 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar22, 40), h0.f.a(12));
                x0.s3 s3Var222 = t0.f2.f25858a;
                androidx.compose.ui.d dVarB22 = androidx.compose.foundation.a.b(dVarD22, ((t0.e2) kVarP.f(s3Var222)).G, q1.y1.f21750a);
                g2.l0 l0VarD22 = z.g.d(d.a.f14606e, false);
                i16 = kVarP.P;
                x0.a2 a2VarP222 = kVarP.P();
                androidx.compose.ui.d dVarC222 = androidx.compose.ui.c.c(dVarB22, kVarP);
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(bVar2, l0VarD22, kVarP);
                ph.v1.j(dVar22, a2VarP222, kVarP);
                if (kVarP.O) {
                }
            }
            final eh.p pVar62 = pVar2;
            h2VarV = kVarP.V();
            if (h2VarV != null) {
            }
        }
        z12 = z10;
        i12 = i11 & 16;
        if (i12 == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        pVar2 = pVar;
        i15 = i13 | (kVarP.l(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if ((i15 & 599187) == 599186) {
        }
        final eh.p pVar622 = pVar2;
        h2VarV = kVarP.V();
        if (h2VarV != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0379  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final p5.x navController, b4 b4Var, a9.b2 b2Var, final float f10, final int i10, final f1.b bVar, final f1.b bVar2, x0.j jVar, final int i11) throws Resources.NotFoundException {
        int i12;
        a9.b2 b2Var2;
        b4 b4Var2;
        a9.b2 b2Var3;
        b4 b4Var3;
        Context context;
        b4 b4Var4;
        j.a.C0321a c0321a;
        ?? r12;
        x0.k kVar;
        j.a.C0321a c0321a2;
        x0.k kVar2;
        b4 b4Var5;
        x0.k kVar3;
        final b4 b4Var6;
        final a9.b2 b2Var4;
        j.a.C0321a c0321a3;
        j.a.C0321a c0321a4;
        boolean zK;
        Object objG;
        x0.k kVar4;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1969623614);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.l(navController) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= kVarP.h(f10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= kVarP.i(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= kVarP.l(bVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= kVarP.l(bVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i12 & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
            b4Var6 = b4Var;
            b2Var4 = b2Var;
            kVar4 = kVarP;
        } else {
            kVarP.r0();
            if ((i11 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(b4.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                b4 b4Var7 = (b4) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(a9.b2.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                b2Var2 = (a9.b2) w0VarB2;
                b4Var2 = b4Var7;
            } else {
                kVarP.v();
                b4Var2 = b4Var;
                b2Var2 = b2Var;
            }
            kVarP.U();
            Context context2 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object objG2 = kVarP.g();
            j.a.C0321a c0321a5 = j.a.f31715a;
            if (objG2 == c0321a5) {
                x0.l0 l0Var = x0.o0.f31834a;
                x0.w2 w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG2 = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG2;
            x0.n1 n1VarA = bg.b.a(b4Var2.f12540d, "en", null, kVarP, 48, 2);
            n8.f1 f1Var = b4Var2.f12541e;
            k9.a.f16171c.getClass();
            x0.n1 n1VarA2 = bg.b.a(f1Var, k9.a.f16172d, null, kVarP, 0, 2);
            x0.n1 n1VarA3 = bg.b.a(b4Var2.f12542f, kVarP.f(q8.x1.f22493a), null, kVarP, 0, 2);
            x0.n1 n1VarB = bg.b.b(b2Var2.f142f, kVarP);
            x0.n1 n1VarB2 = bg.b.b(b4Var2.f12544h, kVarP);
            x0.n1 n1VarB3 = bg.b.b(b4Var2.f12546j, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(-518252060);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a5) {
                objG3 = new c2();
                kVarP.C(objG3);
            }
            kVarP.T(false);
            final x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG3, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(-518249820);
            Object objG4 = kVarP.g();
            if (objG4 == c0321a5) {
                objG4 = new d2();
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.n1 n1Var2 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG4, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(-518247356);
            Object objG5 = kVarP.g();
            if (objG5 == c0321a5) {
                objG5 = new f9.x(1);
                kVarP.C(objG5);
            }
            kVarP.T(false);
            x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG5, kVarP, 3072, 6);
            kVarP.L(-518245716);
            Object objG6 = kVarP.g();
            if (objG6 == c0321a5) {
                objG6 = bg.b.h(com.basitce.htmltoapk.util.a.c(context2));
                kVarP.C(objG6);
            }
            x0.n1 n1Var4 = (x0.n1) objG6;
            Object objA = p0.h.a(kVarP, false, -518242835);
            if (objA == c0321a5) {
                objA = bg.b.h(Boolean.FALSE);
                kVarP.C(objA);
            }
            x0.n1 n1Var5 = (x0.n1) objA;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-518237484);
            boolean zL = kVarP.l(b4Var2);
            Object objG7 = kVarP.g();
            if (zL || objG7 == c0321a5) {
                objG7 = new x8(b4Var2, 1);
                kVarP.C(objG7);
            }
            kVarP.T(false);
            h5.g.a(f0Var, null, (eh.l) objG7, kVarP, 6);
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            String str = (String) n1VarB3.getValue();
            kVarP.L(-518232034);
            boolean zK2 = kVarP.K(n1VarB3) | kVarP.l(b4Var2) | kVarP.l(context2) | kVarP.l(activity);
            Object objG8 = kVarP.g();
            if (zK2 || objG8 == c0321a5) {
                b2Var3 = b2Var2;
                b4 b4Var8 = b4Var2;
                l2 l2Var = new l2(n1VarB3, b4Var8, context2, activity, null);
                b4Var3 = b4Var8;
                context2 = context2;
                kVarP.C(l2Var);
                objG8 = l2Var;
            } else {
                b4Var3 = b4Var2;
                b2Var3 = b2Var2;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG8, str, kVarP);
            Context context3 = context2;
            b4 b4Var9 = b4Var3;
            ra.a(null, f1.c.b(1657982590, new n2(i10), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1889045293, new j3(f10, bVar, bVar2, navController, n1VarB, context3, n1Var, n1Var2, b4Var3, n1Var3, n1VarA, n1VarA2, n1VarA3, n1Var4, n1VarB2, n1Var5), kVarP), kVarP, 806879280, 189);
            x0.k kVar5 = kVarP;
            kVar5.L(-517927001);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVar5.L(-517927028);
                boolean zK3 = kVar5.K(context3);
                Object objG9 = kVar5.g();
                if (zK3) {
                    c0321a4 = c0321a5;
                } else {
                    c0321a4 = c0321a5;
                    if (objG9 == c0321a4) {
                    }
                    List list = (List) objG9;
                    kVar5.T(false);
                    kVar5.L(-517923287);
                    zK = kVar5.K(n1Var);
                    objG = kVar5.g();
                    if (!zK || objG == c0321a4) {
                        objG = new eh.a() { // from class: h9.e2
                            @Override // eh.a
                            public final Object invoke() {
                                v3.e(n1Var, false);
                                return pg.f0.f21461a;
                            }
                        };
                        kVar5.C(objG);
                    }
                    kVar5.T(false);
                    context = context3;
                    b4Var4 = b4Var9;
                    c0321a = c0321a4;
                    r12 = 0;
                    t0.r.a((eh.a) objG, f1.c.b(112045903, new l3(n1Var), kVar5), null, null, null, e.f12588b, f1.c.b(2147432532, new q3(context3, i0Var, b4Var9, n1Var, list, n1VarA), kVar5), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar5, 1769520, 0, 16284);
                    kVar = kVar5;
                }
                l9.d0.f16789a.getClass();
                objG9 = l9.d0.c(context3);
                kVar5.C(objG9);
                List list2 = (List) objG9;
                kVar5.T(false);
                kVar5.L(-517923287);
                zK = kVar5.K(n1Var);
                objG = kVar5.g();
                if (!zK) {
                    objG = new eh.a() { // from class: h9.e2
                        @Override // eh.a
                        public final Object invoke() {
                            v3.e(n1Var, false);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar5.C(objG);
                    kVar5.T(false);
                    context = context3;
                    b4Var4 = b4Var9;
                    c0321a = c0321a4;
                    r12 = 0;
                    t0.r.a((eh.a) objG, f1.c.b(112045903, new l3(n1Var), kVar5), null, null, null, e.f12588b, f1.c.b(2147432532, new q3(context3, i0Var, b4Var9, n1Var, list2, n1VarA), kVar5), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar5, 1769520, 0, 16284);
                    kVar = kVar5;
                }
            } else {
                context = context3;
                b4Var4 = b4Var9;
                c0321a = c0321a5;
                r12 = 0;
                kVar = kVar5;
            }
            kVar.T(r12);
            kVar.L(-517863760);
            if (((Boolean) n1Var3.getValue()).booleanValue()) {
                kVar.L(-517862771);
                boolean zK4 = kVar.K(n1Var3);
                Object objG10 = kVar.g();
                if (zK4) {
                    c0321a3 = c0321a;
                } else {
                    c0321a3 = c0321a;
                    if (objG10 == c0321a3) {
                    }
                    kVar.T(r12);
                    x0.j jVar2 = kVar;
                    c0321a2 = c0321a3;
                    t0.r.a((eh.a) objG10, f1.c.b(17986552, new s3(n1Var3), kVar), null, null, null, e.f12590d, f1.c.b(1814417341, new g2(context, n1Var3, n1Var4), kVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar2, 1769520, 0, 16284);
                    kVar2 = jVar2;
                }
                objG10 = new y8(n1Var3, 1);
                kVar.C(objG10);
                kVar.T(r12);
                x0.j jVar22 = kVar;
                c0321a2 = c0321a3;
                t0.r.a((eh.a) objG10, f1.c.b(17986552, new s3(n1Var3), kVar), null, null, null, e.f12590d, f1.c.b(1814417341, new g2(context, n1Var3, n1Var4), kVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar22, 1769520, 0, 16284);
                kVar2 = jVar22;
            } else {
                c0321a2 = c0321a;
                kVar2 = kVar;
            }
            kVar2.T(r12);
            if (((Boolean) n1Var2.getValue()).booleanValue()) {
                long j10 = ((t0.e2) kVar2.f(t0.f2.f25858a)).I;
                kVar2.L(-517809402);
                boolean zK5 = kVar2.K(n1Var2);
                Object objG11 = kVar2.g();
                if (zK5 || objG11 == c0321a2) {
                    objG11 = new u1(n1Var2, r12);
                    kVar2.C(objG11);
                }
                kVar2.T(r12);
                f1.b bVarB = f1.c.b(-218631273, new i2(n1Var2), kVar2);
                f1.b bVar3 = e.f12592f;
                b4Var5 = b4Var4;
                f1.b bVarB2 = f1.c.b(1577799516, new k2(b4Var5, n1Var2, n1VarA2), kVar2);
                x0.k kVar6 = kVar2;
                t0.r.a((eh.a) objG11, bVarB, null, null, null, bVar3, bVarB2, null, j10, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar6, 1769520, 0, 16028);
                kVar3 = kVar6;
            } else {
                b4Var5 = b4Var4;
                kVar3 = kVar2;
            }
            b4Var6 = b4Var5;
            b2Var4 = b2Var3;
            kVar4 = kVar3;
        }
        x0.h2 h2VarV = kVar4.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: h9.v1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).getClass();
                    v3.d(navController, b4Var6, b2Var4, f10, i10, bVar, bVar2, (x0.j) obj, f3.i.n(i11 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void f(final String str, f1.b bVar, x0.j jVar, final int i10) {
        final f1.b bVar2;
        x0.k kVarP = jVar.p(-834674276);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            bVar2 = bVar;
        } else {
            float f10 = 8;
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, kVarP, 6);
            int i12 = kVarP.P;
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
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26550m;
            x2.p pVar = x2.p.f32032e;
            x0.s3 s3Var = t0.f2.f25858a;
            ff.b(str, androidx.compose.foundation.layout.f.l(aVar, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((t0.e2) kVarP.f(s3Var)).f25751a, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, (i11 & 14) | 196656, 0, 65496);
            kVarP = kVarP;
            bVar2 = bVar;
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(s3Var)).I), kVarP, 0), null, null, f1.c.b(1677425844, new u3(bVar2), kVarP), kVarP, 196614, 24);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, bVar2, i10) { // from class: h9.y1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12898a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.b f12899b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    v3.f(this.f12898a, this.f12899b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final w1.d dVar, final String str, final boolean z10, final eh.l lVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1600418350);
        int i11 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | 384 | (kVarP.c(z10) ? 2048 : 1024) | (kVarP.l(lVar) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar = d.a.f1143b;
            float f10 = 16;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), j2.c3.f14686a, new g0.d(z10, true, new q2.i(2), lVar)), f10, 14);
            z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, kVarP, 54);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 40), h0.f.a(12));
            x0.s3 s3Var = t0.f2.f25858a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, ((t0.e2) kVarP.f(s3Var)).G, q1.y1.f21750a);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i13 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, l0VarD, kVarP);
            ph.v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar, 22), ((t0.e2) kVarP.f(s3Var)).f25751a, kVarP, (i11 & 14) | 432, 0);
            kVarP.T(true);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i14 = kVarP.P;
            x0.a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, qVarA, kVarP);
            ph.v1.j(dVar2, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVarP);
            ff.b(str, null, ((t0.e2) kVarP.f(s3Var)).f25771q, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26547j, kVarP, ((i11 >> 3) & 14) | 196608, 0, 65498);
            kVarP = kVarP;
            kVarP.L(170111429);
            kVarP.T(false);
            kVarP.T(true);
            androidx.compose.material3.a.a(z10, null, null, false, null, kVarP, ((i11 >> 9) & 14) | 48, CdexHeaderItem.DEBUG_INFO_BASE);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, lVar, i10) { // from class: h9.b2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f12534b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f12535c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f12536d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v3.g(this.f12533a, this.f12534b, this.f12535c, this.f12536d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final k9.a aVar, final w1.d dVar, final String str, final boolean z10, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        int i11;
        int i12;
        boolean z11;
        long j10;
        long j11;
        x0.k kVarP = jVar.p(346794474);
        int i13 = i10 | (kVarP.K(aVar) ? 4 : 2) | (kVarP.K(dVar) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | (kVarP.c(z10) ? 2048 : 1024) | (kVarP.l(aVar2) ? 16384 : 8192);
        if ((i13 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar3 = d.a.f1143b;
            float f10 = 12;
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), h0.f.a(f10));
            kVarP.L(-1055741380);
            long jC = z10 ? q1.b1.c(0.15f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a) : q1.b1.f21653g;
            kVarP.T(false);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD, jC, q1.y1.f21750a), false, null, null, aVar2, 7), 16, 14);
            b.g gVar = z.b.f34450g;
            f.b bVar = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(gVar, bVar, kVarP, 54);
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, m1VarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                i11 = i13;
            } else {
                i11 = i13;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                z.m1 m1VarA2 = z.k1.a(z.b.h(f10), bVar, kVarP, 54);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar3, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar4);
                }
                ph.v1.j(bVar2, m1VarA2, kVarP);
                ph.v1.j(dVar2, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                i(aVar, 24, kVarP, (i11 & 14) | 48);
                if (z10) {
                    z11 = false;
                    kVarP.L(-978159120);
                    j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
                } else {
                    kVarP.L(-978160377);
                    j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a;
                    z11 = false;
                }
                kVarP.T(z11);
                float f11 = 20;
                t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar3, f11), j10, kVarP, ((i11 >> 3) & 14) | 432, 0);
                if (z10) {
                    kVarP.L(-978151735);
                    j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q;
                } else {
                    kVarP.L(-978152985);
                    j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a;
                }
                kVarP.T(z11);
                ff.b(str, null, j11, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26547j, kVarP, (i11 >> 6) & 14, 0, 65498);
                kVarP = kVarP;
                kVarP.T(true);
                kVarP.L(-1048070558);
                if (z10) {
                    t4.b(p0.n1.a(), null, androidx.compose.foundation.layout.g.n(aVar3, f11), ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, kVarP, 432, 0);
                }
                kVarP.T(z11);
                kVarP.T(true);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            z.m1 m1VarA22 = z.k1.a(z.b.h(f10), bVar, kVarP, 54);
            i12 = kVarP.P;
            x0.a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(aVar3, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar2, m1VarA22, kVarP);
            ph.v1.j(dVar2, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                i(aVar, 24, kVarP, (i11 & 14) | 48);
                if (z10) {
                }
                kVarP.T(z11);
                float f112 = 20;
                t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar3, f112), j10, kVarP, ((i11 >> 3) & 14) | 432, 0);
                if (z10) {
                }
                kVarP.T(z11);
                ff.b(str, null, j11, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26547j, kVarP, (i11 >> 6) & 14, 0, 65498);
                kVarP = kVarP;
                kVarP.T(true);
                kVarP.L(-1048070558);
                if (z10) {
                }
                kVarP.T(z11);
                kVarP.T(true);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(dVar, str, z10, aVar2, i10) { // from class: h9.x1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w1.d f12877b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f12878c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f12879d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f12880e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v3.h(this.f12876a, this.f12877b, this.f12878c, this.f12879d, this.f12880e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(final k9.a aVar, final float f10, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(897254006);
        if ((((kVarP.K(aVar) ? 4 : 2) | i10) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2VarC = k9.j.c(k9.c.a(aVar, h6.a.b(kVarP)));
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar2, f10);
            h0.e eVar = h0.f.f12083a;
            androidx.compose.ui.d dVarD = e1.d.d(dVarN, eVar);
            long j10 = e2VarC.f25768n;
            y1.a aVar3 = q1.y1.f21750a;
            androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(dVarD, j10, aVar3), 1, ((t0.e2) kVarP.f(t0.f2.f25858a)).B, eVar);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
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
            z.g.a(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 0.45f * f10), eVar), e2VarC.f25751a, aVar3), kVarP, 0);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(f10, i10) { // from class: h9.t1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f12810b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    v3.i(this.f12809a, this.f12810b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
