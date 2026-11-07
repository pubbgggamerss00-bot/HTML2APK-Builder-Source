package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ij1 extends rh implements kj1 {
    @Override // com.google.android.gms.internal.ads.kj1
    public final void a(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj1
    public final void f0(k3.b bVar, String str) {
        Parcel parcelZza = zza();
        th.e(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj1
    public final void h(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj1
    public final void m(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj1
    public final void o() {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj1
    public final void zzf() {
        zzda(3, zza());
    }
}
