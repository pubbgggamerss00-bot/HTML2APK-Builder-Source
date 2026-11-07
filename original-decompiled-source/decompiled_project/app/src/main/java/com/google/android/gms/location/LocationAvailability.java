package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hb.i0;
import hb.y;
import java.util.Arrays;
import qa.a;

/* loaded from: classes2.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public int f6253a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public int f6254b;

    /* renamed from: c, reason: collision with root package name */
    public long f6255c;

    /* renamed from: d, reason: collision with root package name */
    public int f6256d;

    /* renamed from: e, reason: collision with root package name */
    public i0[] f6257e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f6253a == locationAvailability.f6253a && this.f6254b == locationAvailability.f6254b && this.f6255c == locationAvailability.f6255c && this.f6256d == locationAvailability.f6256d && Arrays.equals(this.f6257e, locationAvailability.f6257e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6256d), Integer.valueOf(this.f6253a), Integer.valueOf(this.f6254b), Long.valueOf(this.f6255c), this.f6257e});
    }

    public final String toString() {
        boolean z10 = this.f6256d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z10);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.f6253a;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.f6254b;
        c1.s(parcel, 2, 4);
        parcel.writeInt(i12);
        long j10 = this.f6255c;
        c1.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i13 = this.f6256d;
        c1.s(parcel, 4, 4);
        parcel.writeInt(i13);
        c1.o(parcel, 5, this.f6257e, i10);
        c1.r(iQ, parcel);
    }
}
