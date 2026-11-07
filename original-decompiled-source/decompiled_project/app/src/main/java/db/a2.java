package db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        x xVar = null;
        Uri uri = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                xVar = (x) qa.b.e(parcel, i10, x.CREATOR);
            } else if (c10 == 3) {
                uri = (Uri) qa.b.e(parcel, i10, Uri.CREATOR);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                bArrC = qa.b.c(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new m(xVar, uri, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
