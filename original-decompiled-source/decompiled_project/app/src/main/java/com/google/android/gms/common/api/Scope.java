package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public final class Scope extends qa.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public final int f5903a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5904b;

    public Scope(int i10, String str) {
        com.google.android.gms.common.internal.p.e(str, "scopeUri must not be null or empty");
        this.f5903a = i10;
        this.f5904b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5904b.equals(((Scope) obj).f5904b);
    }

    public final int hashCode() {
        return this.f5904b.hashCode();
    }

    public final String toString() {
        return this.f5904b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5903a);
        c1.m(parcel, 2, this.f5904b, false);
        c1.r(iQ, parcel);
    }
}
