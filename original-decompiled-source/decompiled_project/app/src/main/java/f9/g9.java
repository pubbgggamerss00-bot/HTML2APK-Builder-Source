package f9;

import androidx.compose.ui.d;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class g9 implements eh.q<t0.a3, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f9679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9680d;

    public g9(eh.l lVar, String str, List list, x0.n1 n1Var) {
        this.f9677a = str;
        this.f9678b = n1Var;
        this.f9679c = list;
        this.f9680d = lVar;
    }

    @Override // eh.q
    public final pg.f0 b(t0.a3 a3Var, x0.j jVar, Integer num) {
        x0.n1<Boolean> n1Var;
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
            jVar2.L(-108618200);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new a9(0);
                jVar2.C(objG);
            }
            jVar2.B();
            f1.b bVar = e.f9374s;
            x0.n1<Boolean> n1Var2 = this.f9678b;
            t0.w9.a(this.f9677a, (eh.l) objG, dVarD, false, true, null, bVar, null, null, f1.c.b(-1462714941, new c9(n1Var2), jVar2), null, null, false, null, null, null, false, 0, 0, null, null, jVar2, 806903856, 0, 8388008);
            boolean zBooleanValue = n1Var2.getValue().booleanValue();
            jVar2.L(-108603334);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                n1Var = n1Var2;
                objG2 = new b9(n1Var, 0);
                jVar2.C(objG2);
            } else {
                n1Var = n1Var2;
            }
            jVar2.B();
            q8.g.c(ExposedDropdownMenuBox, zBooleanValue, (eh.a) objG2, f1.c.b(-1305041510, new f9(this.f9680d, this.f9679c, n1Var), jVar2), jVar2, 3456 | (i10 & 14));
        }
        return pg.f0.f21461a;
    }
}
