package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qs extends rh implements ss {
    @Override // com.google.android.gms.internal.ads.ss
    public final void zze() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
