package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class n0 implements Parcelable.Creator<m0> {
    @Override // android.os.Parcelable.Creator
    public final m0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            qa.b.s(parcel.readInt(), parcel);
        }
        qa.b.j(iT, parcel);
        return new m0();
    }

    @Override // android.os.Parcelable.Creator
    public final m0[] newArray(int i10) {
        return new m0[i10];
    }
}
