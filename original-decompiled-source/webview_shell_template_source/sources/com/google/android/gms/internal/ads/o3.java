package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o3 extends z3 {
    public static final Parcelable.Creator<o3> CREATOR = new n3();

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f7582t;

    /* JADX WARN: Illegal instructions before constructor call */
    public o3(Parcel parcel) {
        String string = parcel.readString();
        int i6 = j31.f5914a;
        super(string);
        this.f7582t = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o3.class == obj.getClass()) {
            o3 o3Var = (o3) obj;
            if (this.s.equals(o3Var.s) && Arrays.equals(this.f7582t, o3Var.f7582t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7582t) + ((this.s.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeByteArray(this.f7582t);
    }

    public o3(String str, byte[] bArr) {
        super(str);
        this.f7582t = bArr;
    }
}
