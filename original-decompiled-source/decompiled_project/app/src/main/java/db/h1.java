package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                strF2 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new d0(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
