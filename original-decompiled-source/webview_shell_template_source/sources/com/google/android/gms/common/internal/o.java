package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o extends f3.a {
    public static final Parcelable.Creator<o> CREATOR = new q();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public List<j> f2476t;

    public o(int i6, List<j> list) {
        this.s = i6;
        this.f2476t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.q(parcel, 2, this.f2476t);
        e5.i.t(iS, parcel);
    }
}
