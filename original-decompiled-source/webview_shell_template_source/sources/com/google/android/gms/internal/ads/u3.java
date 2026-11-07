package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u3 extends z3 {
    public static final Parcelable.Creator<u3> CREATOR = new t3();

    /* renamed from: t, reason: collision with root package name */
    public final String f9436t;

    /* renamed from: u, reason: collision with root package name */
    public final String f9437u;

    /* renamed from: v, reason: collision with root package name */
    public final String f9438v;

    public u3(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f9436t = string;
        this.f9437u = parcel.readString();
        this.f9438v = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u3.class == obj.getClass()) {
            u3 u3Var = (u3) obj;
            if (Objects.equals(this.f9437u, u3Var.f9437u) && Objects.equals(this.f9436t, u3Var.f9436t) && Objects.equals(this.f9438v, u3Var.f9438v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9436t;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f9437u;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        String str3 = this.f9438v;
        return (((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": language=" + this.f9436t + ", description=" + this.f9437u + ", text=" + this.f9438v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f9436t);
        parcel.writeString(this.f9438v);
    }

    public u3(String str, String str2, String str3) {
        super("COMM");
        this.f9436t = str;
        this.f9437u = str2;
        this.f9438v = str3;
    }
}
