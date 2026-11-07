package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            qa.b.s(parcel.readInt(), parcel);
        }
        qa.b.j(iT, parcel);
        return new c();
    }

    @Override // android.os.Parcelable.Creator
    public final c[] newArray(int i10) {
        return new c[i10];
    }
}
