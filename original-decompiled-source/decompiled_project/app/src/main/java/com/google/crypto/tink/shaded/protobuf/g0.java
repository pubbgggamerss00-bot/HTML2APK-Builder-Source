package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class g0 extends c<Long> implements RandomAccess, a1 {

    /* renamed from: b, reason: collision with root package name */
    public long[] f6663b;

    /* renamed from: c, reason: collision with root package name */
    public int f6664c;

    static {
        new g0(new long[0], 0).f6635a = false;
    }

    public g0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6664c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6664c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        long[] jArr = this.f6663b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f6663b, i10, jArr2, i10 + 1, this.f6664c - i10);
            this.f6663b = jArr2;
        }
        this.f6663b[i10] = jLongValue;
        this.f6664c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = y.f6818a;
        collection.getClass();
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f6664c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6664c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f6663b;
        if (i12 > jArr.length) {
            this.f6663b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(g0Var.f6663b, 0, this.f6663b, this.f6664c, g0Var.f6664c);
        this.f6664c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j10) {
        a();
        int i10 = this.f6664c;
        long[] jArr = this.f6663b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[androidx.datastore.preferences.protobuf.e.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f6663b = jArr2;
        }
        long[] jArr3 = this.f6663b;
        int i11 = this.f6664c;
        this.f6664c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f6664c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6664c);
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
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f6664c != g0Var.f6664c) {
            return false;
        }
        long[] jArr = g0Var.f6663b;
        for (int i10 = 0; i10 < this.f6664c; i10++) {
            if (this.f6663b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Long.valueOf(this.f6663b[i10]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f6664c; i10++) {
            iB = (iB * 31) + y.b(this.f6663b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f6664c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6663b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f6664c) {
            return new g0(Arrays.copyOf(this.f6663b, i10), this.f6664c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        long[] jArr = this.f6663b;
        long j10 = jArr[i10];
        if (i10 < this.f6664c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f6664c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6663b;
        System.arraycopy(jArr, i11, jArr, i10, this.f6664c - i11);
        this.f6664c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        b(i10);
        long[] jArr = this.f6663b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6664c;
    }

    public g0(long[] jArr, int i10) {
        this.f6663b = jArr;
        this.f6664c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
