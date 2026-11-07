package eb;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Integer numO = null;
        Double dL = null;
        Uri uri = null;
        byte[] bArrC = null;
        ArrayList arrayListI = null;
        a aVar = null;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    numO = qa.b.o(i10, parcel);
                    break;
                case 3:
                    dL = qa.b.l(i10, parcel);
                    break;
                case 4:
                    uri = (Uri) qa.b.e(parcel, i10, Uri.CREATOR);
                    break;
                case 5:
                    bArrC = qa.b.c(i10, parcel);
                    break;
                case 6:
                    arrayListI = qa.b.i(parcel, i10, e.CREATOR);
                    break;
                case 7:
                    aVar = (a) qa.b.e(parcel, i10, a.CREATOR);
                    break;
                case '\b':
                    strF = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new SignRequestParams(numO, dL, uri, bArrC, arrayListI, aVar, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignRequestParams[i10];
    }
}
