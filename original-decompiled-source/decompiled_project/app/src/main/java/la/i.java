package la;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
        boolean zK = false;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 2) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new d(strF, zK, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
