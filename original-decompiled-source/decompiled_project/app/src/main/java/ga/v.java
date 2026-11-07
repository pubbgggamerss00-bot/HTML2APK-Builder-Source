package ga;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        int iN = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 2:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 3:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 4:
                    strF4 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 6:
                    iN = qa.b.n(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new f(strF, strF2, strF3, strF4, zK, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
