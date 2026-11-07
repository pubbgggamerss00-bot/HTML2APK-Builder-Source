package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "";
        ArrayList arrayListI = null;
        int iN = 0;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, zzbe.CREATOR);
            } else if (c10 == 2) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 3) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                strF2 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new e(arrayListI, iN, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
