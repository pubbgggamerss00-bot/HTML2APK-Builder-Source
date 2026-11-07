package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g50 implements MediationRewardedAdCallback {

    /* renamed from: a, reason: collision with root package name */
    public final my f4897a;

    public g50(my myVar) {
        this.f4897a = myVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.f4897a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.f4897a.M0(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.f4897a.zzp();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onUserEarnedReward.");
        try {
            this.f4897a.d0(new h50(rewardItem));
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoComplete.");
        try {
            this.f4897a.zzu();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoStart.");
        try {
            this.f4897a.j();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdClicked.");
        try {
            this.f4897a.zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdImpression.");
        try {
            this.f4897a.zzm();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f4897a.zzl(str);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }
}
