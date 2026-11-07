package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class d1<E> extends c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final d1<Object> f6644d;

    /* renamed from: b, reason: collision with root package name */
    public E[] f6645b;

    /* renamed from: c, reason: collision with root package name */
    public int f6646c;

    static {
        d1<Object> d1Var = new d1<>(new Object[0], 0);
        f6644d = d1Var;
        d1Var.f6635a = false;
    }

    public d1(E[] eArr, int i10) {
        this.f6645b = eArr;
        this.f6646c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i10 = this.f6646c;
        E[] eArr = this.f6645b;
        if (i10 == eArr.length) {
            this.f6645b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6645b;
        int i11 = this.f6646c;
        this.f6646c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f6646c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6646c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        b(i10);
        return this.f6645b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f6646c) {
            return new d1(Arrays.copyOf(this.f6645b, i10), this.f6646c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        b(i10);
        E[] eArr = this.f6645b;
        E e10 = eArr[i10];
        if (i10 < this.f6646c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f6646c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        b(i10);
        E[] eArr = this.f6645b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6646c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f6646c)) {
            E[] eArr = this.f6645b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f6645b, i10, eArr2, i10 + 1, this.f6646c - i10);
                this.f6645b = eArr2;
            }
            this.f6645b[i10] = e10;
            this.f6646c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
        sbB.append(this.f6646c);
        throw new IndexOutOfBoundsException(sbB.toString());
    }
}
