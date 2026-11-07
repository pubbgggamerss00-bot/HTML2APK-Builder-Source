package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h40 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        zzm zzmVar = null;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 2) {
                zzmVar = (zzm) f3.b.c(parcel, i6, zzm.CREATOR);
            } else if (c7 != 3) {
                f3.b.n(i6, parcel);
            } else {
                strD = f3.b.d(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new g40(zzmVar, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new g40[i6];
    }
}
