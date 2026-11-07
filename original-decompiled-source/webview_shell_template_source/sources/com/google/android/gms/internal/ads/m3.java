package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m3 extends z3 {
    public static final Parcelable.Creator<m3> CREATOR = new l3();

    /* renamed from: t, reason: collision with root package name */
    public final String f6913t;

    /* renamed from: u, reason: collision with root package name */
    public final String f6914u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6915v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f6916w;

    public m3(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f6913t = string;
        this.f6914u = parcel.readString();
        this.f6915v = parcel.readInt();
        this.f6916w = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.z3, com.google.android.gms.internal.ads.zg
    public final void d(ae aeVar) {
        aeVar.a(this.f6915v, this.f6916w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m3.class == obj.getClass()) {
            m3 m3Var = (m3) obj;
            if (this.f6915v == m3Var.f6915v && Objects.equals(this.f6913t, m3Var.f6913t) && Objects.equals(this.f6914u, m3Var.f6914u) && Arrays.equals(this.f6916w, m3Var.f6916w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6913t;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f6914u;
        return Arrays.hashCode(this.f6916w) + ((((((this.f6915v + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": mimeType=" + this.f6913t + ", description=" + this.f6914u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f6913t);
        parcel.writeString(this.f6914u);
        parcel.writeInt(this.f6915v);
        parcel.writeByteArray(this.f6916w);
    }

    public m3(String str, String str2, int i6, byte[] bArr) {
        super("APIC");
        this.f6913t = str;
        this.f6914u = str2;
        this.f6915v = i6;
        this.f6916w = bArr;
    }
}
