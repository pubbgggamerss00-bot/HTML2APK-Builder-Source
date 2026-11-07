package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yj0 implements pk0, dn0, fm0, xk0, bi {
    public final yk0 s;

    /* renamed from: t, reason: collision with root package name */
    public final tb1 f11001t;

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledExecutorService f11002u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f11003v;

    /* renamed from: x, reason: collision with root package name */
    public ScheduledFuture f11005x;

    /* renamed from: z, reason: collision with root package name */
    public final String f11007z;

    /* renamed from: w, reason: collision with root package name */
    public final ps1 f11004w = new ps1();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f11006y = new AtomicBoolean();

    public yj0(yk0 yk0Var, tb1 tb1Var, ScheduledExecutorService scheduledExecutorService, h70 h70Var, String str) {
        this.s = yk0Var;
        this.f11001t = tb1Var;
        this.f11002u = scheduledExecutorService;
        this.f11003v = h70Var;
        this.f11007z = str;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        if (((Boolean) zzbe.zzc().a(zn.pb)).booleanValue() && this.f11007z.equals("com.google.ads.mediation.admob.AdMobAdapter") && aiVar.f2772j && this.f11006y.compareAndSet(false, true) && this.f11001t.f9179e != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.s.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final synchronized void e(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.f11004w.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11005x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f11004w.f(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
        tb1 tb1Var = this.f11001t;
        if (tb1Var.f9179e == 3) {
            return;
        }
        int i6 = tb1Var.Y;
        if (i6 == 0 || i6 == 1) {
            if (((Boolean) zzbe.zzc().a(zn.pb)).booleanValue() && this.f11007z.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.s.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void zzj() {
        try {
            if (this.f11004w.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11005x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f11004w.e(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzk() {
        tb1 tb1Var = this.f11001t;
        int i6 = tb1Var.f9179e;
        int i7 = tb1Var.f9201q;
        if (i6 == 3) {
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.E1)).booleanValue() && tb1Var.Y == 2) {
            if (i7 == 0) {
                this.s.zza();
                return;
            }
            xj0 xj0Var = new xj0(0, this);
            ps1 ps1Var = this.f11004w;
            ps1Var.addListener(new as1(0, ps1Var, xj0Var), this.f11003v);
            this.f11005x = this.f11002u.schedule(new x(10, this), i7, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
    }
}
