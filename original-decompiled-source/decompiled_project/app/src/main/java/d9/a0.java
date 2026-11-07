package d9;

import pg.f0;
import t0.x0;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class a0 implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f7589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f7590b;

    public a0(n1 n1Var, n1 n1Var2) {
        this.f7589a = n1Var;
        this.f7590b = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-792504199);
            n1<Boolean> n1Var = this.f7589a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new z(n1Var, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            x0.d((eh.a) objG, null, !((Boolean) this.f7590b.getValue()).booleanValue(), null, null, null, a.f7579a, jVar2, 805306368, 506);
        }
        return f0.f21461a;
    }
}
