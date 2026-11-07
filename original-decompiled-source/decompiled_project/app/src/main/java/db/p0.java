package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p0 extends qa.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: a, reason: collision with root package name */
    public final String f7749a;

    public p0(String str) {
        com.google.android.gms.common.internal.p.f(str);
        this.f7749a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f7749a.equals(((p0) obj).f7749a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7749a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f7749a, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
