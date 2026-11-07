package pg;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s<T> implements j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public eh.a<? extends T> f21476a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f21477b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21478c;

    public s(eh.a initializer) {
        kotlin.jvm.internal.r.e(initializer, "initializer");
        this.f21476a = initializer;
        this.f21477b = b0.f21449a;
        this.f21478c = this;
    }

    @Override // pg.j
    public final T getValue() {
        T tInvoke;
        T t3 = (T) this.f21477b;
        b0 b0Var = b0.f21449a;
        if (t3 != b0Var) {
            return t3;
        }
        synchronized (this.f21478c) {
            tInvoke = (T) this.f21477b;
            if (tInvoke == b0Var) {
                eh.a<? extends T> aVar = this.f21476a;
                kotlin.jvm.internal.r.b(aVar);
                tInvoke = aVar.invoke();
                this.f21477b = tInvoke;
                this.f21476a = null;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return this.f21477b != b0.f21449a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
