package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        l lVar = null;
        String strF = null;
        qd.w0 w0Var = null;
        g gVar = null;
        ArrayList arrayListI2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    arrayListI = qa.b.i(parcel, i10, qd.b0.CREATOR);
                    break;
                case 2:
                    lVar = (l) qa.b.e(parcel, i10, l.CREATOR);
                    break;
                case 3:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 4:
                    w0Var = (qd.w0) qa.b.e(parcel, i10, qd.w0.CREATOR);
                    break;
                case 5:
                    gVar = (g) qa.b.e(parcel, i10, g.CREATOR);
                    break;
                case 6:
                    arrayListI2 = qa.b.i(parcel, i10, qd.e0.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new k(arrayListI, lVar, strF, w0Var, gVar, arrayListI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
