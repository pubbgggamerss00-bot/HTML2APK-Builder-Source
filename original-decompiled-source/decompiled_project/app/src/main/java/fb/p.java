package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final o createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                bundleB = qa.b.b(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new o(bundleB, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final o[] newArray(int i10) {
        return new o[i10];
    }
}
