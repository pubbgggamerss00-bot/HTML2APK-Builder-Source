package e0;

import x0.n1;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements eh.a<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f8199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f8200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<Integer> f8201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n1 n1Var, n1 n1Var2, eh.a aVar) {
        super(0);
        this.f8199a = n1Var;
        this.f8200b = n1Var2;
        this.f8201c = aVar;
    }

    @Override // eh.a
    public final d0 invoke() {
        return new d0((eh.r) this.f8199a.getValue(), (eh.l) this.f8200b.getValue(), this.f8201c.invoke().intValue());
    }
}
