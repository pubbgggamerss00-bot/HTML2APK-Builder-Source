package h9;

import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.c8;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import p0.gc;
import p0.q8;
import p0.u5;
import p0.xb;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class s1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f12801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f12802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f12803c;

    public s1(z.f1 f1Var, x0.l1 l1Var, p5.x xVar) {
        this.f12801a = f1Var;
        this.f12802b = l1Var;
        this.f12803c = xVar;
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
            androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.f976c, 20, 8), ph.m0.c(jVar2), true);
            z.f1 f1Var = this.f12801a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.l(dVarE, CropImageView.DEFAULT_ASPECT_RATIO, f1Var.c(), CropImageView.DEFAULT_ASPECT_RATIO, f1Var.a(), 5)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7);
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
            int i10 = 0;
            m.b(f3.q.c(R.string.guide_hero_title, jVar2), f3.q.c(R.string.guide_hero_body, jVar2), qg.p.j(f3.q.c(R.string.guide_hero_prepare, jVar2), f3.q.c(R.string.guide_hero_test, jVar2), f3.q.c(R.string.guide_hero_publish, jVar2)), jVar2, 0);
            x0.l1 l1Var = this.f12802b;
            int iG = l1Var.g();
            List listJ = qg.p.j(f3.q.c(R.string.guide_tab_prepare, jVar2), f3.q.c(R.string.guide_tab_test, jVar2), f3.q.c(R.string.guide_tab_recovery, jVar2));
            jVar2.L(62347368);
            boolean zK = jVar2.K(l1Var);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new c8(l1Var, 2);
                jVar2.C(objG);
            }
            jVar2.B();
            m.c(iG, listJ, (eh.l) objG, jVar2, 0);
            int iG2 = l1Var.g();
            p5.x xVar = this.f12803c;
            if (iG2 == 0) {
                jVar2.L(1932927130);
                w1.d dVarB = p0.d.f20816a;
                if (dVarB == null) {
                    d.a aVar2 = new d.a("Filled.AccountCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = o0.d.a(12.0f, 2.0f);
                    eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
                    eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
                    eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
                    eVarA.a();
                    eVarA.h(12.0f, 6.0f);
                    eVarA.c(1.93f, CropImageView.DEFAULT_ASPECT_RATIO, 3.5f, 1.57f, 3.5f, 3.5f);
                    eVarA.i(13.93f, 13.0f, 12.0f, 13.0f);
                    eVarA.j(-3.5f, -1.57f, -3.5f, -3.5f);
                    eVarA.i(10.07f, 6.0f, 12.0f, 6.0f);
                    eVarA.a();
                    eVarA.h(12.0f, 20.0f);
                    eVarA.c(-2.03f, CropImageView.DEFAULT_ASPECT_RATIO, -4.43f, -0.82f, -6.14f, -2.88f);
                    eVarA.b(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
                    eVarA.j(4.45f, 0.8f, 6.14f, 2.12f);
                    eVarA.b(16.43f, 19.18f, 14.03f, 20.0f, 12.0f, 20.0f);
                    eVarA.a();
                    d.a.a(aVar2, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar2.b();
                    p0.d.f20816a = dVarB;
                }
                m.a(dVarB, k9.d.f16186h, f3.q.c(R.string.guide_group_account_title, jVar2), f3.q.c(R.string.guide_group_account_summary, jVar2), qg.p.j(f3.q.c(R.string.guide_step1_body, jVar2), f3.q.c(R.string.guide_step2_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                w1.d dVarA = u5.a();
                long j10 = k9.d.f16191m;
                String strC = f3.q.c(R.string.guide_group_key_title, jVar2);
                String strC2 = f3.q.c(R.string.guide_group_key_summary, jVar2);
                List listC = c0.g0.c(f3.q.c(R.string.guide_step3_body, jVar2));
                String strC3 = f3.q.c(R.string.howto_keystore_action, jVar2);
                jVar2.L(62386412);
                boolean zL = jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zL || objG2 == obj) {
                    objG2 = new q1(xVar, 0);
                    jVar2.C(objG2);
                }
                jVar2.B();
                m.a(dVarA, j10, strC, strC2, listC, strC3, (eh.a) objG2, jVar2, 0, 128);
                m.a(p0.l2.a(), k9.d.f16187i, f3.q.c(R.string.guide_group_listing_title, jVar2), f3.q.c(R.string.guide_group_listing_summary, jVar2), qg.p.j(f3.q.c(R.string.guide_step4_body, jVar2), f3.q.c(R.string.guide_step5_body, jVar2), f3.q.c(R.string.guide_step6_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                jVar2.B();
            } else if (iG2 != 1) {
                jVar2.L(1936139815);
                m.a(gc.a(), k9.d.f16191m, f3.q.c(R.string.guide_group_lost_key_title, jVar2), f3.q.c(R.string.guide_group_lost_key_summary, jVar2), c0.g0.c(f3.q.c(R.string.guide_step10_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                w1.d dVarA2 = p0.z2.a();
                long j11 = k9.d.f16188j;
                String strC4 = f3.q.c(R.string.guide_group_restore_title, jVar2);
                String strC5 = f3.q.c(R.string.guide_group_restore_summary, jVar2);
                List listC2 = c0.g0.c(f3.q.c(R.string.guide_step11_body, jVar2));
                String strC6 = f3.q.c(R.string.howto_keystore_action, jVar2);
                jVar2.L(62486796);
                boolean zL2 = jVar2.l(xVar);
                Object objG3 = jVar2.g();
                if (zL2 || objG3 == obj) {
                    objG3 = new r1(xVar, i10);
                    jVar2.C(objG3);
                }
                jVar2.B();
                m.a(dVarA2, j11, strC4, strC5, listC2, strC6, (eh.a) objG3, jVar2, 0, 128);
                jVar2.B();
            } else {
                jVar2.L(1934797980);
                w1.d dVarB2 = q8.f21002a;
                if (dVarB2 == null) {
                    d.a aVar3 = new d.a("Filled.Publish", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = w1.m.f31210a;
                    q1.i2 i2Var2 = new q1.i2(q1.b1.f21648b);
                    w1.e eVar = new w1.e();
                    eVar.h(5.0f, 4.0f);
                    eVar.l(2.0f);
                    eVar.e(14.0f);
                    p0.f0.a(eVar, 19.0f, 4.0f, 5.0f, 4.0f);
                    p0.n.a(eVar, 5.0f, 14.0f, 4.0f, 6.0f);
                    eVar.e(6.0f);
                    eVar.l(-6.0f);
                    eVar.e(4.0f);
                    p0.h.b(eVar, -7.0f, -7.0f, -7.0f, 7.0f);
                    d.a.a(aVar3, eVar.f31100a, 0, i2Var2);
                    dVarB2 = aVar3.b();
                    q8.f21002a = dVarB2;
                }
                m.a(dVarB2, k9.d.f16188j, f3.q.c(R.string.guide_group_test_title, jVar2), f3.q.c(R.string.guide_group_test_summary, jVar2), c0.g0.c(f3.q.c(R.string.guide_step7_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                m.a(xb.a(), k9.d.f16190l, f3.q.c(R.string.guide_group_review_title, jVar2), f3.q.c(R.string.guide_group_review_summary, jVar2), c0.g0.c(f3.q.c(R.string.guide_step8_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                m.a(xb.a(), k9.d.f16186h, f3.q.c(R.string.guide_group_update_title, jVar2), f3.q.c(R.string.guide_group_update_summary, jVar2), c0.g0.c(f3.q.c(R.string.guide_step9_body, jVar2)), null, null, jVar2, 0, BERTags.FLAGS);
                jVar2.B();
            }
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
