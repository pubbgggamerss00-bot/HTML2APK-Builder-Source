package t0;

/* loaded from: classes.dex */
public final class s2 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2 f26936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var) {
        super(0);
        this.f26936a = t2Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        x0.m0 m0Var = ha.f26009b;
        t2 t2Var = this.f26936a;
        if (((fa) i2.i.a(t2Var, m0Var)) == null) {
            s0.d dVar = t2Var.f27041x;
            if (dVar != null) {
                t2Var.U1(dVar);
            }
        } else if (t2Var.f27041x == null) {
            q2 q2Var = new q2(t2Var);
            r2 r2Var = new r2(t2Var);
            x.l lVar = t2Var.f27037s;
            boolean z10 = t2Var.f27038t;
            float f10 = t2Var.f27039v;
            s.m2<Float> m2Var = s0.q.f24137a;
            s0.d dVar2 = new s0.d(lVar, z10, f10, q2Var, r2Var);
            t2Var.T1(dVar2);
            t2Var.f27041x = dVar2;
        }
        return pg.f0.f21461a;
    }
}
