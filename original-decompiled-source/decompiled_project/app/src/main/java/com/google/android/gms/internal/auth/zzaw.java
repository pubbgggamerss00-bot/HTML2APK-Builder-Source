package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iN = 0;
        String strF = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = b.n(i10, parcel);
            } else if (c10 == 2) {
                strF = b.f(i10, parcel);
            } else if (c10 != 3) {
                b.s(i10, parcel);
            } else {
                iN2 = b.n(i10, parcel);
            }
        }
        b.j(iT, parcel);
        return new zzav(iN, strF, iN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
