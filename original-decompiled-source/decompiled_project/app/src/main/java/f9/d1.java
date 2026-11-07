package f9;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l9.w;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w1.d;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f9265a = qg.p.j("<", ">", "/", "=", "\"", "'", "{", "}", "(", ")", "[", "]", ";", ":", ".", "#", "!", "-", "_", "&", "$", "`", "*", "+", "|", "@", "%", "?");

    /* renamed from: b, reason: collision with root package name */
    public static final List<ph> f9266b = qg.p.j(new ph(mh.x.y("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  <title>My App</title>\n</head>\n<body>\n\n</body>\n</html>", "<body>", 0, false, 6) + 7, "HTML5", "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  <title>My App</title>\n</head>\n<body>\n\n</body>\n</html>"), new ph(8, "<div>", "<div>\n  \n</div>"), new ph(3, "<p>", "<p></p>"), new ph(9, "<a>", "<a href=\"\"></a>"), new ph(10, "<img>", "<img src=\"\" alt=\"\">"), new ph(8, "<button>", "<button></button>"), new ph(11, "<script>", "<script>\n  \n</script>"), new ph(10, "<style>", "<style>\n  \n</style>"), new ph(5, "<!-- -->", "<!--  -->"));

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f9268b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9269c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f9270d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t0.e2 f9271e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9272f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f9273g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9274h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9275j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9276k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.a<pg.f0> aVar, boolean z10, eh.a<pg.f0> aVar2, boolean z11, t0.e2 e2Var, eh.a<pg.f0> aVar3, long j10, eh.l<? super String, pg.f0> lVar, eh.a<pg.f0> aVar4, eh.a<pg.f0> aVar5) {
            this.f9267a = aVar;
            this.f9268b = z10;
            this.f9269c = aVar2;
            this.f9270d = z11;
            this.f9271e = e2Var;
            this.f9272f = aVar3;
            this.f9273g = j10;
            this.f9274h = lVar;
            this.f9275j = aVar4;
            this.f9276k = aVar5;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(aVar, 48);
                b.j jVar3 = z.b.f34444a;
                f.b bVar = d.a.f14612k;
                z.m1 m1VarA = z.k1.a(jVar3, bVar, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar2);
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
                float f10 = 44;
                t0.s4.c(this.f9267a, androidx.compose.foundation.layout.g.n(aVar, f10), this.f9268b, null, f9.c.f9159t, jVar2, 196656, 24);
                t0.s4.c(this.f9269c, androidx.compose.foundation.layout.g.n(aVar, f10), this.f9270d, null, f9.c.f9160u, jVar2, 196656, 24);
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(aVar, 1), 24);
                t0.e2 e2Var = this.f9271e;
                z.g.a(androidx.compose.foundation.a.b(dVarF2, e2Var.B, q1.y1.f21750a), jVar2, 0);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(ph.m0.e(new LayoutWeightElement(1.0f, true), ph.m0.c(jVar2), false), 6, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                z.m1 m1VarA2 = z.k1.a(z.b.h(4), bVar, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
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
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                String strC = f3.q.c(R.string.editor_html_snippets_button, jVar2);
                long j10 = this.f9273g;
                d1.r(this.f9272f, strC, j10, q1.b1.c(0.16f, j10), false, f1.c.b(1935994092, new b1(j10), jVar2), jVar2, 196608, 16);
                jVar2.L(-1122823047);
                final eh.l<String, pg.f0> lVar = this.f9274h;
                boolean zK = jVar2.K(lVar);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new z0(lVar, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                d1.r((eh.a) objG, f3.q.c(R.string.editor_html_insert_tab, jVar2), 0L, 0L, false, f9.c.f9161v, jVar2, 196608, 28);
                d1.r(this.f9275j, f3.q.c(R.string.editor_html_caret_left, jVar2), 0L, 0L, true, f9.c.f9162w, jVar2, 221184, 12);
                d1.r(this.f9276k, f3.q.c(R.string.editor_html_caret_right, jVar2), 0L, 0L, true, f9.c.f9163x, jVar2, 221184, 12);
                jVar2.L(-1122797466);
                for (final String str : d1.f9265a) {
                    jVar2.L(-1342849670);
                    boolean zK2 = jVar2.K(lVar) | jVar2.K(str);
                    Object objG2 = jVar2.g();
                    if (zK2 || objG2 == obj) {
                        objG2 = new eh.a() { // from class: f9.a1
                            @Override // eh.a
                            public final Object invoke() {
                                lVar.invoke(str);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    d1.r((eh.a) objG2, str, 0L, 0L, false, f1.c.b(-661470190, new c1(e2Var, str), jVar2), jVar2, 196608, 28);
                }
                jVar2.B();
                jVar2.H();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f9277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9279c;

        public b(long j10, String str, eh.a<pg.f0> aVar) {
            this.f9277a = j10;
            this.f9278b = str;
            this.f9279c = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.f.h(aVar, 24), CropImageView.DEFAULT_ASPECT_RATIO, 360, 1);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarS, jVar2);
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
                long j10 = this.f9277a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.14f, j10), h0.f.f12083a);
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
                t0.t4.b(r0.x.a(), null, androidx.compose.foundation.layout.g.n(aVar, 28), j10, jVar2, 432, 0);
                jVar2.H();
                float f10 = 16;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
                t0.ff.b(this.f9278b, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26547j, jVar2, 0, 0, 65018);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
                t0.x0.b(this.f9279c, null, false, null, null, null, null, f9.c.f9164y, jVar2, 805306368, 510);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f9280a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f9281b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Integer num, eh.l<? super Integer, pg.f0> lVar) {
            this.f9280a = num;
            this.f9281b = lVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-1194292626);
                Integer num2 = this.f9280a;
                boolean zK = jVar2.K(num2);
                eh.l<Integer, pg.f0> lVar = this.f9281b;
                boolean zK2 = zK | jVar2.K(lVar);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    objG = new v1(num2, lVar);
                    jVar2.C(objG);
                }
                eh.a aVar = (eh.a) objG;
                jVar2.B();
                t0.x0.d(aVar, null, num2 != null, null, null, null, f9.c.B, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9282a;

        public d(eh.a<pg.f0> aVar) {
            this.f9282a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9282a, null, false, null, null, null, f9.c.C, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f9283a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f9284b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9285c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9286d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Integer num, eh.l<? super Integer, pg.f0> lVar, x0.n1<String> n1Var, int i10) {
            this.f9283a = num;
            this.f9284b = lVar;
            this.f9285c = n1Var;
            this.f9286d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                x0.n1<String> n1Var = this.f9285c;
                String value = n1Var.getValue();
                i0.h2 h2Var = new i0.h2(3, 2, 115);
                jVar2.L(-1194297618);
                final Integer num2 = this.f9283a;
                boolean zK = jVar2.K(num2);
                final eh.l<Integer, pg.f0> lVar = this.f9284b;
                boolean zK2 = zK | jVar2.K(lVar);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK2 || objG == obj) {
                    objG = new eh.l() { // from class: f9.w1
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            i0.f2 KeyboardActions = (i0.f2) obj2;
                            kotlin.jvm.internal.r.e(KeyboardActions, "$this$KeyboardActions");
                            Integer num3 = num2;
                            if (num3 != null) {
                                lVar.invoke(num3);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                i0.g2 g2Var = new i0.g2(null, (eh.l) objG, 61);
                h0.e eVarA = h0.f.a(12);
                jVar2.L(-1194309771);
                boolean zK3 = jVar2.K(n1Var);
                Object objG2 = jVar2.g();
                if (zK3 || objG2 == obj) {
                    objG2 = new b9.g(n1Var, 1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                t0.w9.a(value, (eh.l) objG2, null, false, false, null, f1.c.b(1739121303, new x1(this.f9286d), jVar2), null, null, null, null, null, false, null, h2Var, g2Var, true, 0, 0, eVarA, null, jVar2, 1572864, 12779520, 6062012);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9287a;

        public f(String str) {
            this.f9287a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.ff.b(this.f9287a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f9288a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f9289b;

        public g(w1.d dVar, long j10) {
            this.f9288a = dVar;
            this.f9289b = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.t4.b(this.f9288a, null, null, this.f9289b, jVar2, 48, 4);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0.e2 f9290a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f9291b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.p<String, Integer, pg.f0> f9292c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f9293d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f9294e;

        /* JADX WARN: Multi-variable type inference failed */
        public h(t0.e2 e2Var, boolean z10, eh.p<? super String, ? super Integer, pg.f0> pVar, long j10, x0.l1 l1Var) {
            this.f9290a = e2Var;
            this.f9291b = z10;
            this.f9292c = pVar;
            this.f9293d = j10;
            this.f9294e = l1Var;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            j.a.C0321a c0321a;
            eh.p<String, Integer, pg.f0> pVar;
            x0.l1 l1Var;
            eh.p<String, Integer, pg.f0> pVar2;
            j.a.C0321a c0321a2;
            int i10;
            long j10;
            float f10;
            t0.e2 e2Var;
            z.r ModalBottomSheet = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                float f11 = 16;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
                b.k kVar = z.b.f34446c;
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
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
                float f12 = 20;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, f12, 4);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 40);
                long j11 = this.f9293d;
                float f13 = 12;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.14f, j11), h0.f.a(f13));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                t0.t4.b(r0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 22), j11, jVar2, 432, 0);
                jVar2.H();
                androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.f.l(aVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
                int iD4 = jVar2.D();
                x0.a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarL2, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA2, jVar2);
                ph.v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                ph.v1.j(cVar, dVarC4, jVar2);
                boolean z10 = this.f9291b;
                String strC = f3.q.c(z10 ? R.string.editor_html_snippets_sheet_title : R.string.editor_html_snippets_button, jVar2);
                x0.s3 s3Var = t0.of.f26647a;
                t0.ff.b(strC, null, 0L, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var)).f26545h, jVar2, 196608, 0, 65502);
                String strC2 = f3.q.c(R.string.editor_html_snippets_sheet_subtitle, jVar2);
                t2.l0 l0Var = ((t0.nf) jVar2.f(s3Var)).f26549l;
                t0.e2 e2Var2 = this.f9290a;
                t0.ff.b(strC2, null, e2Var2.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.H();
                t0.ff.b(f3.q.c(R.string.editor_html_snippets_quick, jVar2), androidx.compose.foundation.layout.f.l(aVar, f12, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2, 4), e2Var2.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var)).f26550m, jVar2, 48, 0, 65528);
                float f14 = f11;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(ph.m0.e(androidx.compose.foundation.layout.g.d(aVar, 1.0f), ph.m0.c(jVar2), false), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                float f15 = 8;
                z.m1 m1VarA2 = z.k1.a(z.b.h(f15), d.a.f14611j, jVar2, 6);
                int iD5 = jVar2.D();
                x0.a2 a2VarY5 = jVar2.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarJ, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA2, jVar2);
                ph.v1.j(dVar, a2VarY5, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar2, iD5, c0128a);
                }
                ph.v1.j(cVar, dVarC5, jVar2);
                jVar2.L(-1395185565);
                Iterator<T> it = d1.f9266b.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c0321a = j.a.f31715a;
                    pVar = this.f9292c;
                    if (!zHasNext) {
                        break;
                    }
                    ph phVar = (ph) it.next();
                    jVar2.L(853833410);
                    boolean zK = jVar2.K(pVar) | jVar2.K(phVar);
                    Object objG = jVar2.g();
                    if (zK || objG == c0321a) {
                        objG = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.d(1, pVar, phVar);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    t0.d2.d((eh.a) objG, f1.c.b(214870243, new c4(phVar), jVar2), null, false, f1.c.b(-1370449536, new d4(j11), jVar2), h0.f.a(10), null, null, null, jVar2, 24624);
                    f15 = f15;
                    f14 = f14;
                }
                float f16 = f15;
                float f17 = f14;
                jVar2.B();
                jVar2.H();
                x0.l1 l1Var2 = this.f9294e;
                if (z10) {
                    jVar2.L(459949328);
                    int iG = l1Var2.g();
                    pVar2 = pVar;
                    androidx.compose.ui.d dVarL3 = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    f1.b bVarB = f1.c.b(1848915834, new e4(l1Var2), jVar2);
                    c0321a2 = c0321a;
                    j10 = j11;
                    l1Var = l1Var2;
                    i10 = 1;
                    f10 = f17;
                    t0.af.a(iG, dVarL3, 0L, 0L, null, null, bVarB, jVar2, 1572912, 60);
                    jVar2.B();
                    e2Var = e2Var2;
                } else {
                    l1Var = l1Var2;
                    pVar2 = pVar;
                    c0321a2 = c0321a;
                    i10 = 1;
                    j10 = j11;
                    f10 = f17;
                    jVar2.L(460838625);
                    e2Var = e2Var2;
                    t0.v2.a(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.5f, e2Var.B), jVar2, 6, 2);
                    jVar2.B();
                }
                List<f9.b> list = (z10 && l1Var.g() == i10) ? s4.f10483a : s4.f10484b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 460, i10);
                z.g1 g1Var = new z.g1(f10, f10, f10, f10);
                b.i iVarH = z.b.h(10);
                jVar2.L(-1093492466);
                final eh.p<String, Integer, pg.f0> pVar3 = pVar2;
                final long j12 = j10;
                boolean zL = jVar2.l(list) | jVar2.K(e2Var) | jVar2.K(pVar3) | jVar2.j(j12);
                Object objG2 = jVar2.g();
                if (zL || objG2 == c0321a2) {
                    final List<f9.b> list2 = list;
                    final t0.e2 e2Var3 = e2Var;
                    eh.l lVar = new eh.l() { // from class: f9.b4
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            b0.j0 LazyColumn = (b0.j0) obj;
                            kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                            List list3 = list2;
                            LazyColumn.d(list3.size(), null, new i4(h4.f9761a, list3), new f1.b(-632812321, true, new j4(list3, e2Var3, pVar3, j12)));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(lVar);
                    objG2 = lVar;
                }
                jVar2.B();
                b0.d.a(dVarH, null, g1Var, iVarH, null, null, false, null, (eh.l) objG2, jVar2, 24966, 490);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9295a;

        public i(eh.a<pg.f0> aVar) {
            this.f9295a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9295a, null, false, null, null, null, f9.c.f9165z, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w.a f9296a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f9297b;

        public j(w.a aVar, long j10) {
            this.f9296a = aVar;
            this.f9297b = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                w.a aVar = this.f9296a;
                w1.d dVarA = aVar == null ? r0.t0.a() : !aVar.f16909a.isEmpty() ? r0.x.a() : !aVar.f16910b.isEmpty() ? r0.v0.a() : r0.i.a();
                jVar2.L(1288520186);
                long j10 = (aVar == null || aVar.f16909a.isEmpty()) ? this.f9297b : ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w;
                jVar2.B();
                t0.t4.b(dVarA, null, null, j10, jVar2, 48, 4);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w.a f9298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f9299b;

        public k(w.a aVar, long j10) {
            this.f9298a = aVar;
            this.f9299b = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                w.a aVar2 = this.f9298a;
                if (aVar2 == null) {
                    jVar2.L(1289667670);
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                    g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                    int iD = jVar2.D();
                    x0.a2 a2VarY = jVar2.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar3);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                    ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar2, iD, c0128a);
                    }
                    ph.v1.j(g.a.f13865d, dVarC, jVar2);
                    t0.z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 29, this.f9299b, 0L, null, jVar2);
                    jVar2.H();
                    jVar2.B();
                } else if (aVar2.f16909a.isEmpty() && aVar2.f16910b.isEmpty()) {
                    jVar2.L(1289873324);
                    t0.ff.b(f3.q.c(R.string.editor_html_integrity_ok, jVar2), androidx.compose.foundation.layout.g.d(aVar, 1.0f), 0L, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, null, jVar2, 48, 0, 130556);
                    jVar2.B();
                } else {
                    jVar2.L(1290036353);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 360, 1);
                    b.i iVarH = z.b.h(8);
                    jVar2.L(1288543523);
                    boolean zL = jVar2.l(aVar2);
                    Object objG = jVar2.g();
                    if (zL || objG == j.a.f31715a) {
                        objG = new k4(aVar2);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    b0.d.a(dVarH, null, null, iVarH, null, null, false, null, (eh.l) objG, jVar2, 24582, 494);
                    jVar2.B();
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final boolean z10, final boolean z11, final long j10, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.a<pg.f0> aVar3, final eh.a<pg.f0> aVar4, final eh.a<pg.f0> aVar5, final eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1959781978);
        if (((i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.c(z11) ? 32 : 16) | (kVarP.j(j10) ? 256 : 128) | (kVarP.l(aVar3) ? 131072 : 65536) | (kVarP.l(lVar) ? 67108864 : 33554432)) & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            t0.md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), null, e2Var.F, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-495513121, new a(aVar, z10, aVar2, z11, e2Var, aVar3, j10, lVar, aVar4, aVar5), kVarP), kVarP, 12582918, 122);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, z11, j10, aVar, aVar2, aVar3, aVar4, aVar5, lVar, i10) { // from class: f9.r0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f10339a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f10340b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f10341c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f10342d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f10343e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f10344f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f10345g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f10346h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.l f10347j;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(14183425);
                    d1.a(this.f10339a, this.f10340b, this.f10341c, this.f10342d, this.f10343e, this.f10344f, this.f10345g, this.f10346h, this.f10347j, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final String str, final eh.l lVar, final String str2, final androidx.compose.ui.d dVar, final w1.d dVar2, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-69891364);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.K(dVar) ? 2048 : 1024) | (kVarP.K(dVar2) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            kVar = kVarP;
            i0.q.a(str, lVar, dVar, false, false, new t2.l0(e2Var.f25771q, f3.u.c(14), null, x2.f.f32016c, 0L, 0, 0L, 16777180), null, null, true, 0, 0, null, null, null, new q1.i2(e2Var.f25751a), f1.c.b(195550361, new e1(e2Var, dVar2, str, str2), kVarP), kVar, (i11 & 14) | 100663296 | (i11 & 112) | ((i11 >> 3) & 896), 196608, 16088);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, str2, dVar, dVar2, i10) { // from class: f9.w0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10822a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10823b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10824c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f10825d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ w1.d f10826e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d1.b(this.f10822a, this.f10823b, this.f10824c, this.f10825d, this.f10826e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final int i10, final long j10, final eh.a aVar, final String str, x0.j jVar) {
        x0.k kVarP = jVar.p(1321562552);
        if (((i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 24;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.f976c, f10);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
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
            t0.md.a(null, h0.f.a(f10), ((t0.e2) kVarP.f(t0.f2.f25858a)).G, 0L, 2, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-293949641, new b(j10, str, aVar), kVarP), kVarP, 12607488, 105);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, j10, aVar, str) { // from class: f9.q0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10267a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f10268b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f10269c;

                {
                    this.f10267a = str;
                    this.f10268b = j10;
                    this.f10269c = aVar;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d1.c(f3.i.n(1), this.f10268b, this.f10269c, this.f10267a, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final boolean z10, final long j10, final boolean z11, final boolean z12, final float f10, final eh.a aVar, final eh.a aVar2, final eh.a aVar3, final eh.a aVar4, final eh.l lVar, final eh.a aVar5, final eh.a aVar6, final eh.a aVar7, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-125477537);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.c(z11) ? 256 : 128) | (kVarP.c(z12) ? 2048 : 1024) | (kVarP.h(f10) ? 16384 : 8192) | (kVarP.l(aVar) ? 131072 : 65536) | (kVarP.l(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(aVar3) ? 8388608 : 4194304) | (kVarP.l(aVar4) ? 67108864 : 33554432) | (kVarP.l(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i12 = (kVarP.l(aVar5) ? (char) 4 : (char) 2) | (kVarP.l(aVar6) ? ' ' : (char) 16) | (kVarP.l(aVar7) ? (char) 256 : (char) 128);
        if ((306783379 & i11) == 306783378 && (i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar8 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar8);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(1757808940);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            Object objA = p0.h.a(kVarP, false, 1757810969);
            if (objA == c0321a) {
                objA = new l(n1Var, 0);
                kVarP.C(objA);
            }
            kVarP.T(false);
            t0.s4.c((eh.a) objA, null, z10, null, f9.c.f9146g, kVarP, ((i11 << 6) & 896) | 196614, 26);
            boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
            kVarP.L(1757819834);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new w(n1Var, 0);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            t0.w.a(zBooleanValue, (eh.a) objG2, null, 0L, null, null, h0.f.a(16), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1284424172, new q1(aVar7, aVar, aVar2, aVar5, aVar6, aVar3, aVar4, n1Var, z11, z12, f10, lVar, j10), kVarP), kVarP, 48, 48, 1980);
            kVarP = kVarP;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, j10, z11, z12, f10, aVar, aVar2, aVar3, aVar4, lVar, aVar5, aVar6, aVar7, i10) { // from class: f9.h0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f9738a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f9739b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f9740c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f9741d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f9742e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f9743f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f9744g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f9745h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.a f9746j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.l f9747k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.a f9748l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.a f9749m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.a f9750n;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d1.d(this.f9738a, this.f9739b, this.f9740c, this.f9741d, this.f9742e, this.f9743f, this.f9744g, this.f9745h, this.f9746j, this.f9747k, this.f9748l, this.f9749m, this.f9750n, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final String str, final eh.l lVar, final String str2, final eh.l lVar2, final boolean z10, final eh.a aVar, final int i10, final int i11, final long j10, final boolean z11, final eh.a aVar2, final eh.a aVar3, final eh.a aVar4, final eh.a aVar5, final eh.a aVar6, x0.j jVar, final int i12) {
        x0.k kVarP = jVar.p(2048614021);
        int i13 = i12 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.c(z10) ? 16384 : 8192) | (kVarP.l(aVar) ? 131072 : 65536) | (kVarP.i(i10) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.i(i11) ? 8388608 : 4194304) | (kVarP.j(j10) ? 67108864 : 33554432) | (kVarP.c(z11) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i14 = (kVarP.l(aVar2) ? (char) 4 : (char) 2) | (kVarP.l(aVar3) ? ' ' : (char) 16) | (kVarP.l(aVar4) ? 256 : 128) | (kVarP.l(aVar5) ? 2048 : 1024) | (kVarP.l(aVar6) ? (char) 16384 : (char) 8192);
        if ((i13 & 306783379) == 306783378 && (i14 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            t0.md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), null, e2Var.I, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1533406752, new t1(z10, aVar, str, lVar, i10, i11, e2Var, aVar2, aVar3, aVar6, j10, str2, lVar2, aVar4, z11, aVar5), kVarP), kVarP, 12582918, 122);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, str2, lVar2, z10, aVar, i10, i11, j10, z11, aVar2, aVar3, aVar4, aVar5, aVar6, i12) { // from class: f9.s0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10458a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10459b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10460c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10461d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f10462e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f10463f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f10464g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f10465h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f10466j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f10467k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.a f10468l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.a f10469m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.a f10470n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ eh.a f10471p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ eh.a f10472q;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d1.e(this.f10458a, this.f10459b, this.f10460c, this.f10461d, this.f10462e, this.f10463f, this.f10464g, this.f10465h, this.f10466j, this.f10467k, this.f10468l, this.f10469m, this.f10470n, this.f10471p, this.f10472q, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final int i10, final int i11, final int i12, final int i13, final w.a aVar, final long j10, final eh.a<pg.f0> aVar2, x0.j jVar, final int i14) {
        boolean z10;
        long j11;
        long j12;
        int i15;
        String strA;
        x0.k kVarP = jVar.p(-102490380);
        if (((i14 | (kVarP.i(i10) ? 4 : 2) | (kVarP.i(i11) ? 32 : 16) | (kVarP.i(i12) ? 256 : 128) | (kVarP.i(i13) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.j(j10) ? 131072 : 65536) | (kVarP.l(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted)) & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            t0.v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.5f, e2Var.B), kVarP, 0, 3);
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), e2Var.I, q1.y1.f21750a), 12, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 10), 30);
            b.j jVar2 = z.b.f34444a;
            f.b bVar = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar2, bVar, kVarP, 48);
            int i16 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, kVarP);
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
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            String strD = f3.q.d(R.string.editor_html_status_position, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26552o;
            x2.p pVar = x2.p.f32032e;
            t0.ff.b(strD, null, e2Var.f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            String strA2 = m3.a.a("  ·  ", f3.q.d(R.string.editor_html_lines_characters, new Object[]{Integer.valueOf(i12), Integer.valueOf(i13)}, kVarP));
            t2.l0 l0Var2 = ((t0.nf) kVarP.f(s3Var)).f26552o;
            long j13 = e2Var.f25773s;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            t0.ff.b(strA2, new LayoutWeightElement(1.0f, true), j13, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, l0Var2, kVarP, 0, 3120, 55288);
            kVarP = kVarP;
            kVarP.L(-1406521440);
            if (aVar != null) {
                List<String> list = aVar.f16909a;
                int size = aVar.f16910b.size() + list.size();
                if (!list.isEmpty()) {
                    j12 = e2Var.f25777w;
                } else if (size > 0) {
                    j12 = e2Var.f25764j;
                } else {
                    j11 = j10;
                    float f10 = 4;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(e1.d.d(aVar3, h0.f.a(10)), false, null, null, aVar2, 7), 8, f10);
                    z.m1 m1VarA2 = z.k1.a(jVar2, bVar, kVarP, 48);
                    i15 = kVarP.P;
                    x0.a2 a2VarP2 = kVarP.P();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, kVarP);
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar4);
                    }
                    ph.v1.j(bVar2, m1VarA2, kVarP);
                    ph.v1.j(dVar, a2VarP2, kVarP);
                    if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                    }
                    ph.v1.j(cVar, dVarC2, kVarP);
                    long j14 = j11;
                    z10 = false;
                    t0.t4.b(size != 0 ? r0.i.a() : r0.v0.a(), null, androidx.compose.foundation.layout.g.n(aVar3, 14), j14, kVarP, 432, 0);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f10), kVarP);
                    if (size != 0) {
                        kVarP.L(-1181445340);
                        strA = f3.q.c(R.string.editor_html_valid, kVarP);
                        kVarP.T(false);
                    } else {
                        kVarP.L(-1181443135);
                        strA = f3.q.a(R.plurals.editor_html_issue_count, size, new Object[]{Integer.valueOf(size)}, kVarP);
                        kVarP.T(false);
                    }
                    t0.ff.b(strA, null, j14, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26552o, kVarP, 196608, 0, 65498);
                    kVarP = kVarP;
                    kVarP.T(true);
                }
                j11 = j12;
                float f102 = 4;
                androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(e1.d.d(aVar3, h0.f.a(10)), false, null, null, aVar2, 7), 8, f102);
                z.m1 m1VarA22 = z.k1.a(jVar2, bVar, kVarP, 48);
                i15 = kVarP.P;
                x0.a2 a2VarP22 = kVarP.P();
                androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarI2, kVarP);
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(bVar2, m1VarA22, kVarP);
                ph.v1.j(dVar, a2VarP22, kVarP);
                if (!kVarP.O) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                    ph.v1.j(cVar, dVarC22, kVarP);
                    if (size != 0) {
                    }
                    long j142 = j11;
                    z10 = false;
                    t0.t4.b(size != 0 ? r0.i.a() : r0.v0.a(), null, androidx.compose.foundation.layout.g.n(aVar3, 14), j142, kVarP, 432, 0);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, f102), kVarP);
                    if (size != 0) {
                    }
                    t0.ff.b(strA, null, j142, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26552o, kVarP, 196608, 0, 65498);
                    kVarP = kVarP;
                    kVarP.T(true);
                }
            } else {
                z10 = false;
            }
            kVarP.T(z10);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11, i12, i13, aVar, j10, aVar2, i14) { // from class: f9.p0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f10212a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f10213b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f10214c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f10215d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ w.a f10216e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f10217f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f10218g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(32769);
                    d1.f(this.f10212a, this.f10213b, this.f10214c, this.f10215d, this.f10216e, this.f10217f, this.f10218g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final String str, final String str2, final boolean z10, final long j10, final boolean z11, final eh.a aVar, final f1.b bVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1444646138);
        if (((i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.j(j10) ? 2048 : 1024) | (kVarP.c(z11) ? 16384 : 8192) | (kVarP.l(aVar) ? 131072 : 65536)) & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            t0.md.a(null, null, e2Var.f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 3, null, f1.c.b(-105517825, new u1(z11, j10, aVar, bVar, e2Var, str, z10, str2), kVarP), kVarP, 12779520, 91);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, z10, j10, z11, aVar, bVar, i10) { // from class: f9.o0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10145a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f10146b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10147c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f10148d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f10149e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f10150f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f1.b f10151g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1572865);
                    d1.g(this.f10145a, this.f10146b, this.f10147c, this.f10148d, this.f10149e, this.f10150f, this.f10151g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final int i10, final eh.a<pg.f0> aVar, final eh.l<? super Integer, pg.f0> lVar, x0.j jVar, final int i11) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-168814352);
        int i12 = i11 | (kVarP.i(i10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128);
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(-105096910);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new m0();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Integer numG = mh.s.g((String) n1Var.getValue());
            if (numG != null) {
                int iIntValue = numG.intValue();
                if (1 > iIntValue) {
                    numG = null;
                    kVar = kVarP;
                    t0.r.a(aVar, f1.c.b(-323081928, new c(numG, lVar), kVarP), null, f1.c.b(103472570, new d(aVar), kVarP), f9.c.D, f9.c.E, f1.c.b(-1404179331, new e(numG, lVar, n1Var, i10), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 3) & 14) | 1797168, 0, 16260);
                } else {
                    if (iIntValue > (i10 >= 1 ? i10 : 1)) {
                    }
                    kVar = kVarP;
                    t0.r.a(aVar, f1.c.b(-323081928, new c(numG, lVar), kVarP), null, f1.c.b(103472570, new d(aVar), kVarP), f9.c.D, f9.c.E, f1.c.b(-1404179331, new e(numG, lVar, n1Var, i10), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 3) & 14) | 1797168, 0, 16260);
                }
            }
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar, lVar, i11) { // from class: f9.n0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f10084a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f10085b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f10086c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d1.h(this.f10084a, this.f10085b, this.f10086c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0710  */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r15v16, types: [x0.j, x0.k] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [int] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final fg fgVar, final eh.a onBack, final eh.a aVar, final eh.a aVar2, final boolean z10, x0.j jVar, final int i10) {
        int i11;
        x0.n1 n1Var;
        Uri uri;
        j.a.C0321a c0321a;
        x0.n1 n1Var2;
        View view;
        boolean z11;
        final x0.n1 n1Var3;
        x0.n1 n1Var4;
        Context context;
        j.a.C0321a c0321a2;
        x0.n1 n1Var5;
        x0.n1 n1Var6;
        x0.n1 n1Var7;
        boolean z12;
        x0.n1 n1Var8;
        j.a.C0321a c0321a3;
        boolean z13;
        final boolean zBooleanValue;
        boolean zC;
        final x0.n1 n1Var9;
        Object objG;
        x0.n1 n1Var10;
        x0.n1 n1Var11;
        final x0.n1 n1Var12;
        final View view2;
        x0.n1 n1Var13;
        boolean zC2;
        Object obj;
        ?? r92;
        j.a.C0321a c0321a4;
        boolean z14;
        x0.n1 n1Var14;
        View view3;
        Context context2;
        Object objG2;
        j.a.C0321a c0321a5;
        x0.n1 n1Var15;
        Object objA;
        x0.n1 n1Var16;
        Object objA2;
        x0.n1 n1Var17;
        boolean zK;
        Object objG3;
        x0.l1 l1Var;
        x0.n1 n1Var18;
        x0.n1 n1Var19;
        x0.n1 n1Var20;
        x0.n1 n1Var21;
        x0.n1 n1Var22;
        boolean zK2;
        Uri uri2;
        ph.i0 i0Var;
        x0.n1 n1Var23;
        j.a.C0321a c0321a6;
        ?? r02;
        x0.j jVar2;
        final x0.n1 n1Var24;
        long j10;
        j.a.C0321a c0321a7;
        x0.n1 n1Var25;
        boolean z15;
        x0.k kVar;
        final fg viewModel = fgVar;
        kotlin.jvm.internal.r.e(viewModel, "viewModel");
        kotlin.jvm.internal.r.e(onBack, "onBack");
        x0.k kVarP = jVar.p(-610998633);
        int i12 = i10 | (kVarP.l(viewModel) ? 4 : 2) | (kVarP.l(onBack) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.l(aVar2) ? 2048 : 1024) | (kVarP.c(z10) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Context context3 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            View view4 = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
            Object objG4 = kVarP.g();
            j.a.C0321a c0321a8 = j.a.f31715a;
            if (objG4 == c0321a8) {
                x0.l0 l0Var = x0.o0.f31834a;
                x0.w2 w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG4 = w2Var;
            }
            ph.i0 i0Var2 = (ph.i0) objG4;
            long j11 = q8.o1.b(ProjectKind.HTML).f22292a;
            x0.n1 n1VarB = bg.b.b(viewModel.F, kVarP);
            kVarP.L(-575478800);
            Object objG5 = kVarP.g();
            if (objG5 == c0321a8) {
                i11 = i12;
                objG5 = bg.b.h(new y2.c0("", 0L, 6));
                kVarP.C(objG5);
            } else {
                i11 = i12;
            }
            final x0.n1 n1Var26 = (x0.n1) objG5;
            Object objA3 = p0.h.a(kVarP, false, -575476416);
            if (objA3 == c0321a8) {
                objA3 = bg.b.h("");
                kVarP.C(objA3);
            }
            final x0.n1 n1Var27 = (x0.n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, -575474539);
            if (objA4 == c0321a8) {
                objA4 = bg.b.h(new f9.j(0));
                kVarP.C(objA4);
            }
            final x0.n1 n1Var28 = (x0.n1) objA4;
            Object objA5 = p0.h.a(kVarP, false, -575472190);
            if (objA5 == c0321a8) {
                objA5 = bg.b.h(Boolean.TRUE);
                kVarP.C(objA5);
            }
            x0.n1 n1Var29 = (x0.n1) objA5;
            Object objA6 = p0.h.a(kVarP, false, -575470461);
            if (objA6 == c0321a8) {
                objA6 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA6);
            }
            x0.n1 n1Var30 = (x0.n1) objA6;
            Object objA7 = p0.h.a(kVarP, false, -575468661);
            if (objA7 == c0321a8) {
                objA7 = bg.b.h(null);
                kVarP.C(objA7);
            }
            x0.n1 n1Var31 = (x0.n1) objA7;
            kVarP.T(false);
            Object[] objArr = new Object[0];
            kVarP.L(-575465830);
            Object objG6 = kVarP.g();
            if (objG6 == c0321a8) {
                objG6 = new y0(0);
                kVarP.C(objG6);
            }
            kVarP.T(false);
            x0.n1 n1Var32 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG6, kVarP, 3072, 6);
            kVarP.L(-575464263);
            Object objG7 = kVarP.g();
            if (objG7 == c0321a8) {
                objG7 = bg.b.h(null);
                kVarP.C(objG7);
            }
            x0.n1 n1Var33 = (x0.n1) objG7;
            kVarP.T(false);
            Object[] objArr2 = new Object[0];
            kVarP.L(-575460902);
            Object objG8 = kVarP.g();
            if (objG8 == c0321a8) {
                objG8 = new x(0);
                kVarP.C(objG8);
            }
            kVarP.T(false);
            x0.n1 n1Var34 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG8, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(-575458758);
            Object objG9 = kVarP.g();
            if (objG9 == c0321a8) {
                objG9 = new a0();
                kVarP.C(objG9);
            }
            kVarP.T(false);
            final x0.n1 n1Var35 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG9, kVarP, 3072, 6);
            Object[] objArr4 = new Object[0];
            kVarP.L(-575456454);
            Object objG10 = kVarP.g();
            if (objG10 == c0321a8) {
                objG10 = new b0(0);
                kVarP.C(objG10);
            }
            kVarP.T(false);
            final x0.n1 n1Var36 = (x0.n1) b0.a0.d(objArr4, null, (eh.a) objG10, kVarP, 3072, 6);
            Object[] objArr5 = new Object[0];
            kVarP.L(-575452678);
            Object objG11 = kVarP.g();
            if (objG11 == c0321a8) {
                objG11 = new c0();
                kVarP.C(objG11);
            }
            kVarP.T(false);
            x0.n1 n1Var37 = (x0.n1) b0.a0.d(objArr5, null, (eh.a) objG11, kVarP, 3072, 6);
            Object[] objArr6 = new Object[0];
            kVarP.L(-575450374);
            Object objG12 = kVarP.g();
            if (objG12 == c0321a8) {
                objG12 = new d0();
                kVarP.C(objG12);
            }
            kVarP.T(false);
            x0.n1 n1Var38 = (x0.n1) b0.a0.d(objArr6, null, (eh.a) objG12, kVarP, 3072, 6);
            Object[] objArr7 = new Object[0];
            kVarP.L(-575448263);
            Object objG13 = kVarP.g();
            if (objG13 == c0321a8) {
                objG13 = new e0();
                kVarP.C(objG13);
            }
            kVarP.T(false);
            x0.n1 n1Var39 = (x0.n1) b0.a0.d(objArr7, null, (eh.a) objG13, kVarP, 3072, 6);
            Object[] objArr8 = new Object[0];
            kVarP.L(-575446275);
            Object objG14 = kVarP.g();
            if (objG14 == c0321a8) {
                objG14 = new f0();
                kVarP.C(objG14);
            }
            kVarP.T(false);
            x0.k1 k1Var = (x0.k1) b0.a0.d(objArr8, null, (eh.a) objG14, kVarP, 3072, 6);
            Object[] objArr9 = new Object[0];
            kVarP.L(-575443910);
            Object objG15 = kVarP.g();
            if (objG15 == c0321a8) {
                objG15 = new g0();
                kVarP.C(objG15);
            }
            kVarP.T(false);
            x0.n1 n1Var40 = (x0.n1) b0.a0.d(objArr9, null, (eh.a) objG15, kVarP, 3072, 6);
            Object[] objArr10 = new Object[0];
            kVarP.L(-575441638);
            Object objG16 = kVarP.g();
            if (objG16 == c0321a8) {
                objG16 = new i0();
                kVarP.C(objG16);
            }
            kVarP.T(false);
            x0.n1 n1Var41 = (x0.n1) b0.a0.d(objArr10, null, (eh.a) objG16, kVarP, 3072, 6);
            Object[] objArr11 = new Object[0];
            kVarP.L(-575439529);
            Object objG17 = kVarP.g();
            if (objG17 == c0321a8) {
                objG17 = new m();
                kVarP.C(objG17);
            }
            kVarP.T(false);
            x0.n1 n1Var42 = (x0.n1) b0.a0.d(objArr11, null, (eh.a) objG17, kVarP, 3072, 6);
            Object[] objArr12 = new Object[0];
            kVarP.L(-575437513);
            Object objG18 = kVarP.g();
            if (objG18 == c0321a8) {
                objG18 = new n();
                kVarP.C(objG18);
            }
            kVarP.T(false);
            x0.n1 n1Var43 = (x0.n1) b0.a0.d(objArr12, null, (eh.a) objG18, kVarP, 3072, 6);
            Object[] objArr13 = new Object[0];
            kVarP.L(-575435335);
            Object objG19 = kVarP.g();
            if (objG19 == c0321a8) {
                objG19 = new o();
                kVarP.C(objG19);
            }
            kVarP.T(false);
            x0.l1 l1Var2 = (x0.l1) b0.a0.d(objArr13, null, (eh.a) objG19, kVarP, 3072, 6);
            kVarP.L(-575433693);
            Object objG20 = kVarP.g();
            if (objG20 == c0321a8) {
                objG20 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG20);
            }
            x0.n1 n1Var44 = (x0.n1) objG20;
            Object objA8 = p0.h.a(kVarP, false, -575431870);
            if (objA8 == c0321a8) {
                objA8 = new x0.v1(1);
                kVarP.C(objA8);
            }
            x0.l1 l1Var3 = (x0.l1) objA8;
            Object objA9 = p0.h.a(kVarP, false, -575430046);
            if (objA9 == c0321a8) {
                objA9 = new x0.v1(1);
                kVarP.C(objA9);
            }
            x0.l1 l1Var4 = (x0.l1) objA9;
            Object objA10 = p0.h.a(kVarP, false, -575428286);
            if (objA10 == c0321a8) {
                objA10 = new x0.v1(1);
                kVarP.C(objA10);
            }
            x0.l1 l1Var5 = (x0.l1) objA10;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-575426108);
            boolean zK3 = kVarP.K(n1Var37) | kVarP.l(context3) | kVarP.K(n1Var38) | kVarP.K(n1Var39) | kVarP.K(k1Var);
            Object objG21 = kVarP.g();
            if (zK3 || objG21 == c0321a8) {
                objG21 = new y1(n1Var37, context3, n1Var38, n1Var39, k1Var, null);
                n1Var = n1Var38;
                kVarP.C(objG21);
            } else {
                n1Var = n1Var38;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG21, f0Var, kVarP);
            Uri uri3 = (Uri) n1VarB.getValue();
            kVarP.L(-575407784);
            boolean zK4 = kVarP.K(n1VarB) | kVarP.l(context3) | kVarP.l(viewModel);
            Object objG22 = kVarP.g();
            if (zK4 || objG22 == c0321a8) {
                uri = uri3;
                c0321a = c0321a8;
                n1Var2 = n1Var32;
                view = view4;
                z11 = false;
                n1Var3 = n1VarB;
                g2 g2Var = new g2(context3, viewModel, n1Var3, n1Var31, n1Var29, n1Var26, n1Var27, n1Var28, null);
                n1Var4 = n1Var31;
                context = context3;
                viewModel = viewModel;
                kVarP.C(g2Var);
                objG22 = g2Var;
            } else {
                uri = uri3;
                n1Var4 = n1Var31;
                n1Var3 = n1VarB;
                c0321a = c0321a8;
                n1Var2 = n1Var32;
                view = view4;
                z11 = false;
                context = context3;
            }
            kVarP.T(z11);
            x0.o0.d((eh.p) objG22, uri, kVarP);
            final boolean z16 = (((Boolean) n1Var29.getValue()).booleanValue() || ((String) n1Var4.getValue()) != null) ? z11 : true;
            kVarP.L(-575357085);
            Object objG23 = kVarP.g();
            j.a.C0321a c0321a9 = c0321a;
            if (objG23 == c0321a9) {
                objG23 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG23);
            }
            final x0.n1 n1Var45 = (x0.n1) objG23;
            kVarP.T(z11);
            kVarP.L(-575355312);
            boolean zK5 = kVarP.K(n1Var3) | kVarP.c(z16) | kVarP.l(viewModel);
            Object objG24 = kVarP.g();
            if (zK5 || objG24 == c0321a9) {
                c0321a2 = c0321a9;
                final fg fgVar2 = viewModel;
                eh.a aVar3 = new eh.a() { // from class: f9.p
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        Uri uri4 = (Uri) n1Var3.getValue();
                        if (z16 && uri4 != null && !((Boolean) n1Var45.getValue()).booleanValue()) {
                            fgVar2.G = new r4(uri4, (y2.c0) n1Var26.getValue(), (String) n1Var27.getValue(), (j) n1Var28.getValue());
                        }
                        return pg.f0.f21461a;
                    }
                };
                n1Var5 = n1Var3;
                n1Var6 = n1Var27;
                n1Var7 = n1Var28;
                z12 = z16;
                n1Var45 = n1Var45;
                n1Var8 = n1Var26;
                viewModel = fgVar2;
                kVarP.C(aVar3);
                objG24 = aVar3;
            } else {
                c0321a2 = c0321a9;
                n1Var5 = n1Var3;
                n1Var7 = n1Var28;
                n1Var6 = n1Var27;
                z12 = z16;
                n1Var8 = n1Var26;
            }
            kVarP.T(z11);
            kVarP.u((eh.a) objG24);
            String str = ((y2.c0) n1Var8.getValue()).f33682a.f27761b;
            String str2 = (String) n1Var6.getValue();
            kVarP.L(-575347854);
            boolean zK6 = kVarP.K(str) | kVarP.K(str2);
            Object objG25 = kVarP.g();
            if (zK6) {
                c0321a3 = c0321a2;
            } else {
                c0321a3 = c0321a2;
                if (objG25 != c0321a3) {
                    z13 = true;
                }
                zBooleanValue = ((Boolean) objG25).booleanValue();
                kVarP.T(z11);
                String str3 = ((y2.c0) n1Var8.getValue()).f33682a.f27761b;
                Boolean boolValueOf = Boolean.valueOf(z12);
                kVarP.L(-575341782);
                zC = kVarP.c(z12);
                n1Var9 = n1Var45;
                objG = kVarP.g();
                if (!zC || objG == c0321a3) {
                    n1Var10 = n1Var4;
                    n1Var11 = n1Var33;
                    objG = new h2(z12, n1Var8, n1Var11, null);
                    kVarP.C(objG);
                } else {
                    n1Var10 = n1Var4;
                    n1Var11 = n1Var33;
                }
                kVarP.T(false);
                x0.o0.e(str3, boolValueOf, (eh.p) objG, kVarP);
                kVarP.L(-575328303);
                n1Var12 = n1Var2;
                view2 = view;
                n1Var13 = n1Var8;
                zC2 = ((i11 & 112) != 32 ? z13 : false) | kVarP.c(z12) | kVarP.c(zBooleanValue) | kVarP.K(n1Var12) | kVarP.l(viewModel) | kVarP.l(context) | kVarP.l(view2);
                Object objG26 = kVarP.g();
                if (!zC2 || objG26 == c0321a3) {
                    final boolean z17 = z12;
                    final Context context4 = context;
                    r92 = z13;
                    c0321a4 = c0321a3;
                    obj = new eh.a() { // from class: f9.q
                        @Override // eh.a
                        public final Object invoke() {
                            if (z17 && zBooleanValue) {
                                d1.o(n1Var12, true);
                            } else {
                                d1.j(viewModel, onBack, n1Var9, context4, view2);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    z14 = zBooleanValue;
                    n1Var14 = n1Var9;
                    view3 = view2;
                    n1Var12 = n1Var12;
                    z12 = z17;
                    context2 = context4;
                    kVarP.C(obj);
                } else {
                    n1Var14 = n1Var9;
                    c0321a4 = c0321a3;
                    obj = objG26;
                    context2 = context;
                    z14 = zBooleanValue;
                    view3 = view2;
                    r92 = z13;
                }
                kVarP.T(false);
                c.e.a(0, r92, (eh.a) obj, kVarP, false);
                kVarP.L(-575208556);
                objG2 = kVarP.g();
                c0321a5 = c0321a4;
                if (objG2 == c0321a5) {
                    objG2 = bg.b.h(qg.z.f22752a);
                    kVarP.C(objG2);
                }
                n1Var15 = (x0.n1) objG2;
                objA = p0.h.a(kVarP, false, -575206112);
                if (objA == c0321a5) {
                    objA = bg.b.h("");
                    kVarP.C(objA);
                }
                n1Var16 = (x0.n1) objA;
                objA2 = p0.h.a(kVarP, false, -575203997);
                if (objA2 == c0321a5) {
                    objA2 = bg.b.h(Boolean.FALSE);
                    kVarP.C(objA2);
                }
                n1Var17 = (x0.n1) objA2;
                kVarP.T(false);
                String str4 = ((y2.c0) n1Var13.getValue()).f33682a.f27761b;
                String str5 = (String) n1Var42.getValue();
                Boolean boolValueOf2 = Boolean.valueOf(((Boolean) n1Var40.getValue()).booleanValue());
                Context context5 = context2;
                kVarP.L(-575199663);
                zK = kVarP.K(n1Var42) | kVarP.K(n1Var40) | kVarP.K(l1Var2);
                objG3 = kVarP.g();
                if (!zK || objG3 == c0321a5) {
                    l1Var = l1Var2;
                    n1Var18 = n1Var40;
                    objG3 = new j2(n1Var42, n1Var18, n1Var15, n1Var16, n1Var13, n1Var17, l1Var, null);
                    n1Var19 = n1Var15;
                    n1Var20 = n1Var16;
                    n1Var13 = n1Var13;
                    n1Var21 = n1Var17;
                    n1Var22 = n1Var42;
                    kVarP.C(objG3);
                } else {
                    l1Var = l1Var2;
                    n1Var19 = n1Var15;
                    n1Var21 = n1Var17;
                    n1Var22 = n1Var42;
                    n1Var20 = n1Var16;
                    n1Var18 = n1Var40;
                }
                kVarP.T(false);
                x0.o0.f(str4, str5, boolValueOf2, (eh.p) objG3, kVarP);
                Uri uri4 = (Uri) n1Var5.getValue();
                kVarP.L(-575083427);
                zK2 = kVarP.K(uri4);
                Object objG27 = kVarP.g();
                if (!zK2 || objG27 == c0321a5) {
                    uri2 = (Uri) n1Var5.getValue();
                    if (uri2 != null) {
                        if (kotlin.jvm.internal.r.a(uri2.getScheme(), "content")) {
                            String lastPathSegment = uri2.getLastPathSegment();
                            String name = lastPathSegment != null ? mh.x.T(lastPathSegment, '/', lastPathSegment) : "";
                            kVarP.C(name);
                            objG27 = name;
                        } else {
                            String path = uri2.getPath();
                            if (path == null || (name = new File(path).getName()) == null) {
                            }
                            kVarP.C(name);
                            objG27 = name;
                        }
                    }
                }
                kVarP.T(false);
                View view5 = view3;
                x0.n1 n1Var46 = n1Var6;
                x0.n1 n1Var47 = n1Var7;
                x0.n1 n1Var48 = n1Var10;
                x0.n1 n1Var49 = n1Var18;
                x0.n1 n1Var50 = n1Var14;
                x0.n1 n1Var51 = n1Var11;
                y2 y2Var = new y2((String) objG27, z14, z12, j11, n1Var12, fgVar, context5, view5, onBack, n1Var29, n1Var48, n1Var30, n1Var44, n1Var50, n1Var49, n1Var41, aVar, z10, n1Var5, i0Var2, n1Var35, n1Var, n1Var39, k1Var, n1Var34, aVar2, n1Var13, n1Var46, n1Var47);
                boolean z18 = z12;
                x0.n1 n1Var52 = n1Var5;
                x0.n1 n1Var53 = n1Var12;
                x0.n1 n1Var54 = n1Var13;
                long j12 = j11;
                t0.ra.a(null, f1.c.b(1830619739, y2Var, kVarP), null, null, null, 0, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, new z.z(), f1.c.b(1397782118, new u3(j11, fgVar, context5, view5, onBack, n1Var29, n1Var48, n1Var50, n1Var52, z18, i0Var2, n1Var34, n1Var36, n1Var39, n1Var49, n1Var22, l1Var, n1Var43, n1Var41, n1Var19, n1Var44, n1Var54, n1Var20, n1Var47, n1Var21, n1Var, k1Var, n1Var30, n1Var46, l1Var3, l1Var4, l1Var5, n1Var51), kVarP), kVarP, 805306416, 189);
                x0.k kVar2 = kVarP;
                kVar2.L(-574776183);
                if (((Boolean) n1Var53.getValue()).booleanValue()) {
                    kVar2.L(-574774786);
                    boolean zK7 = kVar2.K(n1Var53);
                    Object objG28 = kVar2.g();
                    if (zK7 || objG28 == c0321a5) {
                        z15 = false;
                        objG28 = new r(n1Var53, 0);
                        kVar2.C(objG28);
                    } else {
                        z15 = false;
                    }
                    kVar2.T(z15);
                    n1Var23 = n1Var47;
                    j12 = j12;
                    i0Var = i0Var2;
                    c0321a6 = c0321a5;
                    r02 = z15;
                    t0.r.a((eh.a) objG28, f1.c.b(-1058027414, new b2(context5, view5, onBack, fgVar, i0Var2, n1Var53, n1Var52, n1Var50, n1Var30, n1Var54, n1Var46, z18), kVar2), null, f1.c.b(-570953688, new d2(context5, view5, onBack, fgVar, n1Var53, n1Var50), kVar2), f1.c.b(-327416825, new e2(j12), kVar2), f9.c.f9143d, f9.c.f9144e, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar2, 1797168, 0, 16260);
                    jVar2 = kVar2;
                } else {
                    i0Var = i0Var2;
                    n1Var23 = n1Var47;
                    c0321a6 = c0321a5;
                    r02 = 0;
                    jVar2 = kVar2;
                }
                jVar2.T(r02);
                jVar2.L(-574741706);
                if (((Boolean) n1Var34.getValue()).booleanValue()) {
                    jVar2.L(-574740054);
                    Object objG29 = jVar2.g();
                    c0321a7 = c0321a6;
                    if (objG29 == c0321a7) {
                        n1Var24 = n1Var54;
                        n1Var25 = n1Var51;
                        objG29 = new f2(n1Var25, n1Var24, null);
                        jVar2.C(objG29);
                    } else {
                        n1Var24 = n1Var54;
                        n1Var25 = n1Var51;
                    }
                    jVar2.T(r02);
                    x0.o0.d((eh.p) objG29, f0Var, jVar2);
                    w.a aVar4 = (w.a) n1Var25.getValue();
                    jVar2.L(-574733343);
                    boolean zK8 = jVar2.K(n1Var34);
                    Object objG30 = jVar2.g();
                    if (zK8 || objG30 == c0321a7) {
                        objG30 = new s(n1Var34, r02);
                        jVar2.C(objG30);
                    }
                    jVar2.T(r02);
                    long j13 = j12;
                    u(aVar4, j13, (eh.a) objG30, jVar2, 8);
                    j10 = j13;
                } else {
                    n1Var24 = n1Var54;
                    j10 = j12;
                    c0321a7 = c0321a6;
                }
                jVar2.T(r02);
                jVar2.L(-574731680);
                if (((Boolean) n1Var35.getValue()).booleanValue()) {
                    int iG = l1Var5.g();
                    jVar2.L(-574728615);
                    boolean zK9 = jVar2.K(n1Var35);
                    Object objG31 = jVar2.g();
                    if (zK9 || objG31 == c0321a7) {
                        objG31 = new t(n1Var35, r02);
                        jVar2.C(objG31);
                    }
                    eh.a aVar5 = (eh.a) objG31;
                    jVar2.T(r02);
                    jVar2.L(-574727108);
                    final ph.i0 i0Var3 = i0Var;
                    boolean zK10 = jVar2.K(n1Var35) | jVar2.l(i0Var3);
                    Object objG32 = jVar2.g();
                    if (zK10 || objG32 == c0321a7) {
                        objG32 = new eh.l() { // from class: f9.u
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                n1Var35.setValue(Boolean.FALSE);
                                x0.n1 n1Var55 = n1Var24;
                                ph.h.c(i0Var3, null, null, new v3(((y2.c0) n1Var55.getValue()).f33682a.f27761b, iIntValue, n1Var55, null), 3);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG32);
                    }
                    jVar2.T(r02);
                    h(iG, aVar5, (eh.l) objG32, jVar2, r02);
                }
                jVar2.T(r02);
                kVar = jVar2;
                if (((Boolean) n1Var36.getValue()).booleanValue()) {
                    boolean z19 = !z10;
                    jVar2.L(-574718786);
                    boolean zK11 = jVar2.K(n1Var36);
                    Object objG33 = jVar2.g();
                    if (zK11 || objG33 == c0321a7) {
                        objG33 = new v(n1Var36, r02);
                        jVar2.C(objG33);
                    }
                    eh.a aVar6 = (eh.a) objG33;
                    jVar2.T(r02);
                    jVar2.L(-574716975);
                    boolean zK12 = jVar2.K(n1Var36);
                    Object objG34 = jVar2.g();
                    if (zK12 || objG34 == c0321a7) {
                        final x0.n1 n1Var55 = n1Var23;
                        objG34 = new eh.p() { // from class: f9.y
                            @Override // eh.p
                            public final Object invoke(Object obj2, Object obj3) {
                                String code = (String) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                kotlin.jvm.internal.r.e(code, "code");
                                n1Var36.setValue(Boolean.FALSE);
                                d1.l(n1Var24, n1Var55, code, iIntValue);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG34);
                    }
                    jVar2.T(r02);
                    t(z19, j10, aVar6, (eh.p) objG34, jVar2, 0);
                    kVar = jVar2;
                }
            }
            z13 = true;
            objG25 = Boolean.valueOf(!kotlin.jvm.internal.r.a(((y2.c0) n1Var8.getValue()).f33682a.f27761b, (String) n1Var6.getValue()));
            kVarP.C(objG25);
            zBooleanValue = ((Boolean) objG25).booleanValue();
            kVarP.T(z11);
            String str32 = ((y2.c0) n1Var8.getValue()).f33682a.f27761b;
            Boolean boolValueOf3 = Boolean.valueOf(z12);
            kVarP.L(-575341782);
            zC = kVarP.c(z12);
            n1Var9 = n1Var45;
            objG = kVarP.g();
            if (zC) {
                n1Var10 = n1Var4;
                n1Var11 = n1Var33;
                objG = new h2(z12, n1Var8, n1Var11, null);
                kVarP.C(objG);
                kVarP.T(false);
                x0.o0.e(str32, boolValueOf3, (eh.p) objG, kVarP);
                kVarP.L(-575328303);
                n1Var12 = n1Var2;
                view2 = view;
                n1Var13 = n1Var8;
                zC2 = ((i11 & 112) != 32 ? z13 : false) | kVarP.c(z12) | kVarP.c(zBooleanValue) | kVarP.K(n1Var12) | kVarP.l(viewModel) | kVarP.l(context) | kVarP.l(view2);
                Object objG262 = kVarP.g();
                if (zC2) {
                    final boolean z172 = z12;
                    final Context context42 = context;
                    r92 = z13;
                    c0321a4 = c0321a3;
                    obj = new eh.a() { // from class: f9.q
                        @Override // eh.a
                        public final Object invoke() {
                            if (z172 && zBooleanValue) {
                                d1.o(n1Var12, true);
                            } else {
                                d1.j(viewModel, onBack, n1Var9, context42, view2);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    z14 = zBooleanValue;
                    n1Var14 = n1Var9;
                    view3 = view2;
                    n1Var12 = n1Var12;
                    z12 = z172;
                    context2 = context42;
                    kVarP.C(obj);
                    kVarP.T(false);
                    c.e.a(0, r92, (eh.a) obj, kVarP, false);
                    kVarP.L(-575208556);
                    objG2 = kVarP.g();
                    c0321a5 = c0321a4;
                    if (objG2 == c0321a5) {
                    }
                    n1Var15 = (x0.n1) objG2;
                    objA = p0.h.a(kVarP, false, -575206112);
                    if (objA == c0321a5) {
                    }
                    n1Var16 = (x0.n1) objA;
                    objA2 = p0.h.a(kVarP, false, -575203997);
                    if (objA2 == c0321a5) {
                    }
                    n1Var17 = (x0.n1) objA2;
                    kVarP.T(false);
                    String str42 = ((y2.c0) n1Var13.getValue()).f33682a.f27761b;
                    String str52 = (String) n1Var42.getValue();
                    Boolean boolValueOf22 = Boolean.valueOf(((Boolean) n1Var40.getValue()).booleanValue());
                    Context context52 = context2;
                    kVarP.L(-575199663);
                    zK = kVarP.K(n1Var42) | kVarP.K(n1Var40) | kVarP.K(l1Var2);
                    objG3 = kVarP.g();
                    if (zK) {
                        l1Var = l1Var2;
                        n1Var18 = n1Var40;
                        objG3 = new j2(n1Var42, n1Var18, n1Var15, n1Var16, n1Var13, n1Var17, l1Var, null);
                        n1Var19 = n1Var15;
                        n1Var20 = n1Var16;
                        n1Var13 = n1Var13;
                        n1Var21 = n1Var17;
                        n1Var22 = n1Var42;
                        kVarP.C(objG3);
                        kVarP.T(false);
                        x0.o0.f(str42, str52, boolValueOf22, (eh.p) objG3, kVarP);
                        Uri uri42 = (Uri) n1Var5.getValue();
                        kVarP.L(-575083427);
                        zK2 = kVarP.K(uri42);
                        Object objG272 = kVarP.g();
                        if (!zK2) {
                            uri2 = (Uri) n1Var5.getValue();
                            if (uri2 != null) {
                            }
                        }
                    }
                }
            }
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(onBack, aVar, aVar2, z10, i10) { // from class: f9.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f11044b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f11045c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f11046d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f11047e;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    d1.i(this.f11043a, this.f11044b, this.f11045c, this.f11046d, this.f11047e, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(fg fgVar, eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var, Context context, View view) {
        n1Var.setValue(Boolean.TRUE);
        fgVar.G = null;
        k(context, view);
        aVar.invoke();
    }

    public static final void k(Context context, View view) {
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void l(x0.n1<y2.c0> n1Var, x0.n1<f9.j> n1Var2, String str, int i10) {
        String str2 = n1Var.getValue().f33682a.f27761b;
        int iM = jh.j.m(t2.j0.e(n1Var.getValue().f33683b), 0, str2.length());
        String string = mh.x.M(str2, iM, jh.j.m(t2.j0.d(n1Var.getValue().f33683b), iM, str2.length()), str).toString();
        int i11 = iM + i10;
        y2.c0 c0Var = new y2.c0(string, t2.k0.a(i11, i11), 4);
        n1Var.setValue(c0Var);
        n1Var2.getValue().a(c0Var, true);
    }

    public static final void m(x0.n1<List<Integer>> n1Var, x0.l1 l1Var, x0.n1<y2.c0> n1Var2, x0.n1<String> n1Var3, int i10) {
        if (n1Var.getValue().isEmpty()) {
            return;
        }
        int size = (n1Var.getValue().size() + i10) % n1Var.getValue().size();
        l1Var.f(size);
        int iIntValue = n1Var.getValue().get(size).intValue();
        n1Var2.setValue(y2.c0.b(n1Var2.getValue(), null, t2.k0.a(iIntValue, n1Var3.getValue().length() + iIntValue), 5));
    }

    public static final boolean n(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final void o(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final boolean p(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(boolean z10, ph.i0 i0Var, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, fg fgVar, Context context, x0.n1 n1Var4, eh.a aVar) {
        Uri uri = (Uri) n1Var.getValue();
        if (!z10 || n(n1Var2) || uri == null) {
            return;
        }
        String str = ((y2.c0) n1Var3.getValue()).f33682a.f27761b;
        n1Var2.setValue(Boolean.TRUE);
        ph.h.c(i0Var, null, null, new z3(str, fgVar, context, aVar, uri, n1Var4, n1Var2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final eh.a aVar, final String str, long j10, long j11, boolean z10, final f1.b bVar, x0.j jVar, final int i10, final int i11) {
        boolean z11;
        long j12;
        long j13;
        long j14;
        t.v vVarA;
        boolean z12;
        Object objG;
        x0.k kVar;
        final long j15;
        final long j16;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(898035416);
        long j17 = j10;
        long j18 = j11;
        int i12 = (kVarP.l(aVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16) | (((i11 & 4) == 0 && kVarP.j(j17)) ? 256 : 128) | (((i11 & 8) == 0 && kVarP.j(j18)) ? 2048 : 1024);
        int i13 = i11 & 16;
        if (i13 == 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                i12 |= kVarP.c(z11) ? 16384 : 8192;
            }
            if ((74899 & i12) == 74898 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    if ((i11 & 4) != 0) {
                        j17 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q;
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        j18 = ((t0.e2) kVarP.f(t0.f2.f25858a)).H;
                        i12 &= -7169;
                    }
                    if (i13 == 0) {
                        j12 = j17;
                        j13 = j18;
                        z11 = false;
                    }
                    kVarP.U();
                    h0.e eVarA = h0.f.a(10);
                    long j19 = z11 ? q1.b1.f21653g : j13;
                    kVarP.L(-330378947);
                    if (z11) {
                        j14 = j13;
                        vVarA = a9.d2.a(1, ((t0.e2) kVarP.f(t0.f2.f25858a)).A);
                    } else {
                        j14 = j13;
                        vVarA = null;
                    }
                    t.v vVar = vVarA;
                    kVarP.T(false);
                    float f10 = 36;
                    androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.g.h(d.a.f1143b, f10, CropImageView.DEFAULT_ASPECT_RATIO, 2), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    kVarP.L(-330371698);
                    z12 = (i12 & 112) == 32;
                    objG = kVarP.g();
                    if (z12 || objG == j.a.f31715a) {
                        objG = new eh.l() { // from class: f9.u0
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                q2.d0 semantics = (q2.d0) obj;
                                kotlin.jvm.internal.r.e(semantics, "$this$semantics");
                                q2.a0.d(semantics, str);
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG);
                    }
                    kVarP.T(false);
                    kVar = kVarP;
                    t0.md.b(aVar, q2.q.a(dVarS, false, (eh.l) objG), false, eVarA, j19, j12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVar, null, f1.c.b(-1359428829, new a4(bVar), kVarP), kVar, (i12 & 14) | ((i12 << 9) & 458752), 708);
                    j15 = j14;
                    j16 = j12;
                } else {
                    kVarP.v();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                j12 = j17;
                j13 = j18;
                kVarP.U();
                h0.e eVarA2 = h0.f.a(10);
                if (z11) {
                }
                kVarP.L(-330378947);
                if (z11) {
                }
                t.v vVar2 = vVarA;
                kVarP.T(false);
                float f102 = 36;
                androidx.compose.ui.d dVarS2 = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.g.h(d.a.f1143b, f102, CropImageView.DEFAULT_ASPECT_RATIO, 2), f102, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                kVarP.L(-330371698);
                if ((i12 & 112) == 32) {
                }
                objG = kVarP.g();
                if (z12) {
                    objG = new eh.l() { // from class: f9.u0
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            q2.d0 semantics = (q2.d0) obj;
                            kotlin.jvm.internal.r.e(semantics, "$this$semantics");
                            q2.a0.d(semantics, str);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                    kVarP.T(false);
                    kVar = kVarP;
                    t0.md.b(aVar, q2.q.a(dVarS2, false, (eh.l) objG), false, eVarA2, j19, j12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVar2, null, f1.c.b(-1359428829, new a4(bVar), kVarP), kVar, (i12 & 14) | ((i12 << 9) & 458752), 708);
                    j15 = j14;
                    j16 = j12;
                }
            } else {
                kVarP.v();
                kVar = kVarP;
                j16 = j17;
                j15 = j18;
            }
            final boolean z13 = z11;
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: f9.v0
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d1.r(aVar, str, j16, j15, z13, bVar, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i12 |= 24576;
        z11 = z10;
        if ((74899 & i12) == 74898) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if ((i11 & 4) != 0) {
                }
                if ((i11 & 8) != 0) {
                }
                if (i13 == 0) {
                    j12 = j17;
                    j13 = j18;
                }
                kVarP.U();
                h0.e eVarA22 = h0.f.a(10);
                if (z11) {
                }
                kVarP.L(-330378947);
                if (z11) {
                }
                t.v vVar22 = vVarA;
                kVarP.T(false);
                float f1022 = 36;
                androidx.compose.ui.d dVarS22 = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.g.h(d.a.f1143b, f1022, CropImageView.DEFAULT_ASPECT_RATIO, 2), f1022, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                kVarP.L(-330371698);
                if ((i12 & 112) == 32) {
                }
                objG = kVarP.g();
                if (z12) {
                }
            }
        }
        final boolean z132 = z11;
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final w1.d dVar, final String str, long j10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10, final int i11) {
        final long j11;
        int i12;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(1788666720);
        int i13 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16);
        if ((i11 & 4) == 0) {
            j11 = j10;
            int i14 = kVarP.j(j11) ? 256 : 128;
            i12 = i13 | i14 | (!kVarP.l(aVar) ? 2048 : 1024);
            if ((i12 & 1171) == 1170 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    if ((i11 & 4) != 0) {
                        j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
                        i12 &= -897;
                    }
                    long j12 = j11;
                    kVarP.U();
                    t0.w.b(f1.c.b(914258320, new f(str), kVarP), aVar, null, f1.c.b(-539208147, new g(dVar, j12), kVarP), null, false, null, null, kVarP, ((i12 >> 6) & 112) | 3078, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    j11 = j12;
                } else {
                    kVarP.v();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    long j122 = j11;
                    kVarP.U();
                    t0.w.b(f1.c.b(914258320, new f(str), kVarP), aVar, null, f1.c.b(-539208147, new g(dVar, j122), kVarP), null, false, null, null, kVarP, ((i12 >> 6) & 112) | 3078, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    j11 = j122;
                }
            } else {
                kVarP.v();
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p(str, j11, aVar, i10, i11) { // from class: f9.x0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f10881b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f10882c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ eh.a f10883d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f10884e;

                    {
                        this.f10884e = i11;
                    }

                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iN = f3.i.n(1);
                        d1.s(this.f10880a, this.f10881b, this.f10882c, this.f10883d, (x0.j) obj, iN, this.f10884e);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        j11 = j10;
        i12 = i13 | i14 | (!kVarP.l(aVar) ? 2048 : 1024);
        if ((i12 & 1171) == 1170) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if ((i11 & 4) != 0) {
                }
                long j1222 = j11;
                kVarP.U();
                t0.w.b(f1.c.b(914258320, new f(str), kVarP), aVar, null, f1.c.b(-539208147, new g(dVar, j1222), kVarP), null, false, null, null, kVarP, ((i12 >> 6) & 112) | 3078, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                j11 = j1222;
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void t(final boolean z10, final long j10, final eh.a<pg.f0> aVar, final eh.p<? super String, ? super Integer, pg.f0> pVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-1818506492);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.l(pVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            t0.hb hbVarF = t0.p7.f(6, 2, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(-488262439);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new k0();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.l1 l1Var = (x0.l1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            kVar = kVarP;
            t0.p7.a(aVar, null, hbVarF, CropImageView.DEFAULT_ASPECT_RATIO, null, e2Var.f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(-1561222623, new h(e2Var, z10, pVar, j10, l1Var), kVarP), kVar, (i11 >> 6) & 14, 4058);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, j10, aVar, pVar, i10) { // from class: f9.l0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f9967a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f9968b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f9969c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.p f9970d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d1.t(this.f9967a, this.f9968b, this.f9969c, this.f9970d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void u(final w.a aVar, final long j10, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(124877660);
        int i11 = i10 | (kVarP.l(aVar) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.r.a(aVar2, f1.c.b(-362449900, new i(aVar2), kVarP), null, null, f1.c.b(144981425, new j(aVar, j10), kVarP), f9.c.A, f1.c.b(483268975, new k(aVar, j10), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i11 >> 6) & 14) | 1794096, 0, 16268);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j10, aVar2, i10) { // from class: f9.j0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f9837b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f9838c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(9);
                    d1.u(this.f9836a, this.f9837b, this.f9838c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void v(String str, boolean z10, x0.j jVar, int i10) {
        w1.d dVarA;
        x0.k kVarP = jVar.p(1431674566);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2);
        int i12 = 18;
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            long j10 = z10 ? e2Var.f25777w : e2Var.f25764j;
            d.a aVar = d.a.f1143b;
            float f10 = 10;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(12)), q1.b1.c(0.08f, j10), q1.y1.f21750a), f10);
            z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14611j, kVarP, 54);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            if (z10) {
                dVarA = r0.x.a();
            } else {
                dVarA = r0.d0.f23014a;
                if (dVarA == null) {
                    d.a aVar3 = new d.a("Rounded.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i14 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = o0.d.a(12.0f, 2.0f);
                    eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
                    eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
                    eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
                    eVarA.a();
                    eVarA.h(12.0f, 17.0f);
                    eVarA.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                    eVarA.l(-4.0f);
                    eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                    eVarA.j(1.0f, 0.45f, 1.0f, 1.0f);
                    eVarA.l(4.0f);
                    eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                    p0.d0.a(eVarA, 13.0f, 9.0f, -2.0f);
                    b6.a.c(eVarA, 11.0f, 7.0f, 2.0f, 2.0f);
                    d.a.a(aVar3, eVarA.f31100a, 0, i2Var);
                    w1.d dVarB = aVar3.b();
                    r0.d0.f23014a = dVarB;
                    dVarA = dVarB;
                }
                i12 = 18;
            }
            t0.t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, i12), j10, kVarP, 432, 0);
            t2.l0 l0Var = ((t0.nf) kVarP.f(t0.of.f26647a)).f26548k;
            long j11 = e2Var.f25771q;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            t0.ff.b(str, new LayoutWeightElement(1.0f, true), j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i11 & 14, 0, 65528);
            kVarP = kVarP;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new t0(str, z10, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(x0.n1 n1Var, int i10) {
        String str = ((y2.c0) n1Var.getValue()).f33682a.f27761b;
        int iE = i10 < 0 ? t2.j0.e(((y2.c0) n1Var.getValue()).f33683b) : t2.j0.d(((y2.c0) n1Var.getValue()).f33683b);
        if (t2.j0.e(((y2.c0) n1Var.getValue()).f33683b) == t2.j0.d(((y2.c0) n1Var.getValue()).f33683b)) {
            iE = i10 < 0 ? iE > 0 ? Character.offsetByCodePoints(str, iE, -1) : 0 : iE < str.length() ? Character.offsetByCodePoints(str, iE, 1) : str.length();
        }
        n1Var.setValue(y2.c0.b((y2.c0) n1Var.getValue(), null, t2.k0.a(iE, iE), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(x0.n1 n1Var, x0.n1 n1Var2) {
        y2.c0 c0Var;
        f9.j jVar = (f9.j) n1Var.getValue();
        ArrayList arrayList = jVar.f9833b;
        if (arrayList.isEmpty()) {
            c0Var = null;
        } else {
            y2.c0 c0Var2 = (y2.c0) arrayList.remove(qg.p.i(arrayList));
            jVar.f9832a.add(c0Var2);
            jVar.b();
            jVar.f9834c = c0Var2.f33682a.f27761b;
            jVar.f9835d = System.currentTimeMillis();
            c0Var = c0Var2;
        }
        if (c0Var != null) {
            n1Var2.setValue(c0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(Context context, x0.k1 k1Var, x0.n1 n1Var, x0.n1 n1Var2) {
        boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
        boolean zP = p(n1Var2);
        float floatValue = k1Var.getFloatValue();
        kotlin.jvm.internal.r.e(context, "context");
        context.getSharedPreferences("html_editor_prefs", 0).edit().putBoolean("word_wrap", zBooleanValue).putBoolean("smart_typing", zP).putFloat("font_size", floatValue).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(x0.n1 n1Var, x0.n1 n1Var2) {
        y2.c0 c0Var;
        f9.j jVar = (f9.j) n1Var.getValue();
        ArrayList arrayList = jVar.f9832a;
        if (arrayList.size() <= 1) {
            c0Var = null;
        } else {
            jVar.f9833b.add((y2.c0) arrayList.remove(qg.p.i(arrayList)));
            y2.c0 c0Var2 = (y2.c0) qg.x.J(arrayList);
            jVar.f9834c = c0Var2.f33682a.f27761b;
            jVar.f9835d = System.currentTimeMillis();
            c0Var = c0Var2;
        }
        if (c0Var != null) {
            n1Var2.setValue(c0Var);
        }
    }
}
