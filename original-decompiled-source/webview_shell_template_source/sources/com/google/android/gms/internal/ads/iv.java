package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iv extends f3.a {
    public static final Parcelable.Creator<iv> CREATOR = new jv();
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5855t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5856u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f5857v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f5858w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f5859x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5860y;

    /* renamed from: z, reason: collision with root package name */
    public final long f5861z;

    public iv(boolean z6, String str, int i6, byte[] bArr, String[] strArr, String[] strArr2, boolean z7, long j6) {
        this.s = z6;
        this.f5855t = str;
        this.f5856u = i6;
        this.f5857v = bArr;
        this.f5858w = strArr;
        this.f5859x = strArr2;
        this.f5860y = z7;
        this.f5861z = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s ? 1 : 0);
        e5.i.m(parcel, 2, this.f5855t);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f5856u);
        e5.i.j(parcel, 4, this.f5857v);
        e5.i.n(parcel, 5, this.f5858w);
        e5.i.n(parcel, 6, this.f5859x);
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(this.f5860y ? 1 : 0);
        e5.i.r(parcel, 8, 8);
        parcel.writeLong(this.f5861z);
        e5.i.t(iS, parcel);
    }
}
