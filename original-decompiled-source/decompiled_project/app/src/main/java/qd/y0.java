package qd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* loaded from: classes2.dex */
public final class y0 implements Parcelable.Creator<w0> {
    @Override // android.os.Parcelable.Creator
    public final w0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        zzait zzaitVar = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
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
                    zzaitVar = (zzait) qa.b.e(parcel, i10, zzait.CREATOR);
                    break;
                case 5:
                    strF4 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    strF5 = qa.b.f(i10, parcel);
                    break;
                case 7:
                    strF6 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new w0(strF, strF2, strF3, zzaitVar, strF4, strF5, strF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w0[] newArray(int i10) {
        return new w0[i10];
    }
}
