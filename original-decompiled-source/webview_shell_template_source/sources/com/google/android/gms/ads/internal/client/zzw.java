package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzw extends f3.a {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzw(String str, long j6, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j6;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, str);
        long j6 = this.zzb;
        e5.i.r(parcel, 2, 8);
        parcel.writeLong(j6);
        e5.i.l(parcel, 3, this.zzc, i6);
        e5.i.i(parcel, 4, this.zzd);
        e5.i.m(parcel, 5, this.zze);
        e5.i.m(parcel, 6, this.zzf);
        e5.i.m(parcel, 7, this.zzg);
        e5.i.m(parcel, 8, this.zzh);
        e5.i.t(iS, parcel);
    }
}
