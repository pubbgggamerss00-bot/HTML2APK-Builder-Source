package x0;

/* loaded from: classes.dex */
public final class d2<T> implements c2<T>, n1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f31630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<T> f31631b;

    public d2(n1<T> n1Var, tg.h hVar) {
        this.f31630a = hVar;
        this.f31631b = n1Var;
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        return this.f31630a;
    }

    @Override // x0.r3
    public final T getValue() {
        return this.f31631b.getValue();
    }

    @Override // x0.n1
    public final void setValue(T t3) {
        this.f31631b.setValue(t3);
    }
}
