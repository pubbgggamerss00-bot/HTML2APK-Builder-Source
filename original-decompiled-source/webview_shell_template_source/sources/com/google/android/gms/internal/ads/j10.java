package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j10 extends ls {
    public final NativeAd.OnNativeAdLoadedListener s;

    public j10(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.s = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.ms
    public final void J0(vs vsVar) {
        this.s.onNativeAdLoaded(new e10(vsVar));
    }
}
