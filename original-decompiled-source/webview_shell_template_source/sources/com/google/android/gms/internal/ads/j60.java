package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j60 extends rh implements l60 {
    public j60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final k3.a zze(k3.a aVar, k3.a aVar2, String str, k3.a aVar3) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, aVar2);
        parcelZza.writeString(str);
        th.e(parcelZza, aVar3);
        return androidx.activity.m.f(zzcZ(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzf(k3.a aVar, p60 p60Var, i60 i60Var) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, p60Var);
        th.e(parcelZza, i60Var);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzg(p20 p20Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, p20Var);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzh(List list, k3.a aVar, f20 f20Var) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        th.e(parcelZza, aVar);
        th.e(parcelZza, f20Var);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzi(List list, k3.a aVar, f20 f20Var) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        th.e(parcelZza, aVar);
        th.e(parcelZza, f20Var);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzj(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzk(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzl(List list, k3.a aVar, f20 f20Var) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        th.e(parcelZza, aVar);
        th.e(parcelZza, f20Var);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzm(List list, k3.a aVar, f20 f20Var) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        th.e(parcelZza, aVar);
        th.e(parcelZza, f20Var);
        zzda(5, parcelZza);
    }
}
