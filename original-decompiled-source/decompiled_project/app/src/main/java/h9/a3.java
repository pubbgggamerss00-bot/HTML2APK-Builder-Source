package h9;

import android.content.Context;
import android.text.format.Formatter;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import p0.u5;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class a3 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f12511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4 f12513c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Long> f12514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12515e;

    public a3(p5.x xVar, Context context, b4 b4Var, x0.r3<Long> r3Var, x0.n1<Boolean> n1Var) {
        this.f12511a = xVar;
        this.f12512b = context;
        this.f12513c = b4Var;
        this.f12514d = r3Var;
        this.f12515e = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        String strB;
        z.r SettingsSection = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(SettingsSection, "$this$SettingsSection");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarA = u5.a();
            String strC = f3.q.c(R.string.settings_keystore, jVar2);
            String strC2 = f3.q.c(R.string.settings_keystore_summary, jVar2);
            jVar2.L(-46534433);
            Object obj = this.f12511a;
            boolean zL = jVar2.l(obj);
            Object objG = jVar2.g();
            Object obj2 = j.a.f31715a;
            if (zL || objG == obj2) {
                objG = new y2(obj, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            v3.c(dVarA, strC, strC2, false, false, null, (eh.a) objG, jVar2, 0, 56);
            v3.b(0, jVar2);
            w1.d dVarB = p0.r1.f21009a;
            if (dVarB == null) {
                d.a aVar = new d.a("Filled.CleaningServices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(16.0f, 11.0f);
                eVar.e(-1.0f);
                eVar.k(3.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                eVar.e(-2.0f);
                eVar.b(9.9f, 1.0f, 9.0f, 1.9f, 9.0f, 3.0f);
                eVar.l(8.0f);
                eVar.d(8.0f);
                eVar.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, 2.24f, -5.0f, 5.0f);
                eVar.l(7.0f);
                eVar.e(18.0f);
                eVar.l(-7.0f);
                eVar.b(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f);
                com.google.android.recaptcha.internal.e.c(eVar, 19.0f, 21.0f, -2.0f, -3.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                eVar.j(-1.0f, 0.45f, -1.0f, 1.0f);
                eVar.l(3.0f);
                eVar.e(-2.0f);
                eVar.l(-3.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                eVar.j(-1.0f, 0.45f, -1.0f, 1.0f);
                eVar.l(3.0f);
                eVar.d(9.0f);
                eVar.l(-3.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                eVar.j(-1.0f, 0.45f, -1.0f, 1.0f);
                eVar.l(3.0f);
                eVar.d(5.0f);
                eVar.l(-5.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
                eVar.e(8.0f);
                eVar.c(1.65f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, 1.35f, 3.0f, 3.0f);
                eVar.k(21.0f);
                eVar.a();
                d.a.a(aVar, eVar.f31100a, 0, i2Var);
                dVarB = aVar.b();
                p0.r1.f21009a = dVarB;
            }
            w1.d dVar = dVarB;
            String strC3 = f3.q.c(R.string.settings_clear_cache, jVar2);
            x0.r3<Long> r3Var = this.f12514d;
            long jLongValue = r3Var.getValue().longValue();
            final Context context = this.f12512b;
            if (jLongValue > 0) {
                jVar2.L(-1442219074);
                strB = f3.q.d(R.string.settings_clear_cache_size, new Object[]{Formatter.formatShortFileSize(context, r3Var.getValue().longValue())}, jVar2);
                jVar2.B();
            } else {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -1442058928, R.string.settings_clear_cache_empty, jVar2);
            }
            String str = strB;
            final x0.n1<Boolean> n1Var = this.f12515e;
            boolean z10 = !n1Var.getValue().booleanValue();
            jVar2.L(-46509979);
            final b4 b4Var = this.f12513c;
            boolean zL2 = jVar2.l(b4Var) | jVar2.l(context);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == obj2) {
                objG2 = new eh.a() { // from class: h9.z2
                    @Override // eh.a
                    public final Object invoke() {
                        Boolean bool = Boolean.TRUE;
                        x0.n1 n1Var2 = n1Var;
                        n1Var2.setValue(bool);
                        x2 x2Var = new x2(context, n1Var2);
                        b4 b4Var2 = b4Var;
                        l5.a aVarA = androidx.lifecycle.x0.a(b4Var2);
                        wh.c cVar = ph.z0.f21632a;
                        ph.h.c(aVarA, wh.b.f31563c, null, new w3(b4Var2, x2Var, null), 2);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            v3.c(dVar, strC3, str, false, z10, null, (eh.a) objG2, jVar2, 3072, 32);
        }
        return pg.f0.f21461a;
    }
}
