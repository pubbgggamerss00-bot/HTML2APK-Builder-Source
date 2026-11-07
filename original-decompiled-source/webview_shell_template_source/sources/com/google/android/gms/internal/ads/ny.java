package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ny extends rh implements oy {
    public ny(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.oy
    public final k3.a zze() {
        return androidx.activity.m.f(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.oy
    public final boolean zzf() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
