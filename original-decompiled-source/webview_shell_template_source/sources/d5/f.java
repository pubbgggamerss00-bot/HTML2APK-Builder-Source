package d5;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f<T> implements b<T>, Serializable {
    public p5.a<? extends T> s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Object f12740t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f12741u;

    public f(p5.a aVar) {
        kotlin.jvm.internal.j.e("initializer", aVar);
        this.s = aVar;
        this.f12740t = h.f12744a;
        this.f12741u = this;
    }

    @Override // d5.b
    public final T getValue() {
        T tA;
        T t6 = (T) this.f12740t;
        h hVar = h.f12744a;
        if (t6 != hVar) {
            return t6;
        }
        synchronized (this.f12741u) {
            tA = (T) this.f12740t;
            if (tA == hVar) {
                p5.a<? extends T> aVar = this.s;
                kotlin.jvm.internal.j.b(aVar);
                tA = aVar.a();
                this.f12740t = tA;
                this.s = null;
            }
        }
        return tA;
    }

    public final String toString() {
        return this.f12740t != h.f12744a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
