package p3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements ListIterator, Iterator {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public int f14083t;

    /* renamed from: u, reason: collision with root package name */
    public final f f14084u;

    public c(f fVar, int i6) {
        int size = fVar.size();
        if (i6 < 0 || i6 > size) {
            throw new IndexOutOfBoundsException(l.c(i6, size, "index"));
        }
        this.s = size;
        this.f14083t = i6;
        this.f14084u = fVar;
    }

    public final Object a(int i6) {
        return this.f14084u.get(i6);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14083t < this.s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14083t > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f14083t;
        this.f14083t = i6 + 1;
        return a(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14083t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f14083t - 1;
        this.f14083t = i6;
        return a(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14083t - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
