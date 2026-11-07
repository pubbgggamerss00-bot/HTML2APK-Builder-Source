package h9;

import android.content.Context;
import android.text.Html;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.y6;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import p0.aa;
import p0.e8;
import p0.k4;
import p0.r9;
import p0.u5;
import s8.e2;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class w implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f12835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f12836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f12837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f12838d;

    public w(z.f1 f1Var, x0.l1 l1Var, p5.x xVar, Context context) {
        this.f12835a = f1Var;
        this.f12836b = l1Var;
        this.f12837c = xVar;
        this.f12838d = context;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            int i10 = 2;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.l(ph.m0.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.f976c, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), ph.m0.c(jVar2), true), CropImageView.DEFAULT_ASPECT_RATIO, this.f12835a.c() + 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7);
            z.q qVarA = z.o.a(z.b.h(16), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
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
            int i11 = 0;
            m.b(f3.q.c(R.string.howto_quick_start_title, jVar2), f3.q.c(R.string.howto_overview, jVar2), qg.p.j(f3.q.c(R.string.howto_quick_create, jVar2), f3.q.c(R.string.howto_quick_customize, jVar2), f3.q.c(R.string.howto_quick_build, jVar2)), jVar2, 0);
            x0.l1 l1Var = this.f12836b;
            int iG = l1Var.g();
            List listJ = qg.p.j(f3.q.c(R.string.howto_tab_apps, jVar2), f3.q.c(R.string.howto_tab_documents, jVar2), f3.q.c(R.string.howto_tab_publish, jVar2));
            jVar2.L(1640796693);
            boolean zK = jVar2.K(l1Var);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new t(l1Var, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            m.c(iG, listJ, (eh.l) objG, jVar2, 0);
            int iG2 = l1Var.g();
            final p5.x xVar = this.f12837c;
            if (iG2 == 0) {
                jVar2.L(-674750975);
                w1.d dVarB = p0.e.f20829a;
                if (dVarB == null) {
                    d.a aVar2 = new d.a("Filled.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = o0.d.a(12.0f, 2.0f);
                    eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
                    eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
                    eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
                    com.google.android.recaptcha.internal.e.c(eVarA, 17.0f, 13.0f, -4.0f, 4.0f);
                    eVarA.e(-2.0f);
                    eVarA.l(-4.0f);
                    eVarA.f(7.0f, 13.0f);
                    eVarA.l(-2.0f);
                    eVarA.e(4.0f);
                    eVarA.f(11.0f, 7.0f);
                    eVarA.e(2.0f);
                    eVarA.l(4.0f);
                    eVarA.e(4.0f);
                    eVarA.l(2.0f);
                    eVarA.a();
                    d.a.a(aVar2, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar2.b();
                    p0.e.f20829a = dVarB;
                }
                m.a(dVarB, k9.d.f16186h, f3.q.c(R.string.howto_group_build_title, jVar2), f3.q.c(R.string.howto_group_build_summary, jVar2), qg.p.j(f3.q.c(R.string.howto_create_body, jVar2), f3.q.c(R.string.howto_content_body, jVar2), f3.q.c(R.string.howto_advanced_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                w1.d dVarA = p0.l2.a();
                long j10 = k9.d.f16187i;
                String strC = f3.q.c(R.string.howto_templates_title, jVar2);
                String strC2 = f3.q.c(R.string.howto_templates_summary, jVar2);
                List listC = c0.g0.c(f3.q.c(R.string.howto_templates_body, jVar2));
                String strC3 = f3.q.c(R.string.howto_templates_action, jVar2);
                jVar2.L(1640838431);
                boolean zL = jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zL || objG2 == obj) {
                    objG2 = new eh.a() { // from class: h9.u
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.b0.f24632c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                m.a(dVarA, j10, strC, strC2, listC, strC3, (eh.a) objG2, jVar2, 0, 128);
                m.a(p0.x0.a(), k9.d.f16190l, f3.q.c(R.string.howto_group_output_title, jVar2), f3.q.c(R.string.howto_group_output_summary, jVar2), qg.p.j(f3.q.c(R.string.howto_preview_body, jVar2), f3.q.c(R.string.howto_output_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                jVar2.B();
                pg.f0 f0Var = pg.f0.f21461a;
            } else if (iG2 != 1) {
                jVar2.L(-671496192);
                w1.d dVarA2 = u5.a();
                long j11 = k9.d.f16191m;
                String strC4 = f3.q.c(R.string.howto_keystore_title, jVar2);
                String strC5 = f3.q.c(R.string.howto_keystore_summary, jVar2);
                List listC2 = c0.g0.c(f3.q.c(R.string.howto_keystore_body, jVar2));
                String strC6 = f3.q.c(R.string.howto_keystore_action, jVar2);
                jVar2.L(1640921593);
                boolean zL2 = jVar2.l(xVar);
                Object objG3 = jVar2.g();
                if (zL2 || objG3 == obj) {
                    objG3 = new v(xVar, i11);
                    jVar2.C(objG3);
                }
                jVar2.B();
                m.a(dVarA2, j11, strC4, strC5, listC2, strC6, (eh.a) objG3, jVar2, 0, 128);
                w1.d dVarA3 = aa.a();
                long j12 = k9.d.f16190l;
                String strC7 = f3.q.c(R.string.howto_publish_title, jVar2);
                String strC8 = f3.q.c(R.string.howto_publish_summary, jVar2);
                List listC3 = c0.g0.c(f3.q.c(R.string.howto_publish_body, jVar2));
                String strC9 = f3.q.c(R.string.howto_publish_action, jVar2);
                jVar2.L(1640941240);
                boolean zL3 = jVar2.l(xVar);
                Object objG4 = jVar2.g();
                if (zL3 || objG4 == obj) {
                    objG4 = new y6(xVar, i10);
                    jVar2.C(objG4);
                }
                jVar2.B();
                m.a(dVarA3, j12, strC7, strC8, listC3, strC9, (eh.a) objG4, jVar2, 0, 128);
                w1.d dVarA4 = r9.a();
                long j13 = k9.d.f16186h;
                String strC10 = f3.q.c(R.string.howto_playstore_signing_title, jVar2);
                String strC11 = f3.q.c(R.string.howto_playstore_signing_summary, jVar2);
                List listC4 = c0.g0.c(mh.x.W(Html.fromHtml(f3.q.c(R.string.howto_playstore_signing_body, jVar2), 63).toString()).toString());
                String strC12 = f3.q.c(R.string.howto_playstore_signing_action, jVar2);
                jVar2.L(1640969855);
                Object obj2 = this.f12838d;
                boolean zL4 = jVar2.l(obj2);
                Object objG5 = jVar2.g();
                if (zL4 || objG5 == obj) {
                    objG5 = new androidx.room.b0(obj2, 1);
                    jVar2.C(objG5);
                }
                jVar2.B();
                m.a(dVarA4, j13, strC10, strC11, listC4, strC12, (eh.a) objG5, jVar2, 0, 128);
                jVar2.B();
                pg.f0 f0Var2 = pg.f0.f21461a;
            } else {
                jVar2.L(-672868934);
                w1.d dVarA5 = p0.c3.a();
                long j14 = k9.d.f16188j;
                m.a(dVarA5, j14, f3.q.c(R.string.howto_group_html_title, jVar2), f3.q.c(R.string.howto_group_html_summary, jVar2), c0.g0.c(f3.q.c(R.string.howto_html_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                m.a(e8.a(), k9.d.f16187i, f3.q.c(R.string.howto_group_pdf_title, jVar2), f3.q.c(R.string.howto_group_pdf_summary, jVar2), c0.g0.c(f3.q.c(R.string.howto_pdf_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                m.a(k4.a(), j14, f3.q.c(R.string.howto_organize_title, jVar2), f3.q.c(R.string.howto_organize_summary, jVar2), c0.g0.c(f3.q.c(R.string.howto_organize_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                jVar2.B();
                pg.f0 f0Var3 = pg.f0.f21461a;
            }
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
