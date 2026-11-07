package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class wz extends sh implements xz {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        ty ryVar;
        if (i6 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ryVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                ryVar = iInterfaceQueryLocalInterface instanceof ty ? (ty) iInterfaceQueryLocalInterface : new ry(strongBinder);
            }
            th.b(parcel);
            ((w11) this).q0(ryVar);
        } else if (i6 == 2) {
            String string = parcel.readString();
            th.b(parcel);
            ((w11) this).zze(string);
        } else {
            if (i6 != 3) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            ((w11) this).zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
