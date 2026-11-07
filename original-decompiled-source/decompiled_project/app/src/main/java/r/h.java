package r;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements eh.p<u0, u0, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f22832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w1 w1Var) {
        super(2);
        this.f22832a = w1Var;
    }

    @Override // eh.p
    public final Boolean invoke(u0 u0Var, u0 u0Var2) {
        u0 u0Var3 = u0Var;
        u0 u0Var4 = u0Var2;
        u0 u0Var5 = u0.f22957c;
        return Boolean.valueOf(u0Var3 == u0Var5 && u0Var4 == u0Var5 && !this.f22832a.a().f22906e);
    }
}
