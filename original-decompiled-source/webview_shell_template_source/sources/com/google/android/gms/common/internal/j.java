package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends f3.a {
    public static final Parcelable.Creator<j> CREATOR = new z();
    public final int A;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2452t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2453u;

    /* renamed from: v, reason: collision with root package name */
    public final long f2454v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2455w;

    /* renamed from: x, reason: collision with root package name */
    public final String f2456x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2457y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2458z;

    public j(int i6, int i7, int i8, long j6, long j7, String str, String str2, int i9, int i10) {
        this.s = i6;
        this.f2452t = i7;
        this.f2453u = i8;
        this.f2454v = j6;
        this.f2455w = j7;
        this.f2456x = str;
        this.f2457y = str2;
        this.f2458z = i9;
        this.A = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f2452t);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f2453u);
        e5.i.r(parcel, 4, 8);
        parcel.writeLong(this.f2454v);
        e5.i.r(parcel, 5, 8);
        parcel.writeLong(this.f2455w);
        e5.i.m(parcel, 6, this.f2456x);
        e5.i.m(parcel, 7, this.f2457y);
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(this.f2458z);
        e5.i.r(parcel, 9, 4);
        parcel.writeInt(this.A);
        e5.i.t(iS, parcel);
    }
}
