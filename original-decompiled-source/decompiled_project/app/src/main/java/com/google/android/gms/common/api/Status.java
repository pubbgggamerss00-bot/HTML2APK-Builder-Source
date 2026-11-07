package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Status extends qa.a implements l, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f5905e;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f5906f;

    /* renamed from: g, reason: collision with root package name */
    public static final Status f5907g;

    /* renamed from: h, reason: collision with root package name */
    public static final Status f5908h;

    /* renamed from: j, reason: collision with root package name */
    public static final Status f5909j;

    /* renamed from: a, reason: collision with root package name */
    public final int f5910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5911b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f5912c;

    /* renamed from: d, reason: collision with root package name */
    public final pa.a f5913d;

    static {
        new Status(-1, null, null, null);
        f5905e = new Status(0, null, null, null);
        f5906f = new Status(14, null, null, null);
        f5907g = new Status(8, null, null, null);
        f5908h = new Status(15, null, null, null);
        f5909j = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new v();
    }

    public Status(int i10, String str, PendingIntent pendingIntent, pa.a aVar) {
        this.f5910a = i10;
        this.f5911b = str;
        this.f5912c = pendingIntent;
        this.f5913d = aVar;
    }

    public final boolean d() {
        return this.f5910a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5910a == status.f5910a && com.google.android.gms.common.internal.o.a(this.f5911b, status.f5911b) && com.google.android.gms.common.internal.o.a(this.f5912c, status.f5912c) && com.google.android.gms.common.internal.o.a(this.f5913d, status.f5913d);
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5910a), this.f5911b, this.f5912c, this.f5913d});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        String strA = this.f5911b;
        if (strA == null) {
            strA = d.a(this.f5910a);
        }
        aVar.a(strA, "statusCode");
        aVar.a(this.f5912c, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5910a);
        c1.m(parcel, 2, this.f5911b, false);
        c1.l(parcel, 3, this.f5912c, i10, false);
        c1.l(parcel, 4, this.f5913d, i10, false);
        c1.r(iQ, parcel);
    }
}
