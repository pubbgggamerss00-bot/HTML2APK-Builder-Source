package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uq extends rh implements wq {
    public uq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zzf() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zzg() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f6 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final zzeb zzh() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        zzeb zzebVarZzb = zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final k3.a zzi() {
        return androidx.activity.m.f(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final void zzj(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final boolean zzk() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final boolean zzl() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
