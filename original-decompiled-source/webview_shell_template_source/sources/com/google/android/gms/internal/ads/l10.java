package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l10 extends rh implements n10 {
    public l10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void L0(k3.a aVar, zza zzaVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzaVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void X0(String[] strArr, int[] iArr, k3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        th.e(parcelZza, aVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void t(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void u(Intent intent) {
        Parcel parcelZza = zza();
        th.c(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void zzh() {
        zzda(3, zza());
    }
}
