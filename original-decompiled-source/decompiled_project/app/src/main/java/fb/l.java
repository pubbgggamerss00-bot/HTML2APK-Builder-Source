package fb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        PendingIntent pendingIntent = null;
        o oVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                oVar = (o) qa.b.e(parcel, i10, o.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new k(pendingIntent, oVar);
    }

    @Override // android.os.Parcelable.Creator
    public final k[] newArray(int i10) {
        return new k[i10];
    }
}
