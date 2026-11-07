package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class e extends c {
    public static final Parcelable.Creator<e> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    public final String f22670a;

    public e(String str) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22670a = str;
    }

    @Override // qd.c
    public final String d() {
        return "facebook.com";
    }

    @Override // qd.c
    public final c e() {
        return new e(this.f22670a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22670a, false);
        c1.r(iQ, parcel);
    }
}
