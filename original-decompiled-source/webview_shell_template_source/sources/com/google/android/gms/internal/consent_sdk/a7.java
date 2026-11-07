package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a7 extends z5 implements RandomAccess, c7 {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f11631v;

    /* renamed from: w, reason: collision with root package name */
    public static final a7 f11632w;

    /* renamed from: t, reason: collision with root package name */
    public int[] f11633t;

    /* renamed from: u, reason: collision with root package name */
    public int f11634u;

    static {
        int[] iArr = new int[0];
        f11631v = iArr;
        f11632w = new a7(iArr, 0, false);
    }

    public a7() {
        this(f11631v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.d7
    public final /* bridge */ /* synthetic */ d7 a(int i6) {
        if (i6 >= this.f11634u) {
            return new a7(i6 == 0 ? f11631v : Arrays.copyOf(this.f11633t, i6), this.f11634u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f11634u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11634u, ", Size:"));
        }
        int i8 = i6 + 1;
        int[] iArr = this.f11633t;
        int length = iArr.length;
        if (i7 < length) {
            System.arraycopy(iArr, i6, iArr, i8, i7 - i6);
        } else {
            int[] iArr2 = new int[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11633t, 0, iArr2, 0, i6);
            System.arraycopy(this.f11633t, i6, iArr2, i8, this.f11634u - i6);
            this.f11633t = iArr2;
        }
        this.f11633t[i6] = iIntValue;
        this.f11634u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = e7.f11716a;
        collection.getClass();
        if (!(collection instanceof a7)) {
            return super.addAll(collection);
        }
        a7 a7Var = (a7) collection;
        int i6 = a7Var.f11634u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f11634u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        int[] iArr = this.f11633t;
        if (i8 > iArr.length) {
            this.f11633t = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(a7Var.f11633t, 0, this.f11633t, this.f11634u, a7Var.f11634u);
        this.f11634u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i6) {
        e(i6);
        return this.f11633t[i6];
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f11634u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11634u, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return super.equals(obj);
        }
        a7 a7Var = (a7) obj;
        if (this.f11634u != a7Var.f11634u) {
            return false;
        }
        int[] iArr = a7Var.f11633t;
        for (int i6 = 0; i6 < this.f11634u; i6++) {
            if (this.f11633t[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Integer.valueOf(this.f11633t[i6]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f11634u; i7++) {
            i6 = (i6 * 31) + this.f11633t[i7];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i6 = this.f11634u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f11633t[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        e(i6);
        int[] iArr = this.f11633t;
        int i7 = iArr[i6];
        if (i6 < this.f11634u - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.f11634u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11633t;
        System.arraycopy(iArr, i7, iArr, i6, this.f11634u - i7);
        this.f11634u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        e(i6);
        int[] iArr = this.f11633t;
        int i7 = iArr[i6];
        iArr[i6] = iIntValue;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11634u;
    }

    public a7(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.f11633t = iArr;
        this.f11634u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        int i6 = this.f11634u;
        int length = this.f11633t.length;
        if (i6 == length) {
            int[] iArr = new int[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11633t, 0, iArr, 0, this.f11634u);
            this.f11633t = iArr;
        }
        int[] iArr2 = this.f11633t;
        int i7 = this.f11634u;
        this.f11634u = i7 + 1;
        iArr2[i7] = iIntValue;
        return true;
    }
}
