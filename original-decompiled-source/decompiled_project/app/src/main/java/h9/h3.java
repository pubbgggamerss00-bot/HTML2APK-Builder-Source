package h9;

import com.basitce.htmltoapk.R;
import p0.s4;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class h3 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f12640a;

    public h3(p5.x xVar) {
        this.f12640a = xVar;
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
            w1.d dVarA = s4.a();
            String strC = f3.q.c(R.string.settings_legal, jVar2);
            String strC2 = f3.q.c(R.string.settings_legal_summary, jVar2);
            jVar2.L(-46424715);
            final p5.x xVar = this.f12640a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new eh.a() { // from class: h9.f3
                    @Override // eh.a
                    public final Object invoke() {
                        p5.x.c(e2.n.f24644c.f24627a, xVar);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v3.c(dVarA, strC, strC2, false, false, null, (eh.a) objG, jVar2, 0, 56);
            v3.b(0, jVar2);
            w1.d dVarA2 = p0.w1.a();
            String strC3 = f3.q.c(R.string.settings_open_source_licenses, jVar2);
            String strC4 = f3.q.c(R.string.settings_open_source_licenses_summary, jVar2);
            jVar2.L(-46411486);
            boolean zL2 = jVar2.l(xVar);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == obj) {
                objG2 = new g3(xVar, 0);
                jVar2.C(objG2);
            }
            jVar2.B();
            v3.c(dVarA2, strC3, strC4, false, false, null, (eh.a) objG2, jVar2, 0, 56);
        }
        return pg.f0.f21461a;
    }
}
