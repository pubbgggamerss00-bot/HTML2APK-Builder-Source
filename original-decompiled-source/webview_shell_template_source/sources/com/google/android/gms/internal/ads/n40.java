package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n40 extends rh implements o40 {
    public n40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final int zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        int i6 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final String zzf() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
