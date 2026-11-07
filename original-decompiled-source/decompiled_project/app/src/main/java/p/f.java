package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class f<T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f20612a;

    /* renamed from: b, reason: collision with root package name */
    public int f20613b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20614c;

    public f(int i10) {
        this.f20612a = i10;
    }

    public abstract T c(int i10);

    public abstract void e(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20613b < this.f20612a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tC = c(this.f20613b);
        this.f20613b++;
        this.f20614c = true;
        return tC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20614c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f20613b - 1;
        this.f20613b = i10;
        e(i10);
        this.f20612a--;
        this.f20614c = false;
    }
}
