package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class r extends c {
    public static final Parcelable.Creator<r> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22693a;

    public r(String str) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22693a = str;
    }

    @Override // qd.c
    public final String d() {
        return "github.com";
    }

    @Override // qd.c
    public final c e() {
        return new r(this.f22693a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22693a, false);
        c1.r(iQ, parcel);
    }
}
