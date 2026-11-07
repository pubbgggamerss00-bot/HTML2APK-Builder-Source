package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class nj extends sh implements oj {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            ((ej) this).zzf();
        } else if (i6 == 2) {
            ((ej) this).zzc();
        } else if (i6 == 3) {
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            ((ej) this).zzd(zzeVar);
        } else if (i6 == 4) {
            ((ej) this).zze();
        } else {
            if (i6 != 5) {
                return false;
            }
            ((ej) this).zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
