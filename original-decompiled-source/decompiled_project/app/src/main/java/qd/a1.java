package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new e(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
