package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uh extends rh implements wh {
    @Override // com.google.android.gms.internal.ads.wh
    public final void a(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void g(k3.b bVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, bVar);
        parcelZza.writeString("GMA_SDK");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void h(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void m(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void o() {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void zzf() {
        zzda(3, zza());
    }
}
