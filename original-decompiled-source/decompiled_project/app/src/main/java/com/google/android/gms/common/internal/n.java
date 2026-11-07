package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class n extends qa.a {
    public static final Parcelable.Creator<n> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final int f6168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6169b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6170c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6171d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6172e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6173f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6174g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6175h;

    /* renamed from: j, reason: collision with root package name */
    public final int f6176j;

    public n(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f6168a = i10;
        this.f6169b = i11;
        this.f6170c = i12;
        this.f6171d = j10;
        this.f6172e = j11;
        this.f6173f = str;
        this.f6174g = str2;
        this.f6175h = i13;
        this.f6176j = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6168a);
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(this.f6169b);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f6170c);
        androidx.lifecycle.c1.s(parcel, 4, 8);
        parcel.writeLong(this.f6171d);
        androidx.lifecycle.c1.s(parcel, 5, 8);
        parcel.writeLong(this.f6172e);
        androidx.lifecycle.c1.m(parcel, 6, this.f6173f, false);
        androidx.lifecycle.c1.m(parcel, 7, this.f6174g, false);
        androidx.lifecycle.c1.s(parcel, 8, 4);
        parcel.writeInt(this.f6175h);
        androidx.lifecycle.c1.s(parcel, 9, 4);
        parcel.writeInt(this.f6176j);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
