package nc;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class d<T> extends e1<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f18671a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(mc.f fVar) {
        this.f18671a = fVar;
    }

    public abstract mc.f a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18671a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t3 = this.f18671a;
            this.f18671a = (T) a(t3);
            return t3;
        } catch (Throwable th2) {
            this.f18671a = (T) a(this.f18671a);
            throw th2;
        }
    }
}
