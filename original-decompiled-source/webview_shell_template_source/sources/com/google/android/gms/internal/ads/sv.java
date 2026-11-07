package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        boolean zI = false;
        int iK = 0;
        String strD2 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                strD = f3.b.d(i6, parcel);
            } else if (c7 == 2) {
                zI = f3.b.i(i6, parcel);
            } else if (c7 == 3) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 != 4) {
                f3.b.n(i6, parcel);
            } else {
                strD2 = f3.b.d(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new rv(strD, iK, strD2, zI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new rv[i6];
    }
}
