package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class ya implements eh.q<t0.a3, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f11028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Long, pg.f0> f11029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<KeystoreEntity> f11030d;

    public ya(eh.l lVar, String str, List list, x0.n1 n1Var) {
        this.f11027a = str;
        this.f11028b = n1Var;
        this.f11029c = lVar;
        this.f11030d = list;
    }

    @Override // eh.q
    public final pg.f0 b(t0.a3 a3Var, x0.j jVar, Integer num) {
        final x0.n1<Boolean> n1Var;
        t0.a3 ExposedDropdownMenuBox = a3Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jVar2.K(ExposedDropdownMenuBox) : jVar2.l(ExposedDropdownMenuBox) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(ExposedDropdownMenuBox.d(d.a.f1143b, true), 1.0f);
            jVar2.L(-1355490678);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new sa(0);
                jVar2.C(objG);
            }
            jVar2.B();
            f1.b bVar = e.N;
            x0.n1<Boolean> n1Var2 = this.f11028b;
            t0.w9.a(this.f11027a, (eh.l) objG, dVarD, false, true, null, bVar, null, null, f1.c.b(-670513298, new ua(n1Var2), jVar2), null, null, false, null, null, null, false, 0, 0, null, null, jVar2, 806903856, 0, 8388008);
            boolean zBooleanValue = n1Var2.getValue().booleanValue();
            jVar2.L(-1355475876);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                n1Var = n1Var2;
                objG2 = new eh.a() { // from class: f9.ta
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            } else {
                n1Var = n1Var2;
            }
            jVar2.B();
            q8.g.c(ExposedDropdownMenuBox, zBooleanValue, (eh.a) objG2, f1.c.b(406251191, new xa(this.f11029c, this.f11030d, n1Var), jVar2), jVar2, 3456 | (i10 & 14));
        }
        return pg.f0.f21461a;
    }
}
