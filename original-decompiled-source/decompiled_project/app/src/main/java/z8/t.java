package z8;

import e0.p0;
import f9.kc;
import java.util.List;
import q1.b1;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class t implements eh.r<p0, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.b f34855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<b1> f34856c;

    public t(n1 n1Var, e0.b bVar, List list) {
        this.f34854a = n1Var;
        this.f34855b = bVar;
        this.f34856c = list;
    }

    @Override // eh.r
    public final pg.f0 f(p0 p0Var, Integer num, x0.j jVar, Integer num2) {
        p0 HorizontalPager = p0Var;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        kotlin.jvm.internal.r.e(HorizontalPager, "$this$HorizontalPager");
        if (iIntValue == 3) {
            jVar2.L(-1415179866);
            n1<String> n1Var = this.f34854a;
            String value = n1Var.getValue();
            jVar2.L(-599834411);
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new kc(n1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            j.a(value, (eh.l) objG, jVar2, 0);
            jVar2.B();
        } else {
            jVar2.L(-1414906012);
            j.d(iIntValue, this.f34855b, this.f34856c.get(iIntValue).f21656a, jVar2, (iIntValue2 >> 3) & 14);
            jVar2.B();
        }
        return pg.f0.f21461a;
    }
}
