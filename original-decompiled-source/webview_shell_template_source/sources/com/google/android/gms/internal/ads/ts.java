package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ts extends rh implements vs {
    @Override // com.google.android.gms.internal.ads.vs
    public final void B(zzdh zzdhVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdhVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void N1(zzdr zzdrVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdrVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean W0(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void Y0(zzdd zzddVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzddVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean b() {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void c() {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void c2(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void d() {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void g0(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void s0(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void t0(ss ssVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, ssVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void zzA() {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean zzH() {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final double zze() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final Bundle zzf() {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) th.a(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final zzdy zzg() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        zzdy zzdyVarZzb = zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final zzeb zzh() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        zzeb zzebVarZzb = zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final sq zzi() {
        sq qqVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            qqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            qqVar = iInterfaceQueryLocalInterface instanceof sq ? (sq) iInterfaceQueryLocalInterface : new qq(strongBinder);
        }
        parcelZzcZ.recycle();
        return qqVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final wq zzj() {
        wq uqVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            uqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            uqVar = iInterfaceQueryLocalInterface instanceof wq ? (wq) iInterfaceQueryLocalInterface : new uq(strongBinder);
        }
        parcelZzcZ.recycle();
        return uqVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final yq zzk() {
        yq xqVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            xqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            xqVar = iInterfaceQueryLocalInterface instanceof yq ? (yq) iInterfaceQueryLocalInterface : new xq(strongBinder);
        }
        parcelZzcZ.recycle();
        return xqVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final k3.a zzl() {
        return androidx.activity.m.f(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final k3.a zzm() {
        return androidx.activity.m.f(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzn() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzo() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzp() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzq() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzs() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzt() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final List zzu() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(th.f9281a);
        parcelZzcZ.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final List zzv() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(th.f9281a);
        parcelZzcZ.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void zzx() {
        zzda(13, zza());
    }
}
