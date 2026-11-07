package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ez implements MediationAdLoadCallback {
    public final /* synthetic */ my s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz f4424t;

    public ez(fz fzVar, my myVar) {
        this.s = myVar;
        this.f4424t = fzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        my myVar = this.s;
        try {
            zzo.zze(this.f4424t.s.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            myVar.T(adError.zza());
            myVar.K(adError.getCode(), adError.getMessage());
            myVar.a(adError.getCode());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        my myVar = this.s;
        try {
            this.f4424t.C = (MediationAppOpenAd) obj;
            myVar.zzo();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        return new vy(myVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        my myVar = this.s;
        try {
            zzo.zze(this.f4424t.s.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            myVar.K(0, str);
            myVar.a(0);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }
}
