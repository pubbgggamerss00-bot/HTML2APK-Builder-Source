package pg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class y implements Collection<x>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21489a;

    public static final class a implements Iterator<x>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f21490a;

        /* renamed from: b, reason: collision with root package name */
        public int f21491b;

        public a(int[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            this.f21490a = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21491b < this.f21490a.length;
        }

        @Override // java.util.Iterator
        public final x next() {
            int i10 = this.f21491b;
            int[] iArr = this.f21490a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21491b));
            }
            this.f21491b = i10 + 1;
            return new x(iArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        int i10 = ((x) obj).f21488a;
        int[] iArr = this.f21489a;
        kotlin.jvm.internal.r.e(iArr, "<this>");
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (i10 == iArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Collection<?> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof x) {
                    int i10 = ((x) obj).f21488a;
                    int[] iArr = this.f21489a;
                    kotlin.jvm.internal.r.e(iArr, "<this>");
                    int length = iArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        }
                        if (i10 == iArr[i11]) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return kotlin.jvm.internal.r.a(this.f21489a, ((y) obj).f21489a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f21489a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21489a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<x> iterator() {
        return new a(this.f21489a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f21489a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f21489a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
