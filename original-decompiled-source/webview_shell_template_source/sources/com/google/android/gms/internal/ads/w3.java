package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w3 extends z3 {
    public static final Parcelable.Creator<w3> CREATOR = new v3();

    /* renamed from: t, reason: collision with root package name */
    public final String f10024t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10025u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10026v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f10027w;

    public w3(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f10024t = string;
        this.f10025u = parcel.readString();
        this.f10026v = parcel.readString();
        this.f10027w = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w3.class == obj.getClass()) {
            w3 w3Var = (w3) obj;
            if (Objects.equals(this.f10024t, w3Var.f10024t) && Objects.equals(this.f10025u, w3Var.f10025u) && Objects.equals(this.f10026v, w3Var.f10026v) && Arrays.equals(this.f10027w, w3Var.f10027w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10024t;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f10025u;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        String str3 = this.f10026v;
        return Arrays.hashCode(this.f10027w) + (((((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": mimeType=" + this.f10024t + ", filename=" + this.f10025u + ", description=" + this.f10026v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f10024t);
        parcel.writeString(this.f10025u);
        parcel.writeString(this.f10026v);
        parcel.writeByteArray(this.f10027w);
    }

    public w3(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f10024t = str;
        this.f10025u = str2;
        this.f10026v = str3;
        this.f10027w = bArr;
    }
}
