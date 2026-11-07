package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.xv;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfm extends zzcy {
    private xv zza;

    public final /* synthetic */ void zzb() {
        xv xvVar = this.zza;
        if (xvVar != null) {
            try {
                xvVar.r1(Collections.EMPTY_LIST);
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(xv xvVar) {
        this.zza = xvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(gy gyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, k3.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(k3.a aVar, String str) {
    }
}
