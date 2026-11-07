package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends f3.a {
    public static final Parcelable.Creator<n> CREATOR = new i0();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2470t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2471u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2472v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2473w;

    public n(int i6, boolean z6, boolean z7, int i7, int i8) {
        this.s = i6;
        this.f2470t = z6;
        this.f2471u = z7;
        this.f2472v = i7;
        this.f2473w = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f2470t ? 1 : 0);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f2471u ? 1 : 0);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f2472v);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f2473w);
        e5.i.t(iS, parcel);
    }
}
