package rd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        boolean zK = false;
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
                    strF5 = qa.b.f(i10, parcel);
                    break;
                case 4:
                    strF4 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    strF6 = qa.b.f(i10, parcel);
                    break;
                case 7:
                    zK = qa.b.k(i10, parcel);
                    break;
                case '\b':
                    strF7 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new d(strF, strF2, strF3, strF4, strF5, strF6, zK, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
