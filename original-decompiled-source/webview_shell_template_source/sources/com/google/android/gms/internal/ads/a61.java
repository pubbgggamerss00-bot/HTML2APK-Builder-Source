package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a61 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f2590a;

    /* renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f2591b;

    public a61(VersionInfoParcel versionInfoParcel, hs1 hs1Var) {
        this.f2591b = versionInfoParcel;
        this.f2590a = hs1Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f2590a.u(new x60(3, this));
    }
}
