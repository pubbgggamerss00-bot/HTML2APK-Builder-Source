package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bj extends jj {
    public final AppOpenAd.AppOpenAdLoadCallback s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3202t;

    public bj(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.s = appOpenAdLoadCallback;
        this.f3202t = str;
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void p1(zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.s;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void z(hj hjVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.s;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new cj(hjVar, this.f3202t));
        }
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void zzb(int i6) {
    }
}
