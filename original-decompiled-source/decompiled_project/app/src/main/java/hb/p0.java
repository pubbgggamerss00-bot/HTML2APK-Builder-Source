package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class p0 implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        int iN2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                iN2 = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new b(iN, iN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
