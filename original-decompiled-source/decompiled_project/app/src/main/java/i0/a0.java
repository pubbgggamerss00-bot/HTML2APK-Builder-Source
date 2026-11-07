package i0;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f13124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n4 n4Var) {
        super(0);
        this.f13124a = n4Var;
    }

    @Override // eh.a
    public final Boolean invoke() {
        n4 n4Var = this.f13124a;
        return Boolean.valueOf(n4Var != null ? ((Boolean) new f0.c(n4Var, 1).invoke()).booleanValue() : false);
    }
}
