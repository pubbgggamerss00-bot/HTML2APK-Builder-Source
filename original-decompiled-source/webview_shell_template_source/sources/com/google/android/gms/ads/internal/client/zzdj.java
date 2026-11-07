package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzdj extends rh implements zzdl {
    public zzdj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(1, parcelZza);
    }
}
