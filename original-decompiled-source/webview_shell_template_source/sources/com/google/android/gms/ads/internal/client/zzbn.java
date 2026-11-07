package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbn extends sh implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzc();
        } else {
            if (i6 != 2) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            zzb(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
