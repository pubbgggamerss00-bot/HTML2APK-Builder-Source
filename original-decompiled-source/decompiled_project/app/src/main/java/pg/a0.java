package pg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a0 implements Collection<z>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f21446a;

    public static final class a implements Iterator<z>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f21447a;

        /* renamed from: b, reason: collision with root package name */
        public int f21448b;

        public a(long[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            this.f21447a = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21448b < this.f21447a.length;
        }

        @Override // java.util.Iterator
        public final z next() {
            int i10 = this.f21448b;
            long[] jArr = this.f21447a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21448b));
            }
            this.f21448b = i10 + 1;
            return new z(jArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(z zVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends z> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        long j10 = ((z) obj).f21493a;
        long[] jArr = this.f21446a;
        kotlin.jvm.internal.r.e(jArr, "<this>");
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (j10 == jArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Collection<?> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof z) {
                    long j10 = ((z) obj).f21493a;
                    long[] jArr = this.f21446a;
                    kotlin.jvm.internal.r.e(jArr, "<this>");
                    int length = jArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (j10 == jArr[i10]) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return kotlin.jvm.internal.r.a(this.f21446a, ((a0) obj).f21446a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f21446a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21446a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<z> iterator() {
        return new a(this.f21446a);
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
        return this.f21446a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f21446a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
