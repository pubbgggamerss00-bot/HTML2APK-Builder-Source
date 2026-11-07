package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final int f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5922c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5923d;

    static {
        new e(-1, -1, 0, true);
        CREATOR = new t();
    }

    public e(int i10, int i11, int i12, boolean z10) {
        this.f5920a = i10;
        this.f5921b = i11;
        this.f5922c = i12;
        this.f5923d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5920a == eVar.f5920a && this.f5921b == eVar.f5921b && this.f5922c == eVar.f5922c && this.f5923d == eVar.f5923d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5920a), Integer.valueOf(this.f5921b), Integer.valueOf(this.f5922c), Boolean.valueOf(this.f5923d)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f5920a + ", dataOwnerProductId=" + this.f5921b + ", processingReason=" + this.f5922c + ", isUserData=" + this.f5923d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5920a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f5921b);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f5922c);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f5923d ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
