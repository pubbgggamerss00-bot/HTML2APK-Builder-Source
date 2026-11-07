package q3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends f3.a {
    public static final Parcelable.Creator<i> CREATOR = new j();
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14136t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14137u;

    /* renamed from: v, reason: collision with root package name */
    public final String f14138v;

    /* renamed from: w, reason: collision with root package name */
    public final String f14139w;

    /* renamed from: x, reason: collision with root package name */
    public final String f14140x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f14141y;

    /* renamed from: z, reason: collision with root package name */
    public final String f14142z;

    public i(long j6, long j7, boolean z6, String str, String str2, String str3, Bundle bundle, String str4) {
        this.s = j6;
        this.f14136t = j7;
        this.f14137u = z6;
        this.f14138v = str;
        this.f14139w = str2;
        this.f14140x = str3;
        this.f14141y = bundle;
        this.f14142z = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 8);
        parcel.writeLong(this.s);
        e5.i.r(parcel, 2, 8);
        parcel.writeLong(this.f14136t);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f14137u ? 1 : 0);
        e5.i.m(parcel, 4, this.f14138v);
        e5.i.m(parcel, 5, this.f14139w);
        e5.i.m(parcel, 6, this.f14140x);
        e5.i.i(parcel, 7, this.f14141y);
        e5.i.m(parcel, 8, this.f14142z);
        e5.i.t(iS, parcel);
    }
}
