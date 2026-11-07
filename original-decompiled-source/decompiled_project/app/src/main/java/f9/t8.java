package f9;

import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class t8 implements eh.q<t0.a3, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f10581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10585e;

    /* JADX WARN: Multi-variable type inference failed */
    public t8(List<pg.n<String, String>> list, String str, boolean z10, x0.n1<Boolean> n1Var, eh.l<? super String, pg.f0> lVar) {
        this.f10581a = list;
        this.f10582b = str;
        this.f10583c = z10;
        this.f10584d = n1Var;
        this.f10585e = lVar;
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
            List<pg.n<String, String>> list = this.f10581a;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f10582b;
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
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            boolean z10 = this.f10583c;
            androidx.compose.ui.d dVarD2 = ExposedDropdownMenuBox.d(dVarD, z10);
            jVar2.L(-145098172);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new n8();
                jVar2.C(objG);
            }
            jVar2.B();
            f1.b bVar = e.f9379u0;
            x0.n1<Boolean> n1Var2 = this.f10584d;
            t0.w9.a(str, (eh.l) objG, dVarD2, this.f10583c, true, null, bVar, null, null, f1.c.b(-934310438, new p8(n1Var2), jVar2), null, null, false, null, null, null, false, 0, 0, null, null, jVar2, 806903856, 0, 8388000);
            boolean z11 = n1Var2.getValue().booleanValue() && z10;
            jVar2.L(-145081770);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                n1Var = n1Var2;
                objG2 = new o8(n1Var, 0);
                jVar2.C(objG2);
            } else {
                n1Var = n1Var2;
            }
            jVar2.B();
            q8.g.c(ExposedDropdownMenuBox, z11, (eh.a) objG2, f1.c.b(-719443229, new s8(this.f10585e, list, n1Var), jVar2), jVar2, 3456 | (i10 & 14));
        }
        return pg.f0.f21461a;
    }
}
