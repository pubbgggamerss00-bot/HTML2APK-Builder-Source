package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f3.a {
    public static final Parcelable.Creator<d> CREATOR = new s0();
    public final n s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2429t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2430u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f2431v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2432w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2433x;

    public d(n nVar, boolean z6, boolean z7, int[] iArr, int i6, int[] iArr2) {
        this.s = nVar;
        this.f2429t = z6;
        this.f2430u = z7;
        this.f2431v = iArr;
        this.f2432w = i6;
        this.f2433x = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.l(parcel, 1, this.s, i6);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f2429t ? 1 : 0);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f2430u ? 1 : 0);
        int[] iArr = this.f2431v;
        if (iArr != null) {
            int iS2 = e5.i.s(4, parcel);
            parcel.writeIntArray(iArr);
            e5.i.t(iS2, parcel);
        }
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f2432w);
        int[] iArr2 = this.f2433x;
        if (iArr2 != null) {
            int iS3 = e5.i.s(6, parcel);
            parcel.writeIntArray(iArr2);
            e5.i.t(iS3, parcel);
        }
        e5.i.t(iS, parcel);
    }
}
