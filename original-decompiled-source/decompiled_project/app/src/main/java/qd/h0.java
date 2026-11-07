package qd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class h0 extends qa.a {
    public static final Parcelable.Creator<h0> CREATOR = new u0();

    /* renamed from: a, reason: collision with root package name */
    public String f22678a;

    /* renamed from: b, reason: collision with root package name */
    public String f22679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22681d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f22682e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 2, this.f22678a, false);
        c1.m(parcel, 3, this.f22679b, false);
        boolean z10 = this.f22680c;
        c1.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f22681d;
        c1.s(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
