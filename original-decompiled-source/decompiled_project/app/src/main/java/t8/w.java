package t8;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.aa;
import g8.s;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.p7;
import t0.ra;
import t0.t4;
import t0.z9;
import x0.j;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final long f28522a = c2.n0.c(4280490496L);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28523b = 0;

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f28524a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28525b;

        public a(eh.a aVar, boolean z10) {
            this.f28524a = z10;
            this.f28525b = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r ModalBottomSheet = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                float f10 = 24;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, 7);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 56);
                long j10 = k9.d.f16192n;
                float f11 = 16;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.15f, j10), h0.f.a(f11));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 28), j10, jVar2, 432, 0);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                String strC = f3.q.c(R.string.ai_sign_in_title, jVar2);
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26544g;
                x2.p pVar = x2.p.f32033f;
                x0.s3 s3Var2 = t0.f2.f25858a;
                ff.b(strC, null, ((t0.e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                ff.b(pd.d.a(aVar, 8, jVar2, R.string.ai_sign_in_message, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 0, 65018);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
                boolean z10 = this.f28524a;
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 52);
                h0.e eVarA = h0.f.a(f11);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f28525b, dVarF, !z10, eVarA, t0.m0.a(j10, w.f28522a, 0L, jVar2, 12), null, null, null, f1.c.b(1448918887, new v(z10), jVar2), jVar2, 805306416, 480);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f28526a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28527b;

        public b(Long l10, eh.a<pg.f0> aVar) {
            this.f28526a = l10;
            this.f28527b = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            long j10;
            d.a aVar;
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                float f10 = 12;
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar2, 16, f10);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                int iD = jVar3.D();
                x0.a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                ph.v1.j(g.a.f13867f, m1VarA, jVar3);
                ph.v1.j(g.a.f13866e, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar3);
                w1.d dVarA = p0.y.a();
                long j11 = k9.d.f16192n;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar2, 22), j11, jVar3, 432, 0);
                String strB = r.e2.b(aVar2, f10, jVar3, R.string.profile_credits, jVar3);
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar3.f(s3Var)).f26548k;
                x0.s3 s3Var2 = t0.f2.f25858a;
                long j12 = ((t0.e2) jVar3.f(s3Var2)).f25773s;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                ff.b(strB, new LayoutWeightElement(1.0f, true), j12, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 0, 0, 65528);
                Long l10 = this.f28526a;
                if (l10 == null) {
                    jVar3.L(-1054468548);
                    z9.a(2, 0, 390, 24, j11, 0L, androidx.compose.foundation.layout.g.n(aVar2, 18), jVar3);
                    jVar2 = jVar3;
                    jVar2.B();
                    aVar = aVar2;
                } else {
                    jVar3.L(-1054362342);
                    String string = l10.toString();
                    t2.l0 l0Var2 = ((nf) jVar3.f(s3Var)).f26545h;
                    x2.p pVar = x2.p.f32033f;
                    if (l10.longValue() < 0) {
                        jVar3.L(520184312);
                        j10 = ((t0.e2) jVar3.f(s3Var2)).f25777w;
                    } else {
                        jVar3.L(520185500);
                        j10 = ((t0.e2) jVar3.f(s3Var2)).f25771q;
                    }
                    jVar3.B();
                    aVar = aVar2;
                    ff.b(string, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar3, 196608, 0, 65498);
                    jVar2 = jVar3;
                    jVar2.B();
                }
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 8), jVar2);
                x0.j jVar4 = jVar2;
                t0.x0.d(this.f28527b, null, false, null, t0.m0.f(0L, j11, jVar2, 13), null, a4.f28095h, jVar4, 805306368, 494);
                jVar4.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28528a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f28529b;

        public c(eh.a<pg.f0> aVar, boolean z10) {
            this.f28528a = aVar;
            this.f28529b = z10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 16);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, m1VarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                String strC = f3.q.c(R.string.ai_create_sign_in_needed, jVar2);
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26548k;
                long j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                ff.b(strC, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65528);
                float f10 = 12;
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                boolean z10 = !this.f28529b;
                h0.e eVarA = h0.f.a(f10);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f28528a, null, z10, eVarA, t0.m0.a(k9.d.f16192n, w.f28522a, 0L, jVar2, 12), null, null, null, a4.f28096i, jVar2, 805306368, 482);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final p5.x navController, g8.u uVar, final eh.p pVar, x0.j jVar, final int i10) throws Resources.NotFoundException {
        g8.u uVar2;
        x0.n1 n1Var;
        boolean z10;
        boolean z11;
        boolean zL;
        Object objG;
        x0.n1 n1Var2;
        int i11;
        final g8.u uVar3;
        g8.d dVar;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1187145427);
        if (((i10 | (kVarP.l(navController) ? 4 : 2) | 16 | (kVarP.l(pVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            uVar3 = uVar;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(g8.u.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                uVar2 = (g8.u) w0VarB;
            } else {
                kVarP.v();
                uVar2 = uVar;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            x0.n1 n1VarB = bg.b.b(uVar2.f11634c, kVarP);
            x0.n1 n1VarB2 = bg.b.b(uVar2.f11635d, kVarP);
            x0.n1 n1VarB3 = bg.b.b(uVar2.f11636e, kVarP);
            x0.n1 n1VarB4 = bg.b.b(uVar2.f11638g, kVarP);
            x0.n1 n1VarB5 = bg.b.b(uVar2.f11640i, kVarP);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(1839359749);
            boolean zL2 = kVarP.l(uVar2);
            Object objG2 = kVarP.g();
            Object obj = j.a.f31715a;
            if (zL2 || objG2 == obj) {
                objG2 = new g(uVar2, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            Integer num = (Integer) n1VarB5.getValue();
            kVarP.L(1839362018);
            boolean zK = kVarP.K(n1VarB5) | kVarP.l(context) | kVarP.l(uVar2);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj) {
                objG3 = new h(n1VarB5, context, uVar2, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, num, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(1839368989);
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                objG4 = new m9.g1(1);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG4, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(1839370976);
            Object objG5 = kVarP.g();
            if (objG5 == obj) {
                objG5 = new t8.b(0);
                kVarP.C(objG5);
            }
            kVarP.T(false);
            final x0.n1 n1Var4 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG5, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(1839373120);
            Object objG6 = kVarP.g();
            if (objG6 == obj) {
                objG6 = new t8.c(0);
                kVarP.C(objG6);
            }
            kVarP.T(false);
            x0.n1 n1Var5 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG6, kVarP, 3072, 6);
            String[] stringArray = f3.o.c(kVarP).getStringArray(R.array.ai_ideas);
            boolean z12 = ((g8.s) n1VarB.getValue()) instanceof s.a;
            g8.d dVar2 = (g8.d) n1VarB2.getValue();
            Long lValueOf = dVar2 != null ? Long.valueOf(dVar2.f11561a) : null;
            if (z12 && (dVar = (g8.d) n1VarB2.getValue()) != null) {
                boolean z13 = dVar.f11564d;
                if (z12 || z13 || lValueOf == null) {
                    n1Var = n1Var5;
                } else {
                    n1Var = n1Var5;
                    if (lValueOf.longValue() < ((g8.x) n1VarB3.getValue()).f11647a) {
                        z10 = z13;
                        z11 = true;
                    }
                    kVarP.L(1839387550);
                    zL = kVarP.l(navController);
                    objG = kVarP.g();
                    if (zL || objG == obj) {
                        objG = new h9.g3(navController, 1);
                        kVarP.C(objG);
                    }
                    kVarP.T(false);
                    g8.u uVar4 = uVar2;
                    n1Var2 = n1Var;
                    ra.a(null, f1.c.b(-708948239, new k(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1602722692, new q(lValueOf, (eh.a) objG, n1Var4, z11, z12, z10, n1Var2, pVar, n1Var3, n1VarB, n1VarB4, stringArray, n1VarB3), kVarP), kVarP, 806879280, 189);
                    kVarP = kVarP;
                    kVarP.L(1839601790);
                    if (((Boolean) n1Var2.getValue()).booleanValue()) {
                        i11 = 1;
                    } else {
                        boolean z14 = ((String) n1Var3.getValue()).length() >= 200;
                        kVarP.L(1839608159);
                        boolean zK2 = kVarP.K(n1Var2);
                        Object objG7 = kVarP.g();
                        if (zK2 || objG7 == obj) {
                            i11 = 1;
                            objG7 = new aa(n1Var2, 1);
                            kVarP.C(objG7);
                        } else {
                            i11 = 1;
                        }
                        kVarP.T(false);
                        t0.r.a((eh.a) objG7, f1.c.b(287991936, new s(pVar, n1Var2, n1Var3), kVarP), null, f1.c.b(1268946750, new t(n1Var2), kVarP), null, a4.f28094g, f1.c.b(592895323, new u(z14), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1772592, 0, 16276);
                    }
                    kVarP.T(false);
                    if (((Boolean) n1Var4.getValue()).booleanValue()) {
                        uVar3 = uVar4;
                    } else {
                        boolean zBooleanValue = ((Boolean) n1VarB4.getValue()).booleanValue();
                        kVarP.L(1839635517);
                        boolean zK3 = kVarP.K(n1Var4);
                        Object objG8 = kVarP.g();
                        if (zK3 || objG8 == obj) {
                            objG8 = new h9.k3(n1Var4, i11);
                            kVarP.C(objG8);
                        }
                        eh.a aVar = (eh.a) objG8;
                        kVarP.T(false);
                        boolean zBooleanValue2 = ((Boolean) n1VarB4.getValue()).booleanValue();
                        kVarP.L(1839639467);
                        uVar3 = uVar4;
                        boolean zL3 = kVarP.l(context) | kVarP.l(uVar3) | kVarP.K(n1Var4);
                        Object objG9 = kVarP.g();
                        if (zL3 || objG9 == obj) {
                            objG9 = new eh.l() { // from class: t8.d
                                @Override // eh.l
                                public final Object invoke(Object obj2) {
                                    eh.a onSignedIn = (eh.a) obj2;
                                    kotlin.jvm.internal.r.e(onSignedIn, "onSignedIn");
                                    Activity activityB = k9.j.b(context);
                                    if (activityB != null) {
                                        uVar3.f(activityB, new f9.f1(onSignedIn, n1Var4, 1));
                                    }
                                    return pg.f0.f21461a;
                                }
                            };
                            kVarP.C(objG9);
                        }
                        kVarP.T(false);
                        b(zBooleanValue, aVar, q8.n2.d(zBooleanValue2, (eh.l) objG9, kVarP), kVarP, 0);
                    }
                }
                z10 = z13;
                z11 = false;
                kVarP.L(1839387550);
                zL = kVarP.l(navController);
                objG = kVarP.g();
                if (zL) {
                    objG = new h9.g3(navController, 1);
                    kVarP.C(objG);
                    kVarP.T(false);
                    g8.u uVar42 = uVar2;
                    n1Var2 = n1Var;
                    ra.a(null, f1.c.b(-708948239, new k(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1602722692, new q(lValueOf, (eh.a) objG, n1Var4, z11, z12, z10, n1Var2, pVar, n1Var3, n1VarB, n1VarB4, stringArray, n1VarB3), kVarP), kVarP, 806879280, 189);
                    kVarP = kVarP;
                    kVarP.L(1839601790);
                    if (((Boolean) n1Var2.getValue()).booleanValue()) {
                    }
                    kVarP.T(false);
                    if (((Boolean) n1Var4.getValue()).booleanValue()) {
                    }
                }
            }
            if (z12) {
                n1Var = n1Var5;
                z10 = z13;
                z11 = false;
                kVarP.L(1839387550);
                zL = kVarP.l(navController);
                objG = kVarP.g();
                if (zL) {
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(uVar3, pVar, i10) { // from class: t8.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g8.u f28203b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.p f28204c;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) throws Resources.NotFoundException {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    w.a(this.f28202a, this.f28203b, this.f28204c, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(1754970672);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            p7.a(aVar, null, p7.f(6, 2, kVarP), CropImageView.DEFAULT_ASPECT_RATIO, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(1995225997, new a(aVar2, z10), kVarP), kVar, (i11 >> 3) & 14, 4058);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar, aVar2, i10) { // from class: t8.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f28212a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28213b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f28214c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    w.b(this.f28212a, this.f28213b, this.f28214c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final Long l10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1762410333);
        if ((((kVarP.K(l10) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            long j10 = k9.d.f16192n;
            md.a(dVarD, eVarA, q1.b1.c(0.1f, j10), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.45f, j10)), f1.c.b(-749926936, new b(l10, aVar), kVarP), kVarP, 12582918, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(l10, aVar, i10) { // from class: t8.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Long f28078a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28079b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    w.c(this.f28078a, this.f28079b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(boolean z10, eh.a<pg.f0> aVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(738863165);
        if ((((kVarP.c(z10) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            long j10 = k9.d.f16192n;
            md.a(dVarD, eVarA, q1.b1.c(0.1f, j10), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.45f, j10)), f1.c.b(-1222168510, new c(aVar, z10), kVarP), kVarP, 12582918, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f9.t0(z10, aVar, i10);
        }
    }
}
