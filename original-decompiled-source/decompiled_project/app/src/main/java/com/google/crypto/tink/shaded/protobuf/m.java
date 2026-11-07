package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class m extends c<Double> implements RandomAccess, a1 {

    /* renamed from: b, reason: collision with root package name */
    public double[] f6727b;

    /* renamed from: c, reason: collision with root package name */
    public int f6728c;

    static {
        new m(new double[0], 0).f6635a = false;
    }

    public m() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6728c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6728c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        double[] dArr = this.f6727b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f6727b, i10, dArr2, i10 + 1, this.f6728c - i10);
            this.f6727b = dArr2;
        }
        this.f6727b[i10] = dDoubleValue;
        this.f6728c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = y.f6818a;
        collection.getClass();
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f6728c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6728c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f6727b;
        if (i12 > dArr.length) {
            this.f6727b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(mVar.f6727b, 0, this.f6727b, this.f6728c, mVar.f6728c);
        this.f6728c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d10) {
        a();
        int i10 = this.f6728c;
        double[] dArr = this.f6727b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[androidx.datastore.preferences.protobuf.e.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f6727b = dArr2;
        }
        double[] dArr3 = this.f6727b;
        int i11 = this.f6728c;
        this.f6728c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f6728c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6728c);
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
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f6728c != mVar.f6728c) {
            return false;
        }
        double[] dArr = mVar.f6727b;
        for (int i10 = 0; i10 < this.f6728c; i10++) {
            if (Double.doubleToLongBits(this.f6727b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Double.valueOf(this.f6727b[i10]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f6728c; i10++) {
            iB = (iB * 31) + y.b(Double.doubleToLongBits(this.f6727b[i10]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f6728c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6727b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f6728c) {
            return new m(Arrays.copyOf(this.f6727b, i10), this.f6728c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        double[] dArr = this.f6727b;
        double d10 = dArr[i10];
        if (i10 < this.f6728c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f6728c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f6727b;
        System.arraycopy(dArr, i11, dArr, i10, this.f6728c - i11);
        this.f6728c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        b(i10);
        double[] dArr = this.f6727b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6728c;
    }

    public m(double[] dArr, int i10) {
        this.f6727b = dArr;
        this.f6728c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
