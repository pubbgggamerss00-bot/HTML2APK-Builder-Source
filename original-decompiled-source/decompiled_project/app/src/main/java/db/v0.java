package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        y yVar = null;
        a0 a0Var = null;
        byte[] bArrC = null;
        ArrayList arrayListI = null;
        Double dL = null;
        ArrayList arrayListI2 = null;
        k kVar = null;
        Integer numO = null;
        d0 d0Var = null;
        String strF = null;
        d dVar = null;
        String strF2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    yVar = (y) qa.b.e(parcel, i10, y.CREATOR);
                    break;
                case 3:
                    a0Var = (a0) qa.b.e(parcel, i10, a0.CREATOR);
                    break;
                case 4:
                    bArrC = qa.b.c(i10, parcel);
                    break;
                case 5:
                    arrayListI = qa.b.i(parcel, i10, w.CREATOR);
                    break;
                case 6:
                    dL = qa.b.l(i10, parcel);
                    break;
                case 7:
                    arrayListI2 = qa.b.i(parcel, i10, v.CREATOR);
                    break;
                case '\b':
                    kVar = (k) qa.b.e(parcel, i10, k.CREATOR);
                    break;
                case '\t':
                    numO = qa.b.o(i10, parcel);
                    break;
                case '\n':
                    d0Var = (d0) qa.b.e(parcel, i10, d0.CREATOR);
                    break;
                case 11:
                    strF = qa.b.f(i10, parcel);
                    break;
                case '\f':
                    dVar = (d) qa.b.e(parcel, i10, d.CREATOR);
                    break;
                case '\r':
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) qa.b.e(parcel, i10, ResultReceiver.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new u(yVar, a0Var, bArrC, arrayListI, dL, arrayListI2, kVar, numO, d0Var, strF, dVar, strF2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
