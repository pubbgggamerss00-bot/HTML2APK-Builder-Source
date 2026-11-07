package be;

/* loaded from: classes2.dex */
public final class c<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f4213a;

    public c(T t3) {
        this.f4213a = t3;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // og.a
    public final T get() {
        return this.f4213a;
    }
}
