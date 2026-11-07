package t8;

/* loaded from: classes.dex */
public final class g0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f28224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f28225b;

    public g0(q0 q0Var, x xVar) {
        this.f28224a = q0Var;
        this.f28225b = xVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        String str = this.f28225b.f28557a;
        q0 q0Var = this.f28224a;
        ae.m mVar = q0Var.f28403b.f11600d;
        if (mVar != null) {
            ph.h.c(androidx.lifecycle.x0.a(q0Var), null, null, new o0(mVar, str, q0Var, null), 3);
        }
        return pg.f0.f21461a;
    }
}
