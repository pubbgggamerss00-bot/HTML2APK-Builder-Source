package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        boolean zK = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                strF3 = qa.b.f(i10, parcel);
            } else if (c10 == 4) {
                strF4 = qa.b.f(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                zK = qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new d(strF, strF2, strF3, strF4, zK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
