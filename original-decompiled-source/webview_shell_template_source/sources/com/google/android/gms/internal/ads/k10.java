package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k10 extends rs {
    public final NativeAd.UnconfirmedClickListener s;

    public k10(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        this.s = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zze() {
        this.s.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzf(String str) {
        this.s.onUnconfirmedClickReceived(str);
    }
}
