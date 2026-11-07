package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12951a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12952b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12953c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12954d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12955e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12956f;

    public k(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f12951a = z10;
        this.f12952b = z11;
        this.f12953c = z12;
        this.f12954d = z13;
        this.f12955e = z14;
        this.f12956f = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f12951a ? 1 : 0);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12952b ? 1 : 0);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f12953c ? 1 : 0);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f12954d ? 1 : 0);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f12955e ? 1 : 0);
        c1.s(parcel, 6, 4);
        parcel.writeInt(this.f12956f ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
