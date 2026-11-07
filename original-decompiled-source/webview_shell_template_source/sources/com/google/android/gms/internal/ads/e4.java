package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e4 extends z3 {
    public static final Parcelable.Creator<e4> CREATOR = new d4();

    /* renamed from: t, reason: collision with root package name */
    public final int f4108t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4109u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4110v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f4111w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4112x;

    public e4(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        super("MLLT");
        this.f4108t = i6;
        this.f4109u = i7;
        this.f4110v = i8;
        this.f4111w = iArr;
        this.f4112x = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.z3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e4.class == obj.getClass()) {
            e4 e4Var = (e4) obj;
            if (this.f4108t == e4Var.f4108t && this.f4109u == e4Var.f4109u && this.f4110v == e4Var.f4110v && Arrays.equals(this.f4111w, e4Var.f4111w) && Arrays.equals(this.f4112x, e4Var.f4112x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4112x) + ((Arrays.hashCode(this.f4111w) + ((((((this.f4108t + 527) * 31) + this.f4109u) * 31) + this.f4110v) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f4108t);
        parcel.writeInt(this.f4109u);
        parcel.writeInt(this.f4110v);
        parcel.writeIntArray(this.f4111w);
        parcel.writeIntArray(this.f4112x);
    }

    public e4(Parcel parcel) {
        super("MLLT");
        this.f4108t = parcel.readInt();
        this.f4109u = parcel.readInt();
        this.f4110v = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i6 = j31.f5914a;
        this.f4111w = iArrCreateIntArray;
        this.f4112x = parcel.createIntArray();
    }
}
