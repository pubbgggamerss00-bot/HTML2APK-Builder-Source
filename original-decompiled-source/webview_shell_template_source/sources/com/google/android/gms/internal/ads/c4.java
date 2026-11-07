package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c4 extends z3 {
    public static final Parcelable.Creator<c4> CREATOR = new b4();

    /* renamed from: t, reason: collision with root package name */
    public final String f3392t;

    /* renamed from: u, reason: collision with root package name */
    public final String f3393u;

    /* renamed from: v, reason: collision with root package name */
    public final String f3394v;

    public c4(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f3392t = string;
        this.f3393u = parcel.readString();
        this.f3394v = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (Objects.equals(this.f3393u, c4Var.f3393u) && Objects.equals(this.f3392t, c4Var.f3392t) && Objects.equals(this.f3394v, c4Var.f3394v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3392t;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f3393u;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        String str3 = this.f3394v;
        return (((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": domain=" + this.f3392t + ", description=" + this.f3393u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f3392t);
        parcel.writeString(this.f3394v);
    }

    public c4(String str, String str2, String str3) {
        super("----");
        this.f3392t = str;
        this.f3393u = str2;
        this.f3394v = str3;
    }
}
