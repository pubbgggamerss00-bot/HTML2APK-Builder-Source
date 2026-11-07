package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class y0 extends qa.a {
    public static final Parcelable.Creator<y0> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    public Bundle f6210a;

    /* renamed from: b, reason: collision with root package name */
    public pa.c[] f6211b;

    /* renamed from: c, reason: collision with root package name */
    public int f6212c;

    /* renamed from: d, reason: collision with root package name */
    public e f6213d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.e(parcel, 1, this.f6210a, false);
        androidx.lifecycle.c1.o(parcel, 2, this.f6211b, i10);
        int i11 = this.f6212c;
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(i11);
        androidx.lifecycle.c1.l(parcel, 4, this.f6213d, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
