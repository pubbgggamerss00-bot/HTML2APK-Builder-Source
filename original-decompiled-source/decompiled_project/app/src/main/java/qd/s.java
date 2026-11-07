package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class s extends c {
    public static final Parcelable.Creator<s> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22695b;

    public s(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f22694a = str;
        this.f22695b = str2;
    }

    @Override // qd.c
    public final String d() {
        return "google.com";
    }

    @Override // qd.c
    public final c e() {
        return new s(this.f22694a, this.f22695b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22694a, false);
        c1.m(parcel, 2, this.f22695b, false);
        c1.r(iQ, parcel);
    }
}
