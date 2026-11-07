package u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        ArrayList arrayListF = null;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                arrayListF = f3.b.f(i6, parcel);
            } else if (c7 != 2) {
                f3.b.n(i6, parcel);
            } else {
                strD = f3.b.d(i6, parcel);
            }
        }
        f3.b.h(iO, parcel);
        return new g(arrayListF, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i6) {
        return new g[i6];
    }
}
