package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yu extends rh implements av {
    @Override // com.google.android.gms.internal.ads.av
    public final xu v(k3.b bVar, gy gyVar, su suVar) {
        xu vuVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, bVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        th.e(parcelZza, suVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            vuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            vuVar = iInterfaceQueryLocalInterface instanceof xu ? (xu) iInterfaceQueryLocalInterface : new vu(strongBinder);
        }
        parcelZzcZ.recycle();
        return vuVar;
    }
}
