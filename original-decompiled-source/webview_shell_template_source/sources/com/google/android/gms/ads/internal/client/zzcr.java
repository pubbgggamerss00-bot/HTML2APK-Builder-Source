package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcr extends rh implements zzct {
    public zzcr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() {
        zzda(2, zza());
    }
}
