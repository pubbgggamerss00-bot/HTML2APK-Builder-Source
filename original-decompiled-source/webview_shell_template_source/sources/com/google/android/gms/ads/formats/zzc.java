package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = b.o(parcel);
        IBinder iBinderJ = null;
        boolean zI = false;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                zI = b.i(i6, parcel);
            } else if (c7 != 2) {
                b.n(i6, parcel);
            } else {
                iBinderJ = b.j(i6, parcel);
            }
        }
        b.h(iO, parcel);
        return new AdManagerAdViewOptions(zI, iBinderJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new AdManagerAdViewOptions[i6];
    }
}
