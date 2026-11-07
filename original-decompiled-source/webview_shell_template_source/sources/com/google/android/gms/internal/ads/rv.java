package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rv extends f3.a {
    public static final Parcelable.Creator<rv> CREATOR = new sv();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8708t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8709u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8710v;

    public rv(String str, int i6, String str2, boolean z6) {
        this.s = str;
        this.f8708t = z6;
        this.f8709u = i6;
        this.f8710v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f8708t ? 1 : 0);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f8709u);
        e5.i.m(parcel, 4, this.f8710v);
        e5.i.t(iS, parcel);
    }
}
