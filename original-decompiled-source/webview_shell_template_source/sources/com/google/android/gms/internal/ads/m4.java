package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m4 implements zg {
    public static final Parcelable.Creator<m4> CREATOR = new l4();
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6923t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6924u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6925v;

    /* renamed from: w, reason: collision with root package name */
    public final long f6926w;

    public m4(long j6, long j7, long j8, long j9, long j10) {
        this.s = j6;
        this.f6923t = j7;
        this.f6924u = j8;
        this.f6925v = j9;
        this.f6926w = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m4.class == obj.getClass()) {
            m4 m4Var = (m4) obj;
            if (this.s == m4Var.s && this.f6923t == m4Var.f6923t && this.f6924u == m4Var.f6924u && this.f6925v == m4Var.f6925v && this.f6926w == m4Var.f6926w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.s;
        int i6 = ((int) (j6 ^ (j6 >>> 32))) + 527;
        long j7 = this.f6926w;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.f6925v;
        long j10 = j9 ^ (j9 >>> 32);
        long j11 = this.f6924u;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f6923t;
        return (((((((i6 * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) j12)) * 31) + ((int) j10)) * 31) + ((int) j8);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.s + ", photoSize=" + this.f6923t + ", photoPresentationTimestampUs=" + this.f6924u + ", videoStartPosition=" + this.f6925v + ", videoSize=" + this.f6926w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.s);
        parcel.writeLong(this.f6923t);
        parcel.writeLong(this.f6924u);
        parcel.writeLong(this.f6925v);
        parcel.writeLong(this.f6926w);
    }

    public /* synthetic */ m4(Parcel parcel) {
        this.s = parcel.readLong();
        this.f6923t = parcel.readLong();
        this.f6924u = parcel.readLong();
        this.f6925v = parcel.readLong();
        this.f6926w = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
