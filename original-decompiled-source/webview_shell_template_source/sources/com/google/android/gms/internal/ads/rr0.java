package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rr0 extends sh implements hw {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            parcel.readInt();
            th.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zze(int i6) {
    }
}
