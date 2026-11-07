package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zv extends f3.a {
    public static final Parcelable.Creator<zv> CREATOR = new aw();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f11585t;

    public zv(String str, Bundle bundle) {
        this.s = str;
        this.f11585t = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.i(parcel, 2, this.f11585t);
        e5.i.t(iS, parcel);
    }
}
