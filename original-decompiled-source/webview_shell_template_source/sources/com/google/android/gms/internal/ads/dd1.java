package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dd1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        int iK4 = 0;
        int iK5 = 0;
        int iK6 = 0;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 2:
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 3:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case 4:
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case 5:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 6:
                    iK5 = f3.b.k(i6, parcel);
                    break;
                case 7:
                    iK6 = f3.b.k(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new cd1(iK, iK2, iK3, iK4, strD, iK5, iK6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new cd1[i6];
    }
}
