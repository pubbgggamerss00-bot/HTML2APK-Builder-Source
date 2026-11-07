package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b<T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f16316a;

    /* renamed from: b, reason: collision with root package name */
    public int f16317b;

    public b(T[] array) {
        r.e(array, "array");
        this.f16316a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16317b < this.f16316a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f16316a;
            int i10 = this.f16317b;
            this.f16317b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f16317b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
