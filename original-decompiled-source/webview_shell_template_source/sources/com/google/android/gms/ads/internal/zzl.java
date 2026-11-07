package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import e5.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzl extends f3.a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzl(boolean z6, boolean z7, String str, boolean z8, float f6, int i6, boolean z9, boolean z10, boolean z11) {
        this.zza = z6;
        this.zzb = z7;
        this.zzc = str;
        this.zzd = z8;
        this.zze = f6;
        this.zzf = i6;
        this.zzg = z9;
        this.zzh = z10;
        this.zzi = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        boolean z6 = this.zza;
        int iS = i.s(20293, parcel);
        i.r(parcel, 2, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzb;
        i.r(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        i.m(parcel, 4, this.zzc);
        boolean z8 = this.zzd;
        i.r(parcel, 5, 4);
        parcel.writeInt(z8 ? 1 : 0);
        float f6 = this.zze;
        i.r(parcel, 6, 4);
        parcel.writeFloat(f6);
        int i7 = this.zzf;
        i.r(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z9 = this.zzg;
        i.r(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzh;
        i.r(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzi;
        i.r(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        i.t(iS, parcel);
    }

    public zzl(boolean z6, boolean z7, boolean z8, float f6, int i6, boolean z9, boolean z10, boolean z11) {
        this(z6, z7, null, z8, f6, -1, z9, z10, z11);
    }
}
