package rd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        long jP = 0;
        long jP2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                jP2 = qa.b.p(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new i(jP, jP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
