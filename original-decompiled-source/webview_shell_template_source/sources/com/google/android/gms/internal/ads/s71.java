package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final q81 f8825a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8826b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f8827c;

    public s71(q81 q81Var, long j6, ScheduledExecutorService scheduledExecutorService) {
        this.f8825a = q81Var;
        this.f8826b = j6;
        this.f8827c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return this.f8825a.zza();
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        c5.a aVarZzb = this.f8825a.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) zzbe.zzc().a(zn.f11469r2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j6 = this.f8826b;
        if (j6 > 0) {
            aVarZzb = bs1.q(aVarZzb, j6, timeUnit, this.f8827c);
        }
        return bs1.k(aVarZzb, Throwable.class, new l50(3, this), i70.f5592g);
    }
}
