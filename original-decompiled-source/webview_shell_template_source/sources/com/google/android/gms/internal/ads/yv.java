package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yv implements AdapterStatus {

    /* renamed from: a, reason: collision with root package name */
    public final AdapterStatus.State f11084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11085b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11086c;

    public yv(AdapterStatus.State state, String str, int i6) {
        this.f11084a = state;
        this.f11085b = str;
        this.f11086c = i6;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f11085b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f11084a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f11086c;
    }
}
