package s4;

/* loaded from: classes.dex */
public final class i0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final sh.z0 f24265a = sh.a1.a(l1.f24303b);

    public final i1<T> a() {
        return (i1) this.f24265a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(i1 newState) {
        sh.z0 z0Var;
        Object value;
        i1 i1Var;
        kotlin.jvm.internal.r.e(newState, "newState");
        do {
            z0Var = this.f24265a;
            value = z0Var.getValue();
            i1Var = (i1) value;
            if (!(i1Var instanceof x0 ? true : kotlin.jvm.internal.r.a(i1Var, l1.f24303b))) {
                if (i1Var instanceof d) {
                    if (newState.f24266a > i1Var.f24266a) {
                        i1Var = newState;
                    }
                } else if (!(i1Var instanceof t0)) {
                    throw new pg.l();
                }
            }
        } while (!z0Var.a(value, i1Var));
    }
}
