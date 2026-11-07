package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final a0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        q qVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                qVar = (q) qa.b.e(parcel, i10, q.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new a0(qVar);
    }

    @Override // android.os.Parcelable.Creator
    public final a0[] newArray(int i10) {
        return new a0[i10];
    }
}
