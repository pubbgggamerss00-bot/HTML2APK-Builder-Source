package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vz extends rh implements xz {
    public vz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void q0(ty tyVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, tyVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
