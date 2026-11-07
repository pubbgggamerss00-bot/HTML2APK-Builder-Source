package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends f3.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final IBinder f2425t;

    /* renamed from: u, reason: collision with root package name */
    public final c3.b f2426u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2427v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2428w;

    public c0(int i6, IBinder iBinder, c3.b bVar, boolean z6, boolean z7) {
        this.s = i6;
        this.f2425t = iBinder;
        this.f2426u = bVar;
        this.f2427v = z6;
        this.f2428w = z7;
    }

    public final boolean equals(Object obj) {
        Object a1Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.f2426u.equals(c0Var.f2426u)) {
            return false;
        }
        Object a1Var2 = null;
        IBinder iBinder = this.f2425t;
        if (iBinder == null) {
            a1Var = null;
        } else {
            int i6 = h.a.s;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            a1Var = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new a1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = c0Var.f2425t;
        if (iBinder2 != null) {
            int i7 = h.a.s;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            a1Var2 = iInterfaceQueryLocalInterface2 instanceof h ? (h) iInterfaceQueryLocalInterface2 : new a1(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return k.a(a1Var, a1Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.k(parcel, 2, this.f2425t);
        e5.i.l(parcel, 3, this.f2426u, i6);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f2427v ? 1 : 0);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f2428w ? 1 : 0);
        e5.i.t(iS, parcel);
    }
}
