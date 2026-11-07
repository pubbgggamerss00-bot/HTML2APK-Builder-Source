package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j;

/* loaded from: classes2.dex */
public final class j0 extends qa.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final int f6157a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f6158b;

    /* renamed from: c, reason: collision with root package name */
    public final pa.a f6159c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6160d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6161e;

    public j0(int i10, IBinder iBinder, pa.a aVar, boolean z10, boolean z11) {
        this.f6157a = i10;
        this.f6158b = iBinder;
        this.f6159c = aVar;
        this.f6160d = z10;
        this.f6161e = z11;
    }

    public final boolean equals(Object obj) {
        Object j1Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (!this.f6159c.equals(j0Var.f6159c)) {
            return false;
        }
        Object j1Var2 = null;
        IBinder iBinder = this.f6158b;
        if (iBinder == null) {
            j1Var = null;
        } else {
            int i10 = j.a.f6156a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            j1Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = j0Var.f6158b;
        if (iBinder2 != null) {
            int i11 = j.a.f6156a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            j1Var2 = iInterfaceQueryLocalInterface2 instanceof j ? (j) iInterfaceQueryLocalInterface2 : new j1(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return o.a(j1Var, j1Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6157a);
        androidx.lifecycle.c1.h(parcel, 2, this.f6158b);
        androidx.lifecycle.c1.l(parcel, 3, this.f6159c, i10, false);
        androidx.lifecycle.c1.s(parcel, 4, 4);
        parcel.writeInt(this.f6160d ? 1 : 0);
        androidx.lifecycle.c1.s(parcel, 5, 4);
        parcel.writeInt(this.f6161e ? 1 : 0);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
