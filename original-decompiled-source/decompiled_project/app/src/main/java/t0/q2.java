package t0;

/* loaded from: classes.dex */
public final class q2 implements q1.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2 f26774a;

    public q2(t2 t2Var) {
        this.f26774a = t2Var;
    }

    @Override // q1.e1
    public final long a() {
        t2 t2Var = this.f26774a;
        long jA = t2Var.f27040w.a();
        if (jA != 16) {
            return jA;
        }
        fa faVar = (fa) i2.i.a(t2Var, ha.f26009b);
        if (faVar != null) {
            long j10 = faVar.f25879a;
            if (j10 != 16) {
                return j10;
            }
        }
        return ((q1.b1) i2.i.a(t2Var, p2.f26666a)).f21656a;
    }
}
