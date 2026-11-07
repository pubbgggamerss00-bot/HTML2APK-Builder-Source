package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzm extends f3.a {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfx zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public zzm(int i6, long j6, Bundle bundle, int i7, List list, boolean z6, int i8, boolean z7, String str, zzfx zzfxVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z8, zzc zzcVar, int i9, String str5, List list3, int i10, String str6, int i11, long j7) {
        this.zza = i6;
        this.zzb = j6;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i7;
        this.zze = list;
        this.zzf = z6;
        this.zzg = i8;
        this.zzh = z7;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z8;
        this.zzs = zzcVar;
        this.zzt = i9;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i10;
        this.zzx = str6;
        this.zzy = i11;
        this.zzz = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        long j6 = this.zzb;
        e5.i.r(parcel, 2, 8);
        parcel.writeLong(j6);
        e5.i.i(parcel, 3, this.zzc);
        int i8 = this.zzd;
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(i8);
        e5.i.o(parcel, 5, this.zze);
        boolean z6 = this.zzf;
        e5.i.r(parcel, 6, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i9 = this.zzg;
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(i9);
        boolean z7 = this.zzh;
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        e5.i.m(parcel, 9, this.zzi);
        e5.i.l(parcel, 10, this.zzj, i6);
        e5.i.l(parcel, 11, this.zzk, i6);
        e5.i.m(parcel, 12, this.zzl);
        e5.i.i(parcel, 13, this.zzm);
        e5.i.i(parcel, 14, this.zzn);
        e5.i.o(parcel, 15, this.zzo);
        e5.i.m(parcel, 16, this.zzp);
        e5.i.m(parcel, 17, this.zzq);
        boolean z8 = this.zzr;
        e5.i.r(parcel, 18, 4);
        parcel.writeInt(z8 ? 1 : 0);
        e5.i.l(parcel, 19, this.zzs, i6);
        int i10 = this.zzt;
        e5.i.r(parcel, 20, 4);
        parcel.writeInt(i10);
        e5.i.m(parcel, 21, this.zzu);
        e5.i.o(parcel, 22, this.zzv);
        int i11 = this.zzw;
        e5.i.r(parcel, 23, 4);
        parcel.writeInt(i11);
        e5.i.m(parcel, 24, this.zzx);
        int i12 = this.zzy;
        e5.i.r(parcel, 25, 4);
        parcel.writeInt(i12);
        long j7 = this.zzz;
        e5.i.r(parcel, 26, 8);
        parcel.writeLong(j7);
        e5.i.t(iS, parcel);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && com.google.android.gms.common.internal.k.a(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && com.google.android.gms.common.internal.k.a(this.zzi, zzmVar.zzi) && com.google.android.gms.common.internal.k.a(this.zzj, zzmVar.zzj) && com.google.android.gms.common.internal.k.a(this.zzk, zzmVar.zzk) && com.google.android.gms.common.internal.k.a(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && com.google.android.gms.common.internal.k.a(this.zzo, zzmVar.zzo) && com.google.android.gms.common.internal.k.a(this.zzp, zzmVar.zzp) && com.google.android.gms.common.internal.k.a(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && com.google.android.gms.common.internal.k.a(this.zzu, zzmVar.zzu) && com.google.android.gms.common.internal.k.a(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && com.google.android.gms.common.internal.k.a(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}
