package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes2.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Account account = null;
        int iN = 0;
        int iN2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                account = (Account) qa.b.e(parcel, i10, Account.CREATOR);
            } else if (c10 == 3) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) qa.b.e(parcel, i10, GoogleSignInAccount.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new h0(iN, account, iN2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
