package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListG = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
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
                    arrayListG = qa.b.g(i10, parcel);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) qa.b.e(parcel, i10, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new a(strF, strF2, strF3, arrayListG, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
