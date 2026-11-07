package r;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.s implements eh.l<u0, Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f22785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f22786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(u1 u1Var, w1 w1Var) {
        super(1);
        this.f22785a = u1Var;
        this.f22786b = w1Var;
    }

    @Override // eh.l
    public final Float invoke(u0 u0Var) {
        int iOrdinal = u0Var.ordinal();
        float f10 = 1.0f;
        if (iOrdinal == 0) {
            f2 f2Var = this.f22785a.a().f22905d;
            if (f2Var != null) {
                f10 = f2Var.f22819a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new pg.l();
            }
            f2 f2Var2 = this.f22786b.a().f22905d;
            if (f2Var2 != null) {
                f10 = f2Var2.f22819a;
            }
        }
        return Float.valueOf(f10);
    }
}
