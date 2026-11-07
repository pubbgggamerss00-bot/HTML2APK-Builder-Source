package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k0 extends qa.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final long f7737a;

    public k0(long j10) {
        this.f7737a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k0) && this.f7737a == ((k0) obj).f7737a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7737a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 8);
        parcel.writeLong(this.f7737a);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
