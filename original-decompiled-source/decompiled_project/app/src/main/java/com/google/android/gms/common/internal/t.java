package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class t extends qa.a {
    public static final Parcelable.Creator<t> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    public final int f6195a;

    /* renamed from: b, reason: collision with root package name */
    public List f6196b;

    public t(int i10, List list) {
        this.f6195a = i10;
        this.f6196b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6195a);
        androidx.lifecycle.c1.p(parcel, 2, this.f6196b, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
