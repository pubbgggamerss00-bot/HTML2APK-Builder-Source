package x8;

import java.util.List;
import java.util.Map;
import x0.j;

/* loaded from: classes.dex */
public final class h3 implements eh.q<c0.v, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f32707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f32708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f32710d;

    public h3(Map<String, Integer> map, x0.n1<String> n1Var, x0.r3<Boolean> r3Var, x0.n1<List<Long>> n1Var2) {
        this.f32707a = map;
        this.f32708b = n1Var;
        this.f32709c = r3Var;
        this.f32710d = n1Var2;
    }

    @Override // eh.q
    public final pg.f0 b(c0.v vVar, x0.j jVar, Integer num) {
        c0.v item = vVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = g5.f32665a;
            final x0.n1<String> n1Var = this.f32708b;
            String value = n1Var.getValue();
            boolean zE = g5.E(this.f32709c);
            jVar2.L(354124030);
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                final x0.n1<List<Long>> n1Var2 = this.f32710d;
                objG = new eh.l() { // from class: x8.g3
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        boolean z11 = g5.f32665a;
                        n1Var.setValue((String) obj);
                        n1Var2.setValue(null);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            s.f(value, this.f32707a, zE, (eh.l) objG, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
