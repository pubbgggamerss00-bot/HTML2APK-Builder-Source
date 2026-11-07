package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class q0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final b0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        long jP = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                strF3 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new b0(strF, strF2, jP, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i10) {
        return new b0[i10];
    }
}
