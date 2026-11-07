package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d3.l;
import e5.i;
import f3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2394t;

    public Scope(int i6, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.s = i6;
        this.f2394t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2394t.equals(((Scope) obj).f2394t);
    }

    public final int hashCode() {
        return this.f2394t.hashCode();
    }

    public final String toString() {
        return this.f2394t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        i.m(parcel, 2, this.f2394t);
        i.t(iS, parcel);
    }
}
