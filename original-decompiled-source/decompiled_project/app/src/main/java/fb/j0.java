package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final i0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            qa.b.s(parcel.readInt(), parcel);
        }
        qa.b.j(iT, parcel);
        return new i0();
    }

    @Override // android.os.Parcelable.Creator
    public final i0[] newArray(int i10) {
        return new i0[i10];
    }
}
