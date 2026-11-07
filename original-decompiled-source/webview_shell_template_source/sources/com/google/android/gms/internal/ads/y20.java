package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y20 extends f3.a {
    public static final Parcelable.Creator<y20> CREATOR = new z20();
    public final String A;
    public final String B;
    public final VersionInfoParcel C;
    public final Bundle D;
    public final int E;
    public final List F;
    public final Bundle G;
    public final boolean H;
    public final int I;
    public final int J;
    public final float K;
    public final String L;
    public final long M;
    public final String N;
    public final List O;
    public final String P;
    public final oq Q;
    public final List R;
    public final long S;
    public final String T;
    public final float U;
    public final int V;
    public final int W;
    public final boolean X;
    public final String Y;
    public final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f10782a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f10783b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f10784c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Bundle f10785d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f10786e0;

    /* renamed from: f0, reason: collision with root package name */
    public final zzef f10787f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f10788g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Bundle f10789h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f10790i0;

    /* renamed from: j0, reason: collision with root package name */
    public final String f10791j0;

    /* renamed from: k0, reason: collision with root package name */
    public final String f10792k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f10793l0;

    /* renamed from: m0, reason: collision with root package name */
    public final List f10794m0;

    /* renamed from: n0, reason: collision with root package name */
    public final String f10795n0;

    /* renamed from: o0, reason: collision with root package name */
    public final List f10796o0;
    public final int p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f10797q0;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f10798r0;
    public final int s;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f10799s0;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f10800t;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f10801t0;

    /* renamed from: u, reason: collision with root package name */
    public final zzm f10802u;

    /* renamed from: u0, reason: collision with root package name */
    public final String f10803u0;

    /* renamed from: v, reason: collision with root package name */
    public final zzs f10804v;

    /* renamed from: v0, reason: collision with root package name */
    public final bw f10805v0;

    /* renamed from: w, reason: collision with root package name */
    public final String f10806w;

    /* renamed from: w0, reason: collision with root package name */
    public final String f10807w0;

    /* renamed from: x, reason: collision with root package name */
    public final ApplicationInfo f10808x;

    /* renamed from: x0, reason: collision with root package name */
    public final Bundle f10809x0;

    /* renamed from: y, reason: collision with root package name */
    public final PackageInfo f10810y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10811z;

    public y20(int i6, Bundle bundle, zzm zzmVar, zzs zzsVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i7, ArrayList arrayList, Bundle bundle3, boolean z6, int i8, int i9, float f6, String str5, long j6, String str6, ArrayList arrayList2, String str7, oq oqVar, ArrayList arrayList3, long j7, String str8, float f7, boolean z7, int i10, int i11, boolean z8, String str9, String str10, boolean z9, int i12, Bundle bundle4, String str11, zzef zzefVar, boolean z10, Bundle bundle5, String str12, String str13, String str14, boolean z11, ArrayList arrayList4, String str15, ArrayList arrayList5, int i13, boolean z12, boolean z13, boolean z14, ArrayList arrayList6, String str16, bw bwVar, String str17, Bundle bundle6) {
        this.s = i6;
        this.f10800t = bundle;
        this.f10802u = zzmVar;
        this.f10804v = zzsVar;
        this.f10806w = str;
        this.f10808x = applicationInfo;
        this.f10810y = packageInfo;
        this.f10811z = str2;
        this.A = str3;
        this.B = str4;
        this.C = versionInfoParcel;
        this.D = bundle2;
        this.E = i7;
        this.F = arrayList;
        this.R = arrayList3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList3);
        this.G = bundle3;
        this.H = z6;
        this.I = i8;
        this.J = i9;
        this.K = f6;
        this.L = str5;
        this.M = j6;
        this.N = str6;
        this.O = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.P = str7;
        this.Q = oqVar;
        this.S = j7;
        this.T = str8;
        this.U = f7;
        this.Z = z7;
        this.V = i10;
        this.W = i11;
        this.X = z8;
        this.Y = str9;
        this.f10782a0 = str10;
        this.f10783b0 = z9;
        this.f10784c0 = i12;
        this.f10785d0 = bundle4;
        this.f10786e0 = str11;
        this.f10787f0 = zzefVar;
        this.f10788g0 = z10;
        this.f10789h0 = bundle5;
        this.f10790i0 = str12;
        this.f10791j0 = str13;
        this.f10792k0 = str14;
        this.f10793l0 = z11;
        this.f10794m0 = arrayList4;
        this.f10795n0 = str15;
        this.f10796o0 = arrayList5;
        this.p0 = i13;
        this.f10797q0 = z12;
        this.f10798r0 = z13;
        this.f10799s0 = z14;
        this.f10801t0 = arrayList6;
        this.f10803u0 = str16;
        this.f10805v0 = bwVar;
        this.f10807w0 = str17;
        this.f10809x0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.i(parcel, 2, this.f10800t);
        e5.i.l(parcel, 3, this.f10802u, i6);
        e5.i.l(parcel, 4, this.f10804v, i6);
        e5.i.m(parcel, 5, this.f10806w);
        e5.i.l(parcel, 6, this.f10808x, i6);
        e5.i.l(parcel, 7, this.f10810y, i6);
        e5.i.m(parcel, 8, this.f10811z);
        e5.i.m(parcel, 9, this.A);
        e5.i.m(parcel, 10, this.B);
        e5.i.l(parcel, 11, this.C, i6);
        e5.i.i(parcel, 12, this.D);
        e5.i.r(parcel, 13, 4);
        parcel.writeInt(this.E);
        e5.i.o(parcel, 14, this.F);
        e5.i.i(parcel, 15, this.G);
        e5.i.r(parcel, 16, 4);
        parcel.writeInt(this.H ? 1 : 0);
        e5.i.r(parcel, 18, 4);
        parcel.writeInt(this.I);
        e5.i.r(parcel, 19, 4);
        parcel.writeInt(this.J);
        e5.i.r(parcel, 20, 4);
        parcel.writeFloat(this.K);
        e5.i.m(parcel, 21, this.L);
        e5.i.r(parcel, 25, 8);
        parcel.writeLong(this.M);
        e5.i.m(parcel, 26, this.N);
        e5.i.o(parcel, 27, this.O);
        e5.i.m(parcel, 28, this.P);
        e5.i.l(parcel, 29, this.Q, i6);
        e5.i.o(parcel, 30, this.R);
        e5.i.r(parcel, 31, 8);
        parcel.writeLong(this.S);
        e5.i.m(parcel, 33, this.T);
        e5.i.r(parcel, 34, 4);
        parcel.writeFloat(this.U);
        e5.i.r(parcel, 35, 4);
        parcel.writeInt(this.V);
        e5.i.r(parcel, 36, 4);
        parcel.writeInt(this.W);
        e5.i.r(parcel, 37, 4);
        parcel.writeInt(this.X ? 1 : 0);
        e5.i.m(parcel, 39, this.Y);
        e5.i.r(parcel, 40, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        e5.i.m(parcel, 41, this.f10782a0);
        e5.i.r(parcel, 42, 4);
        parcel.writeInt(this.f10783b0 ? 1 : 0);
        e5.i.r(parcel, 43, 4);
        parcel.writeInt(this.f10784c0);
        e5.i.i(parcel, 44, this.f10785d0);
        e5.i.m(parcel, 45, this.f10786e0);
        e5.i.l(parcel, 46, this.f10787f0, i6);
        e5.i.r(parcel, 47, 4);
        parcel.writeInt(this.f10788g0 ? 1 : 0);
        e5.i.i(parcel, 48, this.f10789h0);
        e5.i.m(parcel, 49, this.f10790i0);
        e5.i.m(parcel, 50, this.f10791j0);
        e5.i.m(parcel, 51, this.f10792k0);
        e5.i.r(parcel, 52, 4);
        parcel.writeInt(this.f10793l0 ? 1 : 0);
        List list = this.f10794m0;
        if (list != null) {
            int iS2 = e5.i.s(53, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i7 = 0; i7 < size; i7++) {
                parcel.writeInt(((Integer) list.get(i7)).intValue());
            }
            e5.i.t(iS2, parcel);
        }
        e5.i.m(parcel, 54, this.f10795n0);
        e5.i.o(parcel, 55, this.f10796o0);
        e5.i.r(parcel, 56, 4);
        parcel.writeInt(this.p0);
        e5.i.r(parcel, 57, 4);
        parcel.writeInt(this.f10797q0 ? 1 : 0);
        e5.i.r(parcel, 58, 4);
        parcel.writeInt(this.f10798r0 ? 1 : 0);
        e5.i.r(parcel, 59, 4);
        parcel.writeInt(this.f10799s0 ? 1 : 0);
        e5.i.o(parcel, 60, this.f10801t0);
        e5.i.m(parcel, 61, this.f10803u0);
        e5.i.l(parcel, 63, this.f10805v0, i6);
        e5.i.m(parcel, 64, this.f10807w0);
        e5.i.i(parcel, 65, this.f10809x0);
        e5.i.t(iS, parcel);
    }
}
