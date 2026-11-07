package u3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        Intent intent = null;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                iK2 = f3.b.k(i6, parcel);
            } else if (c7 != 3) {
                f3.b.n(i6, parcel);
            } else {
                intent = (Intent) f3.b.c(parcel, i6, Intent.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new b(iK, iK2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i6) {
        return new b[i6];
    }
}
