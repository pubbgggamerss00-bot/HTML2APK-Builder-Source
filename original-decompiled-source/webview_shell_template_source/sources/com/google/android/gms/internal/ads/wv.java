package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class wv extends sh implements xv {
    public wv() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(rv.CREATOR);
        th.b(parcel);
        r1(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
