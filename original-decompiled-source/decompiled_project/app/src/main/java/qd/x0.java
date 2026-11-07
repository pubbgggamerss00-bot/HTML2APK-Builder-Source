package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class x0 implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final y createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            qa.b.s(parcel.readInt(), parcel);
        }
        qa.b.j(iT, parcel);
        return new y();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i10) {
        return new y[i10];
    }
}
