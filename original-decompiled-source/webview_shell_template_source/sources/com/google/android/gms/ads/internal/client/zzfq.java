package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.o40;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.y40;
import com.google.android.gms.internal.ads.z40;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfq extends q40 {
    private static void zzr(final y40 y40Var) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final void run() {
                y40 y40Var2 = y40Var;
                if (y40Var2 != null) {
                    try {
                        y40Var2.zze(1);
                    } catch (RemoteException e6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final zzdy zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final o40 zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final String zze() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzf(zzm zzmVar, y40 y40Var) {
        zzr(y40Var);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzg(zzm zzmVar, y40 y40Var) {
        zzr(y40Var);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzh(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzi(zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzj(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzk(u40 u40Var) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzl(e50 e50Var) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzm(k3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzp(z40 z40Var) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzn(k3.a aVar, boolean z6) {
    }
}
