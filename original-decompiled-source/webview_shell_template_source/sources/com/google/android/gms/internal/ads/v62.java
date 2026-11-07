package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v62 extends v32 implements RandomAccess {

    /* renamed from: v, reason: collision with root package name */
    public static final Object[] f9733v;

    /* renamed from: w, reason: collision with root package name */
    public static final v62 f9734w;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f9735t;

    /* renamed from: u, reason: collision with root package name */
    public int f9736u;

    static {
        Object[] objArr = new Object[0];
        f9733v = objArr;
        f9734w = new v62(objArr, 0, false);
    }

    public v62(Object[] objArr, int i6, boolean z6) {
        super(z6);
        this.f9735t = objArr;
        this.f9736u = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        c();
        if (i6 < 0 || i6 > (i7 = this.f9736u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f9736u, ", Size:"));
        }
        int i8 = i6 + 1;
        Object[] objArr = this.f9735t;
        int length = objArr.length;
        if (i7 < length) {
            System.arraycopy(objArr, i6, objArr, i8, i7 - i6);
        } else {
            Object[] objArr2 = new Object[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f9735t, 0, objArr2, 0, i6);
            System.arraycopy(this.f9735t, i6, objArr2, i8, this.f9736u - i6);
            this.f9735t = objArr2;
        }
        this.f9735t[i6] = obj;
        this.f9736u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.r52
    public final /* bridge */ /* synthetic */ r52 b(int i6) {
        if (i6 >= this.f9736u) {
            return new v62(i6 == 0 ? f9733v : Arrays.copyOf(this.f9735t, i6), this.f9736u, true);
        }
        throw new IllegalArgumentException();
    }

    public final void d(int i6) {
        if (i6 < 0 || i6 >= this.f9736u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f9736u, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        d(i6);
        return this.f9735t[i6];
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        c();
        d(i6);
        Object[] objArr = this.f9735t;
        Object obj = objArr[i6];
        if (i6 < this.f9736u - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f9736u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        c();
        d(i6);
        Object[] objArr = this.f9735t;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9736u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i6 = this.f9736u;
        int length = this.f9735t.length;
        if (i6 == length) {
            this.f9735t = Arrays.copyOf(this.f9735t, androidx.activity.m.b(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f9735t;
        int i7 = this.f9736u;
        this.f9736u = i7 + 1;
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
