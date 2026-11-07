package m0;

import x0.j;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(r1 r1Var) {
        super(3);
        this.f17356a = r1Var;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        androidx.compose.ui.d dVar2 = dVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-1914520728);
        f3.d dVar3 = (f3.d) jVar2.f(j2.j2.f14779h);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = bg.b.h(new f3.p(0L));
            jVar2.C(objG);
        }
        x0.n1 n1Var = (x0.n1) objG;
        r1 r1Var = this.f17356a;
        boolean zL = jVar2.l(r1Var);
        Object objG2 = jVar2.g();
        if (zL || objG2 == c0321a) {
            objG2 = new e2(r1Var, n1Var);
            jVar2.C(objG2);
        }
        eh.a aVar = (eh.a) objG2;
        boolean zK = jVar2.K(dVar3);
        Object objG3 = jVar2.g();
        if (zK || objG3 == c0321a) {
            objG3 = new h2(dVar3, n1Var);
            jVar2.C(objG3);
        }
        s.p pVar = m1.f17414a;
        androidx.compose.ui.d dVarA = androidx.compose.ui.c.a(dVar2, j2.c3.f14686a, new o1(aVar, (eh.l) objG3));
        jVar2.B();
        return dVarA;
    }
}
