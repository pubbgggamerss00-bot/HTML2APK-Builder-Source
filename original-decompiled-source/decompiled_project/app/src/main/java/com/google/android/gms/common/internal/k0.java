package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        boolean zK = false;
        boolean zK2 = false;
        IBinder iBinderM = null;
        pa.a aVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                iBinderM = qa.b.m(i10, parcel);
            } else if (c10 == 3) {
                aVar = (pa.a) qa.b.e(parcel, i10, pa.a.CREATOR);
            } else if (c10 == 4) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                zK2 = qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new j0(iN, iBinderM, aVar, zK, zK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j0[i10];
    }
}
