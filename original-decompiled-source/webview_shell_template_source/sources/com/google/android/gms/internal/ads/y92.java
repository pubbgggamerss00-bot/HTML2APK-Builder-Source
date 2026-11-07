package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y92 implements x92, u92 {

    /* renamed from: b, reason: collision with root package name */
    public static final y92 f10907b = new y92(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f10908a;

    public y92(Object obj) {
        this.f10908a = obj;
    }

    public static y92 a(Object obj) {
        ih1.c("instance cannot be null", obj);
        return new y92(obj);
    }

    public static y92 b(Object obj) {
        return obj == null ? f10907b : new y92(obj);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        return this.f10908a;
    }
}
