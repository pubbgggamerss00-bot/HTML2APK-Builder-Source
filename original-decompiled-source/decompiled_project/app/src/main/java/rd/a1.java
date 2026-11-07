package rd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a1 implements Parcelable.Creator<b1> {
    @Override // android.os.Parcelable.Creator
    public final b1 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        boolean zK = false;
        String strF2 = null;
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
                zK = qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new b1(strF, strF2, zK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b1[] newArray(int i10) {
        return new b1[i10];
    }
}
