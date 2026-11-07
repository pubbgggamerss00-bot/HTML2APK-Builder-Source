package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        boolean zI = false;
        boolean zI2 = false;
        int iK2 = 0;
        int iK3 = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                zI = f3.b.i(i6, parcel);
            } else if (c7 == 3) {
                zI2 = f3.b.i(i6, parcel);
            } else if (c7 == 4) {
                iK2 = f3.b.k(i6, parcel);
            } else if (c7 != 5) {
                f3.b.n(i6, parcel);
            } else {
                iK3 = f3.b.k(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new n(iK, zI, zI2, iK2, iK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new n[i6];
    }
}
