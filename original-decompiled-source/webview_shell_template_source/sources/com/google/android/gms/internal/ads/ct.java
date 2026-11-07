package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ct extends is {
    public final OnAdManagerAdViewLoadedListener s;

    public ct(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        this.s = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.js
    public final void I1(zzby zzbyVar, k3.a aVar) {
        if (zzbyVar == null || aVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) k3.b.i1(aVar));
        try {
            if (zzbyVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbyVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        try {
            if (zzbyVar.zzj() instanceof gi) {
                gi giVar = (gi) zzbyVar.zzj();
                adManagerAdView.setAppEventListener(giVar != null ? giVar.s : null);
            }
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
        zzf.zza.post(new v(this, adManagerAdView, zzbyVar));
    }
}
