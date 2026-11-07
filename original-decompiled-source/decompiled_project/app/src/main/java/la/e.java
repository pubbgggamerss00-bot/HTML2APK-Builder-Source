package la;

import android.os.Parcel;
import android.os.Parcelable;
import la.c;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        byte[] bArrC = null;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new c.a(bArrC, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c.a[i10];
    }
}
