package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList arrayListI = null;
        ArrayList arrayListI2 = null;
        g gVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                arrayListI = qa.b.i(parcel, i10, qd.b0.CREATOR);
            } else if (c10 == 4) {
                arrayListI2 = qa.b.i(parcel, i10, qd.e0.CREATOR);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                gVar = (g) qa.b.e(parcel, i10, g.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        l lVar = new l();
        lVar.f23397a = strF;
        lVar.f23398b = strF2;
        lVar.f23399c = arrayListI;
        lVar.f23400d = arrayListI2;
        lVar.f23401e = gVar;
        return lVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
