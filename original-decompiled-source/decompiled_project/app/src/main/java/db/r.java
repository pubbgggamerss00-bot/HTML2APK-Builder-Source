package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r extends qa.a {
    public static final Parcelable.Creator<r> CREATOR = new j2();

    /* renamed from: a, reason: collision with root package name */
    public final String f7764a;

    public r(String str) {
        com.google.android.gms.common.internal.p.f(str);
        this.f7764a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f7764a.equals(((r) obj).f7764a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7764a});
    }

    public final String toString() {
        return b.o.a(new StringBuilder("FidoAppIdExtension{appid='"), this.f7764a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 2, this.f7764a, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
