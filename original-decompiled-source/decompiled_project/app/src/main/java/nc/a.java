package nc;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class a<E> extends e1<Object> implements ListIterator<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final int f18657a;

    /* renamed from: b, reason: collision with root package name */
    public int f18658b;

    public a(int i10, int i11) {
        g8.w.f(i11, i10);
        this.f18657a = i10;
        this.f18658b = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18658b < this.f18657a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18658b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18658b;
        this.f18658b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18658b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18658b - 1;
        this.f18658b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18658b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
