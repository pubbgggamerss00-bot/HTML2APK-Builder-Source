package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final c5.a f4123a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4124b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f4125c;

    public e51(c5.a aVar, h70 h70Var, ScheduledExecutorService scheduledExecutorService) {
        this.f4123a = aVar;
        this.f4124b = h70Var;
        this.f4125c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        sw0 sw0Var = new sw0(3);
        c5.a aVar = this.f4123a;
        Executor executor = this.f4124b;
        c5.a aVarP = bs1.p(aVar, sw0Var, executor);
        if (((Integer) zzbe.zzc().a(zn.pc)).intValue() > 0) {
            aVarP = bs1.q(aVarP, ((Integer) zzbe.zzc().a(r1)).intValue(), TimeUnit.MILLISECONDS, this.f4125c);
        }
        return bs1.k(aVarP, Throwable.class, new cr0(2), executor);
    }
}
