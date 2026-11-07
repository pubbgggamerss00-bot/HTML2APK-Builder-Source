package c9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.t4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f5019a = new f1.b(-1045700489, false, C0061a.f5035a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f5020b = new f1.b(-536921675, false, i.f5043a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f5021c = new f1.b(1921121360, false, j.f5044a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f5022d = new f1.b(-2119456529, false, k.f5045a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f5023e = new f1.b(1782999172, false, l.f5046a);

    /* renamed from: f, reason: collision with root package name */
    public static final f1.b f5024f = new f1.b(-1047129477, false, m.f5047a);

    /* renamed from: g, reason: collision with root package name */
    public static final f1.b f5025g = new f1.b(425149116, false, n.f5048a);

    /* renamed from: h, reason: collision with root package name */
    public static final f1.b f5026h = new f1.b(-1604225641, false, o.f5049a);

    /* renamed from: i, reason: collision with root package name */
    public static final f1.b f5027i = new f1.b(1861753297, false, p.f5050a);

    /* renamed from: j, reason: collision with root package name */
    public static final f1.b f5028j = new f1.b(167831226, false, b.f5036a);

    /* renamed from: k, reason: collision with root package name */
    public static final f1.b f5029k = new f1.b(266878771, false, c.f5037a);

    /* renamed from: l, reason: collision with root package name */
    public static final f1.b f5030l = new f1.b(1269162922, false, d.f5038a);

    /* renamed from: m, reason: collision with root package name */
    public static final f1.b f5031m = new f1.b(-78314348, false, e.f5039a);

    /* renamed from: n, reason: collision with root package name */
    public static final f1.b f5032n = new f1.b(332296018, false, f.f5040a);

    /* renamed from: o, reason: collision with root package name */
    public static final f1.b f5033o = new f1.b(1646640557, false, g.f5041a);

    /* renamed from: p, reason: collision with root package name */
    public static final f1.b f5034p = new f1.b(-1631496131, false, h.f5042a);

    /* renamed from: c9.a$a, reason: collision with other inner class name */
    public static final class C0061a implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0061a f5035a = new C0061a();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_discard, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5036a = new b();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_clear_selection, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5037a = new c();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(r0.k.a(), f3.q.c(R.string.pdf_document_previous, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f5038a = new d();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(r0.l.a(), f3.q.c(R.string.pdf_document_next, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5039a = new e();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_add, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f5040a = new f();

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

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f5041a = new g();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_text_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f5042a = new h();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_text_hint, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f5043a = new i();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_keep_editing, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f5044a = new j();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_discard_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f5045a = new k();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_discard_message, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f5046a = new l();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(r0.n.a(), f3.q.c(R.string.pdf_document_close, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f5047a = new m();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(o0.h.a(), f3.q.c(R.string.pdf_edit_undo, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f5048a = new n();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(o0.e.a(), f3.q.c(R.string.pdf_edit_redo, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f5049a = new o();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = r0.j.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 18), 0L, jVar2, 432, 8);
                ff.b(r.e2.b(aVar, 6, jVar2, R.string.common_save, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f5050a = new p();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.pdf_edit_select_all, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }
}
