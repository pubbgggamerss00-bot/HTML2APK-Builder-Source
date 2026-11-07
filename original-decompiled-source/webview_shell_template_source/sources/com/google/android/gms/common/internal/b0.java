package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final a0 createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        int iK = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 == 2) {
                account = (Account) f3.b.c(parcel, i6, Account.CREATOR);
            } else if (c7 == 3) {
                iK2 = f3.b.k(i6, parcel);
            } else if (c7 != 4) {
                f3.b.n(i6, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) f3.b.c(parcel, i6, GoogleSignInAccount.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        return new a0(iK, account, iK2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a0[] newArray(int i6) {
        return new a0[i6];
    }
}
