package ja;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        ArrayList arrayListI2 = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int iN = 0;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    arrayListI2 = qa.b.i(parcel, i10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) qa.b.e(parcel, i10, Account.CREATOR);
                    break;
                case 4:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 5:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 6:
                    zK3 = qa.b.k(i10, parcel);
                    break;
                case 7:
                    strF = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    arrayListI = qa.b.i(parcel, i10, ka.a.CREATOR);
                    break;
                case '\n':
                    strF3 = qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new GoogleSignInOptions(iN, arrayListI2, account, zK, zK2, zK3, strF, strF2, GoogleSignInOptions.e(arrayListI), strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
