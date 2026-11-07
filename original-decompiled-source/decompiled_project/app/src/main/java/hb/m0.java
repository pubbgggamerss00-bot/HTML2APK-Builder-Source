package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, n0.CREATOR);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                iN = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new l(arrayListI, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
