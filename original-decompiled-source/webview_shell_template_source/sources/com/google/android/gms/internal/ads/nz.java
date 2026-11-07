package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class nz extends sh implements oz {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 2) {
            ((n01) this).zzg();
        } else if (i6 == 3) {
            String string = parcel.readString();
            th.b(parcel);
            ((n01) this).zze(string);
        } else {
            if (i6 != 4) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            ((n01) this).zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
