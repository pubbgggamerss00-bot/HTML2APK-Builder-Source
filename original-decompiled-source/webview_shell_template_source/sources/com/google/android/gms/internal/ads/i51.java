package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i51 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5563a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5564b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f5565c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f5566d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f5567e;

    public i51(w92 w92Var, w92 w92Var2, ca2 ca2Var, x92 x92Var) {
        this.f5563a = 2;
        this.f5566d = w92Var;
        this.f5564b = w92Var2;
        this.f5565c = ca2Var;
        this.f5567e = x92Var;
    }

    public o31 a() {
        return new o31((ae1) ((w92) this.f5566d).zzb(), (hs1) this.f5564b.zzb(), (a01) this.f5565c.zzb(), (f01) ((x92) this.f5567e).zzb());
    }

    public g51 b() {
        return new g51((n61) this.f5564b.zzb(), ((lk0) this.f5565c).a(), ((oc0) this.f5566d).a(), (b70) this.f5567e.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f5563a) {
            case 0:
                return b();
            case 1:
                t51 t51VarZzb = ((v51) this.f5564b).zzb();
                n61 n61Var = (n61) this.f5565c.zzb();
                List list = (List) this.f5566d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f5567e.zzb();
                if (list.contains("10")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.Zb)).intValue(), scheduledExecutorService);
                }
                return new s71(t51VarZzb, ((Integer) zzbe.zzc().a(zn.Zb)).intValue(), scheduledExecutorService);
            default:
                return a();
        }
    }

    public /* synthetic */ i51(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, w92 w92Var, int i6) {
        this.f5563a = i6;
        this.f5564b = ca2Var;
        this.f5565c = ca2Var2;
        this.f5566d = ca2Var3;
        this.f5567e = w92Var;
    }
}
