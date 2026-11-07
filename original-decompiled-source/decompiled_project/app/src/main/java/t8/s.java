package t8;

import x0.j;

/* loaded from: classes.dex */
public final class s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<String, String, pg.f0> f28439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f28440c;

    public s(eh.p pVar, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f28438a = n1Var;
        this.f28439b = pVar;
        this.f28440c = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(2141259010);
            final x0.n1<Boolean> n1Var = this.f28438a;
            boolean zK = jVar2.K(n1Var);
            final eh.p<String, String, pg.f0> pVar = this.f28439b;
            boolean zK2 = zK | jVar2.K(pVar);
            final x0.n1<String> n1Var2 = this.f28440c;
            boolean zK3 = zK2 | jVar2.K(n1Var2);
            Object objG = jVar2.g();
            if (zK3 || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: t8.r
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        int i10 = w.f28523b;
                        n1Var.setValue(Boolean.FALSE);
                        pVar.invoke((String) n1Var2.getValue(), "chat");
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, a4.f28092e, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
