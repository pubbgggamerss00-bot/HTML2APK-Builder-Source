package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        boolean zK = false;
        boolean zK2 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 == 3) {
                zK2 = qa.b.k(i10, parcel);
            } else if (c10 == 4) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                iN3 = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new r(iN, iN2, iN3, zK, zK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
