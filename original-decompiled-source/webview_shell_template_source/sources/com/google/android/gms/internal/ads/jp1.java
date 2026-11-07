package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jp1 extends go1 {
    public static final Object[] A;
    public static final jp1 B;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f6146v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f6147w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f6148x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f6149y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f6150z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new jp1(0, 0, 0, objArr, objArr);
    }

    public jp1(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        this.f6146v = objArr;
        this.f6147w = i6;
        this.f6148x = objArr2;
        this.f6149y = i7;
        this.f6150z = i8;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int c(Object[] objArr, int i6) {
        Object[] objArr2 = this.f6146v;
        int i7 = this.f6150z;
        System.arraycopy(objArr2, 0, objArr, i6, i7);
        return i6 + i7;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f6148x;
            if (objArr.length != 0) {
                int iN = aa1.n(obj);
                while (true) {
                    int i6 = iN & this.f6149y;
                    Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iN = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int d() {
        return this.f6150z;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    /* renamed from: g */
    public final up1 iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.go1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6147w;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final Object[] i() {
        return this.f6146v;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.go1
    public final bo1 k() {
        return bo1.k(this.f6146v, this.f6150z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6150z;
    }
}
