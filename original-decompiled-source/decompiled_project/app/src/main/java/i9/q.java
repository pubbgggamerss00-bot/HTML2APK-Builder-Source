package i9;

import a9.d2;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.w0;
import c2.n0;
import c9.u1;
import g2.l0;
import i2.e0;
import i2.g;
import i8.a;
import j1.d;
import j1.f;
import j5.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.v1;
import q1.b1;
import q1.y1;
import t0.d1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.m0;
import t0.nf;
import t0.of;
import t0.ra;
import t0.x0;
import t0.z0;
import x0.a2;
import x0.h2;
import x0.j;
import x0.n1;
import x0.o0;
import x0.s3;
import z.b;
import z.g1;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class q {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f14376a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f14377b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14378c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14379d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f14380e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f14381f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f14382g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f14383h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14384j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f14385k;

        public a(eh.a<pg.f0> aVar, long j10, long j11, boolean z10, boolean z11, String str, String str2, String str3, String str4, boolean z12) {
            this.f14376a = aVar;
            this.f14377b = j10;
            this.f14378c = j11;
            this.f14379d = z10;
            this.f14380e = z11;
            this.f14381f = str;
            this.f14382g = str2;
            this.f14383h = str3;
            this.f14384j = str4;
            this.f14385k = z12;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            long jC;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 18);
                b.k kVar = z.b.f34446c;
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                float f10 = 14;
                androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 46), h0.f.a(f10));
                if (this.f14379d) {
                    jVar2.L(1505453635);
                    jVar2.B();
                    jC = b1.c(0.18f, n0.c(4294956800L));
                } else if (this.f14380e) {
                    jVar2.L(1505457154);
                    jC = b1.c(0.5f, ((e2) jVar2.f(f2.f25858a)).f25755c);
                    jVar2.B();
                } else {
                    jVar2.L(1505460354);
                    jC = b1.c(0.6f, ((e2) jVar2.f(f2.f25858a)).f25772r);
                    jVar2.B();
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD2, jC, y1.f21750a);
                l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, l0VarD, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar2);
                ff.b(this.f14381f, null, 0L, f3.u.c(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131062);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, qVarA2, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(this.f14382g, null, ((e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar2);
                ff.b(this.f14383h, null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.H();
                float f11 = 16;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                h0.e eVarA = h0.f.a(f10);
                long j10 = this.f14377b;
                long j11 = this.f14378c;
                t0.l0 l0VarA = m0.a(j10, j11, 0L, jVar2, 12);
                float f12 = 12;
                x0.a(this.f14376a, dVarD3, false, eVarA, l0VarA, null, null, new g1(f11, f12, f11, f12), f1.c.b(2075507680, new p(j11, this.f14384j, this.f14385k), jVar2), jVar2, 805306416, 356);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final p5.x navController, r rVar, x0.j jVar, final int i10) {
        r rVar2;
        final r rVar3;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-684545534);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            rVar3 = rVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                w0 w0VarB = k5.c.b(r.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                rVar2 = (r) w0VarB;
            } else {
                kVarP.v();
                rVar2 = rVar;
            }
            kVarP.U();
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            n1 n1VarB = bg.b.b(rVar2.f14387c, kVarP);
            n1 n1VarB2 = bg.b.b(rVar2.f14388d, kVarP);
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            boolean z10 = ((i8.a) n1VarB.getValue()) instanceof a.b;
            kVarP.L(-333035977);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            n1 n1Var = (n1) objG;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-333033958);
            boolean zL = kVarP.l(rVar2);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new i(rVar2, n1Var, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            o0.d((eh.p) objG2, f0Var, kVarP);
            r rVar4 = rVar2;
            ra.a(null, f1.c.b(2120406470, new k(navController), kVarP), null, null, null, 0, b1.f21653g, 0L, new z.z(), f1.c.b(189642705, new o(zA, z10, context, rVar2, n1Var, n1VarB2, n1VarB), kVarP), kVarP, 806879280, 189);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(-332749676);
                Object objG3 = kVarP.g();
                if (objG3 == c0321a) {
                    objG3 = new f(n1Var, 0);
                    kVarP.C(objG3);
                }
                kVarP.T(false);
                z.c(6, (eh.a) objG3, kVarP);
            }
            rVar3 = rVar4;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(rVar3, i10) { // from class: i9.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f14336b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    q.a(this.f14335a, this.f14336b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final String str2, final String str3, final String str4, final boolean z10, final boolean z11, boolean z12, final boolean z13, final eh.a<pg.f0> aVar, x0.j jVar, final int i10, final int i11) {
        boolean z14;
        boolean z15;
        long jC;
        long jC2;
        long j10;
        final boolean z16;
        h2 h2VarV;
        x0.k kVarP = jVar.p(-350009288);
        int i12 = i10 | (kVarP.K(str2) ? 32 : 16) | (kVarP.K(str3) ? 256 : 128) | (kVarP.K(str4) ? 2048 : 1024) | (kVarP.c(z10) ? 16384 : 8192);
        int i13 = i11 & 64;
        if (i13 == 0) {
            if ((i10 & 1572864) == 0) {
                z14 = z12;
                i12 |= kVarP.c(z14) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if (((i12 | (!kVarP.c(z13) ? 8388608 : 4194304) | (!kVarP.l(aVar) ? 67108864 : 33554432)) & 38347923) == 38347922 || !kVarP.s()) {
                z15 = i13 == 0 ? false : z14;
                if (!z15) {
                    kVarP.L(-158810137);
                    kVarP.T(false);
                    jC = z13 ? n0.c(4294956800L) : n0.c(4292441862L);
                } else if (z11) {
                    kVarP.L(-158806918);
                    jC = ((e2) kVarP.f(f2.f25858a)).f25751a;
                    kVarP.T(false);
                } else {
                    kVarP.L(-158804827);
                    jC = b1.c(0.5f, ((e2) kVarP.f(f2.f25858a)).B);
                    kVarP.T(false);
                }
                if (!z15) {
                    kVarP.L(-158802428);
                    kVarP.T(false);
                    jC2 = n0.c(4294956800L);
                } else if (z11) {
                    kVarP.L(-158800294);
                    jC2 = ((e2) kVarP.f(f2.f25858a)).f25751a;
                    kVarP.T(false);
                } else {
                    kVarP.L(-158798683);
                    jC2 = ((e2) kVarP.f(f2.f25858a)).f25762h;
                    kVarP.T(false);
                }
                long j11 = jC2;
                if (!z15) {
                    kVarP.L(-158795976);
                    kVarP.T(false);
                    j10 = b1.f21648b;
                } else if (z11) {
                    kVarP.L(-158794212);
                    j10 = ((e2) kVarP.f(f2.f25858a)).f25753b;
                    kVarP.T(false);
                } else {
                    kVarP.L(-158792537);
                    j10 = ((e2) kVarP.f(f2.f25858a)).f25763i;
                    kVarP.T(false);
                }
                d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(22), z0.a(b1.c(0.92f, ((e2) kVarP.f(f2.f25858a)).f25770p), kVarP, 0), null, d2.a((!z11 || z15) ? 2 : 1, jC), f1.c.b(1964545798, new a(aVar, j11, j10, z15, z11, str, str2, str3, str4, z10), kVarP), kVarP, 196614, 8);
                z16 = z15;
            } else {
                kVarP.v();
                z16 = z14;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: i9.h
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.b(str, str2, str3, str4, z10, z11, z16, z13, aVar, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i12 |= 1572864;
        z14 = z12;
        if (((i12 | (!kVarP.c(z13) ? 8388608 : 4194304) | (!kVarP.l(aVar) ? 67108864 : 33554432)) & 38347923) == 38347922) {
            if (i13 == 0) {
            }
            if (!z15) {
            }
            if (!z15) {
            }
            long j112 = jC2;
            if (!z15) {
            }
            if (z11) {
                d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(22), z0.a(b1.c(0.92f, ((e2) kVarP.f(f2.f25858a)).f25770p), kVarP, 0), null, d2.a((!z11 || z15) ? 2 : 1, jC), f1.c.b(1964545798, new a(aVar, j112, j10, z15, z11, str, str2, str3, str4, z10), kVarP), kVarP, 196614, 8);
                z16 = z15;
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }
}
