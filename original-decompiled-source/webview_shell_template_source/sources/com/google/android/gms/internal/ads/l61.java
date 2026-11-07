package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l61 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final double f6586a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6587b;

    public l61(double d7, boolean z6) {
        this.f6586a = d7;
        this.f6587b = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        Bundle bundleA = lc1.a("device", bundle);
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = lc1.a("battery", bundleA);
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f6587b);
        bundleA2.putDouble("battery_level", this.f6586a);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
