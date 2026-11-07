package fa;

import android.os.Parcel;
import android.os.Parcelable;
import j2.y;
import java.util.ArrayList;
import java.util.HashSet;
import qa.b;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        HashSet hashSet = new HashSet();
        int iN = 0;
        ArrayList arrayListI = null;
        e eVar = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
                hashSet.add(1);
            } else if (c10 == 2) {
                arrayListI = qa.b.i(parcel, i10, g.CREATOR);
                hashSet.add(2);
            } else if (c10 == 3) {
                iN2 = qa.b.n(i10, parcel);
                hashSet.add(3);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                eVar = (e) qa.b.e(parcel, i10, e.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iT) {
            return new b(hashSet, iN, arrayListI, iN2, eVar);
        }
        throw new b.a(y.a(iT, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
