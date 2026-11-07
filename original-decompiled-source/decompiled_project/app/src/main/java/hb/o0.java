package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator<n0> {
    @Override // android.os.Parcelable.Creator
    public final n0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 == 3) {
                iN3 = qa.b.n(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                iN4 = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new n0(iN, iN2, iN3, iN4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n0[] newArray(int i10) {
        return new n0[i10];
    }
}
