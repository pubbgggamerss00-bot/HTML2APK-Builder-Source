package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xy implements MediationAdLoadCallback {
    public final /* synthetic */ my s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Adapter f10743t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fz f10744u;

    public xy(fz fzVar, my myVar, Adapter adapter) {
        this.s = myVar;
        this.f10743t = adapter;
        this.f10744u = fzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        my myVar = this.s;
        try {
            zzo.zze(this.f10743t.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
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
            this.f10744u.B = (MediationInterscrollerAd) obj;
            myVar.zzo();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        return new vy(myVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
