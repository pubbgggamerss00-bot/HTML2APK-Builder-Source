package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f22709a;

    /* renamed from: b, reason: collision with root package name */
    public T f22710b;

    public abstract void c();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f22709a;
        if (i10 == 0) {
            this.f22709a = 3;
            c();
            return this.f22709a == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f22709a;
        if (i10 == 1) {
            this.f22709a = 0;
            return this.f22710b;
        }
        if (i10 != 2) {
            this.f22709a = 3;
            c();
            if (this.f22709a == 1) {
                this.f22709a = 0;
                return this.f22710b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
