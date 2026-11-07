package g9;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import b9.e3;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.yalantis.ucrop.view.CropImageView;
import f9.c3;
import f9.d3;
import f9.dc;
import f9.e3;
import f9.fg;
import f9.hc;
import f9.ub;
import f9.vb;
import g2.j;
import g9.u;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l9.n;
import p0.e8;
import p0.g6;
import p0.n5;
import p0.q2;
import p0.x0;
import pg.p;
import ph.i0;
import ph.l2;
import ph.m0;
import ph.v1;
import ph.z0;
import q1.y1;
import s8.e2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.t4;
import t0.w9;
import t2.l0;
import x0.a2;
import x0.j;
import x0.r3;
import x0.s3;
import x2.p;
import z.b;
import z.f1;
import z.g1;
import z.k1;
import z.m1;
import z.n1;
import z.o1;

/* loaded from: classes.dex */
public final class u implements eh.q<f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f11783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9.b f11784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f11785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f11786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r3<Uri> f11789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f11790h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.l<Uri, pg.f0> f11791j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f11792k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r3<Uri> f11794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p5.x f11795n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11796p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11797q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r3<Uri> f11799s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f11800t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11801v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r3<String> f11802w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f11803x;

    public static final class a implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<String> f11804a;

        public a(r3<String> r3Var) {
            this.f11804a = r3Var;
        }

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(q2.a(), f3.q.c(R.string.simple_build_select_html, jVar2), null, 0L, jVar2, 0, 12);
                p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
                jVar2.L(1009556620);
                String value = this.f11804a.getValue();
                if (mh.x.A(value)) {
                    value = f3.q.c(R.string.simple_build_select_html, jVar2);
                }
                jVar2.B();
                ff.b(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, jVar2, 0, 3072, 122878);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<String> f11805a;

        public b(r3<String> r3Var) {
            this.f11805a = r3Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.d(R.string.editor_pasted_html, new Object[]{Integer.valueOf(this.f11805a.getValue().length())}, jVar2), androidx.compose.foundation.layout.f.i(d.a.f1143b, 8, 4), ((e2) jVar2.f(f2.f25858a)).f25757d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26552o, jVar2, 48, 0, 65528);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildScreenKt$SimpleBuildScreen$2$1$14$2$1$1$1", f = "SimpleBuildScreen.kt", l = {443}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11806a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f11807b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f11808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, y yVar, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f11807b = context;
            this.f11808c = yVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f11807b, this.f11808c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11806a;
            Context context = this.f11807b;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f11806a = 1;
                obj = l9.p.b(context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            l9.n nVar = (l9.n) obj;
            if (nVar instanceof n.c) {
                Set<String> set = l9.w.f16906a;
                String strA = l9.w.a(((n.c) nVar).f16856a);
                y yVar = this.f11808c;
                yVar.f11843q.setValue(strA);
                yVar.m(null);
                Toast.makeText(context, context.getString(R.string.editor_clipboard_pasted_success, new Integer(strA.length())), 0).show();
            } else if (kotlin.jvm.internal.r.a(nVar, n.a.f16854a)) {
                Toast.makeText(context, R.string.editor_clipboard_empty, 0).show();
            } else if (kotlin.jvm.internal.r.a(nVar, n.d.f16857a)) {
                Toast.makeText(context, R.string.editor_clipboard_too_large, 1).show();
            } else {
                if (!kotlin.jvm.internal.r.a(nVar, n.b.f16855a)) {
                    throw new pg.l();
                }
                Toast.makeText(context, R.string.editor_clipboard_error, 0).show();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<String> f11809a;

        public d(r3<String> r3Var) {
            this.f11809a = r3Var;
        }

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n5.a(), f3.q.c(R.string.simple_build_select_icon, jVar2), null, 0L, jVar2, 0, 12);
                p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
                jVar2.L(-625134742);
                String value = this.f11809a.getValue();
                if (mh.x.A(value)) {
                    value = f3.q.c(R.string.simple_build_select_icon, jVar2);
                }
                jVar2.B();
                ff.b(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, jVar2, 0, 3072, 122878);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildScreenKt$SimpleBuildScreen$2$1$17$1$1", f = "SimpleBuildScreen.kt", l = {653}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11810a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f11811b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p5.x f11812c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f11813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y yVar, p5.x xVar, Context context, tg.e<? super e> eVar) {
            super(2, eVar);
            this.f11811b = yVar;
            this.f11812c = xVar;
            this.f11813d = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new e(this.f11811b, this.f11812c, this.f11813d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11810a;
            y yVar = this.f11811b;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f11810a = 1;
                objJ = yVar.j(this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                objJ = ((pg.p) obj).f21471a;
            }
            Throwable thA = pg.p.a(objJ);
            if (thA == null) {
                long jLongValue = ((Number) objJ).longValue();
                e2.e.f24635c.getClass();
                this.f11812c.b(new v(0), "build_progress/" + jLongValue);
            } else {
                String message = thA.getMessage();
                if (message == null) {
                    message = this.f11813d.getString(R.string.simple_build_error_content);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
                yVar.m(message);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<Boolean> f11814a;

        public f(r3<Boolean> r3Var) {
            this.f11814a = r3Var;
        }

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            x0.j jVar2;
            n1 Button = n1Var;
            x0.j jVar3 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar3.s()) {
                jVar3.v();
            } else {
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                m1 m1VarA = k1.a(z.b.f34448e, d.a.f14612k, jVar3, 54);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar);
                } else {
                    jVar3.z();
                }
                v1.j(g.a.f13867f, m1VarA, jVar3);
                v1.j(g.a.f13866e, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar3);
                if (this.f11814a.getValue().booleanValue()) {
                    jVar3.L(823839031);
                    jVar2 = jVar3;
                    ff.b(f3.q.c(R.string.home_exporting, jVar3), null, ((t0.e2) jVar3.f(f2.f25858a)).f25753b, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131034);
                    jVar2.B();
                } else {
                    jVar3.L(824140537);
                    w1.d dVarA = x0.a();
                    String strC = f3.q.c(R.string.simple_build_create, jVar3);
                    s3 s3Var = f2.f25858a;
                    t4.b(dVarA, strC, null, ((t0.e2) jVar3.f(s3Var)).f25753b, jVar3, 0, 4);
                    jVar2 = jVar3;
                    ff.b(r.e2.b(d.a.f1143b, 8, jVar3, R.string.simple_build_create, jVar3), null, ((t0.e2) jVar3.f(s3Var)).f25753b, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
                    jVar2.B();
                }
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<String> f11815a;

        public g(r3<String> r3Var) {
            this.f11815a = r3Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            String strC;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1009362355);
                r3<String> r3Var = this.f11815a;
                if (mh.x.A(r3Var.getValue())) {
                    strC = f3.q.c(R.string.simple_build_package_hint, jVar2);
                } else {
                    mh.k kVar = fg.X0;
                    strC = fg.f.a(r3Var.getValue());
                }
                jVar2.B();
                ff.b(strC, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3<String> f11816a;

        public h(r3<String> r3Var) {
            this.f11816a = r3Var;
        }

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1009467646);
                String value = this.f11816a.getValue();
                if (mh.x.A(value)) {
                    value = f3.q.c(R.string.pdf_select, jVar2);
                }
                jVar2.B();
                ff.b(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, jVar2, 0, 3072, 122878);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildScreenKt$SimpleBuildScreen$2$1$8$1$1$1", f = "SimpleBuildScreen.kt", l = {315}, m = "invokeSuspend")
    public static final class i extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11817a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Uri, pg.f0> f11818b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f11819c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f11820d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildScreenKt$SimpleBuildScreen$2$1$8$1$1$1$cover$1", f = "SimpleBuildScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<i0, tg.e<? super File>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f11821a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f11822b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f11823c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, String str, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f11822b = context;
                this.f11823c = str;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f11822b, this.f11823c, eVar);
                aVar.f11821a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super File> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    objA = l9.e0.b(this.f11822b, new File(this.f11823c));
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (objA instanceof p.a) {
                    return null;
                }
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(eh.l<? super Uri, pg.f0> lVar, Context context, String str, tg.e<? super i> eVar) {
            super(2, eVar);
            this.f11818b = lVar;
            this.f11819c = context;
            this.f11820d = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new i(this.f11818b, this.f11819c, this.f11820d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11817a;
            Context context = this.f11819c;
            if (i10 == 0) {
                pg.q.b(obj);
                wh.c cVar = z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(context, this.f11820d, null);
                this.f11817a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            File file = (File) obj;
            if (file != null) {
                Uri uriFromFile = Uri.fromFile(file);
                kotlin.jvm.internal.r.d(uriFromFile, "fromFile(...)");
                this.f11818b.invoke(uriFromFile);
            } else {
                Toast.makeText(context, R.string.pdf_cover_failed, 0).show();
            }
            return pg.f0.f21461a;
        }
    }

    public u(y yVar, g9.b bVar, c.k kVar, Context context, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, i0 i0Var, eh.l lVar, c.k kVar2, x0.n1 n1Var4, x0.n1 n1Var5, p5.x xVar, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, x0.n1 n1Var9, c.k kVar3, x0.n1 n1Var10, x0.n1 n1Var11, x0.n1 n1Var12) {
        this.f11783a = yVar;
        this.f11784b = bVar;
        this.f11785c = kVar;
        this.f11786d = context;
        this.f11787e = n1Var;
        this.f11788f = n1Var2;
        this.f11789g = n1Var3;
        this.f11790h = i0Var;
        this.f11791j = lVar;
        this.f11792k = kVar2;
        this.f11793l = n1Var4;
        this.f11794m = n1Var5;
        this.f11795n = xVar;
        this.f11796p = n1Var6;
        this.f11797q = n1Var7;
        this.f11798r = n1Var8;
        this.f11799s = n1Var9;
        this.f11800t = kVar3;
        this.f11801v = n1Var10;
        this.f11802w = n1Var11;
        this.f11803x = n1Var12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x11e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(f1 padding, x0.j jVar, int i10) {
        int i11;
        Object obj;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        float f10;
        f.b bVar;
        r3<String> r3Var;
        x0.j jVar2;
        o1 o1Var;
        g9.b bVar2;
        y yVar;
        r3<Uri> r3Var2;
        i0 i0Var;
        eh.l<Uri, pg.f0> lVar;
        final r3<Uri> r3Var3;
        f.a aVar;
        float f11;
        d.a aVar2;
        boolean z12;
        r3<String> r3Var4;
        Context context;
        p5.x xVar;
        Object obj2;
        d.a aVar3;
        Object obj3;
        final eh.l<Uri, pg.f0> lVar2;
        androidx.compose.ui.d dVarC;
        eh.l<Uri, pg.f0> lVar3;
        x0.j jVar3;
        r3<Uri> r3Var5;
        final y yVar2;
        boolean z13;
        Object obj4;
        float f12;
        d.a aVar4;
        y yVar3;
        Object obj5;
        r3<Boolean> r3Var6;
        Object obj6;
        final Context context2;
        p5.x xVar2;
        final r3<String> r3Var7;
        final r3<String> r3Var8;
        Object obj7;
        float f13;
        p5.x xVar3;
        r3<String> r3Var9;
        y yVar4;
        Context context3;
        boolean zL;
        Object objG;
        boolean z14;
        final r3<Uri> r3Var10;
        i0 i0Var2;
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((i10 & 6) == 0) {
            i11 = i10 | (jVar.K(padding) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18 && jVar.s()) {
            jVar.v();
            return;
        }
        d.a aVar5 = d.a.f1143b;
        float f14 = 20;
        androidx.compose.ui.d dVarG = m0.g(d0.h.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.c(aVar5), padding), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2)), m0.c(jVar));
        b.k kVar = z.b.f34446c;
        f.a aVar6 = d.a.f14614m;
        z.q qVarA = z.o.a(kVar, aVar6, jVar, 0);
        int iC = u1.c(jVar);
        a2 a2VarY = jVar.y();
        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarG, jVar);
        i2.g.f13861o.getClass();
        e0.a aVarA = g.a.a();
        if (jVar.t() == null) {
            u1.d();
            throw null;
        }
        jVar.r();
        if (jVar.m()) {
            jVar.w(aVarA);
        } else {
            jVar.z();
        }
        v1.j(g.a.c(), qVarA, jVar);
        v1.j(g.a.e(), a2VarY, jVar);
        g.a.C0128a c0128aB = g.a.b();
        if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC))) {
            l9.i.a(iC, jVar, iC, c0128aB);
        }
        v1.j(g.a.d(), dVarC2, jVar);
        float f15 = 8;
        ff.b(pd.d.a(aVar5, f15, jVar, R.string.simple_build_app_name, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).a(), jVar, 0, 0, 65530);
        float f16 = 6;
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f16), jVar);
        final r3<String> r3Var11 = this.f11787e;
        String strC = x.c(r3Var11);
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
        float f17 = 12;
        h0.e eVarA = h0.f.a(f17);
        jVar.L(-796396492);
        final y yVar5 = this.f11783a;
        boolean zL2 = jVar.l(yVar5);
        Object objG2 = jVar.g();
        Object obj8 = j.a.f31715a;
        if (zL2 || objG2 == obj8) {
            objG2 = new ub(yVar5, 1);
            jVar.C(objG2);
        }
        jVar.B();
        w9.a(strC, (eh.l) objG2, dVarD, false, false, null, null, g9.a.f11658c, null, null, null, null, false, null, null, null, true, 1, 0, eVarA, null, jVar, 12583296, 113246208, 5898104);
        float f18 = 16;
        ff.b(pd.d.a(aVar5, f18, jVar, R.string.simple_build_package_name, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).a(), jVar, 0, 0, 65530);
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f16), jVar);
        String strD = x.d(this.f11798r);
        androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
        h0.e eVarA2 = h0.f.a(f17);
        jVar.L(-796367232);
        boolean zL3 = jVar.l(yVar5);
        Object objG3 = jVar.g();
        if (!zL3) {
            obj = obj8;
            if (objG3 != obj) {
                i12 = 1;
            }
            jVar.B();
            Object obj9 = obj;
            w9.a(strD, (eh.l) objG3, dVarD2, false, false, null, null, f1.c.b(-1648776890, new g(r3Var11), jVar), null, null, null, null, false, null, null, null, true, 1, 0, eVarA2, null, jVar, 12583296, 113246208, 5898104);
            float f19 = 4;
            ff.b(pd.d.a(aVar5, f19, jVar, R.string.simple_build_package_help, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).b(), jVar, 0, 0, 65530);
            ff.b(pd.d.a(aVar5, f14, jVar, R.string.simple_build_content_source, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).a(), jVar, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f15), jVar);
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            m1 m1VarA = k1.a(z.b.h(f15), d.a.f14611j, jVar, 6);
            int iC2 = u1.c(jVar);
            a2 a2VarY2 = jVar.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarD3, jVar);
            e0.a aVarA2 = g.a.a();
            if (jVar.t() != null) {
                u1.d();
                throw null;
            }
            jVar.r();
            if (jVar.m()) {
                jVar.w(aVarA2);
            } else {
                jVar.z();
            }
            v1.j(g.a.c(), m1VarA, jVar);
            v1.j(g.a.e(), a2VarY2, jVar);
            g.a.C0128a c0128aB2 = g.a.b();
            if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC2))) {
                l9.i.a(iC2, jVar, iC2, c0128aB2);
            }
            v1.j(g.a.d(), dVarC3, jVar);
            String strC2 = f3.q.c(R.string.simple_build_select_html, jVar);
            g9.b bVar3 = g9.b.f11687a;
            g9.b bVar4 = this.f11784b;
            boolean z15 = bVar4 == bVar3;
            w1.d dVarA = q2.a();
            jVar.L(1009408273);
            boolean zL4 = jVar.l(yVar5);
            Object objG4 = jVar.g();
            if (zL4 || objG4 == obj9) {
                i13 = 2;
                objG4 = new c3(yVar5, i13);
                jVar.C(objG4);
            } else {
                i13 = 2;
            }
            eh.a aVar7 = (eh.a) objG4;
            jVar.B();
            o1 o1Var2 = o1.f34600a;
            x.b(strC2, z15, dVarA, aVar7, o1Var2.a(aVar5, 1.0f), jVar, 0);
            boolean z16 = bVar4 == g9.b.f11688b;
            w1.d dVarA2 = g6.a();
            jVar.L(1009419471);
            boolean zL5 = jVar.l(yVar5);
            Object objG5 = jVar.g();
            if (zL5 || objG5 == obj9) {
                i14 = 1;
                objG5 = new d3(yVar5, i14);
                jVar.C(objG5);
            } else {
                i14 = 1;
            }
            jVar.B();
            int i15 = i14;
            x.b("URL", z16, dVarA2, (eh.a) objG5, o1Var2.a(aVar5, 1.0f), jVar, 6);
            String strC3 = f3.q.c(R.string.simple_build_paste_html, jVar);
            if (bVar4 == g9.b.f11689c) {
                z10 = R.string.simple_build_paste_html;
                z11 = i15;
            } else {
                z10 = R.string.simple_build_paste_html;
                z11 = 0;
            }
            w1.d dVarA3 = p0.c3.a();
            jVar.L(1009432049);
            boolean zL6 = jVar.l(yVar5);
            Object objG6 = jVar.g();
            if (zL6 || objG6 == obj9) {
                objG6 = new e3(yVar5, i15);
                jVar.C(objG6);
            }
            jVar.B();
            x.b(strC3, z11, dVarA3, (eh.a) objG6, o1Var2.a(aVar5, 1.0f), jVar, 0);
            boolean z17 = bVar4 == g9.b.f11690d ? i15 : 0;
            w1.d dVarA4 = e8.a();
            jVar.L(1009443503);
            boolean zL7 = jVar.l(yVar5);
            Object objG7 = jVar.g();
            if (zL7 || objG7 == obj9) {
                objG7 = new b9.m0(yVar5, i15);
                jVar.C(objG7);
            }
            jVar.B();
            x.b("PDF", z17, dVarA4, (eh.a) objG7, o1Var2.a(aVar5, 1.0f), jVar, 6);
            jVar.H();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f17), jVar);
            int iOrdinal = bVar4.ordinal();
            f.b bVar5 = d.a.f14612k;
            final Context context4 = this.f11786d;
            final r3<Uri> r3Var12 = this.f11789g;
            final i0 i0Var3 = this.f11790h;
            final eh.l<Uri, pg.f0> lVar4 = this.f11791j;
            r3<Uri> r3Var13 = this.f11794m;
            final p5.x xVar4 = this.f11795n;
            final r3<String> r3Var14 = this.f11796p;
            r3<String> r3Var15 = this.f11797q;
            if (iOrdinal == 0) {
                f10 = f17;
                bVar = bVar5;
                r3Var = r3Var15;
                jVar2 = jVar;
                o1Var = o1Var2;
                bVar2 = bVar4;
                yVar = yVar5;
                r3Var2 = r3Var12;
                i0Var = i0Var3;
                lVar = lVar4;
                r3Var3 = r3Var13;
                aVar = aVar6;
                f11 = f16;
                aVar2 = aVar5;
                jVar2.L(1088191631);
                jVar2.L(-796180702);
                c.k<String, Uri> kVar2 = this.f11792k;
                boolean zL8 = jVar2.l(kVar2) | jVar2.l(context4);
                Object objG8 = jVar2.g();
                if (zL8 || objG8 == obj9) {
                    z12 = false;
                    objG8 = new n(0, kVar2, context4);
                    jVar2.C(objG8);
                } else {
                    z12 = false;
                }
                jVar2.B();
                androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                h0.e eVarA3 = h0.f.a(f10);
                final r3<String> r3Var16 = this.f11793l;
                t0.x0.c((eh.a) objG8, dVarD4, false, eVarA3, null, null, null, f1.c.b(1451648937, new a(r3Var16), jVar2), jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                if (x.f(r3Var3) != null) {
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f15), jVar2);
                    jVar2.L(-796151976);
                    boolean zK = jVar2.K(r3Var11) | jVar2.K(r3Var16) | jVar2.l(context4) | jVar2.K(r3Var3) | jVar2.l(xVar4);
                    Object objG9 = jVar2.g();
                    if (zK) {
                        obj2 = obj9;
                    } else {
                        obj2 = obj9;
                        if (objG9 != obj2) {
                            xVar = xVar4;
                            r3Var3 = r3Var3;
                            r3Var4 = r3Var11;
                            context = context4;
                        }
                        jVar2.B();
                        t0.x0.c((eh.a) objG9, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11661f, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    }
                    eh.a aVar8 = new eh.a() { // from class: g9.l
                        @Override // eh.a
                        public final Object invoke() {
                            String string = (String) r3Var11.getValue();
                            if (mh.x.A(string)) {
                                string = (String) r3Var16.getValue();
                            }
                            if (mh.x.A(string)) {
                                string = context4.getString(R.string.preview_title);
                                kotlin.jvm.internal.r.d(string, "getString(...)");
                            }
                            b9.e3.f3796a = new e3.a(string, e3.b.f3813c, null, null, (Uri) r3Var3.getValue(), null, null, null, null, 0, false, null, 16364);
                            p5.x.c(e2.t.f24650c.f24627a, xVar4);
                            return pg.f0.f21461a;
                        }
                    };
                    xVar = xVar4;
                    r3Var4 = r3Var11;
                    context = context4;
                    r3Var3 = r3Var3;
                    jVar2.C(aVar8);
                    objG9 = aVar8;
                    jVar2.B();
                    t0.x0.c((eh.a) objG9, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11661f, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                } else {
                    r3Var4 = r3Var11;
                    context = context4;
                    xVar = xVar4;
                    obj2 = obj9;
                }
                jVar2.B();
                pg.f0 f0Var = pg.f0.f21461a;
            } else if (iOrdinal == i15) {
                o1Var = o1Var2;
                bVar2 = bVar4;
                r3Var2 = r3Var12;
                lVar = lVar4;
                r3Var3 = r3Var13;
                aVar = aVar6;
                f11 = f16;
                jVar.L(1090236205);
                String value = r3Var14.getValue();
                androidx.compose.ui.d dVarD5 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                h0.e eVarA4 = h0.f.a(f17);
                jVar.L(-796112901);
                boolean zL9 = jVar.l(yVar5);
                Object objG10 = jVar.g();
                if (zL9 || objG10 == obj9) {
                    objG10 = new dc(yVar5, i15);
                    jVar.C(objG10);
                }
                jVar.B();
                f10 = f17;
                bVar = bVar5;
                r3Var = r3Var15;
                yVar = yVar5;
                i0Var = i0Var3;
                w9.a(value, (eh.l) objG10, dVarD5, false, false, null, null, g9.a.f11662g, null, null, null, null, false, null, null, null, true, 0, 0, eVarA4, null, jVar, 12583296, 12582912, 6160248);
                jVar2 = jVar;
                if (mh.x.A(r3Var14.getValue())) {
                    r3Var14 = r3Var14;
                    aVar2 = aVar5;
                    context2 = context4;
                    xVar2 = xVar4;
                    obj2 = obj9;
                    r3Var7 = r3Var11;
                } else {
                    aVar2 = aVar5;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f15), jVar2);
                    jVar2.L(-796092718);
                    r3Var7 = r3Var11;
                    context2 = context4;
                    boolean zK2 = jVar2.K(r3Var14) | jVar2.K(r3Var7) | jVar2.l(context2) | jVar2.l(xVar4);
                    Object objG11 = jVar2.g();
                    if (zK2) {
                        obj2 = obj9;
                    } else {
                        obj2 = obj9;
                        if (objG11 == obj2) {
                        }
                        jVar2.B();
                        r3Var14 = r3Var14;
                        xVar2 = xVar4;
                        t0.x0.c((eh.a) objG11, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11663h, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    }
                    objG11 = new eh.a() { // from class: g9.o
                        @Override // eh.a
                        public final Object invoke() {
                            r3 r3Var17 = r3Var14;
                            String strA = (mh.t.p((String) r3Var17.getValue(), "http://", false) || mh.t.p((String) r3Var17.getValue(), "https://", false)) ? (String) r3Var17.getValue() : m3.a.a("https://", (String) r3Var17.getValue());
                            String string = (String) r3Var7.getValue();
                            if (mh.x.A(string)) {
                                string = context2.getString(R.string.preview_title);
                                kotlin.jvm.internal.r.d(string, "getString(...)");
                            }
                            b9.e3.f3796a = new e3.a(string, e3.b.f3812b, null, strA, null, null, null, null, null, 0, false, null, 16372);
                            p5.x.c(e2.t.f24650c.f24627a, xVar4);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG11);
                    jVar2.B();
                    r3Var14 = r3Var14;
                    xVar2 = xVar4;
                    t0.x0.c((eh.a) objG11, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11663h, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                }
                jVar2.B();
                pg.f0 f0Var2 = pg.f0.f21461a;
                xVar = xVar2;
                r3Var4 = r3Var7;
                context = context2;
            } else if (iOrdinal == i13) {
                bVar2 = bVar4;
                r3Var2 = r3Var12;
                lVar = lVar4;
                r3Var3 = r3Var13;
                f11 = f16;
                jVar.L(1092374740);
                float f20 = 10;
                z.q qVarA2 = z.o.a(z.b.h(f20), aVar6, jVar, 6);
                int iC3 = u1.c(jVar);
                a2 a2VarY3 = jVar.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar5, jVar);
                e0.a aVarA3 = g.a.a();
                if (jVar.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar.r();
                if (jVar.m()) {
                    jVar.w(aVarA3);
                } else {
                    jVar.z();
                }
                v1.j(g.a.c(), qVarA2, jVar);
                v1.j(g.a.e(), a2VarY3, jVar);
                g.a.C0128a c0128aB3 = g.a.b();
                if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC3))) {
                    l9.i.a(iC3, jVar, iC3, c0128aB3);
                }
                v1.j(g.a.d(), dVarC4, jVar);
                androidx.compose.ui.d dVarD6 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                m1 m1VarA2 = k1.a(z.b.a(), bVar5, jVar, 54);
                int iC4 = u1.c(jVar);
                a2 a2VarY4 = jVar.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarD6, jVar);
                e0.a aVarA4 = g.a.a();
                if (jVar.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar.r();
                if (jVar.m()) {
                    jVar.w(aVarA4);
                } else {
                    jVar.z();
                }
                v1.j(g.a.c(), m1VarA2, jVar);
                v1.j(g.a.e(), a2VarY4, jVar);
                g.a.C0128a c0128aB4 = g.a.b();
                if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC4))) {
                    l9.i.a(iC4, jVar, iC4, c0128aB4);
                }
                v1.j(g.a.d(), dVarC5, jVar);
                String strC4 = f3.q.c(R.string.simple_build_paste_html, jVar);
                l0 l0VarA = b3.l.b(jVar).a();
                x2.p pVar = x2.p.f32029b;
                aVar = aVar6;
                ff.b(strC4, null, b3.l.a(jVar).a(), 0L, p.a.b(), null, 0L, null, 0L, 0, false, 0, 0, l0VarA, jVar, 196608, 0, 65498);
                x0.j jVar4 = jVar;
                jVar4.L(-1636450992);
                if (mh.x.A(r3Var15.getValue())) {
                    r3Var8 = r3Var15;
                } else {
                    r3Var8 = r3Var15;
                    md.a(null, h0.f.a(f15), b3.l.a(jVar4).f25755c, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(1239150853, new b(r3Var8), jVar4), jVar, 12582912, 121);
                    jVar4 = jVar;
                }
                jVar4.B();
                jVar4.H();
                androidx.compose.ui.d dVarD7 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                m1 m1VarA3 = k1.a(z.b.h(f15), bVar5, jVar4, 54);
                int iC5 = u1.c(jVar4);
                a2 a2VarY5 = jVar4.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarD7, jVar4);
                e0.a aVarA5 = g.a.a();
                if (jVar4.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVarA5);
                } else {
                    jVar4.z();
                }
                v1.j(g.a.c(), m1VarA3, jVar4);
                v1.j(g.a.e(), a2VarY5, jVar4);
                g.a.C0128a c0128aB5 = g.a.b();
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iC5))) {
                    l9.i.a(iC5, jVar4, iC5, c0128aB5);
                }
                v1.j(g.a.d(), dVarC6, jVar4);
                jVar4.L(-1636412429);
                boolean zL10 = jVar4.l(i0Var3) | jVar4.l(context4) | jVar4.l(yVar5);
                Object objG12 = jVar4.g();
                if (zL10) {
                    obj7 = obj9;
                } else {
                    obj7 = obj9;
                    if (objG12 == obj7) {
                    }
                    jVar4.B();
                    Object obj10 = obj7;
                    o1Var = o1Var2;
                    t0.x0.a((eh.a) objG12, o1Var2.a(aVar5, 1.0f), false, h0.f.a(f20), null, null, null, androidx.compose.foundation.layout.f.b(14, f15), g9.a.f11664i, jVar, 817889280, 372);
                    jVar.H();
                    jVar.L(1009804621);
                    if (mh.x.A(r3Var8.getValue())) {
                        androidx.compose.ui.d dVarD8 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                        m1 m1VarA4 = k1.a(z.b.h(f15), bVar5, jVar, 54);
                        int iC6 = u1.c(jVar);
                        a2 a2VarY6 = jVar.y();
                        androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarD8, jVar);
                        e0.a aVarA6 = g.a.a();
                        if (jVar.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar.r();
                        if (jVar.m()) {
                            jVar.w(aVarA6);
                        } else {
                            jVar.z();
                        }
                        v1.j(g.a.c(), m1VarA4, jVar);
                        v1.j(g.a.e(), a2VarY6, jVar);
                        g.a.C0128a c0128aB6 = g.a.b();
                        if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC6))) {
                            l9.i.a(iC6, jVar, iC6, c0128aB6);
                        }
                        v1.j(g.a.d(), dVarC7, jVar);
                        jVar.L(-1636326069);
                        boolean zK3 = jVar.K(r3Var11) | jVar.l(context4) | jVar.K(r3Var8) | jVar.l(xVar4);
                        Object objG13 = jVar.g();
                        if (zK3 || objG13 == obj10) {
                            objG13 = new eh.a() { // from class: g9.q
                                @Override // eh.a
                                public final Object invoke() {
                                    String string = (String) r3Var11.getValue();
                                    if (mh.x.A(string)) {
                                        string = context4.getString(R.string.preview_title);
                                        kotlin.jvm.internal.r.d(string, "getString(...)");
                                    }
                                    String htmlContent = (String) r3Var8.getValue();
                                    kotlin.jvm.internal.r.e(htmlContent, "htmlContent");
                                    b9.e3.f3796a = new e3.a(string, e3.b.f3811a, htmlContent, null, null, null, null, null, "auto", 0, true, null, 9208);
                                    p5.x.c(e2.t.f24650c.f24627a, xVar4);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar.C(objG13);
                        }
                        jVar.B();
                        r3Var9 = r3Var11;
                        f13 = f17;
                        context3 = context4;
                        xVar3 = xVar4;
                        t0.x0.c((eh.a) objG13, null, false, h0.f.a(f20), null, null, androidx.compose.foundation.layout.f.b(f17, f15), g9.a.f11665j, jVar, 817889280, 374);
                        jVar.L(-1636284642);
                        boolean zL11 = jVar.l(yVar5);
                        Object objG14 = jVar.g();
                        if (zL11 || objG14 == obj10) {
                            z14 = false;
                            objG14 = new r(yVar5, 0);
                            jVar.C(objG14);
                        } else {
                            z14 = false;
                        }
                        jVar.B();
                        yVar4 = yVar5;
                        t0.x0.c((eh.a) objG14, null, false, h0.f.a(f20), null, null, androidx.compose.foundation.layout.f.b(f13, f15), g9.a.f11666k, jVar, 817889280, 374);
                        jVar.H();
                    } else {
                        f13 = f17;
                        xVar3 = xVar4;
                        r3Var9 = r3Var11;
                        yVar4 = yVar5;
                        context3 = context4;
                    }
                    jVar.B();
                    String value2 = r3Var8.getValue();
                    androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 160);
                    jVar.L(1009890770);
                    zL = jVar.l(yVar4);
                    objG = jVar.g();
                    if (!zL || objG == obj10) {
                        objG = new hc(yVar4, 1);
                        jVar.C(objG);
                    }
                    jVar.B();
                    q8.k1.b(value2, (eh.l) objG, dVarF, null, g9.a.f11667l, null, jVar, 24960, 40);
                    jVar2 = jVar;
                    jVar2.H();
                    jVar2.B();
                    pg.f0 f0Var3 = pg.f0.f21461a;
                    bVar = bVar5;
                    yVar = yVar4;
                    f10 = f13;
                    r3Var = r3Var8;
                    obj2 = obj10;
                    i0Var = i0Var3;
                    r3Var4 = r3Var9;
                    aVar2 = aVar5;
                    context = context3;
                    xVar = xVar3;
                    r3Var14 = r3Var14;
                }
                objG12 = new eh.a() { // from class: g9.p
                    @Override // eh.a
                    public final Object invoke() {
                        ph.h.c(i0Var3, null, null, new u.c(context4, yVar5, null), 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar4.C(objG12);
                jVar4.B();
                Object obj102 = obj7;
                o1Var = o1Var2;
                t0.x0.a((eh.a) objG12, o1Var2.a(aVar5, 1.0f), false, h0.f.a(f20), null, null, null, androidx.compose.foundation.layout.f.b(14, f15), g9.a.f11664i, jVar, 817889280, 372);
                jVar.H();
                jVar.L(1009804621);
                if (mh.x.A(r3Var8.getValue())) {
                }
                jVar.B();
                String value22 = r3Var8.getValue();
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 160);
                jVar.L(1009890770);
                zL = jVar.l(yVar4);
                objG = jVar.g();
                if (!zL) {
                    objG = new hc(yVar4, 1);
                    jVar.C(objG);
                    jVar.B();
                    q8.k1.b(value22, (eh.l) objG, dVarF2, null, g9.a.f11667l, null, jVar, 24960, 40);
                    jVar2 = jVar;
                    jVar2.H();
                    jVar2.B();
                    pg.f0 f0Var32 = pg.f0.f21461a;
                    bVar = bVar5;
                    yVar = yVar4;
                    f10 = f13;
                    r3Var = r3Var8;
                    obj2 = obj102;
                    i0Var = i0Var3;
                    r3Var4 = r3Var9;
                    aVar2 = aVar5;
                    context = context3;
                    xVar = xVar3;
                    r3Var14 = r3Var14;
                }
            } else {
                if (iOrdinal != 3) {
                    jVar.L(-796255117);
                    jVar.B();
                    throw new pg.l();
                }
                jVar.L(1085589615);
                r3Var3 = r3Var13;
                bVar = bVar5;
                xVar = xVar4;
                f10 = f17;
                bVar2 = bVar4;
                ff.b(f3.q.c(R.string.pdf_hint, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).b(), jVar, 0, 0, 65530);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f15), jVar);
                jVar.L(-796258649);
                c.k<String, Uri> kVar3 = this.f11785c;
                boolean zL12 = jVar.l(kVar3) | jVar.l(context4);
                Object objG15 = jVar.g();
                if (zL12 || objG15 == obj9) {
                    objG15 = new androidx.credentials.playservices.controllers.identityauth.getsigninintent.g(1, kVar3, context4);
                    jVar.C(objG15);
                }
                jVar.B();
                androidx.compose.ui.d dVarD9 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                h0.e eVarA5 = h0.f.a(f10);
                final r3<String> r3Var17 = this.f11788f;
                t0.x0.c((eh.a) objG15, dVarD9, false, eVarA5, null, null, null, f1.c.b(-178910208, new h(r3Var17), jVar), jVar, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                jVar.L(-796247350);
                if (x.g(r3Var12) != null) {
                    jVar.L(-796246395);
                    boolean zK4 = jVar.K(r3Var11) | jVar.K(r3Var17) | jVar.l(context4) | jVar.K(r3Var12);
                    Object objG16 = jVar.g();
                    if (zK4 || objG16 == obj9) {
                        objG16 = new eh.a() { // from class: g9.k
                            @Override // eh.a
                            public final Object invoke() {
                                String str = (String) r3Var11.getValue();
                                if (mh.x.A(str)) {
                                    str = (String) r3Var17.getValue();
                                }
                                int i16 = PdfPreviewActivity.f5788v;
                                Uri uri = (Uri) r3Var12.getValue();
                                kotlin.jvm.internal.r.b(uri);
                                PdfPreviewActivity.a.a(context4, uri, str, new m9.v1(str, 4095));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG16);
                    }
                    jVar.B();
                    r3Var4 = r3Var11;
                    r3Var10 = r3Var12;
                    t0.x0.c((eh.a) objG16, androidx.compose.foundation.layout.g.d(aVar5, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11659d, jVar, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    jVar.L(-796224406);
                    boolean zK5 = jVar.K(r3Var10) | jVar.l(i0Var3) | jVar.l(context4) | jVar.K(lVar4);
                    Object objG17 = jVar.g();
                    if (zK5 || objG17 == obj9) {
                        objG17 = new eh.a() { // from class: g9.m
                            @Override // eh.a
                            public final Object invoke() {
                                String path;
                                Uri uri = (Uri) r3Var10.getValue();
                                if (uri != null && (path = uri.getPath()) != null) {
                                    ph.h.c(i0Var3, null, null, new u.i(lVar4, context4, path, null), 3);
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG17);
                    }
                    jVar.B();
                    i0Var2 = i0Var3;
                    lVar = lVar4;
                    t0.x0.c((eh.a) objG17, androidx.compose.foundation.layout.g.d(aVar5, 1.0f), false, h0.f.a(f10), null, null, null, g9.a.f11660e, jVar, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                } else {
                    r3Var10 = r3Var12;
                    r3Var4 = r3Var11;
                    i0Var2 = i0Var3;
                    lVar = lVar4;
                }
                jVar.B();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f16), jVar);
                context = context4;
                f11 = f16;
                r3Var2 = r3Var10;
                ff.b(f3.q.c(R.string.pdf_simple_more_settings, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).b(), jVar, 0, 0, 65530);
                jVar2 = jVar;
                jVar2.B();
                pg.f0 f0Var4 = pg.f0.f21461a;
                r3Var14 = r3Var14;
                aVar2 = aVar5;
                r3Var = r3Var15;
                aVar = aVar6;
                yVar = yVar5;
                o1Var = o1Var2;
                i0Var = i0Var2;
                obj2 = obj9;
            }
            final r3<String> r3Var18 = r3Var14;
            d.a aVar9 = aVar2;
            Object obj11 = obj2;
            final r3<Uri> r3Var19 = r3Var3;
            final r3<String> r3Var20 = r3Var4;
            final Context context5 = context;
            final p5.x xVar5 = xVar;
            ff.b(pd.d.a(aVar2, f14, jVar2, R.string.simple_build_select_icon, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).a(), jVar, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, f11), jVar);
            androidx.compose.ui.d dVarD10 = androidx.compose.foundation.layout.g.d(aVar9, 1.0f);
            f.b bVar6 = bVar;
            m1 m1VarA5 = k1.a(z.b.h(f18), bVar6, jVar, 54);
            int iC7 = u1.c(jVar);
            a2 a2VarY7 = jVar.y();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarD10, jVar);
            e0.a aVarA7 = g.a.a();
            if (jVar.t() == null) {
                u1.d();
                throw null;
            }
            jVar.r();
            if (jVar.m()) {
                jVar.w(aVarA7);
            } else {
                jVar.z();
            }
            v1.j(g.a.c(), m1VarA5, jVar);
            v1.j(g.a.e(), a2VarY7, jVar);
            g.a.C0128a c0128aB7 = g.a.b();
            if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC7))) {
                l9.i.a(iC7, jVar, iC7, c0128aB7);
            }
            v1.j(g.a.d(), dVarC8, jVar);
            float f21 = 96;
            float f22 = 24;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar9, f21), h0.f.a(f22)), b3.l.a(jVar).f(), y1.f21750a);
            jVar.L(1009944029);
            final r3<Uri> r3Var21 = this.f11799s;
            if (r3Var21.getValue() != null) {
                jVar.L(1009946279);
                lVar2 = lVar;
                boolean zK6 = jVar.K(lVar2) | jVar.K(r3Var21);
                Object objG18 = jVar.g();
                if (zK6) {
                    obj6 = obj11;
                } else {
                    obj6 = obj11;
                    if (objG18 == obj6) {
                    }
                    jVar.B();
                    obj3 = obj6;
                    dVarC = androidx.compose.foundation.b.c(aVar9, false, null, null, (eh.a) objG18, 7);
                    aVar3 = aVar9;
                }
                objG18 = new eh.a() { // from class: g9.s
                    @Override // eh.a
                    public final Object invoke() {
                        Uri uri = (Uri) r3Var21.getValue();
                        kotlin.jvm.internal.r.b(uri);
                        lVar2.invoke(uri);
                        return pg.f0.f21461a;
                    }
                };
                jVar.C(objG18);
                jVar.B();
                obj3 = obj6;
                dVarC = androidx.compose.foundation.b.c(aVar9, false, null, null, (eh.a) objG18, 7);
                aVar3 = aVar9;
            } else {
                aVar3 = aVar9;
                obj3 = obj11;
                lVar2 = lVar;
                dVarC = aVar3;
            }
            jVar.B();
            androidx.compose.ui.d dVarH = dVarB.h(dVarC);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iC8 = u1.c(jVar);
            a2 a2VarY8 = jVar.y();
            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarH, jVar);
            e0.a aVarA8 = g.a.a();
            if (jVar.t() == null) {
                u1.d();
                throw null;
            }
            jVar.r();
            if (jVar.m()) {
                jVar.w(aVarA8);
            } else {
                jVar.z();
            }
            v1.j(g.a.c(), l0VarD, jVar);
            v1.j(g.a.e(), a2VarY8, jVar);
            g.a.C0128a c0128aB8 = g.a.b();
            if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC8))) {
                l9.i.a(iC8, jVar, iC8, c0128aB8);
            }
            v1.j(g.a.d(), dVarC9, jVar);
            if (r3Var21.getValue() != null) {
                jVar.L(817759125);
                lVar3 = lVar2;
                r3Var5 = r3Var21;
                h7.r.a(r3Var21.getValue(), f3.q.c(R.string.editor_button_crop_icon, jVar), androidx.compose.foundation.layout.g.n(aVar3, f21), j.a.f11397a, jVar, 1573248);
                jVar3 = jVar;
                jVar3.B();
            } else {
                lVar3 = lVar2;
                jVar3 = jVar;
                r3Var5 = r3Var21;
                jVar3.L(818112370);
                t4.b(n5.a(), null, androidx.compose.foundation.layout.g.n(aVar3, 40), b3.l.a(jVar3).b(), jVar3, 432, 0);
                jVar3.B();
            }
            jVar3.H();
            androidx.compose.ui.d dVarA5 = o1Var.a(aVar3, 1.0f);
            z.q qVarA3 = z.o.a(kVar, aVar, jVar3, 0);
            int iC9 = u1.c(jVar3);
            a2 a2VarY9 = jVar3.y();
            androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(dVarA5, jVar3);
            e0.a aVarA9 = g.a.a();
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVarA9);
            } else {
                jVar3.z();
            }
            v1.j(g.a.c(), qVarA3, jVar3);
            v1.j(g.a.e(), a2VarY9, jVar3);
            g.a.C0128a c0128aB9 = g.a.b();
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iC9))) {
                l9.i.a(iC9, jVar3, iC9, c0128aB9);
            }
            v1.j(g.a.d(), dVarC10, jVar3);
            jVar3.L(-1636162562);
            final c.k<String, Uri> kVar4 = this.f11800t;
            boolean zL13 = jVar3.l(kVar4) | jVar3.l(context5);
            Object objG19 = jVar3.g();
            if (zL13 || objG19 == obj3) {
                objG19 = new eh.a() { // from class: g9.t
                    @Override // eh.a
                    public final Object invoke() {
                        hf.a.a(kVar4, context5, "image/*", R.string.launch_no_app);
                        return pg.f0.f21461a;
                    }
                };
                jVar3.C(objG19);
            }
            jVar3.B();
            r3<Uri> r3Var22 = r3Var5;
            d.a aVar10 = aVar3;
            eh.l<Uri, pg.f0> lVar5 = lVar3;
            x0.j jVar5 = jVar;
            t0.x0.c((eh.a) objG19, androidx.compose.foundation.layout.g.d(aVar3, 1.0f), false, h0.f.a(f10), null, null, null, f1.c.b(-310517287, new d(this.f11801v), jVar3), jVar5, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            jVar5.L(-1636138745);
            if (r3Var22.getValue() != null) {
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar10, f19), jVar5);
                androidx.compose.ui.d dVarD11 = androidx.compose.foundation.layout.g.d(aVar10, 1.0f);
                m1 m1VarA6 = k1.a(z.b.f34445b, bVar6, jVar5, 54);
                int iC10 = u1.c(jVar5);
                a2 a2VarY10 = jVar5.y();
                androidx.compose.ui.d dVarC11 = androidx.compose.ui.c.c(dVarD11, jVar5);
                e0.a aVarA10 = g.a.a();
                if (jVar5.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar5.r();
                if (jVar5.m()) {
                    jVar5.w(aVarA10);
                } else {
                    jVar5.z();
                }
                v1.j(g.a.c(), m1VarA6, jVar5);
                v1.j(g.a.e(), a2VarY10, jVar5);
                g.a.C0128a c0128aB10 = g.a.b();
                if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iC10))) {
                    l9.i.a(iC10, jVar5, iC10, c0128aB10);
                }
                v1.j(g.a.d(), dVarC11, jVar5);
                jVar5.L(-625115345);
                boolean zK7 = jVar5.K(r3Var22) | jVar5.K(lVar5);
                Object objG20 = jVar5.g();
                if (zK7 || objG20 == obj3) {
                    z13 = true;
                    objG20 = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.v(1, r3Var22, lVar5);
                    jVar5.C(objG20);
                } else {
                    z13 = true;
                }
                jVar5.B();
                t0.x0.d((eh.a) objG20, null, false, null, null, null, g9.a.f11668m, jVar, 805306368, 510);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar10, f19), jVar);
                jVar.L(-625099802);
                yVar2 = yVar;
                boolean zL14 = jVar.l(yVar2);
                Object objG21 = jVar.g();
                if (zL14 || objG21 == obj3) {
                    objG21 = new eh.a() { // from class: g9.i
                        @Override // eh.a
                        public final Object invoke() {
                            y yVar6 = yVar2;
                            l2 l2Var = yVar6.f11834h;
                            if (l2Var != null) {
                                l2Var.cancel((CancellationException) null);
                            }
                            yVar6.f11834h = null;
                            yVar6.f11844r.setValue(null);
                            sh.z0 z0Var = yVar6.f11845s;
                            z0Var.getClass();
                            z0Var.j(null, "");
                            l5.a aVarA11 = androidx.lifecycle.x0.a(yVar6);
                            wh.c cVar = z0.f21632a;
                            ph.h.c(aVarA11, wh.b.f31563c, null, new z(yVar6, null), 2);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG21);
                }
                jVar.B();
                t0.x0.d((eh.a) objG21, null, false, null, null, null, g9.a.f11669n, jVar, 805306368, 510);
                jVar5 = jVar;
                jVar5.H();
            } else {
                yVar2 = yVar;
                z13 = true;
            }
            jVar5.B();
            jVar5.H();
            jVar5.H();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar10, f22), jVar5);
            String strE = x.e(this.f11802w);
            jVar5.L(-795670230);
            if (strE == null) {
                obj4 = obj3;
                yVar3 = yVar2;
                aVar4 = aVar10;
                f12 = f22;
            } else {
                obj4 = obj3;
                f12 = f22;
                aVar4 = aVar10;
                yVar3 = yVar2;
                ff.b(strE, androidx.compose.foundation.layout.g.d(aVar10, 1.0f), b3.l.a(jVar5).f25777w, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, b3.l.b(jVar5).b(), jVar, 48, 0, 65016);
                jVar5 = jVar;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f10), jVar5);
                pg.f0 f0Var5 = pg.f0.f21461a;
            }
            jVar5.B();
            androidx.compose.ui.d dVarF3 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), 56);
            h0.e eVarA6 = h0.f.a(f18);
            g1 g1Var = t0.m0.f26400a;
            x0.j jVar6 = jVar5;
            t0.l0 l0VarA2 = t0.m0.a(b3.l.a(jVar5).d(), b3.l.a(jVar5).f25753b, 0L, jVar6, 12);
            g1 g1VarA = androidx.compose.foundation.layout.f.a(0);
            r3<Boolean> r3Var23 = this.f11803x;
            boolean z18 = !r3Var23.getValue().booleanValue();
            jVar6.L(-795655029);
            final y yVar6 = yVar3;
            final g9.b bVar7 = bVar2;
            final r3<Uri> r3Var24 = r3Var2;
            final r3<String> r3Var25 = r3Var;
            d.a aVar11 = aVar4;
            final i0 i0Var4 = i0Var;
            boolean zK8 = jVar6.K(r3Var20) | jVar6.l(yVar6) | jVar6.l(context5) | jVar6.K(bVar7) | jVar6.K(r3Var24) | jVar6.K(r3Var19) | jVar6.K(r3Var18) | jVar6.K(r3Var25) | jVar6.l(i0Var4) | jVar6.l(xVar5);
            Object objG22 = jVar6.g();
            if (zK8 || objG22 == obj4) {
                r3Var6 = r3Var23;
                obj5 = new eh.a() { // from class: g9.j
                    @Override // eh.a
                    public final Object invoke() {
                        boolean zA = mh.x.A((String) r3Var20.getValue());
                        y yVar7 = yVar6;
                        Context context6 = context5;
                        if (zA) {
                            yVar7.m(context6.getString(R.string.simple_build_error_name));
                        } else {
                            b bVar8 = b.f11690d;
                            b bVar9 = bVar7;
                            if (bVar9 == bVar8 && ((Uri) r3Var24.getValue()) == null) {
                                yVar7.m(context6.getString(R.string.pdf_required));
                            } else if (bVar9 == b.f11687a && ((Uri) r3Var19.getValue()) == null) {
                                yVar7.m(context6.getString(R.string.simple_build_error_content));
                            } else if (bVar9 == b.f11688b && mh.x.A((String) r3Var18.getValue())) {
                                yVar7.m(context6.getString(R.string.simple_build_error_content));
                            } else if (bVar9 == b.f11689c && mh.x.A((String) r3Var25.getValue())) {
                                yVar7.m(context6.getString(R.string.simple_build_error_content));
                            } else {
                                yVar7.m(null);
                                ph.h.c(i0Var4, null, null, new u.e(yVar7, xVar5, context6, null), 3);
                            }
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar6.C(obj5);
            } else {
                obj5 = objG22;
                r3Var6 = r3Var23;
            }
            jVar6.B();
            t0.x0.a((eh.a) obj5, dVarF3, z18, eVarA6, l0VarA2, null, null, g1VarA, f1.c.b(1840452230, new f(r3Var6), jVar6), jVar6, 817889328, 352);
            p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar11), f12), jVar6);
            jVar6.H();
            return;
        }
        obj = obj8;
        i12 = 1;
        objG3 = new vb(yVar5, i12);
        jVar.C(objG3);
        jVar.B();
        Object obj92 = obj;
        w9.a(strD, (eh.l) objG3, dVarD2, false, false, null, null, f1.c.b(-1648776890, new g(r3Var11), jVar), null, null, null, null, false, null, null, null, true, 1, 0, eVarA2, null, jVar, 12583296, 113246208, 5898104);
        float f192 = 4;
        ff.b(pd.d.a(aVar5, f192, jVar, R.string.simple_build_package_help, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).b(), jVar, 0, 0, 65530);
        ff.b(pd.d.a(aVar5, f14, jVar, R.string.simple_build_content_source, jVar), null, b3.l.a(jVar).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar).a(), jVar, 0, 0, 65530);
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f15), jVar);
        androidx.compose.ui.d dVarD32 = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
        m1 m1VarA7 = k1.a(z.b.h(f15), d.a.f14611j, jVar, 6);
        int iC22 = u1.c(jVar);
        a2 a2VarY22 = jVar.y();
        androidx.compose.ui.d dVarC32 = androidx.compose.ui.c.c(dVarD32, jVar);
        e0.a aVarA22 = g.a.a();
        if (jVar.t() != null) {
        }
    }

    @Override // eh.q
    public final /* bridge */ /* synthetic */ pg.f0 b(f1 f1Var, x0.j jVar, Integer num) {
        a(f1Var, jVar, num.intValue());
        return pg.f0.f21461a;
    }
}
