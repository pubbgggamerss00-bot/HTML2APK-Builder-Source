package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import e5.i;
import f3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zza(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = i.s(20293, parcel);
        i.m(parcel, 1, str);
        i.m(parcel, 2, this.zzb);
        i.m(parcel, 3, this.zzc);
        i.t(iS, parcel);
    }
}
