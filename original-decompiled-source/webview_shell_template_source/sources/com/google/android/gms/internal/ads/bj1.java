package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bj1 extends f3.a {
    public static final Parcelable.Creator<bj1> CREATOR = new cj1();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f3206t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3207u;

    public bj1(int i6, int i7, byte[] bArr) {
        this.s = i6;
        this.f3206t = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f3207u = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.j(parcel, 2, this.f3206t);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f3207u);
        e5.i.t(iS, parcel);
    }

    public bj1() {
        this(1, 1, null);
    }
}
