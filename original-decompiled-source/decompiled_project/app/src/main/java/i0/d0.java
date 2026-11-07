package i0;

import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.l<List<? extends p1.e>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<p1.e>> f13234a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x0.n1<List<p1.e>> n1Var) {
        super(1);
        this.f13234a = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(List<? extends p1.e> list) {
        List<? extends p1.e> list2 = list;
        x0.n1<List<p1.e>> n1Var = this.f13234a;
        if (n1Var != 0) {
            n1Var.setValue(list2);
        }
        return pg.f0.f21461a;
    }
}
