package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z0 extends w0 {

    /* renamed from: w, reason: collision with root package name */
    public static final z0 f11960w = new z0(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f11961u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f11962v;

    public z0(Object[] objArr, int i6) {
        this.f11961u = objArr;
        this.f11962v = i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w0, com.google.android.gms.internal.consent_sdk.t0
    public final void c(Object[] objArr) {
        System.arraycopy(this.f11961u, 0, objArr, 0, this.f11962v);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int d() {
        return this.f11962v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final Object[] f() {
        return this.f11961u;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        q0.a(i6, this.f11962v);
        Object obj = this.f11961u[i6];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11962v;
    }
}
