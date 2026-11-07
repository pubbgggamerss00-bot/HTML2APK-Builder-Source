package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        a0 a0Var = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 != 2) {
                f3.b.n(i6, parcel);
            } else {
                a0Var = (a0) f3.b.c(parcel, i6, a0.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new i(iK, a0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i6) {
        return new i[i6];
    }
}
