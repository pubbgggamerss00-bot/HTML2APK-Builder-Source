package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pz extends rh implements rz {
    public pz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void t(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void z1(oy oyVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, oyVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
