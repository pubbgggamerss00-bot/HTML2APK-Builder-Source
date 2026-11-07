package t8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import p0.dc;
import p0.e4;
import p0.ya;
import t0.ff;
import t0.t4;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f28149a = new f1.b(-1491205014, false, a.f28169a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f28150b = new f1.b(1880594856, false, l.f28180a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f28151c = new f1.b(-1720651197, false, n.f28182a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f28152d = new f1.b(-34751262, false, o.f28183a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f28153e = new f1.b(1268732981, false, p.f28184a);

    /* renamed from: f, reason: collision with root package name */
    public static final f1.b f28154f = new f1.b(462916458, false, q.f28185a);

    /* renamed from: g, reason: collision with root package name */
    public static final f1.b f28155g = new f1.b(332837780, false, r.f28186a);

    /* renamed from: h, reason: collision with root package name */
    public static final f1.b f28156h = new f1.b(-1981473115, false, s.f28187a);

    /* renamed from: i, reason: collision with root package name */
    public static final f1.b f28157i = new f1.b(-823578719, false, t.f28188a);

    /* renamed from: j, reason: collision with root package name */
    public static final f1.b f28158j = new f1.b(-350059776, false, b.f28170a);

    /* renamed from: k, reason: collision with root package name */
    public static final f1.b f28159k = new f1.b(551894416, false, c.f28171a);

    /* renamed from: l, reason: collision with root package name */
    public static final f1.b f28160l = new f1.b(-376950029, false, d.f28172a);

    /* renamed from: m, reason: collision with root package name */
    public static final f1.b f28161m = new f1.b(-2105393500, false, e.f28173a);

    /* renamed from: n, reason: collision with root package name */
    public static final f1.b f28162n = new f1.b(502809154, false, f.f28174a);

    /* renamed from: o, reason: collision with root package name */
    public static final f1.b f28163o = new f1.b(-1592031633, false, g.f28175a);

    /* renamed from: p, reason: collision with root package name */
    public static final f1.b f28164p = new f1.b(-1591598721, false, h.f28176a);

    /* renamed from: q, reason: collision with root package name */
    public static final f1.b f28165q = new f1.b(1892625121, false, i.f28177a);

    /* renamed from: r, reason: collision with root package name */
    public static final f1.b f28166r = new f1.b(-1994072831, false, j.f28178a);

    /* renamed from: s, reason: collision with root package name */
    public static final f1.b f28167s = new f1.b(-875735624, false, k.f28179a);

    /* renamed from: t, reason: collision with root package name */
    public static final f1.b f28168t = new f1.b(1990753345, false, m.f28181a);

    public static final class a implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28169a = new a();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_leave_background, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28170a = new b();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_report_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28171a = new c();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_report_hint, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f28172a = new d();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(p0.b2.a(), f3.q.c(R.string.ai_session_code_copy, jVar2), androidx.compose.foundation.layout.g.n(d.a.f1143b, 20), v2.f28494d, jVar2, 3456, 0);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28173a = new e();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.profile_buy_credits, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28174a = new f();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_settings_ignore, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f28175a = new g();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_settings_apply, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f28176a = new h();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = dc.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 20), 0L, jVar2, 432, 8);
                ff.b(r.e2.b(aVar, 8, jVar2, R.string.ai_session_preview, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f28177a = new i();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 FilledTonalButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(FilledTonalButton, "$this$FilledTonalButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = p0.x0.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 20), 0L, jVar2, 432, 8);
                ff.b(r.e2.b(aVar, 8, jVar2, R.string.ai_session_build, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f28178a = new j();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = p0.c3.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 20), 0L, jVar2, 432, 8);
                ff.b(r.e2.b(aVar, 8, jVar2, R.string.ai_session_edit_project, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f28179a = new k();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarB = ya.f21110a;
                if (dVarB == null) {
                    d.a aVar = new d.a("Filled.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new g.f(6.0f, 6.0f));
                    arrayList.add(new g.l(12.0f));
                    arrayList.add(new g.r(12.0f));
                    arrayList.add(new g.d(6.0f));
                    arrayList.add(g.b.f31130c);
                    d.a.a(aVar, arrayList, 0, i2Var);
                    dVarB = aVar.b();
                    ya.f21110a = dVarB;
                }
                t4.b(dVarB, f3.q.c(R.string.ai_session_stop, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f28180a = new l();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_leave_cancel, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f28181a = new m();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarB = p0.u.f21047a;
                if (dVarB == null) {
                    d.a aVar = new d.a("Filled.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = n0.b.a(4.0f, 12.0f, 1.41f, 1.41f);
                    eVarA.f(11.0f, 7.83f);
                    eVarA.k(20.0f);
                    eVarA.e(2.0f);
                    eVarA.k(7.83f);
                    eVarA.g(5.58f, 5.59f);
                    eVarA.f(20.0f, 12.0f);
                    p0.h.b(eVarA, -8.0f, -8.0f, -8.0f, 8.0f);
                    d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar.b();
                    p0.u.f21047a = dVarB;
                }
                t4.b(dVarB, f3.q.c(R.string.ai_session_send, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f28182a = new n();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_leave_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f28183a = new o();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_leave_message, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f28184a = new p();

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

    public static final class q implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f28185a = new q();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_history_failed, jVar2), null, 0L, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, null, jVar2, 0, 0, 130558);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class r implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f28186a = new r();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.ai_session_report_send, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class s implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final s f28187a = new s();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.common_cancel, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class t implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final t f28188a = new t();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(e4.a(), null, null, 0L, jVar2, 48, 12);
            }
            return pg.f0.f21461a;
        }
    }
}
