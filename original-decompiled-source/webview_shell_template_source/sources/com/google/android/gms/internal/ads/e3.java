package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e3 implements zg {
    public static final Parcelable.Creator<e3> CREATOR;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4086t;

    /* renamed from: u, reason: collision with root package name */
    public final long f4087u;

    /* renamed from: v, reason: collision with root package name */
    public final long f4088v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f4089w;

    /* renamed from: x, reason: collision with root package name */
    public int f4090x;

    static {
        tk2 tk2Var = new tk2();
        tk2Var.c("application/id3");
        new w(tk2Var);
        tk2 tk2Var2 = new tk2();
        tk2Var2.c("application/x-scte35");
        new w(tk2Var2);
        CREATOR = new d3();
    }

    public e3(Parcel parcel) {
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.s = string;
        this.f4086t = parcel.readString();
        this.f4087u = parcel.readLong();
        this.f4088v = parcel.readLong();
        this.f4089w = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e3.class == obj.getClass()) {
            e3 e3Var = (e3) obj;
            if (this.f4087u == e3Var.f4087u && this.f4088v == e3Var.f4088v && Objects.equals(this.s, e3Var.s) && Objects.equals(this.f4086t, e3Var.f4086t) && Arrays.equals(this.f4089w, e3Var.f4089w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f4090x;
        if (i6 != 0) {
            return i6;
        }
        String str = this.s;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f4086t;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j6 = this.f4088v;
        long j7 = this.f4087u;
        int iHashCode3 = Arrays.hashCode(this.f4089w) + ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31);
        this.f4090x = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.s + ", id=" + this.f4088v + ", durationMs=" + this.f4087u + ", value=" + this.f4086t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f4086t);
        parcel.writeLong(this.f4087u);
        parcel.writeLong(this.f4088v);
        parcel.writeByteArray(this.f4089w);
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
