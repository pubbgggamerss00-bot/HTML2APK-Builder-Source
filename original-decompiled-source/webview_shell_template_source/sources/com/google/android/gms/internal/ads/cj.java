package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cj extends AppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    public final hj f3597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3598b;

    /* renamed from: c, reason: collision with root package name */
    public final ej f3599c = new ej("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    /* renamed from: d, reason: collision with root package name */
    public FullScreenContentCallback f3600d;

    /* renamed from: e, reason: collision with root package name */
    public OnPaidEventListener f3601e;

    public cj(hj hjVar, String str) {
        this.f3597a = hjVar;
        this.f3598b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f3598b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f3600d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f3601e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzf;
        try {
            zzdyVarZzf = this.f3597a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            zzdyVarZzf = null;
        }
        return ResponseInfo.zzb(zzdyVarZzf);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f3600d = fullScreenContentCallback;
        this.f3599c.s = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z6) {
        try {
            this.f3597a.s(z6);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f3601e = onPaidEventListener;
        try {
            this.f3597a.K1(new zzfs(onPaidEventListener));
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f3597a.h0(new k3.b(activity), this.f3599c);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }
}
