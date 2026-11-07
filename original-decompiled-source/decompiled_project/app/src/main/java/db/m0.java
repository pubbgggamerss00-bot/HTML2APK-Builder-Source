package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m0 extends qa.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7745a;

    public m0(boolean z10) {
        this.f7745a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f7745a == ((m0) obj).f7745a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7745a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7745a ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
