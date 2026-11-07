package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new g2();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g2[i10];
    }
}
