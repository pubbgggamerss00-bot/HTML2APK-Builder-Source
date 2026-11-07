package fa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j2.y;
import java.util.HashSet;
import qa.b;

/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        HashSet hashSet = new HashSet();
        int iN = 0;
        String strF = null;
        byte[] bArrC = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    hashSet.add(1);
                    break;
                case 2:
                    strF = qa.b.f(i10, parcel);
                    hashSet.add(2);
                    break;
                case 3:
                    iN2 = qa.b.n(i10, parcel);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrC = qa.b.c(i10, parcel);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    aVar = (a) qa.b.e(parcel, i10, a.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        if (parcel.dataPosition() == iT) {
            return new i(hashSet, iN, strF, iN2, bArrC, pendingIntent, aVar);
        }
        throw new b.a(y.a(iT, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
