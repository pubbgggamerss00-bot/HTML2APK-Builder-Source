package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p4 implements Parcelable {
    public static final Parcelable.Creator<p4> CREATOR = new o4();
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7931t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7932u;

    public p4(int i6, long j6, long j7) {
        y5.n(j6 < j7);
        this.s = j6;
        this.f7931t = j7;
        this.f7932u = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4.class == obj.getClass()) {
            p4 p4Var = (p4) obj;
            if (this.s == p4Var.s && this.f7931t == p4Var.f7931t && this.f7932u == p4Var.f7932u) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.s), Long.valueOf(this.f7931t), Integer.valueOf(this.f7932u)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.s + ", endTimeMs=" + this.f7931t + ", speedDivisor=" + this.f7932u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.s);
        parcel.writeLong(this.f7931t);
        parcel.writeInt(this.f7932u);
    }
}
