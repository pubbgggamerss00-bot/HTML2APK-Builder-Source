package ua;

import android.os.Parcel;
import android.os.Parcelable;
import ua.a;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        int iN = 0;
        a.C0303a c0303a = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                c0303a = (a.C0303a) qa.b.e(parcel, i10, a.C0303a.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new g(c0303a, strF, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
