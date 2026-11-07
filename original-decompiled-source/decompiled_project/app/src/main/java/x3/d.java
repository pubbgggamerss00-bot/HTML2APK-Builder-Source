package x3;

/* loaded from: classes.dex */
public final class d<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Object f32055c;

    public d() {
        super(12);
        this.f32055c = new Object();
    }

    @Override // x3.c
    public final T a() {
        T t3;
        synchronized (this.f32055c) {
            t3 = (T) super.a();
        }
        return t3;
    }

    @Override // x3.c
    public final boolean b(T t3) {
        boolean zB;
        synchronized (this.f32055c) {
            zB = super.b(t3);
        }
        return zB;
    }
}
