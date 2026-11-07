package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzcl extends sh implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcm zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        th.b(parcel);
        zzc(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
