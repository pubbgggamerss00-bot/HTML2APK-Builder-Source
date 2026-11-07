package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable.Creator<q0> {
    @Override // android.os.Parcelable.Creator
    public final q0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            qa.b.s(parcel.readInt(), parcel);
        }
        qa.b.j(iT, parcel);
        return new q0();
    }

    @Override // android.os.Parcelable.Creator
    public final q0[] newArray(int i10) {
        return new q0[i10];
    }
}
