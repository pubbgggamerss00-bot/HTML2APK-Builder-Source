package fb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h0 implements Parcelable.Creator<g0> {
    @Override // android.os.Parcelable.Creator
    public final g0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new g0(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final g0[] newArray(int i10) {
        return new g0[i10];
    }
}
