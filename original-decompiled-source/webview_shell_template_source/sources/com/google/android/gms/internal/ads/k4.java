package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k4 extends z3 {
    public static final Parcelable.Creator<k4> CREATOR = new j4();

    /* renamed from: t, reason: collision with root package name */
    public final String f6235t;

    /* renamed from: u, reason: collision with root package name */
    public final String f6236u;

    /* JADX WARN: Illegal instructions before constructor call */
    public k4(Parcel parcel) {
        String string = parcel.readString();
        int i6 = j31.f5914a;
        super(string);
        this.f6235t = parcel.readString();
        this.f6236u = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k4.class == obj.getClass()) {
            k4 k4Var = (k4) obj;
            if (this.s.equals(k4Var.s) && Objects.equals(this.f6235t, k4Var.f6235t) && Objects.equals(this.f6236u, k4Var.f6236u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.s.hashCode() + 527;
        String str = this.f6235t;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i6 = iHashCode * 31;
        String str2 = this.f6236u;
        return ((i6 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": url=" + this.f6236u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f6235t);
        parcel.writeString(this.f6236u);
    }

    public k4(String str, String str2, String str3) {
        super(str);
        this.f6235t = str2;
        this.f6236u = str3;
    }
}
