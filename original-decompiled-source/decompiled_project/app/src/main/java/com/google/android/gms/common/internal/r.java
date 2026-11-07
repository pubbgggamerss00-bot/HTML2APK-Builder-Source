package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r extends qa.a {
    public static final Parcelable.Creator<r> CREATOR = new r0();

    /* renamed from: a, reason: collision with root package name */
    public final int f6187a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6190d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6191e;

    public r(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f6187a = i10;
        this.f6188b = z10;
        this.f6189c = z11;
        this.f6190d = i11;
        this.f6191e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6187a);
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(this.f6188b ? 1 : 0);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f6189c ? 1 : 0);
        androidx.lifecycle.c1.s(parcel, 4, 4);
        parcel.writeInt(this.f6190d);
        androidx.lifecycle.c1.s(parcel, 5, 4);
        parcel.writeInt(this.f6191e);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
