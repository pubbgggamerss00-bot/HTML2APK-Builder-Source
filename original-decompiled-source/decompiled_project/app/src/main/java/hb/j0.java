package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final i0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 1;
        int iN2 = 1;
        long jP = -1;
        long jP2 = -1;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 == 3) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                jP2 = qa.b.p(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new i0(iN, iN2, jP, jP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i0[] newArray(int i10) {
        return new i0[i10];
    }
}
