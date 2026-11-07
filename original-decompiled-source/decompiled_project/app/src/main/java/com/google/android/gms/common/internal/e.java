package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    public final r f6110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6111b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6112c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6113d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6114e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f6115f;

    public e(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f6110a = rVar;
        this.f6111b = z10;
        this.f6112c = z11;
        this.f6113d = iArr;
        this.f6114e = i10;
        this.f6115f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 1, this.f6110a, i10, false);
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(this.f6111b ? 1 : 0);
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(this.f6112c ? 1 : 0);
        androidx.lifecycle.c1.i(parcel, 4, this.f6113d, false);
        androidx.lifecycle.c1.s(parcel, 5, 4);
        parcel.writeInt(this.f6114e);
        androidx.lifecycle.c1.i(parcel, 6, this.f6115f, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
