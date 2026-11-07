package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.h0;

/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        h0 h0Var = null;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                h0Var = (h0) qa.b.e(parcel, i10, h0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new i(iN, h0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
