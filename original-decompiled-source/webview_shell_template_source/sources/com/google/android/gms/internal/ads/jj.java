package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class jj extends sh implements kj {
    public jj() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        hj fjVar;
        if (i6 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                fjVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                fjVar = iInterfaceQueryLocalInterface instanceof hj ? (hj) iInterfaceQueryLocalInterface : new fj(strongBinder);
            }
            th.b(parcel);
            z(fjVar);
        } else if (i6 == 2) {
            parcel.readInt();
            th.b(parcel);
        } else {
            if (i6 != 3) {
                return false;
            }
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            p1(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
