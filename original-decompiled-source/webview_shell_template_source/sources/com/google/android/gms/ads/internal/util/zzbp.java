package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbp extends rh implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(k3.a aVar, String str, String str2) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(k3.a aVar, zza zzaVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzaVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
