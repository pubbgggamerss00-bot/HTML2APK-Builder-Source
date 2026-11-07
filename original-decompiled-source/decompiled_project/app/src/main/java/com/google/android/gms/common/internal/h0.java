package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes2.dex */
public final class h0 extends qa.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    public final int f6146a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f6147b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6148c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f6149d;

    public h0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f6146a = i10;
        this.f6147b = account;
        this.f6148c = i11;
        this.f6149d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6146a);
        androidx.lifecycle.c1.l(parcel, 2, this.f6147b, i10, false);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f6148c);
        androidx.lifecycle.c1.l(parcel, 4, this.f6149d, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
