package m0;

import x0.j;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<p1.c> f17438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<eh.a<p1.c>, androidx.compose.ui.d> f17439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(eh.a<p1.c> aVar, eh.l<? super eh.a<p1.c>, ? extends androidx.compose.ui.d> lVar) {
        super(3);
        this.f17438a = aVar;
        this.f17439b = lVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(759876635);
        Object objG = jVar2.g();
        Object obj = j.a.f31715a;
        if (objG == obj) {
            objG = bg.b.d(this.f17438a);
            jVar2.C(objG);
        }
        x0.r3 r3Var = (x0.r3) objG;
        Object objG2 = jVar2.g();
        if (objG2 == obj) {
            objG2 = new s.b(new p1.c(((p1.c) r3Var.getValue()).f21129a), m1.f17415b, new p1.c(m1.f17416c), 8);
            jVar2.C(objG2);
        }
        s.b bVar = (s.b) objG2;
        pg.f0 f0Var = pg.f0.f21461a;
        boolean zL = jVar2.l(bVar);
        Object objG3 = jVar2.g();
        if (zL || objG3 == obj) {
            objG3 = new p1(r3Var, bVar, null);
            jVar2.C(objG3);
        }
        x0.o0.d((eh.p) objG3, f0Var, jVar2);
        s.n<T, V> nVar = bVar.f23654c;
        boolean zK = jVar2.K(nVar);
        Object objG4 = jVar2.g();
        if (zK || objG4 == obj) {
            objG4 = new n1(nVar);
            jVar2.C(objG4);
        }
        androidx.compose.ui.d dVarInvoke = this.f17439b.invoke((eh.a) objG4);
        jVar2.B();
        return dVarInvoke;
    }
}
