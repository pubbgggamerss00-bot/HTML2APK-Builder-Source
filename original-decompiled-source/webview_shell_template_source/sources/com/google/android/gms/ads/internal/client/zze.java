package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zze extends f3.a {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public zze zzd;
    public IBinder zze;

    public zze(int i6, String str, String str2, zze zzeVar, IBinder iBinder) {
        this.zza = i6;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        e5.i.m(parcel, 2, this.zzb);
        e5.i.m(parcel, 3, this.zzc);
        e5.i.l(parcel, 4, this.zzd, i6);
        e5.i.k(parcel, 5, this.zze);
        e5.i.t(iS, parcel);
    }

    public final AdError zza() {
        AdError adError;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.zzc;
            adError = new AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final LoadAdError zzb() {
        AdError adError;
        zze zzeVar = this.zzd;
        zzdy zzdwVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i6 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof zzdy ? (zzdy) iInterfaceQueryLocalInterface : new zzdw(iBinder);
        }
        return new LoadAdError(i6, str, str2, adError, ResponseInfo.zza(zzdwVar));
    }
}
