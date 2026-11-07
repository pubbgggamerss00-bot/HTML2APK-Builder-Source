package c0;

import d0.b2;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements eh.a<r> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.g0 f4484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f4485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x0.g0 g0Var, w0 w0Var) {
        super(0);
        this.f4484a = g0Var;
        this.f4485b = w0Var;
    }

    @Override // eh.a
    public final r invoke() {
        j jVar = (j) this.f4484a.getValue();
        w0 w0Var = this.f4485b;
        return new r(w0Var, jVar, new b2((jh.g) w0Var.f4508d.f4474e.getValue(), jVar));
    }
}
