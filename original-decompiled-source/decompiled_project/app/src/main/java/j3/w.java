package j3;

import androidx.compose.ui.d;
import c9.u1;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import ph.v1;
import x0.a2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f15127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var, n1 n1Var) {
        super(2);
        this.f15126a = g0Var;
        this.f15127b = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.d dVarA = q2.q.a(d.a.f1143b, false, u.f15124a);
            g0 g0Var = this.f15126a;
            boolean zL = jVar2.l(g0Var);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new v(g0Var);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarB = c9.g.b(androidx.compose.ui.layout.d.a(dVarA, (eh.l) objG), g0Var.getCanCalculatePosition() ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
            eh.p pVar = (eh.p) this.f15127b.getValue();
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            v1.j(g.a.f13867f, x.f15128a, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            pVar.invoke(jVar2, 0);
            jVar2.H();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
