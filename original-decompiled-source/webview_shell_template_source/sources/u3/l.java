package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        c3.b bVar = null;
        c0 c0Var = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                bVar = (c3.b) f3.b.c(parcel, i6, c3.b.CREATOR);
            } else if (c7 != 3) {
                f3.b.n(i6, parcel);
            } else {
                c0Var = (c0) f3.b.c(parcel, i6, c0.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new k(iK, bVar, c0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i6) {
        return new k[i6];
    }
}
