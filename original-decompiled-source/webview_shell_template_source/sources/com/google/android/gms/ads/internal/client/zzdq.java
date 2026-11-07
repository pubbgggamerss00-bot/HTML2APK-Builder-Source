package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzdq extends sh implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface : new zzdp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzu zzuVar = (zzu) th.a(parcel, zzu.CREATOR);
            th.b(parcel);
            zze(zzuVar);
            parcel2.writeNoException();
        } else {
            if (i6 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = th.f9281a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
