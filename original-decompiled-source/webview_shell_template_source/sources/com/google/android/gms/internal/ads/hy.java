package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hy extends rh implements jy {
    @Override // com.google.android.gms.internal.ads.jy
    public final void A1(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void C(k3.a aVar, zzm zzmVar, String str, String str2, my myVar, oq oqVar, ArrayList arrayList) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        th.e(parcelZza, myVar);
        th.c(parcelZza, oqVar);
        parcelZza.writeStringList(arrayList);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void C0(k3.a aVar, uv uvVar, ArrayList arrayList) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, uvVar);
        parcelZza.writeTypedList(arrayList);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void E(k3.a aVar, zzs zzsVar, zzm zzmVar, String str, String str2, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        th.e(parcelZza, myVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void G1(k3.a aVar, zzm zzmVar, String str, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        th.e(parcelZza, myVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void H(k3.a aVar, zzm zzmVar, String str, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        th.e(parcelZza, myVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void J1(k3.a aVar, zzm zzmVar, String str, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        th.e(parcelZza, myVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void N0(k3.a aVar, k40 k40Var, List list) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, k40Var);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void V0(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void Z(k3.a aVar, zzs zzsVar, zzm zzmVar, String str, String str2, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        th.e(parcelZza, myVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void b() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void d1(zzm zzmVar, String str) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void j1(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void k1(k3.a aVar, zzm zzmVar, k40 k40Var, String str) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(null);
        th.e(parcelZza, k40Var);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void m0(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void o1(k3.a aVar, zzm zzmVar, String str, String str2, my myVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        th.e(parcelZza, myVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final qy p() {
        qy qyVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            qyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            qyVar = iInterfaceQueryLocalInterface instanceof qy ? (qy) iInterfaceQueryLocalInterface : new qy(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelZzcZ.recycle();
        return qyVar;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void t1(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzE() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzF() {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzL() {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final boolean zzM() {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final boolean zzN() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final py zzO() {
        py pyVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            pyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            pyVar = iInterfaceQueryLocalInterface instanceof py ? (py) iInterfaceQueryLocalInterface : new py(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelZzcZ.recycle();
        return pyVar;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final zzeb zzh() {
        Parcel parcelZzcZ = zzcZ(26, zza());
        zzeb zzebVarZzb = zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final oy zzj() {
        oy nyVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            nyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            nyVar = iInterfaceQueryLocalInterface instanceof oy ? (oy) iInterfaceQueryLocalInterface : new ny(strongBinder);
        }
        parcelZzcZ.recycle();
        return nyVar;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final ty zzk() {
        ty ryVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            ryVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            ryVar = iInterfaceQueryLocalInterface instanceof ty ? (ty) iInterfaceQueryLocalInterface : new ry(strongBinder);
        }
        parcelZzcZ.recycle();
        return ryVar;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final n00 zzl() {
        Parcel parcelZzcZ = zzcZ(33, zza());
        n00 n00Var = (n00) th.a(parcelZzcZ, n00.CREATOR);
        parcelZzcZ.recycle();
        return n00Var;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final n00 zzm() {
        Parcel parcelZzcZ = zzcZ(34, zza());
        n00 n00Var = (n00) th.a(parcelZzcZ, n00.CREATOR);
        parcelZzcZ.recycle();
        return n00Var;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final k3.a zzn() {
        return androidx.activity.m.f(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzo() {
        zzda(5, zza());
    }
}
