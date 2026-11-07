package rd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b1 implements qa.c {
    public static final Parcelable.Creator<b1> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    public final String f23346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23348c;

    public b1(boolean z10) {
        this.f23348c = z10;
        this.f23347b = null;
        this.f23346a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f23346a, false);
        androidx.lifecycle.c1.m(parcel, 2, this.f23347b, false);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f23348c ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }

    public b1(String str, String str2, boolean z10) {
        com.google.android.gms.common.internal.p.d(str);
        com.google.android.gms.common.internal.p.d(str2);
        this.f23346a = str;
        this.f23347b = str2;
        z.d(str2);
        this.f23348c = z10;
    }
}
