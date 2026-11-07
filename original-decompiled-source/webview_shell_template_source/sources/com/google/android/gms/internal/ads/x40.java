package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class x40 extends sh implements y40 {
    public x40() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzg();
        } else if (i6 == 2) {
            int i8 = parcel.readInt();
            th.b(parcel);
            zze(i8);
        } else {
            if (i6 != 3) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
