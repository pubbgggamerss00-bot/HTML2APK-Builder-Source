package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0036a();
    public final y s;

    /* renamed from: t, reason: collision with root package name */
    public final y f12220t;

    /* renamed from: u, reason: collision with root package name */
    public final c f12221u;

    /* renamed from: v, reason: collision with root package name */
    public final y f12222v;

    /* renamed from: w, reason: collision with root package name */
    public final int f12223w;

    /* renamed from: x, reason: collision with root package name */
    public final int f12224x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12225y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0036a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((y) parcel.readParcelable(y.class.getClassLoader()), (y) parcel.readParcelable(y.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (y) parcel.readParcelable(y.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f12226c = 0;

        /* renamed from: a, reason: collision with root package name */
        public Long f12227a;

        /* renamed from: b, reason: collision with root package name */
        public c f12228b;

        static {
            i0.a(y.l(1900, 0).f12307x);
            i0.a(y.l(2100, 11).f12307x);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c extends Parcelable {
        boolean f(long j6);
    }

    public a(y yVar, y yVar2, c cVar, y yVar3, int i6) {
        Objects.requireNonNull(yVar, "start cannot be null");
        Objects.requireNonNull(yVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.s = yVar;
        this.f12220t = yVar2;
        this.f12222v = yVar3;
        this.f12223w = i6;
        this.f12221u = cVar;
        if (yVar3 != null && yVar.s.compareTo(yVar3.s) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (yVar3 != null && yVar3.s.compareTo(yVar2.s) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 < 0 || i6 > i0.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f12225y = yVar.o(yVar2) + 1;
        this.f12224x = (yVar2.f12304u - yVar.f12304u) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.s.equals(aVar.s) && this.f12220t.equals(aVar.f12220t) && Objects.equals(this.f12222v, aVar.f12222v) && this.f12223w == aVar.f12223w && this.f12221u.equals(aVar.f12221u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, this.f12220t, this.f12222v, Integer.valueOf(this.f12223w), this.f12221u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.s, 0);
        parcel.writeParcelable(this.f12220t, 0);
        parcel.writeParcelable(this.f12222v, 0);
        parcel.writeParcelable(this.f12221u, 0);
        parcel.writeInt(this.f12223w);
    }
}
