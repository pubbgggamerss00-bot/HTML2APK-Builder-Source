package c9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
    @Override // eh.a
    public final pg.f0 invoke() {
        s1 s1Var = (s1) this.receiver;
        qg.l<List<b>> lVar = s1Var.f5288t;
        x0.v1 v1Var = s1Var.f5286r;
        List<b> listRemoveLast = lVar.isEmpty() ? null : lVar.removeLast();
        if (listRemoveLast != null) {
            s1Var.f5287s.addLast(s1Var.j());
            s1Var.f5276h.setValue(listRemoveLast);
            v1Var.f(v1Var.g() + 1);
        }
        return pg.f0.f21461a;
    }
}
