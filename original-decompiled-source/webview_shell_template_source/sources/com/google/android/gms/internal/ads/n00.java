package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n00 extends f3.a {
    public static final Parcelable.Creator<n00> CREATOR = new o00();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7274t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7275u;

    public n00(int i6, int i7, int i8) {
        this.s = i6;
        this.f7274t = i7;
        this.f7275u = i8;
    }

    public static n00 l(VersionInfo versionInfo) {
        return new n00(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n00)) {
            n00 n00Var = (n00) obj;
            if (n00Var.f7275u == this.f7275u && n00Var.f7274t == this.f7274t && n00Var.s == this.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.s, this.f7274t, this.f7275u});
    }

    public final String toString() {
        return this.s + "." + this.f7274t + "." + this.f7275u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f7274t);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f7275u);
        e5.i.t(iS, parcel);
    }
}
