package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final b70 f8854a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8855b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8856c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f8857d;

    /* renamed from: e, reason: collision with root package name */
    public final hs1 f8858e;

    public s91(b70 b70Var, boolean z6, boolean z7, hs1 hs1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f8854a = b70Var;
        this.f8855b = z6;
        this.f8856c = z7;
        this.f8858e = hs1Var;
        this.f8857d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        if (((Boolean) zzbe.zzc().a(zn.Q6)).booleanValue() && this.f8856c) {
            return bs1.m(new f51(null, 2));
        }
        if (!this.f8855b) {
            return bs1.m(new f51(null, 2));
        }
        ds1 ds1Var = ds1.f4001t;
        a6 a6Var = new a6(4);
        hs1 hs1Var = this.f8858e;
        return bs1.j(bs1.q(bs1.o(ds1Var, a6Var, hs1Var), ((Long) eq.f4369b.c()).longValue(), TimeUnit.MILLISECONDS, this.f8857d), Exception.class, new m30(1, this), hs1Var);
    }
}
