package c3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        PendingIntent pendingIntent = null;
        String strD = null;
        Integer numValueOf = null;
        int iK = 0;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                iK2 = f3.b.k(i6, parcel);
            } else if (c7 == 3) {
                pendingIntent = (PendingIntent) f3.b.c(parcel, i6, PendingIntent.CREATOR);
            } else if (c7 == 4) {
                strD = f3.b.d(i6, parcel);
            } else if (c7 != 5) {
                f3.b.n(i6, parcel);
            } else {
                int iM = f3.b.m(i6, parcel);
                if (iM == 0) {
                    numValueOf = null;
                } else {
                    if (iM != 4) {
                        String hexString = Integer.toHexString(iM);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iM).length() + 4 + 1);
                        sb.append("Expected size 4 got ");
                        sb.append(iM);
                        sb.append(" (0x");
                        sb.append(hexString);
                        sb.append(")");
                        throw new b.a(sb.toString(), parcel);
                    }
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
            }
        }
        f3.b.h(iO, parcel);
        return new b(iK, iK2, pendingIntent, strD, numValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new b[i6];
    }
}
