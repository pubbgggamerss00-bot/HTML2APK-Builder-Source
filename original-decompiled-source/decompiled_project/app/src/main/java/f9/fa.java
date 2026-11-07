package f9;

import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class fa implements eh.q<t0.a3, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9543d;

    public fa(eh.l lVar, String str, List list, x0.n1 n1Var) {
        this.f9540a = list;
        this.f9541b = str;
        this.f9542c = n1Var;
        this.f9543d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(t0.a3 a3Var, x0.j jVar, Integer num) {
        String str;
        Object next;
        x0.n1<Boolean> n1Var;
        String str2;
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
            List<pg.n<String, String>> list = this.f9540a;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f9541b;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.r.a(((pg.n) next).f21469a, str)) {
                    break;
                }
            }
            pg.n nVar = (pg.n) next;
            if (nVar != null && (str2 = (String) nVar.f21470b) != null) {
                str = str2;
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(ExposedDropdownMenuBox.d(d.a.f1143b, true), 1.0f);
            jVar2.L(1350202161);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new z9();
                jVar2.C(objG);
            }
            jVar2.B();
            f1.b bVar = e.I;
            x0.n1<Boolean> n1Var2 = this.f9542c;
            t0.w9.a(str, (eh.l) objG, dVarD, false, true, null, bVar, null, null, f1.c.b(-1680434696, new ba(n1Var2), jVar2), null, null, false, null, null, null, false, 0, 0, null, null, jVar2, 806903856, 0, 8388008);
            boolean zBooleanValue = n1Var2.getValue().booleanValue();
            jVar2.L(1350217027);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                n1Var = n1Var2;
                objG2 = new aa(n1Var, 0);
                jVar2.C(objG2);
            } else {
                n1Var = n1Var2;
            }
            jVar2.B();
            q8.g.c(ExposedDropdownMenuBox, zBooleanValue, (eh.a) objG2, f1.c.b(-1605882673, new ea(this.f9543d, list, n1Var), jVar2), jVar2, 3456 | (i10 & 14));
        }
        return pg.f0.f21461a;
    }
}
