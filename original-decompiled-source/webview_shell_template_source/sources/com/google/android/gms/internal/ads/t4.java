package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t4 implements zg {
    public static final Parcelable.Creator<t4> CREATOR = new s4();
    public final float s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9099t;

    public t4(float f6, int i6) {
        this.s = f6;
        this.f9099t = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t4.class == obj.getClass()) {
            t4 t4Var = (t4) obj;
            if (this.s == t4Var.s && this.f9099t == t4Var.f9099t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.s).hashCode() + 527) * 31) + this.f9099t;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.s + ", svcTemporalLayerCount=" + this.f9099t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.s);
        parcel.writeInt(this.f9099t);
    }

    public /* synthetic */ t4(Parcel parcel) {
        this.s = parcel.readFloat();
        this.f9099t = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
