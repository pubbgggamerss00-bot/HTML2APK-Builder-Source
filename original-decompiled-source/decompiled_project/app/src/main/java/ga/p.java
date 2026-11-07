package ga;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        String strF = null;
        Account account = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    arrayListI = qa.b.i(parcel, i10, Scope.CREATOR);
                    break;
                case 2:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 3:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 4:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 5:
                    account = (Account) qa.b.e(parcel, i10, Account.CREATOR);
                    break;
                case 6:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 7:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    zK3 = qa.b.k(i10, parcel);
                    break;
                case '\t':
                    bundleB = qa.b.b(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new AuthorizationRequest(arrayListI, strF, zK, zK2, account, strF2, strF3, zK3, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
