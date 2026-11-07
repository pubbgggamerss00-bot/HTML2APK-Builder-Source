package h9;

import android.content.Context;
import android.content.res.Resources;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.l9;
import java.util.List;
import p0.a6;
import p0.j5;
import p0.t7;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class w2 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12845c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4 f12846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f12848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.r3<k9.a> f12849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12850h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12851j;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(Context context, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, b4 b4Var, x0.n1<Boolean> n1Var3, x0.r3<String> r3Var, x0.r3<? extends k9.a> r3Var2, x0.r3<Boolean> r3Var3, x0.n1<String> n1Var4) {
        this.f12843a = context;
        this.f12844b = n1Var;
        this.f12845c = n1Var2;
        this.f12846d = b4Var;
        this.f12847e = n1Var3;
        this.f12848f = r3Var;
        this.f12849g = r3Var2;
        this.f12850h = r3Var3;
        this.f12851j = n1Var4;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) throws Resources.NotFoundException {
        z.r SettingsSection = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(SettingsSection, "$this$SettingsSection");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarA = a6.a();
            String strC = f3.q.c(R.string.settings_language, jVar2);
            String value = this.f12848f.getValue();
            l9.d0.f16789a.getClass();
            String strD = l9.d0.d(this.f12843a, value);
            jVar2.L(-46586428);
            final x0.n1<Boolean> n1Var = this.f12844b;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new eh.a() { // from class: h9.s2
                    @Override // eh.a
                    public final Object invoke() {
                        v3.e(n1Var, true);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v3.c(dVarA, strC, strD, false, false, null, (eh.a) objG, jVar2, 0, 56);
            v3.b(0, jVar2);
            w1.d dVarA2 = t7.a();
            String strC2 = f3.q.c(R.string.settings_theme, jVar2);
            x0.r3<k9.a> r3Var = this.f12849g;
            String strC3 = f3.q.c(r3Var.getValue().f16176b, jVar2);
            f1.b bVarB = f1.c.b(358104960, new v2(r3Var), jVar2);
            jVar2.L(-46572383);
            final x0.n1<Boolean> n1Var2 = this.f12845c;
            boolean zK2 = jVar2.K(n1Var2);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == obj) {
                objG2 = new eh.a() { // from class: h9.t2
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var2.setValue(Boolean.TRUE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            v3.c(dVarA2, strC2, strC3, false, false, bVarB, (eh.a) objG2, jVar2, 196608, 24);
            v3.b(0, jVar2);
            w1.d dVarB = p0.q.f20993a;
            if (dVarB == null) {
                d.a aVar = new d.a("Filled.Animation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVarA = o0.d.a(15.0f, 2.0f);
                eVarA.c(-2.71f, CropImageView.DEFAULT_ASPECT_RATIO, -5.05f, 1.54f, -6.22f, 3.78f);
                eVarA.c(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
                eVarA.b(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
                eVarA.c(2.71f, CropImageView.DEFAULT_ASPECT_RATIO, 5.05f, -1.54f, 6.22f, -3.78f);
                eVarA.c(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
                eVarA.b(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
                eVarA.a();
                eVarA.h(9.0f, 20.0f);
                eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -2.24f, -5.0f, -5.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
                eVarA.c(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
                eVarA.a();
                eVarA.h(12.0f, 17.0f);
                eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -2.24f, -5.0f, -5.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
                eVarA.c(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
                eVarA.a();
                eVarA.h(16.7f, 13.7f);
                eVarA.c(-0.53f, 0.19f, -1.1f, 0.3f, -1.7f, 0.3f);
                eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -2.24f, -5.0f, -5.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
                eVarA.c(0.53f, -0.19f, 1.1f, -0.3f, 1.7f, -0.3f);
                eVarA.c(2.76f, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f, 2.24f, 5.0f, 5.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.6f, -0.11f, 1.17f, -0.3f, 1.7f);
                eVarA.a();
                eVarA.h(19.0f, 12.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
                eVarA.c(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
                eVarA.c(2.76f, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f, 2.24f, 5.0f, 5.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.12f, -0.37f, 2.16f, -1.0f, 3.0f);
                eVarA.a();
                d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                dVarB = aVar.b();
                p0.q.f20993a = dVarB;
            }
            String strC4 = f3.q.c(R.string.settings_rich_animations, jVar2);
            boolean zBooleanValue = this.f12850h.getValue().booleanValue();
            jVar2.L(-46560918);
            Object obj2 = this.f12846d;
            boolean zL = jVar2.l(obj2);
            Object objG3 = jVar2.g();
            if (zL || objG3 == obj) {
                objG3 = new l9(obj2, 1);
                jVar2.C(objG3);
            }
            jVar2.B();
            v3.g(dVarB, strC4, zBooleanValue, (eh.l) objG3, jVar2, 0);
            v3.b(0, jVar2);
            w1.d dVarA3 = j5.a();
            String strC5 = f3.q.c(R.string.settings_launcher_name, jVar2);
            List<String> list = com.basitce.htmltoapk.util.a.f5832a;
            String strC6 = f3.q.c(com.basitce.htmltoapk.util.a.f(this.f12851j.getValue()), jVar2);
            jVar2.L(-46548504);
            Object obj3 = this.f12847e;
            boolean zK3 = jVar2.K(obj3);
            Object objG4 = jVar2.g();
            if (zK3 || objG4 == obj) {
                objG4 = new u2(obj3, 0);
                jVar2.C(objG4);
            }
            jVar2.B();
            v3.c(dVarA3, strC5, strC6, false, false, null, (eh.a) objG4, jVar2, 0, 56);
        }
        return pg.f0.f21461a;
    }
}
