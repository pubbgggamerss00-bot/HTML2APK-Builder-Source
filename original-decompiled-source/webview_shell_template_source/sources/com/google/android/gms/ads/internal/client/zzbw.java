package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.a20;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.to;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbw extends rh implements zzby {
    public zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzbiVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzblVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzsVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzcmVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(kj kjVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, kjVar);
        zzda(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzyVar);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzctVar);
        zzda(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(a20 a20Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(to toVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdrVar);
        zzda(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(c20 c20Var, String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(f40 f40Var) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzgaVar);
        zzda(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        Parcel parcelZzcZ = zzcZ(46, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzmVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzs zzsVar = (zzs) th.a(parcelZzcZ, zzs.CREATOR);
        parcelZzcZ.recycle();
        return zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        zzbl zzbjVar;
        Parcel parcelZzcZ = zzcZ(33, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        zzcm zzckVar;
        Parcel parcelZzcZ = zzcZ(32, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzckVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzckVar = iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        zzdy zzdwVar;
        Parcel parcelZzcZ = zzcZ(41, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof zzdy ? (zzdy) iInterfaceQueryLocalInterface : new zzdw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        zzeb zzdzVar;
        Parcel parcelZzcZ = zzcZ(26, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdzVar = iInterfaceQueryLocalInterface instanceof zzeb ? (zzeb) iInterfaceQueryLocalInterface : new zzdz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        return androidx.activity.m.f(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        th.e(parcelZza, zzboVar);
        zzda(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        zzda(5, zza());
    }
}
