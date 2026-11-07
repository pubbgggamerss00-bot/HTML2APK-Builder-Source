package h9;

import androidx.compose.ui.d;
import t0.w9;
import x0.j;

/* loaded from: classes.dex */
public final class f1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12610a;

    public f1(x0.n1<String> n1Var) {
        this.f12610a = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            final x0.n1<String> n1Var = this.f12610a;
            String value = n1Var.getValue();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            jVar2.L(911124550);
            f1.b bVarB = n1Var.getValue().length() > 0 ? f1.c.b(-1555653919, new e1(n1Var), jVar2) : null;
            boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 911109544, n1Var);
            Object objG = jVar2.g();
            if (zB || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: h9.d1
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String it = (String) obj;
                        kotlin.jvm.internal.r.e(it, "it");
                        n1Var.setValue(it);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            w9.a(value, (eh.l) objG, dVarD, false, false, null, null, c.f12550d, c.f12551e, bVarB, null, null, false, null, null, null, true, 0, 0, eVarA, null, jVar2, 113246592, 12582912, 6159480);
        }
        return pg.f0.f21461a;
    }
}
