package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c8 extends z5 implements RandomAccess {

    /* renamed from: v, reason: collision with root package name */
    public static final Object[] f11658v;

    /* renamed from: w, reason: collision with root package name */
    public static final c8 f11659w;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f11660t;

    /* renamed from: u, reason: collision with root package name */
    public int f11661u;

    static {
        Object[] objArr = new Object[0];
        f11658v = objArr;
        f11659w = new c8(objArr, 0, false);
    }

    public c8(Object[] objArr, int i6, boolean z6) {
        super(z6);
        this.f11660t = objArr;
        this.f11661u = i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.d7
    public final /* bridge */ /* synthetic */ d7 a(int i6) {
        if (i6 >= this.f11661u) {
            return new c8(i6 == 0 ? f11658v : Arrays.copyOf(this.f11660t, i6), this.f11661u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        c();
        if (i6 < 0 || i6 > (i7 = this.f11661u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11661u, ", Size:"));
        }
        int i8 = i6 + 1;
        Object[] objArr = this.f11660t;
        int length = objArr.length;
        if (i7 < length) {
            System.arraycopy(objArr, i6, objArr, i8, i7 - i6);
        } else {
            Object[] objArr2 = new Object[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11660t, 0, objArr2, 0, i6);
            System.arraycopy(this.f11660t, i6, objArr2, i8, this.f11661u - i6);
            this.f11660t = objArr2;
        }
        this.f11660t[i6] = obj;
        this.f11661u++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i6) {
        if (i6 < 0 || i6 >= this.f11661u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11661u, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        d(i6);
        return this.f11660t[i6];
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        c();
        d(i6);
        Object[] objArr = this.f11660t;
        Object obj = objArr[i6];
        if (i6 < this.f11661u - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f11661u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        c();
        d(i6);
        Object[] objArr = this.f11660t;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11661u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i6 = this.f11661u;
        int length = this.f11660t.length;
        if (i6 == length) {
            this.f11660t = Arrays.copyOf(this.f11660t, androidx.activity.m.b(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f11660t;
        int i7 = this.f11661u;
        this.f11661u = i7 + 1;
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
