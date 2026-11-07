package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbj extends rh implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
        zzda(9, zza());
    }
}
