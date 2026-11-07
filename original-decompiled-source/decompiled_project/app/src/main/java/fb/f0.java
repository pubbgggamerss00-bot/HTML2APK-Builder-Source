package fb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
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
        return new e0(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final e0[] newArray(int i10) {
        return new e0[i10];
    }
}
