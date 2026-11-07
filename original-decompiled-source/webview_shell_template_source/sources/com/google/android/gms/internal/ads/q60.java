package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q60 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        String strD2 = null;
        zzs zzsVar = null;
        zzm zzmVar = null;
        String strD3 = null;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 2:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case 3:
                    zzsVar = (zzs) f3.b.c(parcel, i6, zzs.CREATOR);
                    break;
                case 4:
                    zzmVar = (zzm) f3.b.c(parcel, i6, zzm.CREATOR);
                    break;
                case 5:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 6:
                    strD3 = f3.b.d(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new p60(strD, strD2, zzsVar, zzmVar, iK, strD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new p60[i6];
    }
}
