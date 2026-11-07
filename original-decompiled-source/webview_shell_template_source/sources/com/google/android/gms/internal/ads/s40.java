package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s40 extends rh implements u40 {
    @Override // com.google.android.gms.internal.ads.u40
    public final void D1(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void e0(o40 o40Var) {
        Parcel parcelZza = zza();
        th.e(parcelZza, o40Var);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void i(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zze() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzf() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzg() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzj() {
        zzda(1, zza());
    }
}
