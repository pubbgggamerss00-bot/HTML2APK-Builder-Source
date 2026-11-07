package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o10 extends rh implements q10 {
    @Override // com.google.android.gms.internal.ads.q10
    public final n10 q(k3.b bVar, gy gyVar) {
        n10 l10Var;
        Parcel parcelZza = zza();
        th.e(parcelZza, bVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            l10Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            l10Var = iInterfaceQueryLocalInterface instanceof n10 ? (n10) iInterfaceQueryLocalInterface : new l10(strongBinder);
        }
        parcelZzcZ.recycle();
        return l10Var;
    }
}
