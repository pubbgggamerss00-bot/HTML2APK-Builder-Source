package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p40 extends rh implements r40 {
    public p40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final Bundle zzb() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) th.a(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final zzdy zzc() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzdy zzdyVarZzb = zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final o40 zzd() {
        o40 n40Var;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            n40Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            n40Var = iInterfaceQueryLocalInterface instanceof o40 ? (o40) iInterfaceQueryLocalInterface : new n40(strongBinder);
        }
        parcelZzcZ.recycle();
        return n40Var;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzf(zzm zzmVar, y40 y40Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        th.e(parcelZza, y40Var);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzg(zzm zzmVar, y40 y40Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        th.e(parcelZza, y40Var);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzh(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzi(zzdo zzdoVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdoVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzj(zzdr zzdrVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzk(u40 u40Var) {
        Parcel parcelZza = zza();
        th.e(parcelZza, u40Var);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzl(e50 e50Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, e50Var);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzm(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(5, parcelZza);
    }
}
