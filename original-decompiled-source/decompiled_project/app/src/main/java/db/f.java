package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new q1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7714a;

    public f(boolean z10) {
        this.f7714a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f7714a == ((f) obj).f7714a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7714a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7714a ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
