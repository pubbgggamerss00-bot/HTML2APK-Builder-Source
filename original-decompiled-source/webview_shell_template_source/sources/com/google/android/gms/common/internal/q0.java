package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q0 extends f3.a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();
    public Bundle s;

    /* renamed from: t, reason: collision with root package name */
    public c3.d[] f2480t;

    /* renamed from: u, reason: collision with root package name */
    public int f2481u;

    /* renamed from: v, reason: collision with root package name */
    public d f2482v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.i(parcel, 1, this.s);
        e5.i.p(parcel, 2, this.f2480t, i6);
        int i7 = this.f2481u;
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(i7);
        e5.i.l(parcel, 4, this.f2482v, i6);
        e5.i.t(iS, parcel);
    }
}
