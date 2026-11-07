package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yv0 extends AdListener {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdView f11087t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f11088u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dw0 f11089v;

    public yv0(dw0 dw0Var, String str, AdView adView, String str2) {
        this.s = str;
        this.f11087t = adView;
        this.f11088u = str2;
        this.f11089v = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f11089v.h2(dw0.g2(loadAdError), this.f11088u);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        AdView adView = this.f11087t;
        this.f11089v.i1(this.s, this.f11088u, adView);
    }
}
