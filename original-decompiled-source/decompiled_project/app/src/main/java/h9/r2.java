package h9;

import com.basitce.htmltoapk.R;
import p0.va;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class r2 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f12777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12778b;

    public r2(p5.x xVar, x0.r3<Boolean> r3Var) {
        this.f12777a = xVar;
        this.f12778b = r3Var;
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
            w1.d dVarA = va.a();
            String strC = f3.q.c(R.string.settings_premium, jVar2);
            x0.r3<Boolean> r3Var = this.f12778b;
            String strB = r3Var.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -46635186, R.string.premium_active, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -46632968, R.string.premium_upgrade_subtitle, jVar2);
            jVar2.L(-46630249);
            final p5.x xVar = this.f12777a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new eh.a() { // from class: h9.o2
                    @Override // eh.a
                    public final Object invoke() {
                        p5.x.c(e2.r.f24648c.f24627a, xVar);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v3.c(dVarA, strC, strB, false, false, null, (eh.a) objG, jVar2, 0, 56);
            v3.b(0, jVar2);
            if (r3Var.getValue().booleanValue()) {
                jVar2.L(-1445383213);
                w1.d dVarA2 = p0.x3.a();
                String strC2 = f3.q.c(R.string.support_developer_title, jVar2);
                String strC3 = f3.q.c(R.string.premium_support_developer_desc, jVar2);
                jVar2.L(-46615424);
                boolean zL2 = jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == obj) {
                    objG2 = new eh.a() { // from class: h9.p2
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.x.f24654c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                v3.c(dVarA2, strC2, strC3, false, false, null, (eh.a) objG2, jVar2, 0, 56);
                jVar2.B();

            }
        }
        return pg.f0.f21461a;
    }
}
