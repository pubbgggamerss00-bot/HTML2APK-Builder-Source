package c0;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.s implements eh.l<Integer, m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f4410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f4411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b0 b0Var, a0 a0Var) {
        super(1);
        this.f4410a = b0Var;
        this.f4411b = a0Var;
    }

    @Override // eh.l
    public final m0 invoke(Integer num) {
        int iIntValue = num.intValue();
        b0 b0Var = this.f4410a;
        int iE = b0Var.f4467e.e(iIntValue);
        long jA = b0Var.a(0, iE);
        a0 a0Var = this.f4411b;
        return a0Var.b(iIntValue, 0, iE, a0Var.f4340c, jA);
    }
}
