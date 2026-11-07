package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hp1 extends bo1 {

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f5452u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f5453v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5454w;

    public hp1(Object[] objArr, int i6, int i7) {
        this.f5452u = objArr;
        this.f5453v = i6;
        this.f5454w = i7;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sl1.a(i6, this.f5454w);
        Object obj = this.f5452u[i6 + i6 + this.f5453v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5454w;
    }
}
