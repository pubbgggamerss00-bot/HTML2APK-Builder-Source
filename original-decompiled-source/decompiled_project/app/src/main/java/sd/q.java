package sd;

/* loaded from: classes2.dex */
public final class q<T> implements fe.b<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24876c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f24877a = f24876c;

    /* renamed from: b, reason: collision with root package name */
    public volatile fe.b<T> f24878b;

    public q(fe.b<T> bVar) {
        this.f24878b = bVar;
    }

    @Override // fe.b
    public final T get() {
        T t3;
        T t10 = (T) this.f24877a;
        Object obj = f24876c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t3 = (T) this.f24877a;
                if (t3 == obj) {
                    t3 = this.f24878b.get();
                    this.f24877a = t3;
                    this.f24878b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3;
    }
}
