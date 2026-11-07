package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final b70 f5617a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5618b;

    /* renamed from: c, reason: collision with root package name */
    public final hs1 f5619c;

    public i91(b70 b70Var, ScheduledExecutorService scheduledExecutorService, hs1 hs1Var) {
        this.f5617a = b70Var;
        this.f5618b = scheduledExecutorService;
        this.f5619c = hs1Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        if (((Boolean) zzbe.zzc().a(zn.X2)).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.f11369c3)).booleanValue()) {
                v3.p pVar = new v3.p();
                pVar.j(null);
                dk1 dk1VarA = ek1.a(pVar);
                ye0 ye0Var = new ye0(3);
                hs1 hs1Var = this.f5619c;
                c5.a aVarP = bs1.p(dk1VarA, ye0Var, hs1Var);
                if (((Boolean) gp.f5099a.c()).booleanValue()) {
                    aVarP = bs1.q(aVarP, ((Long) gp.f5100b.c()).longValue(), TimeUnit.MILLISECONDS, this.f5618b);
                }
                return bs1.j(aVarP, Exception.class, new ta1(5, this), hs1Var);
            }
        }
        return bs1.m(new x51(null, -1, 1));
    }
}
