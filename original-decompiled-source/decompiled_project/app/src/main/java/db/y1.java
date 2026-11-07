package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class y1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        Boolean boolValueOf = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                int iR = qa.b.r(i10, parcel);
                if (iR == 0) {
                    boolValueOf = null;
                } else {
                    qa.b.u(parcel, iR, 4);
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
            } else if (c10 == 4) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                strF3 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new k(strF, boolValueOf, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
