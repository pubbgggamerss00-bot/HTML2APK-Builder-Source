package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c3.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.k;
import d3.c;
import d3.i;
import d3.m;
import f3.a;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Status extends a implements i, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: w, reason: collision with root package name */
    public static final Status f2395w;

    /* renamed from: x, reason: collision with root package name */
    public static final Status f2396x;

    /* renamed from: y, reason: collision with root package name */
    public static final Status f2397y;

    /* renamed from: z, reason: collision with root package name */
    public static final Status f2398z;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2399t;

    /* renamed from: u, reason: collision with root package name */
    public final PendingIntent f2400u;

    /* renamed from: v, reason: collision with root package name */
    public final b f2401v;

    static {
        new Status(-1, null, null, null);
        f2395w = new Status(0, null, null, null);
        new Status(14, null, null, null);
        f2396x = new Status(8, null, null, null);
        f2397y = new Status(15, null, null, null);
        f2398z = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new m();
    }

    public Status(int i6, String str, PendingIntent pendingIntent, b bVar) {
        this.s = i6;
        this.f2399t = str;
        this.f2400u = pendingIntent;
        this.f2401v = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.s == status.s && k.a(this.f2399t, status.f2399t) && k.a(this.f2400u, status.f2400u) && k.a(this.f2401v, status.f2401v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.s), this.f2399t, this.f2400u, this.f2401v});
    }

    public final String toString() {
        k.a aVar = new k.a(this);
        String strA = this.f2399t;
        if (strA == null) {
            strA = c.a(this.s);
        }
        aVar.a("statusCode", strA);
        aVar.a("resolution", this.f2400u);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.m(parcel, 2, this.f2399t);
        e5.i.l(parcel, 3, this.f2400u, i6);
        e5.i.l(parcel, 4, this.f2401v, i6);
        e5.i.t(iS, parcel);
    }

    @Override // d3.i
    public final Status getStatus() {
        return this;
    }
}
