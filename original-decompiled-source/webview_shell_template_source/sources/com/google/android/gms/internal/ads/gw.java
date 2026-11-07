package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gw extends rh implements hw {
    @Override // com.google.android.gms.internal.ads.hw
    public final void zze(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzf() {
        zzda(1, zza());
    }
}
