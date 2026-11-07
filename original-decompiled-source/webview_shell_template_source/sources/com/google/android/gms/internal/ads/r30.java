package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r30 extends f3.a {
    public static final Parcelable.Creator<r30> CREATOR = new s30();
    public cd1 A;
    public String B;
    public final boolean C;
    public final boolean D;
    public final Bundle E;
    public final Bundle F;
    public final Bundle s;

    /* renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f8524t;

    /* renamed from: u, reason: collision with root package name */
    public final ApplicationInfo f8525u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8526v;

    /* renamed from: w, reason: collision with root package name */
    public final List f8527w;

    /* renamed from: x, reason: collision with root package name */
    public final PackageInfo f8528x;

    /* renamed from: y, reason: collision with root package name */
    public final String f8529y;

    /* renamed from: z, reason: collision with root package name */
    public final String f8530z;

    public r30(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, cd1 cd1Var, String str4, boolean z6, boolean z7, Bundle bundle2, Bundle bundle3) {
        this.s = bundle;
        this.f8524t = versionInfoParcel;
        this.f8526v = str;
        this.f8525u = applicationInfo;
        this.f8527w = arrayList;
        this.f8528x = packageInfo;
        this.f8529y = str2;
        this.f8530z = str3;
        this.A = cd1Var;
        this.B = str4;
        this.C = z6;
        this.D = z7;
        this.E = bundle2;
        this.F = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.i(parcel, 1, this.s);
        e5.i.l(parcel, 2, this.f8524t, i6);
        e5.i.l(parcel, 3, this.f8525u, i6);
        e5.i.m(parcel, 4, this.f8526v);
        e5.i.o(parcel, 5, this.f8527w);
        e5.i.l(parcel, 6, this.f8528x, i6);
        e5.i.m(parcel, 7, this.f8529y);
        e5.i.m(parcel, 9, this.f8530z);
        e5.i.l(parcel, 10, this.A, i6);
        e5.i.m(parcel, 11, this.B);
        e5.i.r(parcel, 12, 4);
        parcel.writeInt(this.C ? 1 : 0);
        e5.i.r(parcel, 13, 4);
        parcel.writeInt(this.D ? 1 : 0);
        e5.i.i(parcel, 14, this.E);
        e5.i.i(parcel, 15, this.F);
        e5.i.t(iS, parcel);
    }
}
