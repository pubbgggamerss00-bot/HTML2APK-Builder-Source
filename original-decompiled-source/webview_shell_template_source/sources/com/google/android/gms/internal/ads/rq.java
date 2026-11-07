package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class rq extends sh implements sq {
    public static sq i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof sq ? (sq) iInterfaceQueryLocalInterface : new qq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((kq) this).s);
            return true;
        }
        if (i6 != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((kq) this).f6466u);
        return true;
    }
}
