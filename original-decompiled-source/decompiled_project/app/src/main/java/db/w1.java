package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 3) {
                bArrC2 = qa.b.c(i10, parcel);
            } else if (c10 == 4) {
                bArrC3 = qa.b.c(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                int iR = qa.b.r(i10, parcel);
                int iDataPosition = parcel.dataPosition();
                if (iR == 0) {
                    strArr = null;
                } else {
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    parcel.setDataPosition(iDataPosition + iR);
                    strArr = strArrCreateStringArray;
                }
            }
        }
        qa.b.j(iT, parcel);
        return new h(bArrC, bArrC2, bArrC3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
