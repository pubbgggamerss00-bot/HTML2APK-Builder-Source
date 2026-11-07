package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h81 implements zg {
    public static final Parcelable.Creator<h81> CREATOR = new c71();
    public final float s;

    /* renamed from: t, reason: collision with root package name */
    public final float f5292t;

    public h81(float f6, float f7) {
        boolean z6 = false;
        if (f6 >= -90.0f && f6 <= 90.0f && f7 >= -180.0f && f7 <= 180.0f) {
            z6 = true;
        }
        y5.p("Invalid latitude or longitude", z6);
        this.s = f6;
        this.f5292t = f7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h81.class == obj.getClass()) {
            h81 h81Var = (h81) obj;
            if (this.s == h81Var.s && this.f5292t == h81Var.f5292t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.s).hashCode() + 527) * 31) + Float.valueOf(this.f5292t).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.s + ", longitude=" + this.f5292t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.s);
        parcel.writeFloat(this.f5292t);
    }

    public /* synthetic */ h81(Parcel parcel) {
        this.s = parcel.readFloat();
        this.f5292t = parcel.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
