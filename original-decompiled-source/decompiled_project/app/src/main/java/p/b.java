package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, fh.b, fh.d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20568a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20569b;

    /* renamed from: c, reason: collision with root package name */
    public int f20570c;

    public final class a extends f<E> {
        public a() {
            super(b.this.f20570c);
        }

        @Override // p.f
        public final E c(int i10) {
            return (E) b.this.f20569b[i10];
        }

        @Override // p.f
        public final void e(int i10) {
            b.this.c(i10);
        }
    }

    public b(int i10) {
        this.f20568a = q.a.f21637a;
        this.f20569b = q.a.f21639c;
        if (i10 > 0) {
            this.f20568a = new int[i10];
            this.f20569b = new Object[i10];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int iC;
        int i11 = this.f20570c;
        if (e10 == null) {
            iC = l5.c.c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iC = l5.c.c(this, e10, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        int[] iArr = this.f20568a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f20569b;
            int[] iArr2 = new int[i13];
            this.f20568a = iArr2;
            this.f20569b = new Object[i13];
            if (i11 != this.f20570c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                qg.m.h(0, iArr, iArr.length, 6, iArr2);
                qg.m.i(objArr, 0, this.f20569b, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f20568a;
            int i14 = i12 + 1;
            qg.m.d(i14, iArr3, i12, i11, iArr3);
            Object[] objArr2 = this.f20569b;
            qg.m.g(objArr2, i14, objArr2, i12, i11);
        }
        int i15 = this.f20570c;
        if (i11 == i15) {
            int[] iArr4 = this.f20568a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f20569b[i12] = e10;
                this.f20570c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        int size = elements.size() + this.f20570c;
        int i10 = this.f20570c;
        int[] iArr = this.f20568a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f20569b;
            int[] iArr2 = new int[size];
            this.f20568a = iArr2;
            this.f20569b = new Object[size];
            if (i10 > 0) {
                qg.m.h(0, iArr, i10, 6, iArr2);
                qg.m.i(objArr, 0, this.f20569b, this.f20570c, 6);
            }
        }
        if (this.f20570c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final E c(int i10) {
        int i11 = this.f20570c;
        Object[] objArr = this.f20569b;
        E e10 = (E) objArr[i10];
        if (i11 <= 1) {
            clear();
            return e10;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f20568a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                qg.m.d(i10, iArr, i13, i11, iArr);
                Object[] objArr2 = this.f20569b;
                qg.m.g(objArr2, i10, objArr2, i13, i11);
            }
            this.f20569b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f20568a = iArr2;
            this.f20569b = new Object[i14];
            if (i10 > 0) {
                qg.m.h(0, iArr, i10, 6, iArr2);
                qg.m.i(objArr, 0, this.f20569b, i10, 6);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                qg.m.d(i10, iArr, i15, i11, this.f20568a);
                qg.m.g(objArr, i10, this.f20569b, i15, i11);
            }
        }
        if (i11 != this.f20570c) {
            throw new ConcurrentModificationException();
        }
        this.f20570c = i12;
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f20570c != 0) {
            this.f20568a = q.a.f21637a;
            this.f20569b = q.a.f21639c;
            this.f20570c = 0;
        }
        if (this.f20570c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? l5.c.c(this, null, 0) : l5.c.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f20570c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f20570c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f20569b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f20568a;
        int i10 = this.f20570c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f20570c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? l5.c.c(this, null, 0) : l5.c.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        c(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f20570c - 1; -1 < i10; i10--) {
            if (!qg.x.w(elements, this.f20569b[i10])) {
                c(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f20570c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return qg.m.k(this.f20569b, 0, this.f20570c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f20570c * 14);
        sb.append('{');
        int i10 = this.f20570c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f20569b[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        int i10 = this.f20570c;
        if (array.length < i10) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), i10));
        } else if (array.length > i10) {
            array[i10] = null;
        }
        qg.m.g(this.f20569b, 0, array, 0, this.f20570c);
        return array;
    }
}
