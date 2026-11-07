package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import ja.f;
import qa.a;

/* loaded from: classes2.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public final String f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f5891b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f5892c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5891b = googleSignInAccount;
        p.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5890a = str;
        p.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f5892c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 4, this.f5890a, false);
        c1.l(parcel, 7, this.f5891b, i10, false);
        c1.m(parcel, 8, this.f5892c, false);
        c1.r(iQ, parcel);
    }
}
