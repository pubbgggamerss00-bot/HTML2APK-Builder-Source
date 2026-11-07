package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vk0 extends pm0 implements sk0 {

    /* renamed from: t, reason: collision with root package name */
    public final ScheduledExecutorService f9889t;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledFuture f9890u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9891v;

    public vk0(uk0 uk0Var, Set set, h70 h70Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f9891v = false;
        this.f9889t = scheduledExecutorService;
        l0(uk0Var, h70Var);
    }

    @Override // com.google.android.gms.internal.ads.sk0
    public final void c(zze zzeVar) {
        o0(new tk0(0, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.sk0
    public final void v(io0 io0Var) {
        if (this.f9891v) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f9890u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        o0(new ej0(5, io0Var));
    }

    @Override // com.google.android.gms.internal.ads.sk0
    public final void zzb() {
        o0(new ed0(16));
    }

    public final void zzf() {
        this.f9890u = this.f9889t.schedule(new t(8, this), ((Integer) zzbe.zzc().a(zn.Ba)).intValue(), TimeUnit.MILLISECONDS);
    }
}
