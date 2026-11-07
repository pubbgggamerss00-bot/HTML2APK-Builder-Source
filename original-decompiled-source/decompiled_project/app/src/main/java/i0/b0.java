package i0;

import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements eh.a<List<? extends p1.e>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<p1.e>> f13156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x0.n1<List<p1.e>> n1Var) {
        super(0);
        this.f13156a = n1Var;
    }

    @Override // eh.a
    public final List<? extends p1.e> invoke() {
        x0.n1<List<p1.e>> n1Var = this.f13156a;
        if (n1Var != null) {
            return n1Var.getValue();
        }
        return null;
    }
}
