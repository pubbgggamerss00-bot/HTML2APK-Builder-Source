package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final int f6083a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6084b;

    public c(int i10, String str) {
        this.f6083a = i10;
        this.f6084b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f6083a == this.f6083a && o.a(cVar.f6084b, this.f6084b);
    }

    public final int hashCode() {
        return this.f6083a;
    }

    public final String toString() {
        return this.f6083a + ":" + this.f6084b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f6083a);
        androidx.lifecycle.c1.m(parcel, 2, this.f6084b, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
