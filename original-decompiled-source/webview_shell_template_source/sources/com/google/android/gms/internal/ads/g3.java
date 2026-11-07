package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g3 implements zg {
    public static final Parcelable.Creator<g3> CREATOR = new f3();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4879t;

    /* renamed from: u, reason: collision with root package name */
    public final String f4880u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4881v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4882w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4883x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4884y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f4885z;

    public g3(int i6, String str, String str2, int i7, int i8, int i9, int i10, byte[] bArr) {
        this.s = i6;
        this.f4879t = str;
        this.f4880u = str2;
        this.f4881v = i7;
        this.f4882w = i8;
        this.f4883x = i9;
        this.f4884y = i10;
        this.f4885z = bArr;
    }

    public static g3 l(ex0 ex0Var) {
        int iQ = ex0Var.q();
        String strE = bk.e(ex0Var.b(ex0Var.q(), StandardCharsets.US_ASCII));
        String strB = ex0Var.b(ex0Var.q(), StandardCharsets.UTF_8);
        int iQ2 = ex0Var.q();
        int iQ3 = ex0Var.q();
        int iQ4 = ex0Var.q();
        int iQ5 = ex0Var.q();
        int iQ6 = ex0Var.q();
        byte[] bArr = new byte[iQ6];
        ex0Var.f(0, iQ6, bArr);
        return new g3(iQ, strE, strB, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final void d(ae aeVar) {
        aeVar.a(this.s, this.f4885z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g3.class == obj.getClass()) {
            g3 g3Var = (g3) obj;
            if (this.s == g3Var.s && this.f4879t.equals(g3Var.f4879t) && this.f4880u.equals(g3Var.f4880u) && this.f4881v == g3Var.f4881v && this.f4882w == g3Var.f4882w && this.f4883x == g3Var.f4883x && this.f4884y == g3Var.f4884y && Arrays.equals(this.f4885z, g3Var.f4885z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4885z) + ((((((((((this.f4880u.hashCode() + ((this.f4879t.hashCode() + ((this.s + 527) * 31)) * 31)) * 31) + this.f4881v) * 31) + this.f4882w) * 31) + this.f4883x) * 31) + this.f4884y) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f4879t + ", description=" + this.f4880u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.s);
        parcel.writeString(this.f4879t);
        parcel.writeString(this.f4880u);
        parcel.writeInt(this.f4881v);
        parcel.writeInt(this.f4882w);
        parcel.writeInt(this.f4883x);
        parcel.writeInt(this.f4884y);
        parcel.writeByteArray(this.f4885z);
    }

    public g3(Parcel parcel) {
        this.s = parcel.readInt();
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f4879t = string;
        this.f4880u = parcel.readString();
        this.f4881v = parcel.readInt();
        this.f4882w = parcel.readInt();
        this.f4883x = parcel.readInt();
        this.f4884y = parcel.readInt();
        this.f4885z = parcel.createByteArray();
    }
}
