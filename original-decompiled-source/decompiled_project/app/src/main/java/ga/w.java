package ga;

import android.os.Parcel;
import android.os.Parcelable;
import ga.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListG = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 2:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 3:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 4:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 5:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    arrayListG = qa.b.g(i10, parcel);
                    break;
                case 7:
                    zK3 = qa.b.k(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new b.a(zK, strF, strF2, zK2, strF3, arrayListG, zK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.a[i10];
    }
}
