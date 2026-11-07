package e0;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.s implements eh.a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f8122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var) {
        super(0);
        this.f8122a = d1Var;
    }

    @Override // eh.a
    public final Integer invoke() {
        d1 d1Var = this.f8122a;
        return Integer.valueOf(d1Var.f8153k.a() ? d1Var.f8162t.g() : d1Var.j());
    }
}
