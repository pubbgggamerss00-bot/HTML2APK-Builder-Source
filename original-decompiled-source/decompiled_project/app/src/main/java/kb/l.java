package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j0;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        pa.a aVar = null;
        int iN = 0;
        j0 j0Var = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                aVar = (pa.a) qa.b.e(parcel, i10, pa.a.CREATOR);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                j0Var = (j0) qa.b.e(parcel, i10, j0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new k(iN, aVar, j0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
