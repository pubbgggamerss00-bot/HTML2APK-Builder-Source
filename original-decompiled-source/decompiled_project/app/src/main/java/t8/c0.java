package t8;

import java.util.List;
import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class c0 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.r3<List<x>> f28141b;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(x0.n1<Boolean> n1Var, x0.r3<? extends List<x>> r3Var) {
        this.f28140a = n1Var;
        this.f28141b = r3Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 TopAppBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TopAppBar, "$this$TopAppBar");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            List<x> value = this.f28141b.getValue();
            if (value != null && !value.isEmpty()) {
                jVar2.L(1437374938);
                x0.n1<Boolean> n1Var2 = this.f28140a;
                boolean zK = jVar2.K(n1Var2);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new b9.n(n1Var2, 2);
                    jVar2.C(objG);
                }
                jVar2.B();
                s4.c((eh.a) objG, null, false, null, b4.f28121c, jVar2, 196608, 30);
            }
        }
        return pg.f0.f21461a;
    }
}
