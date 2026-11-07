package w;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, q5.a {
    public int[] s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f14834t;

    /* renamed from: u, reason: collision with root package name */
    public int f14835u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class a extends c<E> {
        public a() {
            super(b.this.f14835u);
        }

        @Override // w.c
        public final E a(int i6) {
            return (E) b.this.f14834t[i6];
        }

        @Override // w.c
        public final void b(int i6) {
            b.this.c(i6);
        }
    }

    public b(int i6) {
        this.s = x.a.f15105a;
        this.f14834t = x.a.f15106b;
        if (i6 > 0) {
            this.s = new int[i6];
            this.f14834t = new Object[i6];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e6) {
        int i6;
        int iH;
        int i7 = this.f14835u;
        if (e6 == null) {
            iH = f5.b.h(this, null, 0);
            i6 = 0;
        } else {
            int iHashCode = e6.hashCode();
            i6 = iHashCode;
            iH = f5.b.h(this, e6, iHashCode);
        }
        if (iH >= 0) {
            return false;
        }
        int i8 = ~iH;
        int[] iArr = this.s;
        if (i7 >= iArr.length) {
            int i9 = 8;
            if (i7 >= 8) {
                i9 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f14834t;
            int[] iArr2 = new int[i9];
            this.s = iArr2;
            this.f14834t = new Object[i9];
            if (i7 != this.f14835u) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                e5.i.d(0, 0, iArr, iArr2, iArr.length);
                e5.i.e(0, objArr.length, 6, objArr, this.f14834t);
            }
        }
        if (i8 < i7) {
            int[] iArr3 = this.s;
            int i10 = i8 + 1;
            e5.i.d(i10, i8, iArr3, iArr3, i7);
            Object[] objArr2 = this.f14834t;
            e5.i.c(i10, i8, i7, objArr2, objArr2);
        }
        int i11 = this.f14835u;
        if (i7 == i11) {
            int[] iArr4 = this.s;
            if (i8 < iArr4.length) {
                iArr4[i8] = i6;
                this.f14834t[i8] = e6;
                this.f14835u = i11 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        j.e("elements", collection);
        int size = collection.size() + this.f14835u;
        int i6 = this.f14835u;
        int[] iArr = this.s;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f14834t;
            int[] iArr2 = new int[size];
            this.s = iArr2;
            this.f14834t = new Object[size];
            if (i6 > 0) {
                e5.i.d(0, 0, iArr, iArr2, i6);
                e5.i.e(0, this.f14835u, 6, objArr, this.f14834t);
            }
        }
        if (this.f14835u != i6) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final E c(int i6) {
        int i7 = this.f14835u;
        Object[] objArr = this.f14834t;
        E e6 = (E) objArr[i6];
        if (i7 <= 1) {
            clear();
            return e6;
        }
        int i8 = i7 - 1;
        int[] iArr = this.s;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i6 < i8) {
                int i9 = i6 + 1;
                e5.i.d(i6, i9, iArr, iArr, i7);
                Object[] objArr2 = this.f14834t;
                e5.i.c(i6, i9, i7, objArr2, objArr2);
            }
            this.f14834t[i8] = null;
        } else {
            int i10 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] iArr2 = new int[i10];
            this.s = iArr2;
            this.f14834t = new Object[i10];
            if (i6 > 0) {
                e5.i.d(0, 0, iArr, iArr2, i6);
                e5.i.e(0, i6, 6, objArr, this.f14834t);
            }
            if (i6 < i8) {
                int i11 = i6 + 1;
                e5.i.d(i6, i11, iArr, this.s, i7);
                e5.i.c(i6, i11, i7, objArr, this.f14834t);
            }
        }
        if (i7 != this.f14835u) {
            throw new ConcurrentModificationException();
        }
        this.f14835u = i8;
        return e6;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f14835u != 0) {
            this.s = x.a.f15105a;
            this.f14834t = x.a.f15106b;
            this.f14835u = 0;
        }
        if (this.f14835u != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? f5.b.h(this, null, 0) : f5.b.h(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        Iterator<? extends Object> it = collection.iterator();
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
        if (!(obj instanceof Set) || this.f14835u != ((Set) obj).size()) {
            return false;
        }
        try {
            int i6 = this.f14835u;
            for (int i7 = 0; i7 < i6; i7++) {
                if (!((Set) obj).contains(this.f14834t[i7])) {
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
        int[] iArr = this.s;
        int i6 = this.f14835u;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14835u <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iH = obj == null ? f5.b.h(this, null, 0) : f5.b.h(this, obj, obj.hashCode());
        if (iH < 0) {
            return false;
        }
        c(iH);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.e("elements", collection);
        boolean z6 = false;
        for (int i6 = this.f14835u - 1; -1 < i6; i6--) {
            if (!collection.contains(this.f14834t[i6])) {
                c(i6);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f14835u;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f14834t;
        int i6 = this.f14835u;
        j.e("<this>", objArr);
        e5.i.f(i6, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i6);
        j.d("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14835u * 14);
        sb.append('{');
        int i6 = this.f14835u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f14834t[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        j.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        j.e("array", tArr);
        int i6 = this.f14835u;
        if (tArr.length < i6) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i6));
        } else if (tArr.length > i6) {
            tArr[i6] = null;
        }
        e5.i.c(0, 0, this.f14835u, this.f14834t, tArr);
        return tArr;
    }
}
