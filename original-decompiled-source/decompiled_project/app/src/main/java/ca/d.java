package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        long jP = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    jP = qa.b.p(i10, parcel);
                    break;
                case 3:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 4:
                    iN2 = qa.b.n(i10, parcel);
                    break;
                case 5:
                    iN3 = qa.b.n(i10, parcel);
                    break;
                case 6:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new a(iN, jP, strF, iN2, iN3, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
