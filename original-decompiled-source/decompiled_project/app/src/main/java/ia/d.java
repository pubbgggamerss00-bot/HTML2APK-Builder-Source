package ia;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        byte[] bArrC = null;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 == 3) {
                iN3 = qa.b.n(i10, parcel);
            } else if (c10 == 4) {
                bundleB = qa.b.b(i10, parcel);
            } else if (c10 == 5) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 != 1000) {
                qa.b.s(i10, parcel);
            } else {
                iN = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new b(iN, iN2, pendingIntent, iN3, bundleB, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
