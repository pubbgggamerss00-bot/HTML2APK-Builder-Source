package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
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
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jP = 0;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 3:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 4:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    strF4 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    uri = (Uri) qa.b.e(parcel, i10, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    jP = qa.b.p(i10, parcel);
                    break;
                case '\t':
                    strF6 = qa.b.f(i10, parcel);
                    break;
                case '\n':
                    arrayListI = qa.b.i(parcel, i10, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = qa.b.f(i10, parcel);
                    break;
                case '\f':
                    strF8 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new GoogleSignInAccount(iN, strF, strF2, strF3, strF4, uri, strF5, jP, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
