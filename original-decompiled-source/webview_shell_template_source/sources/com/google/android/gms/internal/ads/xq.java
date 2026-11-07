package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xq extends rh implements yq {
    public xq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final double zzb() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final int zzc() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i6 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final int zzd() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i6 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final Uri zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) th.a(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final k3.a zzf() {
        return androidx.activity.m.f(zzcZ(1, zza()));
    }
}
