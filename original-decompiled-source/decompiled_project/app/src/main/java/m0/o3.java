package m0;

import x0.j;

/* loaded from: classes.dex */
public final class o3 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(x2 x2Var) {
        super(3);
        this.f17442a = x2Var;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        androidx.compose.ui.d dVar2 = dVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(1980580247);
        f3.d dVar3 = (f3.d) jVar2.f(j2.j2.f14779h);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = bg.b.h(new f3.p(0L));
            jVar2.C(objG);
        }
        x0.n1 n1Var = (x0.n1) objG;
        x2 x2Var = this.f17442a;
        boolean zL = jVar2.l(x2Var);
        Object objG2 = jVar2.g();
        if (zL || objG2 == c0321a) {
            objG2 = new k3(x2Var, n1Var);
            jVar2.C(objG2);
        }
        eh.a aVar = (eh.a) objG2;
        boolean zK = jVar2.K(dVar3);
        Object objG3 = jVar2.g();
        if (zK || objG3 == c0321a) {
            objG3 = new n3(dVar3, n1Var);
            jVar2.C(objG3);
        }
        s.p pVar = m1.f17414a;
        androidx.compose.ui.d dVarA = androidx.compose.ui.c.a(dVar2, j2.c3.f14686a, new o1(aVar, (eh.l) objG3));
        jVar2.B();
        return dVarA;
    }
}
