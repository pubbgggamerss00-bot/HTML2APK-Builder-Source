package ma;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                bundleB = qa.b.b(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new c(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final c[] newArray(int i10) {
        return new c[i10];
    }
}
