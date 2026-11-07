package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator<n0> {
    @Override // android.os.Parcelable.Creator
    public final n0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                strF3 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new n0(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0[] newArray(int i10) {
        return new n0[i10];
    }
}
