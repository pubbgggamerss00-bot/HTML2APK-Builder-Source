package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hb.a0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import qa.a;

/* loaded from: classes2.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List<Location> f6268a;

    /* renamed from: b, reason: collision with root package name */
    public static final List<Location> f6267b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new a0();

    public LocationResult(List<Location> list) {
        this.f6268a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List<Location> list = ((LocationResult) obj).f6268a;
        int size = list.size();
        List<Location> list2 = this.f6268a;
        if (size != list2.size()) {
            return false;
        }
        Iterator<Location> it = list.iterator();
        Iterator<Location> it2 = list2.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator<Location> it = this.f6268a.iterator();
        int i10 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i10 = (i10 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6268a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, this.f6268a, false);
        c1.r(iQ, parcel);
    }
}
