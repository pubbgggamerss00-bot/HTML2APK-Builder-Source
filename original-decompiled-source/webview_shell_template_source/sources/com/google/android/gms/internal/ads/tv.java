package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tv extends rh implements uv {
    @Override // com.google.android.gms.internal.ads.uv
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.uv
    public final void zzf() {
        zzda(2, zza());
    }
}
