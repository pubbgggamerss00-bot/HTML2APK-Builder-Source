package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzcv extends sh implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcw ? (zzcw) iInterfaceQueryLocalInterface : new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            zzfb liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            th.d(parcel2, liteSdkVersion);
        } else {
            if (i6 != 2) {
                return false;
            }
            gy adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            th.e(parcel2, adapterCreator);
        }
        return true;
    }
}
