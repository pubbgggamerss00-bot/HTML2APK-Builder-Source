package h9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.u9;
import p0.aa;
import p0.wa;
import s8.e2;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class e3 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f12604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12605b;

    public e3(p5.x xVar, Context context) {
        this.f12604a = xVar;
        this.f12605b = context;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r SettingsSection = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(SettingsSection, "$this$SettingsSection");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarB = n0.d.f18292a;
            if (dVarB == null) {
                d.a aVar = new d.a("AutoMirrored.Filled.Help", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVarA = o0.d.a(12.0f, 2.0f);
                eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
                eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
                eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
                com.google.android.recaptcha.internal.e.c(eVarA, 13.0f, 19.0f, -2.0f, -2.0f);
                eVarA.e(2.0f);
                eVarA.l(2.0f);
                eVarA.a();
                eVarA.h(15.07f, 11.25f);
                eVarA.g(-0.9f, 0.92f);
                eVarA.b(13.45f, 12.9f, 13.0f, 13.5f, 13.0f, 15.0f);
                eVarA.e(-2.0f);
                eVarA.l(-0.5f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.45f, -2.1f, 1.17f, -2.83f);
                eVarA.g(1.24f, -1.26f);
                eVarA.c(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                eVarA.j(-2.0f, 0.9f, -2.0f, 2.0f);
                eVarA.f(8.0f, 9.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
                eVarA.j(4.0f, 1.79f, 4.0f, 4.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f);
                eVarA.a();
                d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                dVarB = aVar.b();
                n0.d.f18292a = dVarB;
            }
            w1.d dVar = dVarB;
            String strC = f3.q.c(R.string.settings_how_to_use, jVar2);
            String strC2 = f3.q.c(R.string.settings_how_to_use_summary, jVar2);
            jVar2.L(-46479624);
            final p5.x xVar = this.f12604a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new eh.a() { // from class: h9.b3
                    @Override // eh.a
                    public final Object invoke() {
                        p5.x.c(e2.k.f24641c.f24627a, xVar);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v3.c(dVar, strC, strC2, false, false, null, (eh.a) objG, jVar2, 0, 56);
            v3.b(0, jVar2);
            w1.d dVarA = aa.a();
            String strC3 = f3.q.c(R.string.settings_play_store_guide, jVar2);
            String strC4 = f3.q.c(R.string.settings_play_store_guide_summary, jVar2);
            jVar2.L(-46466562);
            boolean zL2 = jVar2.l(xVar);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == obj) {
                objG2 = new c3(xVar, 0);
                jVar2.C(objG2);
            }
            jVar2.B();
            v3.c(dVarA, strC3, strC4, false, false, null, (eh.a) objG2, jVar2, 0, 56);
            v3.b(0, jVar2);
            w1.d dVarA2 = p0.f3.a();
            String strC5 = f3.q.c(R.string.settings_feedback, jVar2);
            String strC6 = f3.q.c(R.string.settings_feedback_summary, jVar2);
            jVar2.L(-46452379);
            final Context context = this.f12605b;
            boolean zL3 = jVar2.l(context);
            Object objG3 = jVar2.g();
            if (zL3 || objG3 == obj) {
                objG3 = new u9(context, 1);
                jVar2.C(objG3);
            }
            jVar2.B();
            v3.c(dVarA2, strC5, strC6, false, false, null, (eh.a) objG3, jVar2, 3072, 48);
            v3.b(0, jVar2);
            w1.d dVarB2 = wa.f21084a;
            if (dVarB2 == null) {
                d.a aVar2 = new d.a("Filled.StarRate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = w1.m.f31210a;
                q1.i2 i2Var2 = new q1.i2(q1.b1.f21648b);
                w1.e eVarA2 = n0.b.a(14.43f, 10.0f, -2.43f, -8.0f);
                eVarA2.g(-2.43f, 8.0f);
                eVarA2.g(-7.57f, CropImageView.DEFAULT_ASPECT_RATIO);
                eVarA2.g(6.18f, 4.41f);
                eVarA2.g(-2.35f, 7.59f);
                eVarA2.g(6.17f, -4.69f);
                eVarA2.g(6.18f, 4.69f);
                p0.h.b(eVarA2, -2.35f, -7.59f, 6.17f, -4.41f);
                d.a.a(aVar2, eVarA2.f31100a, 0, i2Var2);
                dVarB2 = aVar2.b();
                wa.f21084a = dVarB2;
            }
            String strC7 = f3.q.c(R.string.settings_rate_app, jVar2);
            String strC8 = f3.q.c(R.string.settings_rate_app_summary, jVar2);
            jVar2.L(-46438857);
            boolean zL4 = jVar2.l(context);
            Object objG4 = jVar2.g();
            if (zL4 || objG4 == obj) {
                objG4 = new eh.a() { // from class: h9.d3
                    @Override // eh.a
                    public final Object invoke() {
                        Context context2 = context;
                        kotlin.jvm.internal.r.e(context2, "context");
                        String packageName = context2.getPackageName();
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
                            intent.addFlags(1476395008);
                            context2.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                            intent2.addFlags(268435456);
                            context2.startActivity(intent2);
                        } catch (Exception e10) {
                            Log.e("InAppReviewHelper", "Could not open Play Store page", e10);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG4);
            }
            jVar2.B();
            v3.c(dVarB2, strC7, strC8, false, false, null, (eh.a) objG4, jVar2, 3072, 48);
        }
        return pg.f0.f21461a;
    }
}
