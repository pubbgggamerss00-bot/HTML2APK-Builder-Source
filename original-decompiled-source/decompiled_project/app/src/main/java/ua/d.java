package ua;

import android.os.Parcel;
import android.os.Parcelable;
import ua.a;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        ta.b bVar = null;
        int iN = 0;
        int iN2 = 0;
        boolean zK = false;
        int iN3 = 0;
        boolean zK2 = false;
        int iN4 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    iN2 = qa.b.n(i10, parcel);
                    break;
                case 3:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 4:
                    iN3 = qa.b.n(i10, parcel);
                    break;
                case 5:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 6:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 7:
                    iN4 = qa.b.n(i10, parcel);
                    break;
                case '\b':
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    bVar = (ta.b) qa.b.e(parcel, i10, ta.b.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new a.C0303a(iN, iN2, zK, iN3, zK2, strF, iN4, strF2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.C0303a[i10];
    }
}
