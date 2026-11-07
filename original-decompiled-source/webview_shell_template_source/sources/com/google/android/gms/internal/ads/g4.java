package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g4 extends z3 {
    public static final Parcelable.Creator<g4> CREATOR = new f4();

    /* renamed from: t, reason: collision with root package name */
    public final String f4893t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f4894u;

    public g4(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f4893t = string;
        this.f4894u = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g4.class == obj.getClass()) {
            g4 g4Var = (g4) obj;
            if (Objects.equals(this.f4893t, g4Var.f4893t) && Arrays.equals(this.f4894u, g4Var.f4894u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4893t;
        return Arrays.hashCode(this.f4894u) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": owner=" + this.f4893t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4893t);
        parcel.writeByteArray(this.f4894u);
    }

    public g4(String str, byte[] bArr) {
        super("PRIV");
        this.f4893t = str;
        this.f4894u = bArr;
    }
}
