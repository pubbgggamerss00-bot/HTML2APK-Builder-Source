package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ei1 implements b.a, b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final qi1 f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final li1 f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4301c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f4302d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4303e = false;

    public ei1(Context context, Looper looper, li1 li1Var) {
        this.f4300b = li1Var;
        this.f4299a = new qi1(context, looper, this, this, 12800000);
    }

    public final void a() {
        synchronized (this.f4301c) {
            try {
                if (this.f4299a.isConnected() || this.f4299a.isConnecting()) {
                    this.f4299a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        synchronized (this.f4301c) {
            try {
                if (this.f4303e) {
                    return;
                }
                this.f4303e = true;
                try {
                    vi1 vi1Var = (vi1) this.f4299a.getService();
                    oi1 oi1Var = new oi1(1, this.f4300b.i());
                    Parcel parcelZza = vi1Var.zza();
                    th.c(parcelZza, oi1Var);
                    vi1Var.zzda(2, parcelZza);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    a();
                    throw th;
                }
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) {
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) {
    }
}
