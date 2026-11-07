package qd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        boolean zK = false;
        boolean zK2 = false;
        int iN = 0;
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
                    strF5 = qa.b.f(i10, parcel);
                    break;
                case 7:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case '\b':
                    strF6 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    iN = qa.b.n(i10, parcel);
                    break;
                case '\n':
                    strF7 = qa.b.f(i10, parcel);
                    break;
                case 11:
                    strF8 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new a(strF, strF2, strF3, strF4, zK, strF5, zK2, strF6, iN, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
