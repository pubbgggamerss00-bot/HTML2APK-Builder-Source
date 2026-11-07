package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        long jL = 0;
        boolean zI = false;
        int iK = 0;
        boolean zI2 = false;
        String strD = null;
        byte[] bArrB = null;
        String[] strArrE = null;
        String[] strArrE2 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 2:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 3:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 4:
                    bArrB = f3.b.b(i6, parcel);
                    break;
                case 5:
                    strArrE = f3.b.e(i6, parcel);
                    break;
                case 6:
                    strArrE2 = f3.b.e(i6, parcel);
                    break;
                case 7:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case '\b':
                    jL = f3.b.l(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new iv(zI, strD, iK, bArrB, strArrE, strArrE2, zI2, jL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new iv[i6];
    }
}
