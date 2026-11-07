package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a1 extends x0 {
    public static final a1 A;

    /* renamed from: z, reason: collision with root package name */
    public static final Object[] f11622z;

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f11623u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f11624v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f11625w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f11626x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f11627y;

    static {
        Object[] objArr = new Object[0];
        f11622z = objArr;
        A = new a1(0, 0, 0, objArr, objArr);
    }

    public a1(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        this.f11623u = objArr;
        this.f11624v = i6;
        this.f11625w = objArr2;
        this.f11626x = i7;
        this.f11627y = i8;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final void c(Object[] objArr) {
        System.arraycopy(this.f11623u, 0, objArr, 0, this.f11627y);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f11625w;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i6 = iRotateLeft & this.f11626x;
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i6 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int d() {
        return this.f11627y;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final Object[] f() {
        return this.f11623u;
    }

    @Override // com.google.android.gms.internal.consent_sdk.x0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11624v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        w0 z0Var = this.f11934t;
        if (z0Var == null) {
            u0 u0Var = w0.f11924t;
            int i6 = this.f11627y;
            z0Var = i6 == 0 ? z0.f11960w : new z0(this.f11623u, i6);
            this.f11934t = z0Var;
        }
        return z0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11627y;
    }
}
