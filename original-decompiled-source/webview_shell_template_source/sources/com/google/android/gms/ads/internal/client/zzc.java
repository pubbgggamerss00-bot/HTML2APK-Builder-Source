package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzc extends f3.a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    public final String zza;
    public final String zzb;

    public zzc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, str);
        e5.i.m(parcel, 2, this.zzb);
        e5.i.t(iS, parcel);
    }
}
