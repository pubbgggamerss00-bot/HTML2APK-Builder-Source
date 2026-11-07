package a9;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import d8.k;
import g8.s;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import q8.n2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.md;
import t0.mf;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import t0.z9;
import x0.h2;
import x0.j;
import x0.s3;
import z.b;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f276a = c2.n0.c(4280490496L);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f279c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f280d;

        public a(boolean z10, eh.a<pg.f0> aVar, boolean z11, Long l10) {
            this.f277a = z10;
            this.f278b = aVar;
            this.f279c = z11;
            this.f280d = l10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            boolean z10;
            long j10;
            x0.j jVar2;
            x0.j jVar3;
            x0.j jVar4 = jVar;
            if ((num.intValue() & 3) == 2 && jVar4.s()) {
                jVar4.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 18);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar4, 48);
                int iD = jVar4.D();
                x0.a2 a2VarY = jVar4.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar4);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar2);
                } else {
                    jVar4.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar4);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar4);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar4, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar4);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 48);
                long j11 = k9.d.f16192n;
                float f10 = 14;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.2f, j11), h0.f.a(f10));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar4.D();
                x0.a2 a2VarY2 = jVar4.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar2);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar, l0VarD, jVar4);
                ph.v1.j(dVar, a2VarY2, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar4, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar4);
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 26), j11, jVar4, 432, 0);
                jVar4.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 16), jVar4);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar4, 0);
                int iD3 = jVar4.D();
                x0.a2 a2VarY3 = jVar4.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar2);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar, qVarA, jVar4);
                ph.v1.j(dVar, a2VarY3, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar4, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar4);
                String strC = f3.q.c(R.string.profile_credits, jVar4);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar4.f(s3Var)).f26551n;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar4.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 0, 0, 65530);
                boolean z11 = this.f277a;
                if (z11) {
                    z10 = z11;
                    Long l10 = this.f280d;
                    if (l10 == null) {
                        jVar4.L(190981338);
                        z9.a(2, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20), jVar4);
                        jVar2 = jVar4;
                        jVar2.B();
                    } else {
                        jVar4.L(1625576479);
                        String string = l10.toString();
                        t2.l0 l0Var2 = ((nf) jVar4.f(s3Var)).f26542e;
                        x2.p pVar = x2.p.f32033f;
                        if (l10.longValue() < 0) {
                            jVar4.L(190993032);
                            j10 = ((e2) jVar4.f(s3Var2)).f25777w;
                        } else {
                            jVar4.L(190994220);
                            j10 = ((e2) jVar4.f(s3Var2)).f25771q;
                        }
                        jVar4.B();
                        ff.b(string, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar4, 196608, 0, 65498);
                        jVar2 = jVar4;
                        jVar2.B();
                    }
                } else {
                    jVar4.L(1625180206);
                    z10 = z11;
                    ff.b(f3.q.c(R.string.credits_signed_out_balance, jVar4), null, ((e2) jVar4.f(s3Var2)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(s3Var)).f26548k, jVar4, 0, 0, 65530);
                    jVar4.B();
                    jVar2 = jVar4;
                }
                jVar2.H();
                jVar2.L(-2104613179);
                if (z10) {
                    jVar3 = jVar2;
                } else {
                    boolean z12 = this.f279c;
                    boolean z13 = !z12;
                    h0.e eVarA = h0.f.a(f10);
                    z.g1 g1Var = t0.m0.f26400a;
                    x0.j jVar5 = jVar2;
                    t0.l0 l0VarA = t0.m0.a(j11, p.f276a, 0L, jVar5, 12);
                    f1.b bVarB = f1.c.b(2011879749, new o(z12), jVar5);
                    jVar3 = jVar5;
                    t0.x0.a(this.f278b, null, z13, eVarA, l0VarA, null, null, null, bVarB, jVar3, 805306368, 482);
                }
                jVar3.B();
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.x f281a;

        public b(p5.x xVar) {
            this.f281a = xVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVar = a9.a.f105a;
                f1.b bVarB = f1.c.b(-272051266, new t(this.f281a), jVar2);
                float f10 = mf.f26477a;
                t0.g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f282a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f283b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f284c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f285d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f286e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f287f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f288g;

        public c(eh.a<pg.f0> aVar, boolean z10, String str, int i10, int i11, int i12, boolean z11) {
            this.f282a = aVar;
            this.f283b = z10;
            this.f284c = str;
            this.f285d = i10;
            this.f286e = i11;
            this.f287f = i12;
            this.f288g = z11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            s3 s3Var;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 16);
                b.j jVar3 = z.b.f34444a;
                f.b bVar = d.a.f14612k;
                z.m1 m1VarA = z.k1.a(jVar3, bVar, jVar2, 48);
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
                g.a.b bVar2 = g.a.f13867f;
                ph.v1.j(bVar2, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
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
                ph.v1.j(bVar2, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                z.m1 m1VarA2 = z.k1.a(jVar3, bVar, jVar2, 48);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar, jVar2);
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
                ph.v1.j(bVar2, m1VarA2, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                String strD = f3.q.d(R.string.credits_pack_amount, new Object[]{Integer.valueOf(this.f287f)}, jVar2);
                s3 s3Var2 = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26544g;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var3 = f2.f25858a;
                ff.b(strD, null, ((e2) jVar2.f(s3Var3)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                x0.j jVar4 = jVar2;
                jVar4.L(1850447459);
                if (this.f288g) {
                    float f10 = 6;
                    s3Var = s3Var2;
                    ff.b(r.e2.b(aVar, 8, jVar4, R.string.credits_pack_popular, jVar4), androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(aVar, k9.d.f16192n, h0.f.a(f10)), f10, 2), p.f276a, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(s3Var2)).f26552o, jVar4, 196992, 0, 65496);
                    jVar4 = jVar4;
                } else {
                    s3Var = s3Var2;
                }
                jVar4.B();
                jVar4.H();
                x0.j jVar5 = jVar4;
                ff.b(f3.q.d(R.string.credits_pack_estimate, new Object[]{Integer.valueOf(this.f285d), Integer.valueOf(this.f286e)}, jVar4), null, ((e2) jVar4.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(s3Var)).f26549l, jVar5, 0, 0, 65530);
                jVar5.H();
                boolean z10 = this.f283b;
                String str = this.f284c;
                boolean z11 = z10 && str != null;
                h0.e eVarA = h0.f.a(14);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f282a, null, z11, eVarA, t0.m0.a(k9.d.f16192n, p.f276a, 0L, jVar5, 12), null, null, null, f1.c.b(-1942944165, new u(str), jVar5), jVar5, 805306368, 482);
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final boolean z10, final Long l10, final boolean z11, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-2002709447);
        if (((i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.K(l10) ? 32 : 16) | (kVarP.c(z11) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024)) & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(20);
            long j10 = k9.d.f16192n;
            md.a(dVarD, eVarA, q1.b1.c(0.12f, j10), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, d2.a(1, q1.b1.c(0.5f, j10)), f1.c.b(-79676396, new a(z10, aVar, z11, l10), kVarP), kVarP, 12582918, 56);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, l10, z11, aVar, i10) { // from class: a9.m

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f259a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f260b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f261c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f262d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    p.a(this.f259a, this.f260b, this.f261c, this.f262d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(-1375741546);
        if (i10 == 0 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), q1.b1.c(0.85f, ((e2) kVarP.f(f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, a9.a.f109e, kVarP, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f1  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final z.g1 g1Var, v vVar, g8.u uVar, x0.j jVar, final int i10) {
        final g8.u uVar2;
        final v vVar2;
        boolean z10;
        d.a aVar;
        int i11;
        boolean z11;
        Object obj;
        d.a aVar2;
        f.a aVar3;
        g8.u uVar3;
        Context context;
        ?? r02;
        x0.k kVar;
        d.a aVar4;
        x0.k kVar2;
        final g8.u uVar4;
        Object obj2;
        k.a aVarA;
        g8.d dVar;
        x0.k kVar3;
        x0.k kVarP = jVar.p(-1205758650);
        if ((((kVarP.K(g1Var) ? 4 : 2) | i10 | 144) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            vVar2 = vVar;
            uVar4 = uVar;
            kVar3 = kVarP;
        } else {
            kVarP.r0();
            int i12 = 0;
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(v.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                v vVar3 = (v) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(g8.u.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                uVar2 = (g8.u) w0VarB2;
                vVar2 = vVar3;
            } else {
                kVarP.v();
                vVar2 = vVar;
                uVar2 = uVar;
            }
            kVarP.U();
            final Context context2 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            x0.n1 n1VarB = bg.b.b(vVar2.f334d, kVarP);
            x0.n1 n1VarB2 = bg.b.b(vVar2.f335e, kVarP);
            x0.n1 n1VarB3 = bg.b.b(vVar2.f336f, kVarP);
            x0.n1 n1VarB4 = bg.b.b(vVar2.f333c, kVarP);
            x0.n1 n1VarB5 = bg.b.b(uVar2.f11638g, kVarP);
            boolean z12 = ((g8.s) n1VarB.getValue()) instanceof s.a;
            boolean zBooleanValue = ((Boolean) n1VarB5.getValue()).booleanValue();
            kVarP.L(110227658);
            boolean zL = kVarP.l(context2) | kVarP.l(uVar2);
            Object objG = kVarP.g();
            Object obj3 = j.a.f31715a;
            if (zL || objG == obj3) {
                objG = new eh.l() { // from class: a9.f
                    @Override // eh.l
                    public final Object invoke(Object obj4) {
                        eh.a<pg.f0> onSignedIn = (eh.a) obj4;
                        kotlin.jvm.internal.r.e(onSignedIn, "onSignedIn");
                        Activity activityB = k9.j.b(context2);
                        if (activityB != null) {
                            uVar2.f(activityB, onSignedIn);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            eh.a aVarD = n2.d(zBooleanValue, (eh.l) objG, kVarP);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(110232780);
            boolean zL2 = kVarP.l(uVar2);
            Object objG2 = kVarP.g();
            if (zL2 || objG2 == obj3) {
                objG2 = new g(uVar2, i12);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            h5.g.a(f0Var, null, (eh.l) objG2, kVarP, 6);
            g8.u uVar5 = uVar2;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.g(ph.m0.e(androidx.compose.foundation.layout.g.f976c, ph.m0.c(kVarP), true), g1Var), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            b.k kVar4 = z.b.f34446c;
            f.a aVar5 = d.a.f14615n;
            z.q qVarA = z.o.a(kVar4, aVar5, kVarP, 48);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar6 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar6);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                z10 = z12;
            } else {
                z10 = z12;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                aVar = d.a.f1143b;
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f);
                z.q qVarA2 = z.o.a(z.b.h(14), d.a.f14614m, kVarP, 6);
                i11 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar6);
                }
                ph.v1.j(bVar, qVarA2, kVarP);
                ph.v1.j(dVar2, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 8), kVarP);
                g8.d dVar3 = (g8.d) n1VarB2.getValue();
                Long lValueOf = dVar3 == null ? Long.valueOf(dVar3.f11561a) : null;
                z11 = z10;
                a(z11, lValueOf, ((Boolean) n1VarB5.getValue()).booleanValue(), aVarD, kVarP, 0);
                kVarP.L(-2145936473);
                if (z11 || (dVar = (g8.d) n1VarB2.getValue()) == null || !dVar.f11564d) {
                    obj = obj3;
                    aVar2 = aVar;
                    aVar3 = aVar5;
                    uVar3 = uVar5;
                    context = context2;
                    r02 = 0;
                    kVar = kVarP;
                } else {
                    uVar3 = uVar5;
                    obj = obj3;
                    aVar3 = aVar5;
                    context = context2;
                    aVar2 = aVar;
                    r02 = 0;
                    ff.b(k3.b.a(f3.q.c(R.string.ai_create_free_first, kVarP), " · ", f3.q.c(R.string.ai_create_free_first_note, kVarP)), androidx.compose.foundation.layout.g.d(aVar, 1.0f), k9.d.f16192n, 0L, x2.p.f32033f, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26546i, kVarP, 196656, 0, 64984);
                    kVar = kVarP;
                }
                kVar.T(r02);
                kVar.L(-2145919075);
                int i14 = r02;
                for (Object obj4 : qg.x.U(new r(), ((g8.x) n1VarB3.getValue()).f11649c.entrySet())) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) obj4;
                    String str = (String) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    d8.k kVar5 = (d8.k) ((Map) n1VarB4.getValue()).get(str);
                    String str2 = (kVar5 == null || (aVarA = kVar5.a()) == null) ? null : aVarA.f7511a;
                    int i16 = ((g8.x) n1VarB3.getValue()).f11647a;
                    if (i16 < 1) {
                        i16 = 1;
                    }
                    int i17 = iIntValue / i16;
                    int i18 = ((g8.x) n1VarB3.getValue()).f11648b;
                    if (i18 < 1) {
                        i18 = 1;
                    }
                    int i19 = iIntValue / i18;
                    boolean z13 = i14 == 1 ? true : r02;
                    kVar.L(233066082);
                    Context context3 = context;
                    boolean zL3 = kVar.l(context3) | kVar.l(vVar2) | kVar.K(str);
                    Object objG3 = kVar.g();
                    if (zL3) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if (objG3 == obj2) {
                        }
                        kVar.T(r02);
                        e(iIntValue, str2, i17, i19, z13, z11, (eh.a) objG3, kVar, 0);
                        i14 = i15;
                        context = context3;
                        obj = obj2;
                    }
                    objG3 = new h(context3, vVar2, str, r02);
                    kVar.C(objG3);
                    kVar.T(r02);
                    e(iIntValue, str2, i17, i19, z13, z11, (eh.a) objG3, kVar, 0);
                    i14 = i15;
                    context = context3;
                    obj = obj2;
                }
                Object obj5 = obj;
                kVar.T(r02);
                kVar.L(-2145900609);
                if (z11) {
                    d.a aVar7 = aVar2;
                    x0.j jVar2 = kVar;
                    aVar4 = aVar7;
                    ff.b(f3.q.c(R.string.credits_sign_in_to_buy, kVar), androidx.compose.foundation.layout.g.d(aVar7, 1.0f), ((e2) kVar.f(f2.f25858a)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVar.f(of.f26647a)).f26549l, jVar2, 48, 0, 65016);
                    kVar2 = jVar2;
                } else {
                    aVar4 = aVar2;
                    kVar2 = kVar;
                }
                kVar2.T(r02);
                b(r02, kVar2);
                f((g8.x) n1VarB3.getValue(), kVar2, 8);
                kVar2.L(-2145886283);
                if (z11) {
                    kVar2.L(-2145884807);
                    boolean zL4 = kVar2.l(vVar2);
                    Object objG4 = kVar2.g();
                    if (zL4 || objG4 == obj5) {
                        objG4 = new i(vVar2, r02);
                        kVar2.C(objG4);
                    }
                    kVar2.T(r02);
                    t0.x0.d((eh.a) objG4, new HorizontalAlignElement(aVar3), false, null, null, null, a9.a.f108d, kVar2, 805306368, 508);
                }
                kVar2.T(r02);
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar4), 24), kVar2);
                kVar2.T(true);
                kVar2.T(true);
                uVar4 = uVar3;
                kVar3 = kVar2;
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f);
            z.q qVarA22 = z.o.a(z.b.h(14), d.a.f14614m, kVarP, 6);
            i11 = kVarP.P;
            x0.a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarD2, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar, qVarA22, kVarP);
            ph.v1.j(dVar2, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 8), kVarP);
                g8.d dVar32 = (g8.d) n1VarB2.getValue();
                if (dVar32 == null) {
                }
                z11 = z10;
                a(z11, lValueOf, ((Boolean) n1VarB5.getValue()).booleanValue(), aVarD, kVarP, 0);
                kVarP.L(-2145936473);
                if (z11) {
                    obj = obj3;
                    aVar2 = aVar;
                    aVar3 = aVar5;
                    uVar3 = uVar5;
                    context = context2;
                    r02 = 0;
                    kVar = kVarP;
                    kVar.T(r02);
                    kVar.L(-2145919075);
                    int i142 = r02;
                    while (r12.hasNext()) {
                    }
                    Object obj52 = obj;
                    kVar.T(r02);
                    kVar.L(-2145900609);
                    if (z11) {
                    }
                    kVar2.T(r02);
                    b(r02, kVar2);
                    f((g8.x) n1VarB3.getValue(), kVar2, 8);
                    kVar2.L(-2145886283);
                    if (z11) {
                    }
                    kVar2.T(r02);
                    p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar4), 24), kVar2);
                    kVar2.T(true);
                    kVar2.T(true);
                    uVar4 = uVar3;
                    kVar3 = kVar2;
                }
            }
        }
        h2 h2VarV = kVar3.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(vVar2, uVar4, i10) { // from class: a9.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f243b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g8.u f244c;

                @Override // eh.p
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iN = f3.i.n(1);
                    p.c(this.f242a, this.f243b, this.f244c, (x0.j) obj6, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final p5.x navController, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1908193604);
        if ((((kVarP.l(navController) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            ra.a(null, f1.c.b(-673006216, new b(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), a9.a.f107c, kVarP, 806879280, 189);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: a9.e
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    p.d(this.f188a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final int i10, final String str, final int i11, final int i12, final boolean z10, final boolean z11, final eh.a<pg.f0> aVar, x0.j jVar, final int i13) {
        x0.k kVarP = jVar.p(-971016766);
        if (((i13 | (kVarP.i(i10) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | (kVarP.i(i11) ? 256 : 128) | (kVarP.i(i12) ? 2048 : 1024) | (kVarP.c(z10) ? 16384 : 8192) | (kVarP.c(z11) ? 131072 : 65536) | (kVarP.l(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted)) & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), q1.b1.c(0.85f, ((e2) kVarP.f(f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, z10 ? d2.a((float) 1.5d, k9.d.f16192n) : null, f1.c.b(1867147015, new c(aVar, z11, str, i11, i12, i10, z10), kVarP), kVarP, 12582918, 56);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, str, i11, i12, z10, z11, aVar, i13) { // from class: a9.l

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f249a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f250b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f251c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f252d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f253e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f254f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f255g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    p.e(this.f249a, this.f250b, this.f251c, this.f252d, this.f253e, this.f254f, this.f255g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final g8.x xVar, x0.j jVar, final int i10) {
        String strD;
        x0.k kVar;
        x0.k kVarP = jVar.p(941266018);
        if ((((kVarP.l(xVar) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Long l10 = xVar.f11652f;
            int i11 = xVar.f11651e;
            int i12 = xVar.f11650d;
            String str = l10 != null ? DateFormat.getDateInstance(2).format(new Date(l10.longValue())) : null;
            if (str != null) {
                kVarP.L(-1694068234);
                strD = f3.q.d(R.string.credits_pro_bonus_since, new Object[]{Integer.valueOf(i12), Integer.valueOf(i11), str}, kVarP);
                kVarP.T(false);
            } else {
                kVarP.L(-1694064343);
                strD = f3.q.d(R.string.credits_pro_bonus, new Object[]{Integer.valueOf(i12), Integer.valueOf(i11)}, kVarP);
                kVarP.T(false);
            }
            kVar = kVarP;
            ff.b(strD, androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 8, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((e2) kVarP.f(f2.f25858a)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26549l, kVar, 48, 0, 65016);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: a9.n
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(9);
                    p.f(this.f266a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
