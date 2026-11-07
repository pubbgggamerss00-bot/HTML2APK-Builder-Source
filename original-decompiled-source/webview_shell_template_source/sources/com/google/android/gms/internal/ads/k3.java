package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k3 implements zg {
    public static final Parcelable.Creator<k3> CREATOR = new j3();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6228t;

    /* renamed from: u, reason: collision with root package name */
    public final String f6229u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6230v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6231w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6232x;

    public k3(int i6, int i7, String str, String str2, String str3, boolean z6) {
        boolean z7 = true;
        if (i7 != -1 && i7 <= 0) {
            z7 = false;
        }
        y5.n(z7);
        this.s = i6;
        this.f6228t = str;
        this.f6229u = str2;
        this.f6230v = str3;
        this.f6231w = z6;
        this.f6232x = i7;
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final void d(ae aeVar) {
        String str = this.f6229u;
        if (str != null) {
            aeVar.f2690v = str;
        }
        String str2 = this.f6228t;
        if (str2 != null) {
            aeVar.f2689u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k3.class == obj.getClass()) {
            k3 k3Var = (k3) obj;
            if (this.s == k3Var.s && Objects.equals(this.f6228t, k3Var.f6228t) && Objects.equals(this.f6229u, k3Var.f6229u) && Objects.equals(this.f6230v, k3Var.f6230v) && this.f6231w == k3Var.f6231w && this.f6232x == k3Var.f6232x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6228t;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f6229u;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = ((this.s + 527) * 31) + iHashCode;
        String str3 = this.f6230v;
        return (((((((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6231w ? 1 : 0)) * 31) + this.f6232x;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f6229u + "\", genre=\"" + this.f6228t + "\", bitrate=" + this.s + ", metadataInterval=" + this.f6232x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.s);
        parcel.writeString(this.f6228t);
        parcel.writeString(this.f6229u);
        parcel.writeString(this.f6230v);
        int i7 = j31.f5914a;
        parcel.writeInt(this.f6231w ? 1 : 0);
        parcel.writeInt(this.f6232x);
    }

    public k3(Parcel parcel) {
        this.s = parcel.readInt();
        this.f6228t = parcel.readString();
        this.f6229u = parcel.readString();
        this.f6230v = parcel.readString();
        int i6 = j31.f5914a;
        this.f6231w = parcel.readInt() != 0;
        this.f6232x = parcel.readInt();
    }
}
