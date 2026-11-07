package i0;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.l<t2.h0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f13681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<t2.h0, pg.f0> f13682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(n4 n4Var, eh.l<? super t2.h0, pg.f0> lVar) {
        super(1);
        this.f13681a = n4Var;
        this.f13682b = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(t2.h0 h0Var) {
        t2.h0 h0Var2 = h0Var;
        n4 n4Var = this.f13681a;
        if (n4Var != null) {
            n4Var.f13448a.setValue(h0Var2);
        }
        eh.l<t2.h0, pg.f0> lVar = this.f13682b;
        if (lVar != null) {
            lVar.invoke(h0Var2);
        }
        return pg.f0.f21461a;
    }
}
