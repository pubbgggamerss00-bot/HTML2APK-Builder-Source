package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k52 extends v32 implements RandomAccess, n52, t62 {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f6255v;

    /* renamed from: w, reason: collision with root package name */
    public static final k52 f6256w;

    /* renamed from: t, reason: collision with root package name */
    public int[] f6257t;

    /* renamed from: u, reason: collision with root package name */
    public int f6258u;

    static {
        int[] iArr = new int[0];
        f6255v = iArr;
        f6256w = new k52(iArr, 0, false);
    }

    public k52() {
        this(f6255v, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f6258u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f6258u, ", Size:"));
        }
        int i8 = i6 + 1;
        int[] iArr = this.f6257t;
        int length = iArr.length;
        if (i7 < length) {
            System.arraycopy(iArr, i6, iArr, i8, i7 - i6);
        } else {
            int[] iArr2 = new int[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f6257t, 0, iArr2, 0, i6);
            System.arraycopy(this.f6257t, i6, iArr2, i8, this.f6258u - i6);
            this.f6257t = iArr2;
        }
        this.f6257t[i6] = iIntValue;
        this.f6258u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = s52.f8801a;
        collection.getClass();
        if (!(collection instanceof k52)) {
            return super.addAll(collection);
        }
        k52 k52Var = (k52) collection;
        int i6 = k52Var.f6258u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f6258u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        int[] iArr = this.f6257t;
        if (i8 > iArr.length) {
            this.f6257t = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(k52Var.f6257t, 0, this.f6257t, this.f6258u, k52Var.f6258u);
        this.f6258u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i6) {
        g(i6);
        return this.f6257t[i6];
    }

    @Override // com.google.android.gms.internal.ads.r52
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k52 b(int i6) {
        if (i6 >= this.f6258u) {
            return new k52(i6 == 0 ? f6255v : Arrays.copyOf(this.f6257t, i6), this.f6258u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k52)) {
            return super.equals(obj);
        }
        k52 k52Var = (k52) obj;
        if (this.f6258u != k52Var.f6258u) {
            return false;
        }
        int[] iArr = k52Var.f6257t;
        for (int i6 = 0; i6 < this.f6258u; i6++) {
            if (this.f6257t[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i6) {
        c();
        int i7 = this.f6258u;
        int length = this.f6257t.length;
        if (i7 == length) {
            int[] iArr = new int[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f6257t, 0, iArr, 0, this.f6258u);
            this.f6257t = iArr;
        }
        int[] iArr2 = this.f6257t;
        int i8 = this.f6258u;
        this.f6258u = i8 + 1;
        iArr2[i8] = i6;
    }

    public final void g(int i6) {
        if (i6 < 0 || i6 >= this.f6258u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f6258u, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        g(i6);
        return Integer.valueOf(this.f6257t[i6]);
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f6258u; i7++) {
            i6 = (i6 * 31) + this.f6257t[i7];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i6 = this.f6258u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f6257t[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        g(i6);
        int[] iArr = this.f6257t;
        int i7 = iArr[i6];
        if (i6 < this.f6258u - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.f6258u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6257t;
        System.arraycopy(iArr, i7, iArr, i6, this.f6258u - i7);
        this.f6258u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        g(i6);
        int[] iArr = this.f6257t;
        int i7 = iArr[i6];
        iArr[i6] = iIntValue;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6258u;
    }

    public k52(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.f6257t = iArr;
        this.f6258u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
