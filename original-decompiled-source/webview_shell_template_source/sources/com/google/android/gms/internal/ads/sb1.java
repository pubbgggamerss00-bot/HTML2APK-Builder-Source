package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sb1 {

    /* renamed from: a, reason: collision with root package name */
    public final i3.a f8884a;

    /* renamed from: b, reason: collision with root package name */
    public final cu0 f8885b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8886c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f8888e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f8887d = 0;

    public sb1(i3.a aVar, cu0 cu0Var) {
        this.f8884a = aVar;
        this.f8885b = cu0Var;
    }

    public final void a(boolean z6) {
        if (((Boolean) zzbe.zzc().a(zn.Sc)).booleanValue()) {
            bu0 bu0VarA = this.f8885b.a();
            bu0VarA.a("action", "mbs_state");
            bu0VarA.a("mbs_state", true != z6 ? "0" : "1");
            bu0VarA.c();
        }
        if (z6) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        long jA = this.f8884a.a();
        synchronized (this.f8886c) {
            try {
                if (this.f8888e == 3) {
                    if (this.f8887d + ((Long) zzbe.zzc().a(zn.P5)).longValue() <= jA) {
                        this.f8888e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i6, int i7) {
        b();
        Object obj = this.f8886c;
        long jA = this.f8884a.a();
        synchronized (obj) {
            try {
                if (this.f8888e != i6) {
                    return;
                }
                this.f8888e = i7;
                if (this.f8888e == 3) {
                    this.f8887d = jA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
