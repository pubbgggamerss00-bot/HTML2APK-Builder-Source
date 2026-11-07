package i0;

import androidx.compose.ui.d;
import x0.j;
import x2.f;

/* loaded from: classes.dex */
public final class j4 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f13381a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(t2.l0 l0Var) {
        super(3);
        this.f13381a = l0Var;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(1582736677);
        f3.d dVar2 = (f3.d) jVar2.f(j2.j2.f14779h);
        f.a aVar = (f.a) jVar2.f(j2.j2.f14782k);
        f3.r rVar = (f3.r) jVar2.f(j2.j2.f14785n);
        t2.l0 l0Var = this.f13381a;
        boolean zK = jVar2.K(l0Var) | jVar2.K(rVar);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (zK || objG == c0321a) {
            objG = qg.n0.e(l0Var, rVar);
            jVar2.C(objG);
        }
        t2.l0 l0Var2 = (t2.l0) objG;
        boolean zK2 = jVar2.K(aVar) | jVar2.K(l0Var2);
        Object objG2 = jVar2.g();
        if (zK2 || objG2 == c0321a) {
            t2.b0 b0Var = l0Var2.f27852a;
            x2.f fVar = b0Var.f27780f;
            x2.p pVar = b0Var.f27777c;
            if (pVar == null) {
                pVar = x2.p.f32030c;
            }
            x2.n nVar = b0Var.f27778d;
            int i10 = nVar != null ? nVar.f32027a : 0;
            x2.o oVar = b0Var.f27779e;
            objG2 = aVar.a(fVar, pVar, i10, oVar != null ? oVar.f32028a : 65535);
            jVar2.C(objG2);
        }
        x0.r3 r3Var = (x0.r3) objG2;
        Object objG3 = jVar2.g();
        Object obj = objG3;
        if (objG3 == c0321a) {
            Object value = r3Var.getValue();
            g4 g4Var = new g4();
            g4Var.f13300a = rVar;
            g4Var.f13301b = dVar2;
            g4Var.f13302c = aVar;
            g4Var.f13303d = l0Var;
            g4Var.f13304e = value;
            g4Var.f13305f = j3.a(l0Var, dVar2, aVar, j3.f13380a, 1);
            jVar2.C(g4Var);
            obj = g4Var;
        }
        g4 g4Var2 = (g4) obj;
        Object value2 = r3Var.getValue();
        if (rVar != g4Var2.f13300a || !kotlin.jvm.internal.r.a(dVar2, g4Var2.f13301b) || !kotlin.jvm.internal.r.a(aVar, g4Var2.f13302c) || !kotlin.jvm.internal.r.a(l0Var2, g4Var2.f13303d) || !kotlin.jvm.internal.r.a(value2, g4Var2.f13304e)) {
            g4Var2.f13300a = rVar;
            g4Var2.f13301b = dVar2;
            g4Var2.f13302c = aVar;
            g4Var2.f13303d = l0Var2;
            g4Var2.f13304e = value2;
            g4Var2.f13305f = j3.a(l0Var2, dVar2, aVar, j3.f13380a, 1);
        }
        boolean zL = jVar2.l(g4Var2);
        Object objG4 = jVar2.g();
        if (zL || objG4 == c0321a) {
            objG4 = new i4(g4Var2);
            jVar2.C(objG4);
        }
        androidx.compose.ui.d dVarA = androidx.compose.ui.layout.b.a(d.a.f1143b, (eh.q) objG4);
        jVar2.B();
        return dVarA;
    }
}
