package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class f0 extends c {
    public static final Parcelable.Creator<f0> CREATOR = new t0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22676b;

    public f0(String str, String str2) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22675a = str;
        com.google.android.gms.common.internal.p.d(str2);
        this.f22676b = str2;
    }

    @Override // qd.c
    public final String d() {
        return "twitter.com";
    }

    @Override // qd.c
    public final c e() {
        return new f0(this.f22675a, this.f22676b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22675a, false);
        c1.m(parcel, 2, this.f22676b, false);
        c1.r(iQ, parcel);
    }
}
