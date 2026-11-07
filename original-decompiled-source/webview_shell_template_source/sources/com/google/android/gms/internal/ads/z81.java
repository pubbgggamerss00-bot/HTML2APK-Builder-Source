package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11219a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11221c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11222d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11224f;

    public z81(String str, int i6, int i7, int i8, boolean z6, int i9) {
        this.f11219a = str;
        this.f11220b = i6;
        this.f11221c = i7;
        this.f11222d = i8;
        this.f11223e = z6;
        this.f11224f = i9;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        lc1.e(bundle, "carrier", this.f11219a, !TextUtils.isEmpty(r0));
        int i6 = this.f11220b;
        lc1.d(bundle, "cnt", i6, i6 != -2);
        bundle.putInt("gnt", this.f11221c);
        bundle.putInt("pt", this.f11222d);
        Bundle bundleA = lc1.a("device", bundle);
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = lc1.a("network", bundleA);
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f11224f);
        bundleA2.putBoolean("active_network_metered", this.f11223e);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
