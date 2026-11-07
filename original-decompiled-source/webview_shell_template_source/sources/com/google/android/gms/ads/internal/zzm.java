package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        int iK = 0;
        boolean zI4 = false;
        boolean zI5 = false;
        boolean zI6 = false;
        float f6 = 0.0f;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 3:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 4:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 5:
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case 6:
                    f3.b.p(parcel, i6, 4);
                    f6 = parcel.readFloat();
                    break;
                case 7:
                    iK = f3.b.k(i6, parcel);
                    break;
                case '\b':
                    zI4 = f3.b.i(i6, parcel);
                    break;
                case '\t':
                    zI5 = f3.b.i(i6, parcel);
                    break;
                case '\n':
                    zI6 = f3.b.i(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new zzl(zI, zI2, strD, zI3, f6, iK, zI4, zI5, zI6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzl[i6];
    }
}
