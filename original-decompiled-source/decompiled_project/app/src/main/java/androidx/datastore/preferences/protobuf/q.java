package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class q extends b<Double> implements d0.b, RandomAccess, i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final q f2130d = new q(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public double[] f2131b;

    /* renamed from: c, reason: collision with root package name */
    public int f2132c;

    public q() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f2132c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2132c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        double[] dArr = this.f2131b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[e.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2131b, i10, dArr2, i10 + 1, this.f2132c - i10);
            this.f2131b = dArr2;
        }
        this.f2131b[i10] = dDoubleValue;
        this.f2132c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = d0.f2005a;
        collection.getClass();
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f2132c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2132c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f2131b;
        if (i12 > dArr.length) {
            this.f2131b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(qVar.f2131b, 0, this.f2131b, this.f2132c, qVar.f2132c);
        this.f2132c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d10) {
        a();
        int i10 = this.f2132c;
        double[] dArr = this.f2131b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[e.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f2131b = dArr2;
        }
        double[] dArr3 = this.f2131b;
        int i11 = this.f2132c;
        this.f2132c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f2132c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f2132c);
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
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        if (this.f2132c != qVar.f2132c) {
            return false;
        }
        double[] dArr = qVar.f2131b;
        for (int i10 = 0; i10 < this.f2132c; i10++) {
            if (Double.doubleToLongBits(this.f2131b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Double.valueOf(this.f2131b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f2132c; i10++) {
            iB = (iB * 31) + d0.b(Double.doubleToLongBits(this.f2131b[i10]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f2132c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2131b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j<Double> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2132c) {
            return new q(Arrays.copyOf(this.f2131b, i10), this.f2132c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        double[] dArr = this.f2131b;
        double d10 = dArr[i10];
        if (i10 < this.f2132c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f2132c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f2131b;
        System.arraycopy(dArr, i11, dArr, i10, this.f2132c - i11);
        this.f2132c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        b(i10);
        double[] dArr = this.f2131b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2132c;
    }

    public q(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f2131b = dArr;
        this.f2132c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
