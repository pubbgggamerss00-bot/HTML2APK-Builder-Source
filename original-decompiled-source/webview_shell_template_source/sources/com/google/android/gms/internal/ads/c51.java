package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c51 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3411a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3412b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f3413c;

    public /* synthetic */ c51(ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f3411a = i6;
        this.f3412b = ca2Var;
        this.f3413c = ca2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f3411a) {
            case 0:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                ec1 ec1VarA = ((lk0) this.f3412b).a();
                return new a51(h70Var, ec1VarA);
            case 1:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new q51(h70Var2, ((lk0) this.f3412b).a(), ((dd0) this.f3413c).zzb());
            case 2:
                return new s71((n61) this.f3412b.zzb(), ((Integer) zzbe.zzc().a(zn.Ub)).intValue(), (ScheduledExecutorService) this.f3413c.zzb());
            default:
                new bq(17, (byte) 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3412b.zzb();
                ((oc0) this.f3413c).a();
                return new p91(scheduledExecutorService);
        }
    }
}
