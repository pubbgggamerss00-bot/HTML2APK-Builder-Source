package d0;

import d0.c0;
import x0.j;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.a f7057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, c0.a aVar) {
        super(2);
        this.f7056a = c0Var;
        this.f7057b = aVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            c0 c0Var = this.f7056a;
            g0 g0Var = (g0) c0Var.f7071b.invoke();
            c0.a aVar = this.f7057b;
            int iC = aVar.f7075c;
            Object obj = aVar.f7073a;
            if ((iC >= g0Var.getItemCount() || !g0Var.d(iC).equals(obj)) && (iC = g0Var.c(obj)) != -1) {
                aVar.f7075c = iC;
            }
            int i10 = iC;
            if (i10 != -1) {
                jVar2.L(-660404355);
                f0.a(g0Var, c0Var.f7070a, i10, aVar.f7073a, jVar2, 0);
                jVar2.B();
            } else {
                jVar2.L(-660169871);
                jVar2.B();
            }
            boolean zL = jVar2.l(aVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new a0(aVar);
                jVar2.C(objG);
            }
            x0.o0.a(obj, (eh.l) objG, jVar2);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
