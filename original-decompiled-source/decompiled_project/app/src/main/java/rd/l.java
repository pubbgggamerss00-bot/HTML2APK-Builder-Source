package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l extends qd.v {
    public static final Parcelable.Creator<l> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public String f23397a;

    /* renamed from: b, reason: collision with root package name */
    public String f23398b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23399c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f23400d;

    /* renamed from: e, reason: collision with root package name */
    public g f23401e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f23397a, false);
        androidx.lifecycle.c1.m(parcel, 2, this.f23398b, false);
        androidx.lifecycle.c1.p(parcel, 3, this.f23399c, false);
        androidx.lifecycle.c1.p(parcel, 4, this.f23400d, false);
        androidx.lifecycle.c1.l(parcel, 5, this.f23401e, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
