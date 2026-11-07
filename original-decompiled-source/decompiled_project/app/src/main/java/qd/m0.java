package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final s createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                strF2 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new s(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i10) {
        return new s[i10];
    }
}
