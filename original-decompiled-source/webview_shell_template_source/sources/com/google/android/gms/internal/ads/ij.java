package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ij extends rh implements kj {
    @Override // com.google.android.gms.internal.ads.kj
    public final void p1(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void z(hj hjVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, hjVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void zzb(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(2, parcelZza);
    }
}
