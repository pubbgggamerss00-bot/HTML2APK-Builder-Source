package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g60 extends rh implements i60 {
    @Override // com.google.android.gms.internal.ads.i60
    public final void d2(String str, Bundle bundle, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        th.c(parcelZza, bundle);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void zzb(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(2, parcelZza);
    }
}
