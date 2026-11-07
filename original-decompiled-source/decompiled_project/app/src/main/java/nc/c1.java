package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class c1<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f18670a;

    public c1(Iterator<? extends F> it) {
        it.getClass();
        this.f18670a = it;
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18670a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f18670a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18670a.remove();
    }
}
