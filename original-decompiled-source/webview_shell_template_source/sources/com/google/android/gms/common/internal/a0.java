package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a0 extends f3.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final Account f2410t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2411u;

    /* renamed from: v, reason: collision with root package name */
    public final GoogleSignInAccount f2412v;

    public a0(int i6, Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this.s = i6;
        this.f2410t = account;
        this.f2411u = i7;
        this.f2412v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.l(parcel, 2, this.f2410t, i6);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f2411u);
        e5.i.l(parcel, 4, this.f2412v, i6);
        e5.i.t(iS, parcel);
    }
}
