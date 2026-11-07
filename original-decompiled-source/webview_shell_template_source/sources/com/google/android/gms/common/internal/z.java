package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        int iK4 = 0;
        long jL = 0;
        long jL2 = 0;
        String strD = null;
        String strD2 = null;
        int iK5 = -1;
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
                    jL = f3.b.l(i6, parcel);
                    break;
                case 5:
                    jL2 = f3.b.l(i6, parcel);
                    break;
                case 6:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 7:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case '\b':
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case '\t':
                    iK5 = f3.b.k(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new j(iK, iK2, iK3, jL, jL2, strD, strD2, iK4, iK5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i6) {
        return new j[i6];
    }
}
