package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m60 extends rh implements o60 {
    @Override // com.google.android.gms.internal.ads.o60
    public final l60 q(k3.b bVar, gy gyVar) {
        l60 j60Var;
        Parcel parcelZza = zza();
        th.e(parcelZza, bVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j60Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            j60Var = iInterfaceQueryLocalInterface instanceof l60 ? (l60) iInterfaceQueryLocalInterface : new j60(strongBinder);
        }
        parcelZzcZ.recycle();
        return j60Var;
    }
}
