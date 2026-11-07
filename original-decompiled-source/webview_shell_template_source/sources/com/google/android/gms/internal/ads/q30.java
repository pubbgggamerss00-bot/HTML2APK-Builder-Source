package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q30 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            if (((char) i6) != 2) {
                f3.b.n(i6, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) f3.b.c(parcel, i6, ParcelFileDescriptor.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new p30(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new p30[i6];
    }
}
