package pg;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class r<T> implements j<T>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<r<?>, Object> f21473c = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile eh.a<? extends T> f21474a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f21475b;

    public r() {
        throw null;
    }

    @Override // pg.j
    public final T getValue() {
        T t3 = (T) this.f21475b;
        b0 b0Var = b0.f21449a;
        if (t3 != b0Var) {
            return t3;
        }
        eh.a<? extends T> aVar = this.f21474a;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater<r<?>, Object> atomicReferenceFieldUpdater = f21473c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b0Var, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != b0Var) {
                }
            }
            this.f21474a = null;
            return tInvoke;
        }
        return (T) this.f21475b;
    }

    public final String toString() {
        return this.f21475b != b0.f21449a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
