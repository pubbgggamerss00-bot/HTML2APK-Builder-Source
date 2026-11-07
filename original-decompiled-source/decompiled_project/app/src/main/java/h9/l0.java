package h9;

import android.content.Context;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import p0.n8;
import w1.d;

/* loaded from: classes.dex */
public final class l0 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f12710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12711b;

    public l0(z.f1 f1Var, Context context) {
        this.f12710a = f1Var;
        this.f12711b = context;
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
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.l(ph.m0.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.f976c, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), ph.m0.c(jVar2), true), CropImageView.DEFAULT_ASPECT_RATIO, this.f12710a.c() + 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7);
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
            h0.a(p0.q2.a(), f3.q.c(R.string.terms_title, jVar2), f3.o.c(jVar2).getStringArray(R.array.legal_terms_items), null, jVar2, 0, 8);
            w1.d dVarB = n8.f20960a;
            if (dVarB == null) {
                d.a aVar2 = new d.a("Filled.PrivacyTip", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(12.0f, 1.0f);
                eVar.f(3.0f, 5.0f);
                eVar.l(6.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
                eVar.c(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
                eVar.k(5.0f);
                p0.f0.a(eVar, 12.0f, 1.0f, 12.0f, 1.0f);
                p0.n.a(eVar, 11.0f, 7.0f, 2.0f, 2.0f);
                p0.b0.a(eVar, -2.0f, 7.0f, 11.0f, 11.0f);
                eVar.e(2.0f);
                eVar.l(6.0f);
                eVar.e(-2.0f);
                eVar.k(11.0f);
                eVar.a();
                d.a.a(aVar2, eVar.f31100a, 0, i2Var);
                dVarB = aVar2.b();
                n8.f20960a = dVarB;
            }
            h0.a(dVarB, f3.q.c(R.string.privacy_title, jVar2), f3.o.c(jVar2).getStringArray(R.array.legal_privacy_items), f1.c.b(-1340731733, new k0(this.f12711b), jVar2), jVar2, 3072, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
