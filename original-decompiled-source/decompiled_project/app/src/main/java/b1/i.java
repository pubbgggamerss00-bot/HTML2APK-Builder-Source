package b1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i<E> extends a<E> {

    /* renamed from: c, reason: collision with root package name */
    public final E f3501c;

    public i(E e10, int i10) {
        super(i10, 1);
        this.f3501c = e10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3477a++;
        return this.f3501c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f3477a--;
        return this.f3501c;
    }
}
