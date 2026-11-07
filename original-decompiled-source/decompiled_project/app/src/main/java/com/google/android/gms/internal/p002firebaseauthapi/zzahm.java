package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzahm implements Parcelable.Creator<zzahn> {
    @Override // android.os.Parcelable.Creator
    public final zzahn createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        String strF = null;
        String strF2 = null;
        Long lQ = null;
        String strF3 = null;
        Long lQ2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strF = b.f(i10, parcel);
            } else if (c10 == 3) {
                strF2 = b.f(i10, parcel);
            } else if (c10 == 4) {
                lQ = b.q(i10, parcel);
            } else if (c10 == 5) {
                strF3 = b.f(i10, parcel);
            } else if (c10 != 6) {
                b.s(i10, parcel);
            } else {
                lQ2 = b.q(i10, parcel);
            }
        }
        b.j(iT, parcel);
        return new zzahn(strF, strF2, lQ, strF3, lQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahn[] newArray(int i10) {
        return new zzahn[i10];
    }
}
