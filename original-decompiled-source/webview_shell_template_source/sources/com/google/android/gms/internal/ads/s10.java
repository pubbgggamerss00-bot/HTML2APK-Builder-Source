package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s10 extends rh implements u10 {
    public s10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final boolean zzH() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzh(int i6, int i7, Intent intent) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        parcelZza.writeInt(i7);
        th.c(parcelZza, intent);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzi() {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzk(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzl(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzm() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzo() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzp(int i6, String[] strArr, int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzq() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzr() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzs(Bundle bundle) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        if (parcelZzcZ.readInt() != 0) {
            bundle.readFromParcel(parcelZzcZ);
        }
        parcelZzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzt() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzu() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzv() {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzx() {
        zzda(9, zza());
    }
}
