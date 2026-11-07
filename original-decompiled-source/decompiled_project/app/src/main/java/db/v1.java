package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        byte[] bArrC4 = null;
        byte[] bArrC5 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 3) {
                bArrC2 = qa.b.c(i10, parcel);
            } else if (c10 == 4) {
                bArrC3 = qa.b.c(i10, parcel);
            } else if (c10 == 5) {
                bArrC4 = qa.b.c(i10, parcel);
            } else if (c10 != 6) {
                qa.b.s(i10, parcel);
            } else {
                bArrC5 = qa.b.c(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new g(bArrC, bArrC2, bArrC3, bArrC4, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
