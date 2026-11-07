package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final c0 createFromParcel(Parcel parcel) {
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
        return new c0(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int i10) {
        return new c0[i10];
    }
}
