package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b52 extends v32 implements RandomAccess, t62 {

    /* renamed from: v, reason: collision with root package name */
    public static final float[] f2927v;

    /* renamed from: t, reason: collision with root package name */
    public float[] f2928t;

    /* renamed from: u, reason: collision with root package name */
    public int f2929u;

    static {
        float[] fArr = new float[0];
        f2927v = fArr;
        new b52(fArr, 0, false);
    }

    public b52() {
        this(f2927v, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f2929u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f2929u, ", Size:"));
        }
        int i8 = i6 + 1;
        float[] fArr = this.f2928t;
        int length = fArr.length;
        if (i7 < length) {
            System.arraycopy(fArr, i6, fArr, i8, i7 - i6);
        } else {
            float[] fArr2 = new float[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f2928t, 0, fArr2, 0, i6);
            System.arraycopy(this.f2928t, i6, fArr2, i8, this.f2929u - i6);
            this.f2928t = fArr2;
        }
        this.f2928t[i6] = fFloatValue;
        this.f2929u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = s52.f8801a;
        collection.getClass();
        if (!(collection instanceof b52)) {
            return super.addAll(collection);
        }
        b52 b52Var = (b52) collection;
        int i6 = b52Var.f2929u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f2929u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        float[] fArr = this.f2928t;
        if (i8 > fArr.length) {
            this.f2928t = Arrays.copyOf(fArr, i8);
        }
        System.arraycopy(b52Var.f2928t, 0, this.f2928t, this.f2929u, b52Var.f2929u);
        this.f2929u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r52
    public final r52 b(int i6) {
        if (i6 >= this.f2929u) {
            return new b52(i6 == 0 ? f2927v : Arrays.copyOf(this.f2928t, i6), this.f2929u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f6) {
        c();
        int i6 = this.f2929u;
        int length = this.f2928t.length;
        if (i6 == length) {
            float[] fArr = new float[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f2928t, 0, fArr, 0, this.f2929u);
            this.f2928t = fArr;
        }
        float[] fArr2 = this.f2928t;
        int i7 = this.f2929u;
        this.f2929u = i7 + 1;
        fArr2[i7] = f6;
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f2929u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f2929u, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b52)) {
            return super.equals(obj);
        }
        b52 b52Var = (b52) obj;
        if (this.f2929u != b52Var.f2929u) {
            return false;
        }
        float[] fArr = b52Var.f2928t;
        for (int i6 = 0; i6 < this.f2929u; i6++) {
            if (Float.floatToIntBits(this.f2928t[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Float.valueOf(this.f2928t[i6]);
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i6 = 0; i6 < this.f2929u; i6++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2928t[i6]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i6 = this.f2929u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f2928t[i7] == fFloatValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        e(i6);
        float[] fArr = this.f2928t;
        float f6 = fArr[i6];
        if (i6 < this.f2929u - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (r2 - i6) - 1);
        }
        this.f2929u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f2928t;
        System.arraycopy(fArr, i7, fArr, i6, this.f2929u - i7);
        this.f2929u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        e(i6);
        float[] fArr = this.f2928t;
        float f6 = fArr[i6];
        fArr[i6] = fFloatValue;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2929u;
    }

    public b52(float[] fArr, int i6, boolean z6) {
        super(z6);
        this.f2928t = fArr;
        this.f2929u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
