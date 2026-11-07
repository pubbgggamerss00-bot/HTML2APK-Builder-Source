package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v0 extends w0 {

    /* renamed from: u, reason: collision with root package name */
    public final transient int f11914u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f11915v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f11916w;

    public v0(w0 w0Var, int i6, int i7) {
        this.f11916w = w0Var;
        this.f11914u = i6;
        this.f11915v = i7;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int d() {
        return this.f11916w.e() + this.f11914u + this.f11915v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final int e() {
        return this.f11916w.e() + this.f11914u;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final Object[] f() {
        return this.f11916w.f();
    }

    @Override // com.google.android.gms.internal.consent_sdk.w0, java.util.List
    /* renamed from: g */
    public final w0 subList(int i6, int i7) {
        q0.c(i6, i7, this.f11915v);
        int i8 = this.f11914u;
        return this.f11916w.subList(i6 + i8, i7 + i8);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        q0.a(i6, this.f11915v);
        return this.f11916w.get(i6 + this.f11914u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11915v;
    }
}
