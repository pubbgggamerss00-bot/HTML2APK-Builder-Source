package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h0 extends qa.a {
    public static final Parcelable.Creator<h0> CREATOR = new n1();

    /* renamed from: a, reason: collision with root package name */
    public final int f7727a;

    /* renamed from: b, reason: collision with root package name */
    public final short f7728b;

    /* renamed from: c, reason: collision with root package name */
    public final short f7729c;

    public h0(int i10, short s10, short s11) {
        this.f7727a = i10;
        this.f7728b = s10;
        this.f7729c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f7727a == h0Var.f7727a && this.f7728b == h0Var.f7728b && this.f7729c == h0Var.f7729c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7727a), Short.valueOf(this.f7728b), Short.valueOf(this.f7729c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7727a);
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(this.f7728b);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f7729c);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
