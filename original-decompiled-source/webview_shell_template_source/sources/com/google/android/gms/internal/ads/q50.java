package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q50 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        String strD2 = null;
        ArrayList arrayListF = null;
        ArrayList arrayListF2 = null;
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        boolean zI4 = false;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 3:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case 4:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 5:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 6:
                    arrayListF = f3.b.f(i6, parcel);
                    break;
                case 7:
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case '\b':
                    zI4 = f3.b.i(i6, parcel);
                    break;
                case '\t':
                    arrayListF2 = f3.b.f(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new p50(strD, strD2, zI, zI2, arrayListF, zI3, zI4, arrayListF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new p50[i6];
    }
}
