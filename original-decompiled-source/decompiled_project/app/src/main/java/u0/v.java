package u0;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements eh.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0<Object> a0Var) {
        super(0);
        this.f29161a = a0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        a0<Object> a0Var = this.f29161a;
        T value = a0Var.f28952l.getValue();
        if (value != 0) {
            return value;
        }
        x0.u1 u1Var = a0Var.f28950j;
        x0.x1 x1Var = a0Var.f28947g;
        float floatValue = u1Var.getFloatValue();
        if (Float.isNaN(floatValue)) {
            return x1Var.getValue();
        }
        Object value2 = x1Var.getValue();
        c0<Object> c0VarE = a0Var.e();
        float fD = c0VarE.d(value2);
        if (fD != floatValue && !Float.isNaN(fD)) {
            if (fD < floatValue) {
                Object objB = c0VarE.b(floatValue, true);
                if (objB != null) {
                    return objB;
                }
            } else {
                Object objB2 = c0VarE.b(floatValue, false);
                if (objB2 != null) {
                    return objB2;
                }
            }
        }
        return value2;
    }
}
