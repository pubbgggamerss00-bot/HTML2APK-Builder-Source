package ia;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        byte[] bArrC = null;
        Bundle bundleB = null;
        long jP = 0;
        int iN = 0;
        int iN2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 == 3) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 == 4) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 5) {
                bundleB = qa.b.b(i10, parcel);
            } else if (c10 != 1000) {
                qa.b.s(i10, parcel);
            } else {
                iN = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new a(iN, strF, iN2, jP, bArrC, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
