package pg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class w implements Collection<v>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21484a;

    public static final class a implements Iterator<v>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f21485a;

        /* renamed from: b, reason: collision with root package name */
        public int f21486b;

        public a(byte[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            this.f21485a = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21486b < this.f21485a.length;
        }

        @Override // java.util.Iterator
        public final v next() {
            int i10 = this.f21486b;
            byte[] bArr = this.f21485a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21486b));
            }
            this.f21486b = i10 + 1;
            return new v(bArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(v vVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        byte b10 = ((v) obj).f21483a;
        byte[] bArr = this.f21484a;
        kotlin.jvm.internal.r.e(bArr, "<this>");
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (b10 == bArr[i10]) {
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
                if (obj instanceof v) {
                    byte b10 = ((v) obj).f21483a;
                    byte[] bArr = this.f21484a;
                    kotlin.jvm.internal.r.e(bArr, "<this>");
                    int length = bArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (b10 == bArr[i10]) {
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
        if (obj instanceof w) {
            return kotlin.jvm.internal.r.a(this.f21484a, ((w) obj).f21484a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f21484a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21484a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<v> iterator() {
        return new a(this.f21484a);
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
        return this.f21484a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f21484a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
