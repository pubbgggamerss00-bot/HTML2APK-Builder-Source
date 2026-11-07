package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class t implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final s createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "";
        String strF2 = strF;
        String strF3 = strF2;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strF4 = null;
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
                    strF4 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new s(strF, bundleB, bundleB2, strF4, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final s[] newArray(int i10) {
        return new s[i10];
    }
}
