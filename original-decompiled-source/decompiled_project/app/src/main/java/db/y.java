package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class y extends qa.a {
    public static final Parcelable.Creator<y> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    public final String f7822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7823b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7824c;

    public y(String str, String str2, String str3) {
        com.google.android.gms.common.internal.p.f(str);
        this.f7822a = str;
        com.google.android.gms.common.internal.p.f(str2);
        this.f7823b = str2;
        this.f7824c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return com.google.android.gms.common.internal.o.a(this.f7822a, yVar.f7822a) && com.google.android.gms.common.internal.o.a(this.f7823b, yVar.f7823b) && com.google.android.gms.common.internal.o.a(this.f7824c, yVar.f7824c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7822a, this.f7823b, this.f7824c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.f7822a);
        sb.append("', \n name='");
        sb.append(this.f7823b);
        sb.append("', \n icon='");
        return b.o.a(sb, this.f7824c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 2, this.f7822a, false);
        androidx.lifecycle.c1.m(parcel, 3, this.f7823b, false);
        androidx.lifecycle.c1.m(parcel, 4, this.f7824c, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
