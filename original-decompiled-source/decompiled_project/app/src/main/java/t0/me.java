package t0;

import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class me extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ie f26476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ie ieVar) {
        super(3);
        this.f26476a = ieVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-1541271084);
        ie ieVar = this.f26476a;
        float f10 = ieVar.f26119b;
        s.m2 m2Var = af.f25499a;
        x0.r3 r3VarA = s.g.a(f10, m2Var, jVar2, 0);
        x0.r3 r3VarA2 = s.g.a(ieVar.f26118a, m2Var, jVar2, 0);
        androidx.compose.ui.d dVarU = androidx.compose.foundation.layout.g.u(androidx.compose.foundation.layout.g.d(dVar, 1.0f), d.a.f14608g);
        boolean zK = jVar2.K(r3VarA2);
        Object objG = jVar2.g();
        if (zK || objG == j.a.f31715a) {
            objG = new le(r3VarA2);
            jVar2.C(objG);
        }
        androidx.compose.ui.d dVarR = androidx.compose.foundation.layout.g.r(androidx.compose.foundation.layout.e.a(dVarU, (eh.l) objG), ((f3.h) r3VarA.getValue()).f8817a);
        jVar2.B();
        return dVarR;
    }
}
