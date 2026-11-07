package d9;

import pg.f0;
import t0.f2;
import t0.m0;
import t0.x0;
import x0.e2;
import x0.j;
import x0.n1;
import z.g1;

/* loaded from: classes.dex */
public final class y implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8.u f7664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f7665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f7666c;

    public y(g8.u uVar, n1 n1Var, n1 n1Var2) {
        this.f7664a = uVar;
        this.f7665b = n1Var;
        this.f7666c = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-792525732);
            g8.u uVar = this.f7664a;
            boolean zL = jVar2.l(uVar);
            Object obj = this.f7665b;
            boolean zK = zL | jVar2.K(obj);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new v(uVar, obj, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            n1 n1Var = this.f7666c;
            boolean z10 = !((Boolean) n1Var.getValue()).booleanValue();
            g1 g1Var = m0.f26400a;
            e2 e2Var = f2.f25858a;
            x0.a((eh.a) objG, null, z10, null, m0.a(((t0.e2) jVar2.f(e2Var)).f25777w, ((t0.e2) jVar2.f(e2Var)).f25778x, 0L, jVar2, 12), null, null, null, f1.c.b(632511245, new x(n1Var), jVar2), jVar2, 805306368, 490);
        }
        return f0.f21461a;
    }
}
