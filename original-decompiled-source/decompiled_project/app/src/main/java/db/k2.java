package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k2 extends qa.a {
    public static final Parcelable.Creator<k2> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7738a;

    public k2(boolean z10) {
        this.f7738a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k2) && this.f7738a == ((k2) obj).f7738a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7738a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7738a ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
