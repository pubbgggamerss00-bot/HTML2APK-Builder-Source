package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

@Deprecated
/* loaded from: classes2.dex */
public final class d0 extends qa.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f12933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12934b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12935c;

    public d0(String str, String str2, String str3) {
        this.f12935c = str;
        this.f12933a = str2;
        this.f12934b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f12933a, false);
        c1.m(parcel, 2, this.f12934b, false);
        c1.m(parcel, 5, this.f12935c, false);
        c1.r(iQ, parcel);
    }
}
