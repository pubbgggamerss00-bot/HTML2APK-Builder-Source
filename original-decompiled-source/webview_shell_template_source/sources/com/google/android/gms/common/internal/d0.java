package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final c0 createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        boolean zI = false;
        boolean zI2 = false;
        IBinder iBinderJ = null;
        c3.b bVar = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                iBinderJ = f3.b.j(i6, parcel);
            } else if (c7 == 3) {
                bVar = (c3.b) f3.b.c(parcel, i6, c3.b.CREATOR);
            } else if (c7 == 4) {
                zI = f3.b.i(i6, parcel);
            } else if (c7 != 5) {
                f3.b.n(i6, parcel);
            } else {
                zI2 = f3.b.i(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new c0(iK, iBinderJ, bVar, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int i6) {
        return new c0[i6];
    }
}
