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
import com.google.android.gms.common.internal.j;

/* loaded from: classes2.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new b1();

    /* renamed from: q, reason: collision with root package name */
    public static final Scope[] f6119q = new Scope[0];

    /* renamed from: r, reason: collision with root package name */
    public static final pa.c[] f6120r = new pa.c[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f6121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6123c;

    /* renamed from: d, reason: collision with root package name */
    public String f6124d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f6125e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f6126f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f6127g;

    /* renamed from: h, reason: collision with root package name */
    public Account f6128h;

    /* renamed from: j, reason: collision with root package name */
    public pa.c[] f6129j;

    /* renamed from: k, reason: collision with root package name */
    public pa.c[] f6130k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6131l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6132m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6133n;

    /* renamed from: p, reason: collision with root package name */
    public final String f6134p;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pa.c[] cVarArr, pa.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f6119q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        pa.c[] cVarArr3 = f6120r;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f6121a = i10;
        this.f6122b = i11;
        this.f6123c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f6124d = "com.google.android.gms";
        } else {
            this.f6124d = str;
        }
        if (i10 < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i14 = j.a.f6156a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j j1Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i15 = a.f6079b;
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountZzb = j1Var.zzb();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.f6128h = accountZzb;
        } else {
            this.f6125e = iBinder;
            this.f6128h = account;
        }
        this.f6126f = scopeArr;
        this.f6127g = bundle;
        this.f6129j = cVarArr;
        this.f6130k = cVarArr2;
        this.f6131l = z10;
        this.f6132m = i13;
        this.f6133n = z11;
        this.f6134p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b1.a(this, parcel, i10);
    }
}
