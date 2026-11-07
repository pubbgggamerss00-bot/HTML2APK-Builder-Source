package db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class z1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        u uVar = null;
        Uri uri = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                uVar = (u) qa.b.e(parcel, i10, u.CREATOR);
            } else if (c10 == 3) {
                uri = (Uri) qa.b.e(parcel, i10, Uri.CREATOR);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                bArrC = qa.b.c(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new l(uVar, uri, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
