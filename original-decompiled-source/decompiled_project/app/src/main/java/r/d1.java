package r;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.l<u0, q1.l2> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.l2 f22807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f22808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f22809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(q1.l2 l2Var, u1 u1Var, w1 w1Var) {
        super(1);
        this.f22807a = l2Var;
        this.f22808b = u1Var;
        this.f22809c = w1Var;
    }

    @Override // eh.l
    public final q1.l2 invoke(u0 u0Var) {
        q1.l2 l2Var;
        int iOrdinal = u0Var.ordinal();
        q1.l2 l2Var2 = null;
        u1 u1Var = this.f22808b;
        w1 w1Var = this.f22809c;
        if (iOrdinal == 0) {
            f2 f2Var = u1Var.a().f22905d;
            if (f2Var != null) {
                l2Var = new q1.l2(f2Var.f22820b);
            } else {
                f2 f2Var2 = w1Var.a().f22905d;
                if (f2Var2 != null) {
                    l2Var = new q1.l2(f2Var2.f22820b);
                }
            }
            l2Var2 = l2Var;
        } else if (iOrdinal == 1) {
            l2Var2 = this.f22807a;
        } else {
            if (iOrdinal != 2) {
                throw new pg.l();
            }
            f2 f2Var3 = w1Var.a().f22905d;
            if (f2Var3 != null) {
                l2Var = new q1.l2(f2Var3.f22820b);
            } else {
                f2 f2Var4 = u1Var.a().f22905d;
                if (f2Var4 != null) {
                    l2Var = new q1.l2(f2Var4.f22820b);
                }
            }
            l2Var2 = l2Var;
        }
        return new q1.l2(l2Var2 != null ? l2Var2.f21720a : q1.l2.f21718b);
    }
}
