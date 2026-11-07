package e0;

import x0.v1;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.s implements eh.a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f8124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var) {
        super(0);
        this.f8124a = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Integer invoke() {
        d1 d1Var = this.f8124a;
        v1 v1Var = d1Var.f8161s;
        return Integer.valueOf(d1Var.i(!d1Var.f8153k.a() ? d1Var.j() : v1Var.g() != -1 ? v1Var.g() : Math.abs(d1Var.k()) >= Math.abs(Math.min(d1Var.f8159q.N0(e1.f8172a), ((float) d1Var.n()) / 2.0f) / ((float) d1Var.n())) ? ((Boolean) d1Var.F.getValue()).booleanValue() ? d1Var.f8147e + 1 : d1Var.f8147e : d1Var.j()));
    }
}
