package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y implements Comparable<y>, Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();
    public final Calendar s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12303t;

    /* renamed from: u, reason: collision with root package name */
    public final int f12304u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12305v;

    /* renamed from: w, reason: collision with root package name */
    public final int f12306w;

    /* renamed from: x, reason: collision with root package name */
    public final long f12307x;

    /* renamed from: y, reason: collision with root package name */
    public String f12308y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            return y.l(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i6) {
            return new y[i6];
        }
    }

    public y(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = i0.c(calendar);
        this.s = calendarC;
        this.f12303t = calendarC.get(2);
        this.f12304u = calendarC.get(1);
        this.f12305v = calendarC.getMaximum(7);
        this.f12306w = calendarC.getActualMaximum(5);
        this.f12307x = calendarC.getTimeInMillis();
    }

    public static y l(int i6, int i7) {
        Calendar calendarE = i0.e(null);
        calendarE.set(1, i6);
        calendarE.set(2, i7);
        return new y(calendarE);
    }

    public static y m(long j6) {
        Calendar calendarE = i0.e(null);
        calendarE.setTimeInMillis(j6);
        return new y(calendarE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(y yVar) {
        return this.s.compareTo(yVar.s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f12303t == yVar.f12303t && this.f12304u == yVar.f12304u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12303t), Integer.valueOf(this.f12304u)});
    }

    public final String n() {
        if (this.f12308y == null) {
            this.f12308y = i0.b("yMMMM", Locale.getDefault()).format(new Date(this.s.getTimeInMillis()));
        }
        return this.f12308y;
    }

    public final int o(y yVar) {
        if (!(this.s instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (yVar.f12303t - this.f12303t) + ((yVar.f12304u - this.f12304u) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f12304u);
        parcel.writeInt(this.f12303t);
    }
}
