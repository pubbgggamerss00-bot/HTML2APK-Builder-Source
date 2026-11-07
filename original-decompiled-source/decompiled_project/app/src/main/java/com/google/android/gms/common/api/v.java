package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        pa.a aVar = null;
        int iN = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                aVar = (pa.a) qa.b.e(parcel, i10, pa.a.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new Status(iN, strF, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
