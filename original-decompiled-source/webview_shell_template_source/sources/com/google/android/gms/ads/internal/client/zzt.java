package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        int iK2 = 0;
        boolean zI = false;
        int iK3 = 0;
        int iK4 = 0;
        boolean zI2 = false;
        boolean zI3 = false;
        boolean zI4 = false;
        boolean zI5 = false;
        boolean zI6 = false;
        boolean zI7 = false;
        boolean zI8 = false;
        boolean zI9 = false;
        String strD = null;
        zzs[] zzsVarArr = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 3:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 4:
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 5:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 6:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case 7:
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case '\b':
                    zzsVarArr = (zzs[]) f3.b.g(parcel, i6, zzs.CREATOR);
                    break;
                case '\t':
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case '\n':
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case 11:
                    zI4 = f3.b.i(i6, parcel);
                    break;
                case '\f':
                    zI5 = f3.b.i(i6, parcel);
                    break;
                case '\r':
                    zI6 = f3.b.i(i6, parcel);
                    break;
                case 14:
                    zI7 = f3.b.i(i6, parcel);
                    break;
                case 15:
                    zI8 = f3.b.i(i6, parcel);
                    break;
                case 16:
                    zI9 = f3.b.i(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new zzs(strD, iK, iK2, zI, iK3, iK4, zzsVarArr, zI2, zI3, zI4, zI5, zI6, zI7, zI8, zI9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzs[i6];
    }
}
