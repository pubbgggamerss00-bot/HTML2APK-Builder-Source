package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z32 extends v32 implements RandomAccess, t62 {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean[] f11135v;

    /* renamed from: t, reason: collision with root package name */
    public boolean[] f11136t;

    /* renamed from: u, reason: collision with root package name */
    public int f11137u;

    static {
        boolean[] zArr = new boolean[0];
        f11135v = zArr;
        new z32(zArr, 0, false);
    }

    public z32() {
        this(f11135v, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f11137u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11137u, ", Size:"));
        }
        int i8 = i6 + 1;
        boolean[] zArr = this.f11136t;
        int length = zArr.length;
        if (i7 < length) {
            System.arraycopy(zArr, i6, zArr, i8, i7 - i6);
        } else {
            boolean[] zArr2 = new boolean[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11136t, 0, zArr2, 0, i6);
            System.arraycopy(this.f11136t, i6, zArr2, i8, this.f11137u - i6);
            this.f11136t = zArr2;
        }
        this.f11136t[i6] = zBooleanValue;
        this.f11137u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = s52.f8801a;
        collection.getClass();
        if (!(collection instanceof z32)) {
            return super.addAll(collection);
        }
        z32 z32Var = (z32) collection;
        int i6 = z32Var.f11137u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f11137u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        boolean[] zArr = this.f11136t;
        if (i8 > zArr.length) {
            this.f11136t = Arrays.copyOf(zArr, i8);
        }
        System.arraycopy(z32Var.f11136t, 0, this.f11136t, this.f11137u, z32Var.f11137u);
        this.f11137u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r52
    public final r52 b(int i6) {
        if (i6 >= this.f11137u) {
            return new z32(i6 == 0 ? f11135v : Arrays.copyOf(this.f11136t, i6), this.f11137u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z6) {
        c();
        int i6 = this.f11137u;
        int length = this.f11136t.length;
        if (i6 == length) {
            boolean[] zArr = new boolean[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11136t, 0, zArr, 0, this.f11137u);
            this.f11136t = zArr;
        }
        boolean[] zArr2 = this.f11136t;
        int i7 = this.f11137u;
        this.f11137u = i7 + 1;
        zArr2[i7] = z6;
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f11137u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11137u, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z32)) {
            return super.equals(obj);
        }
        z32 z32Var = (z32) obj;
        if (this.f11137u != z32Var.f11137u) {
            return false;
        }
        boolean[] zArr = z32Var.f11136t;
        for (int i6 = 0; i6 < this.f11137u; i6++) {
            if (this.f11136t[i6] != zArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Boolean.valueOf(this.f11136t[i6]);
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f11137u; i7++) {
            int i8 = i6 * 31;
            boolean z6 = this.f11136t[i7];
            Charset charset = s52.f8801a;
            i6 = i8 + (z6 ? 1231 : 1237);
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i6 = this.f11137u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f11136t[i7] == zBooleanValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        e(i6);
        boolean[] zArr = this.f11136t;
        boolean z6 = zArr[i6];
        if (i6 < this.f11137u - 1) {
            System.arraycopy(zArr, i6 + 1, zArr, i6, (r2 - i6) - 1);
        }
        this.f11137u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f11136t;
        System.arraycopy(zArr, i7, zArr, i6, this.f11137u - i7);
        this.f11137u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        e(i6);
        boolean[] zArr = this.f11136t;
        boolean z6 = zArr[i6];
        zArr[i6] = zBooleanValue;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11137u;
    }

    public z32(boolean[] zArr, int i6, boolean z6) {
        super(z6);
        this.f11136t = zArr;
        this.f11137u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
