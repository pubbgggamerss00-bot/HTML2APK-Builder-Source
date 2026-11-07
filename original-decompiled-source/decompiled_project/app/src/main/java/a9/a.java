package a9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import p0.o5;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import t0.v2;
import x0.s3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f105a = new f1.b(-770608068, false, C0003a.f110a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f106b = new f1.b(-1665103205, false, b.f111a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f107c = new f1.b(12142669, false, c.f112a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f108d = new f1.b(-163517694, false, d.f113a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f109e = new f1.b(991767921, false, e.f114a);

    /* renamed from: a9.a$a, reason: collision with other inner class name */
    public static final class C0003a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0003a f110a = new C0003a();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.credits_screen_title, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f111a = new b();

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

    public static final class c implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f112a = new c();

        @Override // eh.q
        public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
            z.f1 padding = f1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(padding, "padding");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(padding) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                p9.d.a(padding.c(), f1.c.b(-1799710566, new a9.b(padding), jVar2), jVar2, 48);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f113a = new d();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.credits_check_purchases, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f114a = new e();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 16;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b(f3.q.c(R.string.credits_cost_title, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26546i, jVar2, 196608, 0, 65498);
                x0.j jVar3 = jVar2;
                float f11 = 8;
                d.a aVar3 = aVar;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, f11), jVar3);
                jVar3.L(-973866048);
                int i10 = 0;
                for (Object obj : qg.p.j(new pg.n(Integer.valueOf(R.string.credits_cost_simple), "6–10"), new pg.n(Integer.valueOf(R.string.credits_cost_api), "8–12"), new pg.n(Integer.valueOf(R.string.credits_cost_game), "10–15"), new pg.n(Integer.valueOf(R.string.credits_cost_edit), "3–6"))) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    pg.n nVar = (pg.n) obj;
                    int iIntValue = ((Number) nVar.f21469a).intValue();
                    String str = (String) nVar.f21470b;
                    jVar3.L(-973864721);
                    if (i10 > 0) {
                        v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.4f, ((e2) jVar3.f(f2.f25858a)).B), jVar3, 0, 3);
                    }
                    jVar3.B();
                    androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                    z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14611j, jVar3, 0);
                    int iD2 = jVar3.D();
                    x0.a2 a2VarY2 = jVar3.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar4 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar4);
                    } else {
                        jVar3.z();
                    }
                    ph.v1.j(g.a.f13867f, m1VarA, jVar3);
                    ph.v1.j(g.a.f13866e, a2VarY2, jVar3);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar3, iD2, c0128a2);
                    }
                    ph.v1.j(g.a.f13865d, dVarC2, jVar3);
                    String strC = f3.q.c(iIntValue, jVar3);
                    s3 s3Var = of.f26647a;
                    t2.l0 l0Var = ((nf) jVar3.f(s3Var)).f26548k;
                    s3 s3Var2 = f2.f25858a;
                    long j10 = ((e2) jVar3.f(s3Var2)).f25771q;
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    x0.j jVar4 = jVar3;
                    ff.b(strC, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 0, 0, 65528);
                    ff.b(f3.q.d(R.string.credits_cost_range, new Object[]{str}, jVar4), null, ((e2) jVar4.f(s3Var2)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(s3Var)).f26548k, jVar4, 196608, 0, 65498);
                    jVar3 = jVar4;
                    jVar3.H();
                    i10 = i11;
                    f11 = f11;
                    aVar3 = aVar3;
                }
                d.a aVar5 = aVar3;
                jVar3.B();
                float f12 = 6;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f12), jVar3);
                z.m1 m1VarA2 = z.k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                int iD3 = jVar3.D();
                x0.a2 a2VarY3 = jVar3.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar5, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar6 = g.a.f13863b;
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar6);
                } else {
                    jVar3.z();
                }
                ph.v1.j(g.a.f13867f, m1VarA2, jVar3);
                ph.v1.j(g.a.f13866e, a2VarY3, jVar3);
                g.a.C0128a c0128a3 = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar3, iD3, c0128a3);
                }
                ph.v1.j(g.a.f13865d, dVarC3, jVar3);
                w1.d dVarA = o5.a();
                s3 s3Var3 = f2.f25858a;
                x0.j jVar5 = jVar3;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar5, f10), ((e2) jVar3.f(s3Var3)).f25751a, jVar5, 432, 0);
                ff.b(r.e2.b(aVar5, f12, jVar5, R.string.credits_cost_note, jVar5), null, ((e2) jVar5.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar5.f(of.f26647a)).f26549l, jVar5, 0, 0, 65530);
                jVar5.H();
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }
}
