package fa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListG = null;
        ArrayList arrayListG2 = null;
        ArrayList arrayListG3 = null;
        ArrayList arrayListG4 = null;
        ArrayList arrayListG5 = null;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    arrayListG = qa.b.g(i10, parcel);
                    break;
                case 3:
                    arrayListG2 = qa.b.g(i10, parcel);
                    break;
                case 4:
                    arrayListG3 = qa.b.g(i10, parcel);
                    break;
                case 5:
                    arrayListG4 = qa.b.g(i10, parcel);
                    break;
                case 6:
                    arrayListG5 = qa.b.g(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new e(iN, arrayListG, arrayListG2, arrayListG3, arrayListG4, arrayListG5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
