package i2;

/* loaded from: classes.dex */
public final class q1 implements w1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14006b = a.f14008a;

    /* renamed from: a, reason: collision with root package name */
    public final o1 f14007a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<q1, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14008a = new a(1);

        @Override // eh.l
        public final pg.f0 invoke(q1 q1Var) {
            q1 q1Var2 = q1Var;
            if (q1Var2.U()) {
                q1Var2.f14007a.V0();
            }
            return pg.f0.f21461a;
        }
    }

    public q1(o1 o1Var) {
        this.f14007a = o1Var;
    }

    @Override // i2.w1
    public final boolean U() {
        return this.f14007a.B().f1157p;
    }
}
