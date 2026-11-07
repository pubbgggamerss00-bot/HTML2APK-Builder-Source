package pg;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g0<T> implements j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public eh.a<? extends T> f21462a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21463b;

    @Override // pg.j
    public final T getValue() {
        if (this.f21463b == b0.f21449a) {
            eh.a<? extends T> aVar = this.f21462a;
            kotlin.jvm.internal.r.b(aVar);
            this.f21463b = aVar.invoke();
            this.f21462a = null;
        }
        return (T) this.f21463b;
    }

    public final String toString() {
        return this.f21463b != b0.f21449a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
