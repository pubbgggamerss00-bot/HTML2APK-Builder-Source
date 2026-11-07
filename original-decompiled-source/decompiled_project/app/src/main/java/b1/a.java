package b1;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3477a;

    /* renamed from: b, reason: collision with root package name */
    public int f3478b;

    public a(int i10, int i11) {
        this.f3477a = i10;
        this.f3478b = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3477a < this.f3478b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3477a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3477a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3477a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
