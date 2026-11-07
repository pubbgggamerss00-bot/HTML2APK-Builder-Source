package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zr extends rh implements cs {
    @Override // com.google.android.gms.internal.ads.cs
    public final void D0(tr trVar, String str) {
        Parcel parcelZza = zza();
        th.e(parcelZza, trVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
