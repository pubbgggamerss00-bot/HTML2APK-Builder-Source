package ta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f28623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28625c;

    public d(int i10, String str, int i11) {
        this.f28623a = i10;
        this.f28624b = str;
        this.f28625c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f28623a);
        c1.m(parcel, 2, this.f28624b, false);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f28625c);
        c1.r(iQ, parcel);
    }

    public d(String str, int i10) {
        this.f28623a = 1;
        this.f28624b = str;
        this.f28625c = i10;
    }
}
