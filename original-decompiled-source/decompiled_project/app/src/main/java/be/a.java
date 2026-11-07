package be;

/* loaded from: classes2.dex */
public final class a<T> implements og.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4210c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f4211a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4212b;

    @Override // og.a
    public final T get() {
        T t3;
        T t10 = (T) this.f4212b;
        Object obj = f4210c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t3 = (T) this.f4212b;
                if (t3 == obj) {
                    t3 = this.f4211a.get();
                    Object obj2 = this.f4212b;
                    if (obj2 != obj && obj2 != t3) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                    }
                    this.f4212b = t3;
                    this.f4211a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3;
    }
}
