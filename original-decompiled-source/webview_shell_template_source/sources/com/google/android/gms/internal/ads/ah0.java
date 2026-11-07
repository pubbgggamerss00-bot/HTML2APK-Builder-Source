package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ah0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2754a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f2755b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f2756c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f2757d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f2758e;

    public ah0(oc0 oc0Var, w92 w92Var, ca2 ca2Var, w92 w92Var2) {
        this.f2754a = 1;
        this.f2757d = oc0Var;
        this.f2755b = w92Var;
        this.f2756c = ca2Var;
        this.f2758e = w92Var2;
    }

    public a21 a() {
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new a21(h70Var, (ScheduledExecutorService) this.f2756c.zzb(), (wi0) ((w92) this.f2755b).zzb(), (n21) ((w92) this.f2757d).zzb(), (af1) ((w92) this.f2758e).zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2754a) {
            case 0:
                ae1 ae1Var = (ae1) ((w92) this.f2755b).zzb();
                hs1 hs1Var = (hs1) this.f2756c.zzb();
                x50 x50Var = (x50) this.f2757d;
                return new o31(ae1Var, hs1Var, ((rj0) this.f2758e).a(), new o01((Context) x50Var.f10385b.zzb(), (yg0) x50Var.f10386c.f10908a));
            case 1:
                return new oz0(((oc0) this.f2757d).a(), (dz0) ((w92) this.f2755b).zzb(), (zzu) this.f2756c.zzb(), (cu0) ((w92) this.f2758e).zzb());
            case 2:
                return a();
            default:
                f71 f71VarZzb = ((h71) this.f2756c).zzb();
                n61 n61Var = (n61) this.f2755b.zzb();
                List list = (List) this.f2757d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f2758e.zzb();
                if (list.contains("60")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.Hc)).intValue(), scheduledExecutorService);
                }
                return new s71(f71VarZzb, ((Integer) zzbe.zzc().a(zn.Hc)).intValue(), scheduledExecutorService);
        }
    }

    public ah0(w92 w92Var, w92 w92Var2, x50 x50Var, rj0 rj0Var) {
        this.f2754a = 0;
        this.f2755b = w92Var;
        this.f2756c = w92Var2;
        this.f2757d = x50Var;
        this.f2758e = rj0Var;
    }

    public /* synthetic */ ah0(ca2 ca2Var, w92 w92Var, w92 w92Var2, w92 w92Var3, int i6) {
        this.f2754a = i6;
        this.f2756c = ca2Var;
        this.f2755b = w92Var;
        this.f2757d = w92Var2;
        this.f2758e = w92Var3;
    }
}
