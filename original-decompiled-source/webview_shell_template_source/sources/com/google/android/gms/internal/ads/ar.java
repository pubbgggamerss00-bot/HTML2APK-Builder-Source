package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ar extends rh implements dr {
    public ar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final k3.a zzb(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return androidx.activity.m.f(zzcZ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzc() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzd(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzdt(String str, k3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        th.e(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzdu(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzdv(wq wqVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, wqVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzdw(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzdx(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zze(k3.a aVar, int i6) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeInt(i6);
        zzda(5, parcelZza);
    }
}
