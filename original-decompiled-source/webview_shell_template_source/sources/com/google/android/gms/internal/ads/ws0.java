package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ws0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10263a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10264b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10265c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f10266d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f10267e;

    public ws0(h61 h61Var, w92 w92Var, w92 w92Var2, w92 w92Var3) {
        this.f10263a = 2;
        this.f10265c = h61Var;
        this.f10264b = w92Var;
        this.f10266d = w92Var2;
        this.f10267e = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10263a) {
            case 0:
                ae1 ae1Var = (ae1) ((w92) this.f10264b).zzb();
                hs1 hs1Var = (hs1) this.f10265c.zzb();
                th0 th0Var = (th0) this.f10266d;
                return new o31(ae1Var, hs1Var, ((rj0) this.f10267e).a(), new w21((Context) ((w92) th0Var.f9284c).zzb(), (us0) ((y92) th0Var.f9283b).f10908a));
            case 1:
                return new u31((ae1) ((w92) this.f10264b).zzb(), (hs1) this.f10265c.zzb(), (to) ((v31) ((cd0) this.f10266d).f3521b).f9702t, new x31((go0) ((y31) this.f10267e).f10825b.f10908a));
            default:
                f61 f61VarZzb = ((h61) this.f10265c).zzb();
                n61 n61Var = (n61) this.f10264b.zzb();
                List list = (List) this.f10266d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10267e.zzb();
                if (list.contains("13")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.hc)).intValue(), scheduledExecutorService);
                }
                return new s71(f61VarZzb, ((Integer) zzbe.zzc().a(zn.hc)).intValue(), scheduledExecutorService);
        }
    }

    public /* synthetic */ ws0(w92 w92Var, w92 w92Var2, x92 x92Var, x92 x92Var2, int i6) {
        this.f10263a = i6;
        this.f10264b = w92Var;
        this.f10265c = w92Var2;
        this.f10266d = x92Var;
        this.f10267e = x92Var2;
    }
}
