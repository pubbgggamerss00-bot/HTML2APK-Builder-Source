package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import f3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = b.o(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                strD = b.d(i6, parcel);
            } else if (c7 == 2) {
                strD2 = b.d(i6, parcel);
            } else if (c7 != 3) {
                b.n(i6, parcel);
            } else {
                strD3 = b.d(i6, parcel);
            }
        }
        b.h(iO, parcel);
        return new zza(strD, strD2, strD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zza[i6];
    }
}
