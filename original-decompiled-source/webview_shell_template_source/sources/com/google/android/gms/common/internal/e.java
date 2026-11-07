package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends f3.a {
    public static final Parcelable.Creator<e> CREATOR = new t0();
    public static final Scope[] G = new Scope[0];
    public static final c3.d[] H = new c3.d[0];
    public c3.d[] A;
    public c3.d[] B;
    public final boolean C;
    public final int D;
    public boolean E;
    public final String F;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2434t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2435u;

    /* renamed from: v, reason: collision with root package name */
    public String f2436v;

    /* renamed from: w, reason: collision with root package name */
    public IBinder f2437w;

    /* renamed from: x, reason: collision with root package name */
    public Scope[] f2438x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f2439y;

    /* renamed from: z, reason: collision with root package name */
    public Account f2440z;

    public e(int i6, int i7, int i8, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c3.d[] dVarArr, c3.d[] dVarArr2, boolean z6, int i9, boolean z7, String str2) {
        scopeArr = scopeArr == null ? G : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c3.d[] dVarArr3 = H;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.s = i6;
        this.f2434t = i7;
        this.f2435u = i8;
        if ("com.google.android.gms".equals(str)) {
            this.f2436v = "com.google.android.gms";
        } else {
            this.f2436v = str;
        }
        if (i6 < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i10 = h.a.s;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                h a1Var = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new a1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i11 = a.f2409t;
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountZzb = a1Var.zzb();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.f2440z = accountZzb;
        } else {
            this.f2437w = iBinder;
            this.f2440z = account;
        }
        this.f2438x = scopeArr;
        this.f2439y = bundle;
        this.A = dVarArr;
        this.B = dVarArr2;
        this.C = z6;
        this.D = i9;
        this.E = z7;
        this.F = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        t0.a(this, parcel, i6);
    }
}
