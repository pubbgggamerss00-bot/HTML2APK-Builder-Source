package fa;

import android.os.Parcel;
import android.os.Parcelable;
import j2.y;
import java.util.HashSet;
import qa.b;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        HashSet hashSet = new HashSet();
        int iN = 0;
        i iVar = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
                hashSet.add(1);
            } else if (c10 == 2) {
                iVar = (i) qa.b.e(parcel, i10, i.CREATOR);
                hashSet.add(2);
            } else if (c10 == 3) {
                strF = qa.b.f(i10, parcel);
                hashSet.add(3);
            } else if (c10 == 4) {
                strF2 = qa.b.f(i10, parcel);
                hashSet.add(4);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                strF3 = qa.b.f(i10, parcel);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iT) {
            return new g(hashSet, iN, iVar, strF, strF2, strF3);
        }
        throw new b.a(y.a(iT, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
