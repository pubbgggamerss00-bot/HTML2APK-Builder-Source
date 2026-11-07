package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e20 extends sh implements f20 {
    public e20() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static f20 i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof f20 ? (f20) iInterfaceQueryLocalInterface : new d20(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            th.b(parcel);
            W(arrayListCreateTypedArrayList);
        } else {
            if (i6 != 2) {
                return false;
            }
            String string = parcel.readString();
            th.b(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
