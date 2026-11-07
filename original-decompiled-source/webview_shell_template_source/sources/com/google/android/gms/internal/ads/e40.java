package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e40 extends rh implements f40 {
    public e40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void a(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void e1(y30 y30Var) {
        Parcel parcelZza = zza();
        th.e(parcelZza, y30Var);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzf() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzh() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzi() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzj() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzk() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.f40
    public final void zzl() {
        zzda(3, zza());
    }
}
