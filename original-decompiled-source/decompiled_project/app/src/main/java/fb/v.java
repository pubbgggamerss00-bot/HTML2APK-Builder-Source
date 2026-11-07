package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public final u createFromParcel(Parcel parcel) {
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
        return new u(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final u[] newArray(int i10) {
        return new u[i10];
    }
}
