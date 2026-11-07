package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzdi implements MuteThisAdReason {
    private final String zza;
    private final zzdh zzb;

    public zzdi(zzdh zzdhVar) {
        String strZze;
        this.zzb = zzdhVar;
        try {
            strZze = zzdhVar.zze();
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            strZze = null;
        }
        this.zza = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdh zza() {
        return this.zzb;
    }
}
