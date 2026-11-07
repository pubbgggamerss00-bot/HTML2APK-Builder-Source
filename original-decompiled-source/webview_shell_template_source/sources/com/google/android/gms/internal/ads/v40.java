package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v40 extends rh {
    public final IBinder zze(k3.a aVar, String str, gy gyVar, int i6) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
