package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        short s10 = 0;
        short s11 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                qa.b.v(parcel, i10, 4);
                s10 = (short) parcel.readInt();
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                qa.b.v(parcel, i10, 4);
                s11 = (short) parcel.readInt();
            }
        }
        qa.b.j(iT, parcel);
        return new h0(iN, s10, s11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
