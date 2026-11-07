package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzgb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 2) {
                zI = f3.b.i(i6, parcel);
            } else if (c7 == 3) {
                zI2 = f3.b.i(i6, parcel);
            } else if (c7 != 4) {
                f3.b.n(i6, parcel);
            } else {
                zI3 = f3.b.i(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new zzga(zI, zI2, zI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzga[i6];
    }
}
