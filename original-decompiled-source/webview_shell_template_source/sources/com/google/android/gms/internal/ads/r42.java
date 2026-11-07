package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r42 extends v32 implements RandomAccess, t62 {

    /* renamed from: v, reason: collision with root package name */
    public static final double[] f8541v;

    /* renamed from: t, reason: collision with root package name */
    public double[] f8542t;

    /* renamed from: u, reason: collision with root package name */
    public int f8543u;

    static {
        double[] dArr = new double[0];
        f8541v = dArr;
        new r42(dArr, 0, false);
    }

    public r42() {
        this(f8541v, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f8543u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f8543u, ", Size:"));
        }
        int i8 = i6 + 1;
        double[] dArr = this.f8542t;
        int length = dArr.length;
        if (i7 < length) {
            System.arraycopy(dArr, i6, dArr, i8, i7 - i6);
        } else {
            double[] dArr2 = new double[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f8542t, 0, dArr2, 0, i6);
            System.arraycopy(this.f8542t, i6, dArr2, i8, this.f8543u - i6);
            this.f8542t = dArr2;
        }
        this.f8542t[i6] = dDoubleValue;
        this.f8543u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = s52.f8801a;
        collection.getClass();
        if (!(collection instanceof r42)) {
            return super.addAll(collection);
        }
        r42 r42Var = (r42) collection;
        int i6 = r42Var.f8543u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f8543u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        double[] dArr = this.f8542t;
        if (i8 > dArr.length) {
            this.f8542t = Arrays.copyOf(dArr, i8);
        }
        System.arraycopy(r42Var.f8542t, 0, this.f8542t, this.f8543u, r42Var.f8543u);
        this.f8543u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r52
    public final r52 b(int i6) {
        if (i6 >= this.f8543u) {
            return new r42(i6 == 0 ? f8541v : Arrays.copyOf(this.f8542t, i6), this.f8543u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d7) {
        c();
        int i6 = this.f8543u;
        int length = this.f8542t.length;
        if (i6 == length) {
            double[] dArr = new double[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f8542t, 0, dArr, 0, this.f8543u);
            this.f8542t = dArr;
        }
        double[] dArr2 = this.f8542t;
        int i7 = this.f8543u;
        this.f8543u = i7 + 1;
        dArr2[i7] = d7;
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f8543u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f8543u, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r42)) {
            return super.equals(obj);
        }
        r42 r42Var = (r42) obj;
        if (this.f8543u != r42Var.f8543u) {
            return false;
        }
        double[] dArr = r42Var.f8542t;
        for (int i6 = 0; i6 < this.f8543u; i6++) {
            if (Double.doubleToLongBits(this.f8542t[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Double.valueOf(this.f8542t[i6]);
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f8543u; i7++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f8542t[i7]);
            Charset charset = s52.f8801a;
            i6 = (i6 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i6 = this.f8543u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f8542t[i7] == dDoubleValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        e(i6);
        double[] dArr = this.f8542t;
        double d7 = dArr[i6];
        if (i6 < this.f8543u - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (r3 - i6) - 1);
        }
        this.f8543u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f8542t;
        System.arraycopy(dArr, i7, dArr, i6, this.f8543u - i7);
        this.f8543u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        e(i6);
        double[] dArr = this.f8542t;
        double d7 = dArr[i6];
        dArr[i6] = dDoubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8543u;
    }

    public r42(double[] dArr, int i6, boolean z6) {
        super(z6);
        this.f8542t = dArr;
        this.f8543u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
