package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n0 extends b<Long> implements d0.i, RandomAccess, i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f2102d = new n0(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public long[] f2103b;

    /* renamed from: c, reason: collision with root package name */
    public int f2104c;

    public n0() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f2104c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2104c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        long[] jArr = this.f2103b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[e.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2103b, i10, jArr2, i10 + 1, this.f2104c - i10);
            this.f2103b = jArr2;
        }
        this.f2103b[i10] = jLongValue;
        this.f2104c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = d0.f2005a;
        collection.getClass();
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i10 = n0Var.f2104c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2104c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f2103b;
        if (i12 > jArr.length) {
            this.f2103b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(n0Var.f2103b, 0, this.f2103b, this.f2104c, n0Var.f2104c);
        this.f2104c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j10) {
        a();
        int i10 = this.f2104c;
        long[] jArr = this.f2103b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[e.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2103b = jArr2;
        }
        long[] jArr3 = this.f2103b;
        int i11 = this.f2104c;
        this.f2104c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f2104c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2104c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.f2104c != n0Var.f2104c) {
            return false;
        }
        long[] jArr = n0Var.f2103b;
        for (int i10 = 0; i10 < this.f2104c; i10++) {
            if (this.f2103b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    public final long getLong(int i10) {
        b(i10);
        return this.f2103b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f2104c; i10++) {
            iB = (iB * 31) + d0.b(this.f2103b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f2104c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2103b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j<Long> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2104c) {
            return new n0(Arrays.copyOf(this.f2103b, i10), this.f2104c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        long[] jArr = this.f2103b;
        long j10 = jArr[i10];
        if (i10 < this.f2104c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f2104c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2103b;
        System.arraycopy(jArr, i11, jArr, i10, this.f2104c - i11);
        this.f2104c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        b(i10);
        long[] jArr = this.f2103b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2104c;
    }

    public n0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f2103b = jArr;
        this.f2104c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
