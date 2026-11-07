package i0;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import x0.j;

/* loaded from: classes.dex */
public final class a4 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1.c, pg.f0> f13150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f13151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a4(eh.l<? super p1.c, pg.f0> lVar, x.m mVar) {
        super(3);
        this.f13150a = lVar;
        this.f13151b = mVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-102778667);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            x0.l0 l0Var = x0.o0.f31834a;
            x0.w2 w2Var = new x0.w2(jVar2.x());
            jVar2.C(w2Var);
            objG = w2Var;
        }
        ph.i0 i0Var = (ph.i0) objG;
        Object objG2 = jVar2.g();
        if (objG2 == c0321a) {
            objG2 = bg.b.h(null);
            jVar2.C(objG2);
        }
        x0.n1 n1Var = (x0.n1) objG2;
        x0.n1 n1VarK = bg.b.k(this.f13150a, jVar2);
        x.m mVar = this.f13151b;
        boolean zK = jVar2.K(mVar);
        Object objG3 = jVar2.g();
        if (zK || objG3 == c0321a) {
            objG3 = new y3(n1Var, mVar);
            jVar2.C(objG3);
        }
        x0.o0.a(mVar, (eh.l) objG3, jVar2);
        boolean zL = jVar2.l(i0Var) | jVar2.K(mVar) | jVar2.K(n1VarK);
        Object objG4 = jVar2.g();
        if (zL || objG4 == c0321a) {
            objG4 = new z3(i0Var, n1Var, mVar, n1VarK);
            jVar2.C(objG4);
        }
        androidx.compose.ui.d dVarA = c2.s0.a(d.a.f1143b, mVar, (PointerInputEventHandler) objG4);
        jVar2.B();
        return dVarA;
    }
}
