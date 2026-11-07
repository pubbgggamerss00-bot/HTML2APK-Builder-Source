package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hr extends rh implements jr {
    public hr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final void zzb(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final void zzc(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final void zzd() {
        zzda(2, zza());
    }
}
