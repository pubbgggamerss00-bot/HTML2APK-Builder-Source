package ga;

import android.os.Parcel;
import android.os.Parcelable;
import ga.b;

/* loaded from: classes2.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        int iN = 0;
        boolean zK2 = false;
        b.d dVar = null;
        b.a aVar = null;
        String strF = null;
        b.c cVar = null;
        b.C0104b c0104b = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    dVar = (b.d) qa.b.e(parcel, i10, b.d.CREATOR);
                    break;
                case 2:
                    aVar = (b.a) qa.b.e(parcel, i10, b.a.CREATOR);
                    break;
                case 3:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 4:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 5:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 6:
                    cVar = (b.c) qa.b.e(parcel, i10, b.c.CREATOR);
                    break;
                case 7:
                    c0104b = (b.C0104b) qa.b.e(parcel, i10, b.C0104b.CREATOR);
                    break;
                case '\b':
                    zK2 = qa.b.k(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new b(dVar, aVar, strF, zK, iN, cVar, c0104b, zK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
