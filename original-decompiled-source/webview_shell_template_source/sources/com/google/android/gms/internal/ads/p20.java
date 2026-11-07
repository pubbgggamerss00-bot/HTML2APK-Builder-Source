package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p20 extends f3.a {
    public static final Parcelable.Creator<p20> CREATOR = new q20();
    public final View s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f7916t;

    public p20(IBinder iBinder, IBinder iBinder2) {
        this.s = (View) k3.b.i1(a.AbstractBinderC0073a.r(iBinder));
        this.f7916t = (Map) k3.b.i1(a.AbstractBinderC0073a.r(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.k(parcel, 1, new k3.b(this.s));
        e5.i.k(parcel, 2, new k3.b(this.f7916t));
        e5.i.t(iS, parcel);
    }
}
