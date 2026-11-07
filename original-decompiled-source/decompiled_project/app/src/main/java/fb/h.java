package fb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                zK = qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new g(zK);
    }

    @Override // android.os.Parcelable.Creator
    public final g[] newArray(int i10) {
        return new g[i10];
    }
}
