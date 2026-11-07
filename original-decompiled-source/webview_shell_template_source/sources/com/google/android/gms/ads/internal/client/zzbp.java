package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbp extends rh implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i6) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzmVar);
        parcelZza.writeInt(i6);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
