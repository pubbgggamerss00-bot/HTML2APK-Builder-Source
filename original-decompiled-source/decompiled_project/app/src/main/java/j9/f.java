package j9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import t0.v2;
import x0.s3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f15360a = new f1.b(-1033388387, false, a.f15376a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f15361b = new f1.b(-765843490, false, i.f15384a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f15362c = new f1.b(-1680342931, false, j.f15385a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f15363d = new f1.b(217092237, false, k.f15386a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f15364e = new f1.b(-1205952351, false, l.f15387a);

    /* renamed from: f, reason: collision with root package name */
    public static final f1.b f15365f = new f1.b(568141628, false, m.f15388a);

    /* renamed from: g, reason: collision with root package name */
    public static final f1.b f15366g = new f1.b(336357672, false, n.f15389a);

    /* renamed from: h, reason: collision with root package name */
    public static final f1.b f15367h = new f1.b(-1451282912, false, o.f15390a);

    /* renamed from: i, reason: collision with root package name */
    public static final f1.b f15368i = new f1.b(1552383713, false, p.f15391a);

    /* renamed from: j, reason: collision with root package name */
    public static final f1.b f15369j = new f1.b(-172458525, false, b.f15377a);

    /* renamed from: k, reason: collision with root package name */
    public static final f1.b f15370k = new f1.b(-1735120920, false, c.f15378a);

    /* renamed from: l, reason: collision with root package name */
    public static final f1.b f15371l = new f1.b(-450058391, false, d.f15379a);

    /* renamed from: m, reason: collision with root package name */
    public static final f1.b f15372m = new f1.b(-1164481559, false, e.f15380a);

    /* renamed from: n, reason: collision with root package name */
    public static final f1.b f15373n = new f1.b(639495984, false, C0150f.f15381a);

    /* renamed from: o, reason: collision with root package name */
    public static final f1.b f15374o = new f1.b(-135458215, false, g.f15382a);

    /* renamed from: p, reason: collision with root package name */
    public static final f1.b f15375p = new f1.b(-1365994895, false, h.f15383a);

    public static final class a implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15376a = new a();

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 20;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, f10, 8);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                s3 s3Var = f2.f25858a;
                v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.15f, ((e2) jVar2.f(s3Var)).f25771q), jVar2, 0, 3);
                String strA = pd.d.a(aVar, f10, jVar2, R.string.catalog_native, jVar2);
                s3 s3Var2 = of.f26647a;
                ff.b(strA, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26544g, jVar2, 196608, 0, 65502);
                ff.b(f3.q.c(R.string.catalog_native_subtitle, jVar2), null, ((e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15377a = new b();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.common_cancel, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15378a = new c();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_premium_prompt_title, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15379a = new d();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_premium_prompt_body, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f15380a = new e();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.common_ok, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    /* renamed from: j9.f$f, reason: collision with other inner class name */
    public static final class C0150f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0150f f15381a = new C0150f();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_guide_title, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f15382a = new g();

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_guide_code, jVar2), androidx.compose.foundation.layout.f.h(d.a.f1143b, 12), ((e2) jVar2.f(f2.f25858a)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 48, 0, 65528);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f15383a = new h();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.g.d(aVar, 1.0f), ph.m0.c(jVar2), true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, jVar2);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                String strC = f3.q.c(R.string.template_guide_body, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26548k;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
                float f10 = 12;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
                t0.d1.a(null, h0.f.a(f10), t0.z0.a(((e2) jVar2.f(s3Var2)).f25770p, jVar2, 0), null, null, f.f15374o, jVar2, 196608, 25);
                ff.b(pd.d.a(aVar, f10, jVar2, R.string.template_guide_note, jVar2), null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f15384a = new i();

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                p1.d.b(d0.h.f(d.a.f1143b), jVar2);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f15385a = new j();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), f3.q.c(R.string.common_back, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f15386a = new k();

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(d.a.f1143b), 16), jVar2);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f15387a = new l();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), f3.q.c(R.string.common_back, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f15388a = new m();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.catalog_preview, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f15389a = new n();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.catalog_technical, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f15390a = new o();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_detail_copy, jVar2), null, 0L, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f15391a = new p();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.template_premium_prompt_upgrade, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }
}
