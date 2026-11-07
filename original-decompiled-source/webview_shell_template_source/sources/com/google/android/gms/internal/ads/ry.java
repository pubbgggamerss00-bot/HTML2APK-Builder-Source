package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ry extends rh implements ty {
    public ry(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void H1(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void T0(k3.a aVar, k3.a aVar2, k3.a aVar3) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, aVar2);
        th.e(parcelZza, aVar3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void b0(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final boolean zzA() {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final boolean zzB() {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final double zze() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzf() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzg() {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzh() {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final Bundle zzi() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) th.a(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final zzeb zzj() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        zzeb zzebVarZzb = zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final sq zzk() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        sq sqVarI1 = rq.i1(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return sqVarI1;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final yq zzl() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        yq yqVarI1 = mq.i1(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return yqVarI1;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzm() {
        return androidx.activity.m.f(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzn() {
        return androidx.activity.m.f(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzo() {
        return androidx.activity.m.f(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzp() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzq() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzr() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzs() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzt() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzu() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final List zzv() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(th.f9281a);
        parcelZzcZ.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void zzx() {
        zzda(19, zza());
    }
}
