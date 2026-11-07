package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcu extends rh implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final gy getAdapterCreator() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        gy gyVarI1 = fy.i1(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return gyVarI1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzfb getLiteSdkVersion() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzfb zzfbVar = (zzfb) th.a(parcelZzcZ, zzfb.CREATOR);
        parcelZzcZ.recycle();
        return zzfbVar;
    }
}
