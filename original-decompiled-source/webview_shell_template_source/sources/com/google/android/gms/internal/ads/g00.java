package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g00 extends sh implements h00 {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            String string = parcel.readString();
            th.b(parcel);
            ((c41) this).zze(string);
        } else if (i6 == 2) {
            String string2 = parcel.readString();
            th.b(parcel);
            ((c41) this).zzf(string2);
        } else {
            if (i6 != 3) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            ((c41) this).D(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
