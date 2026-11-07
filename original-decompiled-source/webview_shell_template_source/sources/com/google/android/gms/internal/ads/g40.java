package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g40 extends f3.a {
    public static final Parcelable.Creator<g40> CREATOR = new h40();
    public final zzm s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4895t;

    public g40(zzm zzmVar, String str) {
        this.s = zzmVar;
        this.f4895t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.l(parcel, 2, this.s, i6);
        e5.i.m(parcel, 3, this.f4895t);
        e5.i.t(iS, parcel);
    }
}
