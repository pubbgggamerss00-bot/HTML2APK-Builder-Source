package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n0 extends qa.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final int f12962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12965d;

    public n0(int i10, int i11, int i12, int i13) {
        com.google.android.gms.common.internal.p.h("Start hour must be in range [0, 23].", i10 >= 0 && i10 <= 23);
        com.google.android.gms.common.internal.p.h("Start minute must be in range [0, 59].", i11 >= 0 && i11 <= 59);
        com.google.android.gms.common.internal.p.h("End hour must be in range [0, 23].", i12 >= 0 && i12 <= 23);
        com.google.android.gms.common.internal.p.h("End minute must be in range [0, 59].", i13 >= 0 && i13 <= 59);
        com.google.android.gms.common.internal.p.h("Parameters can't be all 0.", ((i10 + i11) + i12) + i13 > 0);
        this.f12962a = i10;
        this.f12963b = i11;
        this.f12964c = i12;
        this.f12965d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f12962a == n0Var.f12962a && this.f12963b == n0Var.f12963b && this.f12964c == n0Var.f12964c && this.f12965d == n0Var.f12965d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12962a), Integer.valueOf(this.f12963b), Integer.valueOf(this.f12964c), Integer.valueOf(this.f12965d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(this.f12962a);
        sb.append(", startMinute=");
        sb.append(this.f12963b);
        sb.append(", endHour=");
        sb.append(this.f12964c);
        sb.append(", endMinute=");
        sb.append(this.f12965d);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.p.f(parcel);
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f12962a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12963b);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f12964c);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f12965d);
        c1.r(iQ, parcel);
    }
}
