package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rr extends rh implements tr {
    public rr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void U1(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean k(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean l(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void p0(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final wq zzf() {
        wq uqVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
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

    @Override // com.google.android.gms.internal.ads.tr
    public final yq zzg(String str) {
        yq xqVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.tr
    public final k3.a zzh() {
        return androidx.activity.m.f(zzcZ(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final String zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final List zzk() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzcZ.createStringArrayList();
        parcelZzcZ.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzl() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzm() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzo() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean zzq() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean zzt() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
