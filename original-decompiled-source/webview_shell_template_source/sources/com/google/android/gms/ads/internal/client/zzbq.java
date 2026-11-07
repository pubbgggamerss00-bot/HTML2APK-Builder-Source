package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbq extends sh implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzm zzmVar = (zzm) th.a(parcel, zzm.CREATOR);
            th.b(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
        } else if (i6 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i6 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = th.f9281a;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i6 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i6 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) th.a(parcel, zzm.CREATOR);
            int i8 = parcel.readInt();
            th.b(parcel);
            zzh(zzmVar2, i8);
            parcel2.writeNoException();
        }
        return true;
    }
}
