package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e0 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final d0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "";
        String strF2 = "";
        String strF3 = strF2;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF3 = qa.b.f(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new d0(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d0[] newArray(int i10) {
        return new d0[i10];
    }
}
