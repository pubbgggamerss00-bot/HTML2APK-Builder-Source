package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final b0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        ArrayList arrayListI2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, qd.b0.CREATOR);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                arrayListI2 = qa.b.i(parcel, i10, qd.e0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new b0(arrayListI, arrayListI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i10) {
        return new b0[i10];
    }
}
