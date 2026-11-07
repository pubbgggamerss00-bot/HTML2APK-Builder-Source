package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f extends b<Boolean> implements d0.a, RandomAccess, i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f2010d = new f(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f2011b;

    /* renamed from: c, reason: collision with root package name */
    public int f2012c;

    public f() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f2012c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2012c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        boolean[] zArr = this.f2011b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[e.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2011b, i10, zArr2, i10 + 1, this.f2012c - i10);
            this.f2011b = zArr2;
        }
        this.f2011b[i10] = zBooleanValue;
        this.f2012c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = d0.f2005a;
        collection.getClass();
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f2012c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2012c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f2011b;
        if (i12 > zArr.length) {
            this.f2011b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(fVar.f2011b, 0, this.f2011b, this.f2012c, fVar.f2012c);
        this.f2012c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z10) {
        a();
        int i10 = this.f2012c;
        boolean[] zArr = this.f2011b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[e.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2011b = zArr2;
        }
        boolean[] zArr3 = this.f2011b;
        int i11 = this.f2012c;
        this.f2012c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f2012c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2012c);
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
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f2012c != fVar.f2012c) {
            return false;
        }
        boolean[] zArr = fVar.f2011b;
        for (int i10 = 0; i10 < this.f2012c; i10++) {
            if (this.f2011b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Boolean.valueOf(this.f2011b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2012c; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f2011b[i11];
            Charset charset = d0.f2005a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f2012c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2011b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j<Boolean> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2012c) {
            return new f(Arrays.copyOf(this.f2011b, i10), this.f2012c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        boolean[] zArr = this.f2011b;
        boolean z10 = zArr[i10];
        if (i10 < this.f2012c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f2012c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2011b;
        System.arraycopy(zArr, i11, zArr, i10, this.f2012c - i11);
        this.f2012c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        b(i10);
        boolean[] zArr = this.f2011b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2012c;
    }

    public f(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f2011b = zArr;
        this.f2012c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
