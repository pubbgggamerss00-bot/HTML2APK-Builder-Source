package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzga;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        boolean zI = false;
        int iK2 = 0;
        boolean zI2 = false;
        int iK3 = 0;
        boolean zI3 = false;
        int iK4 = 0;
        int iK5 = 0;
        boolean zI4 = false;
        int iK6 = 0;
        zzga zzgaVar = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 2:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 3:
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 4:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 5:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case 6:
                    zzgaVar = (zzga) f3.b.c(parcel, i6, zzga.CREATOR);
                    break;
                case 7:
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case '\b':
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case '\t':
                    iK5 = f3.b.k(i6, parcel);
                    break;
                case '\n':
                    zI4 = f3.b.i(i6, parcel);
                    break;
                case 11:
                    iK6 = f3.b.k(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new oq(iK, zI, iK2, zI2, iK3, zzgaVar, zI3, iK4, iK5, zI4, iK6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new oq[i6];
    }
}
