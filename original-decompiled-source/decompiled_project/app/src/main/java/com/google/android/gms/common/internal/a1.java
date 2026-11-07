package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        r rVar = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zK = false;
        boolean zK2 = false;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    rVar = (r) qa.b.e(parcel, i10, r.CREATOR);
                    break;
                case 2:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 3:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 4:
                    iArrD = qa.b.d(i10, parcel);
                    break;
                case 5:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 6:
                    iArrD2 = qa.b.d(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new e(rVar, zK, zK2, iArrD, iN, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
