package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        String strF = null;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = b.n(i10, parcel);
            } else if (c10 != 2) {
                b.s(i10, parcel);
            } else {
                strF = b.f(i10, parcel);
            }
        }
        b.j(iT, parcel);
        return new zzax(iN, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzax[i10];
    }
}
