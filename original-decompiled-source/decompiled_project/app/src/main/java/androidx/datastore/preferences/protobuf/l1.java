package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class l1<E> extends b<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final l1<Object> f2082d = new l1<>(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public E[] f2083b;

    /* renamed from: c, reason: collision with root package name */
    public int f2084c;

    public l1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f2083b = eArr;
        this.f2084c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i10 = this.f2084c;
        E[] eArr = this.f2083b;
        if (i10 == eArr.length) {
            this.f2083b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2083b;
        int i11 = this.f2084c;
        this.f2084c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f2084c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2084c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        b(i10);
        return this.f2083b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2084c) {
            return new l1(Arrays.copyOf(this.f2083b, i10), this.f2084c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        b(i10);
        E[] eArr = this.f2083b;
        E e10 = eArr[i10];
        if (i10 < this.f2084c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f2084c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        b(i10);
        E[] eArr = this.f2083b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2084c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f2084c)) {
            E[] eArr = this.f2083b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[e.a(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f2083b, i10, eArr2, i10 + 1, this.f2084c - i10);
                this.f2083b = eArr2;
            }
            this.f2083b[i10] = e10;
            this.f2084c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
        sbB.append(this.f2084c);
        throw new IndexOutOfBoundsException(sbB.toString());
    }
}
