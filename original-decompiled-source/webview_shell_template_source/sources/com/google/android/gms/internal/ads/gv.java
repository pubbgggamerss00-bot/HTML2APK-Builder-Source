package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gv extends f3.a {
    public static final Parcelable.Creator<gv> CREATOR = new hv();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String[] f5169t;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f5170u;

    public gv(String str, String[] strArr, String[] strArr2) {
        this.s = str;
        this.f5169t = strArr;
        this.f5170u = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.n(parcel, 2, this.f5169t);
        e5.i.n(parcel, 3, this.f5170u);
        e5.i.t(iS, parcel);
    }
}
