package pg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d0 implements Collection<c0>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f21456a;

    public static final class a implements Iterator<c0>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final short[] f21457a;

        /* renamed from: b, reason: collision with root package name */
        public int f21458b;

        public a(short[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            this.f21457a = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21458b < this.f21457a.length;
        }

        @Override // java.util.Iterator
        public final c0 next() {
            int i10 = this.f21458b;
            short[] sArr = this.f21457a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21458b));
            }
            this.f21458b = i10 + 1;
            return new c0(sArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(c0 c0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends c0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        short s10 = ((c0) obj).f21455a;
        short[] sArr = this.f21456a;
        kotlin.jvm.internal.r.e(sArr, "<this>");
        int length = sArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (s10 == sArr[i10]) {
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
                if (obj instanceof c0) {
                    short s10 = ((c0) obj).f21455a;
                    short[] sArr = this.f21456a;
                    kotlin.jvm.internal.r.e(sArr, "<this>");
                    int length = sArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (s10 == sArr[i10]) {
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
        if (obj instanceof d0) {
            return kotlin.jvm.internal.r.a(this.f21456a, ((d0) obj).f21456a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f21456a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21456a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<c0> iterator() {
        return new a(this.f21456a);
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
        return this.f21456a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f21456a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
