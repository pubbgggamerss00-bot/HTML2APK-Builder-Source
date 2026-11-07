package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a30 extends f3.a {
    public static final Parcelable.Creator<a30> CREATOR = new b30();
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final List f2559t;

    public a30(List list, boolean z6) {
        this.s = z6;
        this.f2559t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.s ? 1 : 0);
        e5.i.o(parcel, 3, this.f2559t);
        e5.i.t(iS, parcel);
    }
}
