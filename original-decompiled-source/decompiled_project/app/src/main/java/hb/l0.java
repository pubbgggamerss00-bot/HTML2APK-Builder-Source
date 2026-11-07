package hb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l0 implements Parcelable.Creator<k0> {
    @Override // android.os.Parcelable.Creator
    public final k0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "";
        ArrayList arrayListG = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListG = qa.b.g(i10, parcel);
            } else if (c10 == 2) {
                pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new k0(arrayListG, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k0[] newArray(int i10) {
        return new k0[i10];
    }
}
