package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yi1 extends f3.a {
    public static final Parcelable.Creator<yi1> CREATOR = new aj1();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10997t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10998u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10999v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11000w;

    public yi1(int i6, int i7, int i8, String str, String str2) {
        this.s = i6;
        this.f10997t = i7;
        this.f10998u = str;
        this.f10999v = str2;
        this.f11000w = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f10997t);
        e5.i.m(parcel, 3, this.f10998u);
        e5.i.m(parcel, 4, this.f10999v);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f11000w);
        e5.i.t(iS, parcel);
    }
}
