package t9;

/* loaded from: classes.dex */
public final class a<T> implements og.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f28614c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f28615a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f28616b;

    public static og.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f28616b = f28614c;
        aVar.f28615a = bVar;
        return aVar;
    }

    @Override // og.a
    public final T get() {
        T t3;
        T t10 = (T) this.f28616b;
        Object obj = f28614c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t3 = (T) this.f28616b;
                if (t3 == obj) {
                    t3 = this.f28615a.get();
                    Object obj2 = this.f28616b;
                    if (obj2 != obj && obj2 != t3) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                    }
                    this.f28616b = t3;
                    this.f28615a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3;
    }
}
