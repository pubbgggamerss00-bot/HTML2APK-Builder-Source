package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        long jL = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) f3.b.c(parcel, i6, ParcelFileDescriptor.CREATOR);
            } else if (c7 == 3) {
                zI = f3.b.i(i6, parcel);
            } else if (c7 == 4) {
                zI2 = f3.b.i(i6, parcel);
            } else if (c7 == 5) {
                jL = f3.b.l(i6, parcel);
            } else if (c7 != 6) {
                f3.b.n(i6, parcel);
            } else {
                zI3 = f3.b.i(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new uj(parcelFileDescriptor, zI, zI2, jL, zI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new uj[i6];
    }
}
