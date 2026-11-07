package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q3 extends z3 {
    public static final Parcelable.Creator<q3> CREATOR = new p3();

    /* renamed from: t, reason: collision with root package name */
    public final String f8221t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8222u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8223v;

    /* renamed from: w, reason: collision with root package name */
    public final long f8224w;

    /* renamed from: x, reason: collision with root package name */
    public final long f8225x;

    /* renamed from: y, reason: collision with root package name */
    public final z3[] f8226y;

    public q3(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f8221t = string;
        this.f8222u = parcel.readInt();
        this.f8223v = parcel.readInt();
        this.f8224w = parcel.readLong();
        this.f8225x = parcel.readLong();
        int i7 = parcel.readInt();
        this.f8226y = new z3[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            this.f8226y[i8] = (z3) parcel.readParcelable(z3.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.z3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q3.class == obj.getClass()) {
            q3 q3Var = (q3) obj;
            if (this.f8222u == q3Var.f8222u && this.f8223v == q3Var.f8223v && this.f8224w == q3Var.f8224w && this.f8225x == q3Var.f8225x && Objects.equals(this.f8221t, q3Var.f8221t) && Arrays.equals(this.f8226y, q3Var.f8226y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8221t;
        return ((((((((this.f8222u + 527) * 31) + this.f8223v) * 31) + ((int) this.f8224w)) * 31) + ((int) this.f8225x)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f8221t);
        parcel.writeInt(this.f8222u);
        parcel.writeInt(this.f8223v);
        parcel.writeLong(this.f8224w);
        parcel.writeLong(this.f8225x);
        z3[] z3VarArr = this.f8226y;
        parcel.writeInt(z3VarArr.length);
        for (z3 z3Var : z3VarArr) {
            parcel.writeParcelable(z3Var, 0);
        }
    }

    public q3(String str, int i6, int i7, long j6, long j7, z3[] z3VarArr) {
        super("CHAP");
        this.f8221t = str;
        this.f8222u = i6;
        this.f8223v = i7;
        this.f8224w = j6;
        this.f8225x = j7;
        this.f8226y = z3VarArr;
    }
}
