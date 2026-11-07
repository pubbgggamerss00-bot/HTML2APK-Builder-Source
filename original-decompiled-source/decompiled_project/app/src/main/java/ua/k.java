package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        Parcel parcel2 = null;
        h hVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                int iR = qa.b.r(i10, parcel);
                int iDataPosition = parcel.dataPosition();
                if (iR == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iR);
                    parcel.setDataPosition(iDataPosition + iR);
                    parcel2 = parcelObtain;
                }
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                hVar = (h) qa.b.e(parcel, i10, h.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new c(iN, parcel2, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
