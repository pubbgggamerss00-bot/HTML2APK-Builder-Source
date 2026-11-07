package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        boolean zI = false;
        int iK = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Bundle bundleA = null;
        String strD5 = null;
        long jL = 0;
        long jL2 = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 3:
                    jL = f3.b.l(i6, parcel);
                    break;
                case 4:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case 5:
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case 6:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case 7:
                    bundleA = f3.b.a(i6, parcel);
                    break;
                case '\b':
                    zI = f3.b.i(i6, parcel);
                    break;
                case '\t':
                    jL2 = f3.b.l(i6, parcel);
                    break;
                case '\n':
                    strD5 = f3.b.d(i6, parcel);
                    break;
                case 11:
                    iK = f3.b.k(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new xj(strD, jL, strD2, strD3, strD4, bundleA, zI, jL2, strD5, iK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new xj[i6];
    }
}
