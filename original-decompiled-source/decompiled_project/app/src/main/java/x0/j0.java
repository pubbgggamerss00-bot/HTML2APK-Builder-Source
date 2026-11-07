package x0;

/* loaded from: classes.dex */
public final class j0 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<l0, k0> f31716a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f31717b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(eh.l<? super l0, ? extends k0> lVar) {
        this.f31716a = lVar;
    }

    @Override // x0.u2
    public final void b() {
    }

    @Override // x0.u2
    public final void c() {
        k0 k0Var = this.f31717b;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f31717b = null;
    }

    @Override // x0.u2
    public final void d() {
        this.f31717b = this.f31716a.invoke(o0.f31834a);
    }
}
