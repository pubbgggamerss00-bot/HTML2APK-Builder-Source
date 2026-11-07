package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sz extends rh implements uz {
    @Override // com.google.android.gms.internal.ads.uz
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.uz
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.uz
    public final void zzg() {
        zzda(2, zza());
    }
}
