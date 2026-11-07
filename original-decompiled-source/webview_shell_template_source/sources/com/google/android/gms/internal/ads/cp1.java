package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cp1 extends bo1 {

    /* renamed from: w, reason: collision with root package name */
    public static final cp1 f3636w = new cp1(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f3637u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f3638v;

    public cp1(Object[] objArr, int i6) {
        this.f3637u = objArr;
        this.f3638v = i6;
    }

    @Override // com.google.android.gms.internal.ads.bo1, com.google.android.gms.internal.ads.wn1
    public final int c(Object[] objArr, int i6) {
        Object[] objArr2 = this.f3637u;
        int i7 = this.f3638v;
        System.arraycopy(objArr2, 0, objArr, i6, i7);
        return i6 + i7;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int d() {
        return this.f3638v;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sl1.a(i6, this.f3638v);
        Object obj = this.f3637u[i6];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final Object[] i() {
        return this.f3637u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3638v;
    }
}
