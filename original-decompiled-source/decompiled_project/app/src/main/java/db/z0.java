package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        byte[] bArrC = null;
        Double dL = null;
        String strF = null;
        ArrayList arrayListI = null;
        Integer numO = null;
        d0 d0Var = null;
        String strF2 = null;
        d dVar = null;
        Long lQ = null;
        String strF3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    bArrC = qa.b.c(i10, parcel);
                    break;
                case 3:
                    dL = qa.b.l(i10, parcel);
                    break;
                case 4:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 5:
                    arrayListI = qa.b.i(parcel, i10, v.CREATOR);
                    break;
                case 6:
                    numO = qa.b.o(i10, parcel);
                    break;
                case 7:
                    d0Var = (d0) qa.b.e(parcel, i10, d0.CREATOR);
                    break;
                case '\b':
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    dVar = (d) qa.b.e(parcel, i10, d.CREATOR);
                    break;
                case '\n':
                    lQ = qa.b.q(i10, parcel);
                    break;
                case 11:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case '\f':
                    resultReceiver = (ResultReceiver) qa.b.e(parcel, i10, ResultReceiver.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new x(bArrC, dL, strF, arrayListI, numO, d0Var, strF2, dVar, lQ, strF3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
