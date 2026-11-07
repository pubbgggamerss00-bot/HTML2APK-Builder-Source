package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p50 extends f3.a {
    public static final Parcelable.Creator<p50> CREATOR = new q50();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7940t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7941u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7942v;

    /* renamed from: w, reason: collision with root package name */
    public final List f7943w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7944x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7945y;

    /* renamed from: z, reason: collision with root package name */
    public final List f7946z;

    public p50(String str, String str2, boolean z6, boolean z7, List list, boolean z8, boolean z9, List list2) {
        this.s = str;
        this.f7940t = str2;
        this.f7941u = z6;
        this.f7942v = z7;
        this.f7943w = list;
        this.f7944x = z8;
        this.f7945y = z9;
        this.f7946z = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 2, this.s);
        e5.i.m(parcel, 3, this.f7940t);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f7941u ? 1 : 0);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f7942v ? 1 : 0);
        e5.i.o(parcel, 6, this.f7943w);
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(this.f7944x ? 1 : 0);
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(this.f7945y ? 1 : 0);
        e5.i.o(parcel, 9, this.f7946z);
        e5.i.t(iS, parcel);
    }
}
