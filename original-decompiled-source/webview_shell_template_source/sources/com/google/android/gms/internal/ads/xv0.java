package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xv0 extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dw0 f10719c;

    public xv0(dw0 dw0Var, String str, String str2) {
        this.f10717a = str;
        this.f10718b = str2;
        this.f10719c = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f10719c.h2(dw0.g2(loadAdError), this.f10718b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.f10719c.i1(this.f10717a, this.f10718b, appOpenAd);
    }
}
