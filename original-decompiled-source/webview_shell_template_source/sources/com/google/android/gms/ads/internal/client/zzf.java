package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        String strD2 = null;
        zze zzeVar = null;
        IBinder iBinderJ = null;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                strD = f3.b.d(i6, parcel);
            } else if (c7 == 3) {
                strD2 = f3.b.d(i6, parcel);
            } else if (c7 == 4) {
                zzeVar = (zze) f3.b.c(parcel, i6, zze.CREATOR);
            } else if (c7 != 5) {
                f3.b.n(i6, parcel);
            } else {
                iBinderJ = f3.b.j(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new zze(iK, strD, strD2, zzeVar, iBinderJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zze[i6];
    }
}
