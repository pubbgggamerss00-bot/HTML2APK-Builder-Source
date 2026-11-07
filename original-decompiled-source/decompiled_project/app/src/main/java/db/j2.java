package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new r(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
