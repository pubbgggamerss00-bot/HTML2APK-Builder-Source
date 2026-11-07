package s;

/* loaded from: classes.dex */
public final class s0<S> extends c2.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f23916b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f23917c;

    public s0(S s10) {
        super(2);
        this.f23916b = bg.b.h(s10);
        this.f23917c = bg.b.h(s10);
    }

    @Override // c2.g0
    public final S V() {
        return (S) this.f23916b.getValue();
    }

    @Override // c2.g0
    public final S X() {
        return (S) this.f23917c.getValue();
    }

    @Override // c2.g0
    public final void Z(S s10) {
        this.f23916b.setValue(s10);
    }

    @Override // c2.g0
    public final void a0(y1<S> y1Var) {
    }

    @Override // c2.g0
    public final void b0() {
    }
}
