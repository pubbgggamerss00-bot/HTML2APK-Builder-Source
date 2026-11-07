package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class qz extends sh implements rz {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        oy nyVar;
        if (i6 == 1) {
            ((w01) this).t(androidx.camera.core.c.c(parcel, parcel));
        } else if (i6 == 2) {
            String string = parcel.readString();
            th.b(parcel);
            ((w01) this).zze(string);
        } else if (i6 == 3) {
            zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
            th.b(parcel);
            ((w01) this).zzf(zzeVar);
        } else {
            if (i6 != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                nyVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                nyVar = iInterfaceQueryLocalInterface instanceof oy ? (oy) iInterfaceQueryLocalInterface : new ny(strongBinder);
            }
            th.b(parcel);
            ((w01) this).z1(nyVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
