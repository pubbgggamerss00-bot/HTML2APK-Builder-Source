package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class rs extends sh implements ss {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            String string = parcel.readString();
            th.b(parcel);
            ((k10) this).zzf(string);
        } else {
            if (i6 != 2) {
                return false;
            }
            ((k10) this).zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
