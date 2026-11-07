package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s extends qa.a {
    public static final Parcelable.Creator<s> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7771a;

    public s(boolean z10) {
        this.f7771a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && this.f7771a == ((s) obj).f7771a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7771a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7771a ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
