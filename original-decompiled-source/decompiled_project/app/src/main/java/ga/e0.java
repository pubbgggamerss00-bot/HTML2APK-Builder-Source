package ga;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        db.t tVar = null;
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
                    uri = (Uri) qa.b.e(parcel, i10, Uri.CREATOR);
                    break;
                case 6:
                    strF5 = qa.b.f(i10, parcel);
                    break;
                case 7:
                    strF6 = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    strF7 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    tVar = (db.t) qa.b.e(parcel, i10, db.t.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new l(strF, strF2, strF3, strF4, uri, strF5, strF6, strF7, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
