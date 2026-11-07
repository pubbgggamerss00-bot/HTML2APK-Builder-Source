package ng;

/* loaded from: classes2.dex */
public final class a<T> implements c<T>, cg.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18805c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c<T> f18806a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f18807b = f18805c;

    public a(c<T> cVar) {
        this.f18806a = cVar;
    }

    public static <T> c<T> a(c<T> cVar) {
        return cVar instanceof a ? cVar : new a(cVar);
    }

    @Override // og.a
    public final T get() {
        T t3;
        T t10 = (T) this.f18807b;
        Object obj = f18805c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            t3 = (T) this.f18807b;
            if (t3 == obj) {
                t3 = this.f18806a.get();
                Object obj2 = this.f18807b;
                if (obj2 != obj && obj2 != t3) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                }
                this.f18807b = t3;
                this.f18806a = null;
            }
        }
        return t3;
    }
}
