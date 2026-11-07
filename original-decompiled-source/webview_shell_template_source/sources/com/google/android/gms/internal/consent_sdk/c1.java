package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c1 extends x0 {

    /* renamed from: u, reason: collision with root package name */
    public final transient Object f11657u;

    public c1(Object obj) {
        this.f11657u = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0
    public final void c(Object[] objArr) {
        objArr[0] = this.f11657u;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11657u.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.x0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11657u.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new y0(this.f11657u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("[", this.f11657u.toString(), "]");
    }
}
