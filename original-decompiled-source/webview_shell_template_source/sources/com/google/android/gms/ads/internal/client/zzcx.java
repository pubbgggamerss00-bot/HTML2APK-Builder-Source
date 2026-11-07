package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.rv;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.xv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcx extends rh implements zzcz {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(rv.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, k3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        th.e(parcelZza, aVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdlVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(k3.a aVar, String str) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(gy gyVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, gyVar);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f6) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f6);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(xv xvVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, xvVar);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzfvVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
