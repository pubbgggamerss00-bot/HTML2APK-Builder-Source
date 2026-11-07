package m0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.s implements eh.a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f17331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17332b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(y yVar, int i10) {
        super(0);
        this.f17331a = yVar;
        this.f17332b = i10;
    }

    @Override // eh.a
    public final Integer invoke() {
        t2.h0 h0Var = this.f17331a.f17579f;
        return Integer.valueOf(h0Var.f27820b.d(this.f17332b));
    }
}
