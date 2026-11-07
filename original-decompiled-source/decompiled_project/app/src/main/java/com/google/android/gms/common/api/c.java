package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = r.f6078a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f5918b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final e f5919a;

    public c(e eVar) {
        this.f5919a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Objects.equals(this.f5919a, ((c) obj).f5919a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5919a);
    }

    public final String toString() {
        return i8.n.d("ApiMetadata(complianceOptions=", String.valueOf(this.f5919a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f5919a, i10, false);
        c1.r(iQ, parcel);
    }
}
