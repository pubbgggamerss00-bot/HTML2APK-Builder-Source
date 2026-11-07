package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e1 extends qa.a {
    public static final Parcelable.Creator<e1> CREATOR = new f1();

    /* renamed from: a, reason: collision with root package name */
    public final String f7712a;

    public e1(String str) {
        this.f7712a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e1) {
            return com.google.android.gms.common.internal.o.a(this.f7712a, ((e1) obj).f7712a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7712a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f7712a, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
