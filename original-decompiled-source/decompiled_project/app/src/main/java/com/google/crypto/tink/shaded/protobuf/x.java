package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class x extends c<Integer> implements RandomAccess, a1 {

    /* renamed from: b, reason: collision with root package name */
    public int[] f6816b;

    /* renamed from: c, reason: collision with root package name */
    public int f6817c;

    static {
        new x(new int[0], 0).f6635a = false;
    }

    public x() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6817c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6817c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        int[] iArr = this.f6816b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f6816b, i10, iArr2, i10 + 1, this.f6817c - i10);
            this.f6816b = iArr2;
        }
        this.f6816b[i10] = iIntValue;
        this.f6817c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = y.f6818a;
        collection.getClass();
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f6817c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6817c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f6816b;
        if (i12 > iArr.length) {
            this.f6816b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(xVar.f6816b, 0, this.f6816b, this.f6817c, xVar.f6817c);
        this.f6817c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i10) {
        a();
        int i11 = this.f6817c;
        int[] iArr = this.f6816b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f6816b = iArr2;
        }
        int[] iArr3 = this.f6816b;
        int i12 = this.f6817c;
        this.f6817c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f6817c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6817c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f6817c != xVar.f6817c) {
            return false;
        }
        int[] iArr = xVar.f6816b;
        for (int i10 = 0; i10 < this.f6817c; i10++) {
            if (this.f6816b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Integer.valueOf(this.f6816b[i10]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6817c; i11++) {
            i10 = (i10 * 31) + this.f6816b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f6817c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6816b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f6817c) {
            return new x(Arrays.copyOf(this.f6816b, i10), this.f6817c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        int[] iArr = this.f6816b;
        int i11 = iArr[i10];
        if (i10 < this.f6817c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f6817c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6816b;
        System.arraycopy(iArr, i11, iArr, i10, this.f6817c - i11);
        this.f6817c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        b(i10);
        int[] iArr = this.f6816b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6817c;
    }

    public x(int[] iArr, int i10) {
        this.f6816b = iArr;
        this.f6817c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
