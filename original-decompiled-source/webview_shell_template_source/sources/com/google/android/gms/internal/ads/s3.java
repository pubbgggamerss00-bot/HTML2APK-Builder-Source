package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s3 extends z3 {
    public static final Parcelable.Creator<s3> CREATOR = new r3();

    /* renamed from: t, reason: collision with root package name */
    public final String f8774t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8775u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8776v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f8777w;

    /* renamed from: x, reason: collision with root package name */
    public final z3[] f8778x;

    public s3(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f8774t = string;
        this.f8775u = parcel.readByte() != 0;
        this.f8776v = parcel.readByte() != 0;
        this.f8777w = parcel.createStringArray();
        int i7 = parcel.readInt();
        this.f8778x = new z3[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            this.f8778x[i8] = (z3) parcel.readParcelable(z3.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3.class == obj.getClass()) {
            s3 s3Var = (s3) obj;
            if (this.f8775u == s3Var.f8775u && this.f8776v == s3Var.f8776v && Objects.equals(this.f8774t, s3Var.f8774t) && Arrays.equals(this.f8777w, s3Var.f8777w) && Arrays.equals(this.f8778x, s3Var.f8778x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8774t;
        return (((((this.f8775u ? 1 : 0) + 527) * 31) + (this.f8776v ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f8774t);
        parcel.writeByte(this.f8775u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8776v ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8777w);
        z3[] z3VarArr = this.f8778x;
        parcel.writeInt(z3VarArr.length);
        for (z3 z3Var : z3VarArr) {
            parcel.writeParcelable(z3Var, 0);
        }
    }

    public s3(String str, boolean z6, boolean z7, String[] strArr, z3[] z3VarArr) {
        super("CTOC");
        this.f8774t = str;
        this.f8775u = z6;
        this.f8776v = z7;
        this.f8777w = strArr;
        this.f8778x = z3VarArr;
    }
}
