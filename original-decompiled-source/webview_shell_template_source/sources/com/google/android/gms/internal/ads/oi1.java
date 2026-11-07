package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oi1 extends f3.a {
    public static final Parcelable.Creator<oi1> CREATOR = new pi1();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f7779t;

    public oi1(int i6, byte[] bArr) {
        this.s = i6;
        this.f7779t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.j(parcel, 2, this.f7779t);
        e5.i.t(iS, parcel);
    }
}
