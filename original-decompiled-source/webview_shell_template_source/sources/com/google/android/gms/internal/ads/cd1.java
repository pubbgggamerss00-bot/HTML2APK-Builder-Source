package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cd1 extends f3.a {
    public static final Parcelable.Creator<cd1> CREATOR = new dd1();
    public final int A;
    public final int B;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3522t;

    /* renamed from: u, reason: collision with root package name */
    public final bd1 f3523u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3524v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3525w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3526x;

    /* renamed from: y, reason: collision with root package name */
    public final String f3527y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3528z;

    public cd1(int i6, int i7, int i8, int i9, String str, int i10, int i11) {
        bd1[] bd1VarArrValues = bd1.values();
        this.s = null;
        this.f3522t = i6;
        this.f3523u = bd1VarArrValues[i6];
        this.f3524v = i7;
        this.f3525w = i8;
        this.f3526x = i9;
        this.f3527y = str;
        this.f3528z = i10;
        this.B = new int[]{1, 2, 3}[i10];
        this.A = i11;
        int i12 = new int[]{1}[i11];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.f3522t);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f3524v);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f3525w);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f3526x);
        e5.i.m(parcel, 5, this.f3527y);
        e5.i.r(parcel, 6, 4);
        parcel.writeInt(this.f3528z);
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(this.A);
        e5.i.t(iS, parcel);
    }

    public cd1(Context context, bd1 bd1Var, int i6, int i7, int i8, String str, String str2, String str3) {
        int i9;
        bd1.values();
        this.s = context;
        this.f3522t = bd1Var.ordinal();
        this.f3523u = bd1Var;
        this.f3524v = i6;
        this.f3525w = i7;
        this.f3526x = i8;
        this.f3527y = str;
        if ("oldest".equals(str2)) {
            i9 = 1;
        } else {
            i9 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.B = i9;
        this.f3528z = i9 - 1;
        "onAdClosed".equals(str3);
        this.A = 0;
    }
}
