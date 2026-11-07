package eb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        byte[] bArrC = null;
        ArrayList arrayListI = null;
        int iN = 0;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 3) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                arrayListI = qa.b.i(parcel, i10, Transport.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new b(iN, bArrC, strF, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
