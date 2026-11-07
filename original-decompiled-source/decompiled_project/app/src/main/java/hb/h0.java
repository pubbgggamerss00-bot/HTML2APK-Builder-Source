package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h0 implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        boolean zK4 = false;
        boolean zK5 = false;
        boolean zK6 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 2:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 3:
                    zK3 = qa.b.k(i10, parcel);
                    break;
                case 4:
                    zK4 = qa.b.k(i10, parcel);
                    break;
                case 5:
                    zK5 = qa.b.k(i10, parcel);
                    break;
                case 6:
                    zK6 = qa.b.k(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new k(zK, zK2, zK3, zK4, zK5, zK6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
