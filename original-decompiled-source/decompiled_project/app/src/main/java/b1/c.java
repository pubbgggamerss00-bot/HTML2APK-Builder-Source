package b1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    public final T[] f3480c;

    public c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        this.f3480c = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3477a;
        this.f3477a = i10 + 1;
        return this.f3480c[i10];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3477a - 1;
        this.f3477a = i10;
        return this.f3480c[i10];
    }
}
