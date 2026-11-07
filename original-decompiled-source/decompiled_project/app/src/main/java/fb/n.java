package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final m createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strF2 = null;
        String strF3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 2:
                    bundleB = qa.b.b(i10, parcel);
                    break;
                case 3:
                    bundleB2 = qa.b.b(i10, parcel);
                    break;
                case 4:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) qa.b.e(parcel, i10, ResultReceiver.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new m(strF, bundleB, bundleB2, strF2, strF3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final m[] newArray(int i10) {
        return new m[i10];
    }
}
