package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r91 implements zg {
    public static final Parcelable.Creator<r91> CREATOR = new w81();
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8591t;

    /* renamed from: u, reason: collision with root package name */
    public final long f8592u;

    public r91(long j6, long j7, long j8) {
        this.s = j6;
        this.f8591t = j7;
        this.f8592u = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r91)) {
            return false;
        }
        r91 r91Var = (r91) obj;
        return this.s == r91Var.s && this.f8591t == r91Var.f8591t && this.f8592u == r91Var.f8592u;
    }

    public final int hashCode() {
        long j6 = this.s;
        int i6 = ((int) (j6 ^ (j6 >>> 32))) + 527;
        long j7 = this.f8592u;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.f8591t;
        return (((i6 * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31) + ((int) j8);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.s + ", modification time=" + this.f8591t + ", timescale=" + this.f8592u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.s);
        parcel.writeLong(this.f8591t);
        parcel.writeLong(this.f8592u);
    }

    public /* synthetic */ r91(Parcel parcel) {
        this.s = parcel.readLong();
        this.f8591t = parcel.readLong();
        this.f8592u = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
