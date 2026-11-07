package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    public final int f12926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12927b;

    public b(int i10, int i11) {
        this.f12926a = i10;
        this.f12927b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12926a == bVar.f12926a && this.f12927b == bVar.f12927b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12926a), Integer.valueOf(this.f12927b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(this.f12926a);
        sb.append(", mTransitionType=");
        sb.append(this.f12927b);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.p.f(parcel);
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f12926a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12927b);
        c1.r(iQ, parcel);
    }
}
