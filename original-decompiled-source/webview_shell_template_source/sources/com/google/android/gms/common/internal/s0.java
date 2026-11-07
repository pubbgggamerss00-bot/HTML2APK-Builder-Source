package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        n nVar = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean zI = false;
        boolean zI2 = false;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    nVar = (n) f3.b.c(parcel, i6, n.CREATOR);
                    break;
                case 2:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 3:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 4:
                    int iM = f3.b.m(i6, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iM != 0) {
                        iArrCreateIntArray = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition + iM);
                        break;
                    } else {
                        iArrCreateIntArray = null;
                        break;
                    }
                case 5:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 6:
                    int iM2 = f3.b.m(i6, parcel);
                    int iDataPosition2 = parcel.dataPosition();
                    if (iM2 != 0) {
                        iArrCreateIntArray2 = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition2 + iM2);
                        break;
                    } else {
                        iArrCreateIntArray2 = null;
                        break;
                    }
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new d(nVar, zI, zI2, iArrCreateIntArray, iK, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new d[i6];
    }
}
