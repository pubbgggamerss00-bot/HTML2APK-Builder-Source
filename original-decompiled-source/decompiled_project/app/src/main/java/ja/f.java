package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strF2 = "";
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 4) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) qa.b.e(parcel, i10, GoogleSignInAccount.CREATOR);
            } else if (c10 != '\b') {
                qa.b.s(i10, parcel);
            } else {
                strF2 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new SignInAccount(strF, googleSignInAccount, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
