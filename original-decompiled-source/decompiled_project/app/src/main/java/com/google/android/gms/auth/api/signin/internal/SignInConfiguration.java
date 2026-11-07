package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import ka.t;
import qa.a;

/* loaded from: classes2.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f5893a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f5894b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        p.d(str);
        this.f5893a = str;
        this.f5894b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f5894b;
        if (this.f5893a.equals(signInConfiguration.f5893a)) {
            GoogleSignInOptions googleSignInOptions2 = this.f5894b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.f5893a;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f5894b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 2, this.f5893a, false);
        c1.l(parcel, 5, this.f5894b, i10, false);
        c1.r(iQ, parcel);
    }
}
