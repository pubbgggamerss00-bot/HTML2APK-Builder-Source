package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rp1 extends go1 {

    /* renamed from: v, reason: collision with root package name */
    public final transient Object f8689v;

    public rp1(Object obj) {
        obj.getClass();
        this.f8689v = obj;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int c(Object[] objArr, int i6) {
        objArr[i6] = this.f8689v;
        return i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f8689v.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.go1, com.google.android.gms.internal.ads.wn1
    public final bo1 f() {
        return bo1.n(this.f8689v);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    /* renamed from: g */
    public final up1 iterator() {
        return new jo1(this.f8689v);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.go1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8689v.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return new jo1(this.f8689v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("[", this.f8689v.toString(), "]");
    }
}
