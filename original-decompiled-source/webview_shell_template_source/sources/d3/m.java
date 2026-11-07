package d3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        c3.b bVar = null;
        int iK = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                strD = f3.b.d(i6, parcel);
            } else if (c7 == 3) {
                pendingIntent = (PendingIntent) f3.b.c(parcel, i6, PendingIntent.CREATOR);
            } else if (c7 != 4) {
                f3.b.n(i6, parcel);
            } else {
                bVar = (c3.b) f3.b.c(parcel, i6, c3.b.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new Status(iK, strD, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new Status[i6];
    }
}
