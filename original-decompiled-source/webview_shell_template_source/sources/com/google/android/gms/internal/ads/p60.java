package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p60 extends f3.a {
    public static final Parcelable.Creator<p60> CREATOR = new q60();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7956t;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public final zzs f7957u;

    /* renamed from: v, reason: collision with root package name */
    public final zzm f7958v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7959w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7960x;

    public p60(String str, String str2, zzs zzsVar, zzm zzmVar, int i6, String str3) {
        this.s = str;
        this.f7956t = str2;
        this.f7957u = zzsVar;
        this.f7958v = zzmVar;
        this.f7959w = i6;
        this.f7960x = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.m(parcel, 2, this.f7956t);
        e5.i.l(parcel, 3, this.f7957u, i6);
        e5.i.l(parcel, 4, this.f7958v, i6);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f7959w);
        e5.i.m(parcel, 6, this.f7960x);
        e5.i.t(iS, parcel);
    }
}
