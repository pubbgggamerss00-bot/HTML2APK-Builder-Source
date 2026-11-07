package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pe0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8050a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f8051b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8052c;

    public pe0(w92 w92Var, z92 z92Var) {
        this.f8050a = 5;
        this.f8052c = w92Var;
        this.f8051b = z92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        View view;
        switch (this.f8050a) {
            case 0:
                return new ro0(((z92) this.f8051b).zzb(), ((z92) this.f8052c).zzb());
            case 1:
                return new kn0((bm0) ((w92) this.f8051b).zzb(), (Executor) this.f8052c.zzb());
            case 2:
                tb1 tb1VarA = ((qi0) this.f8052c).a();
                new d0(14);
                return new ak0(tb1VarA);
            case 3:
                fp0 fp0Var = (fp0) ((pc0) this.f8051b).zzb();
                jp0 jp0VarA = ((qc0) this.f8052c).a();
                sr0 sr0Var = new sr0("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (jp0VarA) {
                    view = jp0VarA.f6136o;
                }
                sr0Var.s = view;
                sr0Var.f8994t = jp0VarA.i();
                sr0Var.f8995u = fp0Var;
                sr0Var.f8996v = false;
                sr0Var.f8997w = false;
                if (jp0VarA.m() != null) {
                    jp0VarA.m().P(sr0Var);
                }
                return sr0Var;
            case 4:
                return new ps0((fl0) ((w92) this.f8051b).zzb(), ((qi0) this.f8052c).a());
            case 5:
                return new st0((kk) this.f8052c.zzb(), ((z92) this.f8051b).zzb());
            case 6:
                return new x01((Context) ((w92) this.f8051b).zzb(), (wh0) ((y92) this.f8052c).f10908a);
            case 7:
                c51 c51Var = (c51) this.f8051b;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                ec1 ec1VarA = ((lk0) c51Var.f3412b).a();
                return new s71(new a51(h70Var, ec1VarA), ((Integer) zzbe.zzc().a(zn.kc)).intValue(), (ScheduledExecutorService) this.f8052c.zzb());
            case 8:
                ue0 ue0Var = (ue0) this.f8051b;
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new s71(new b71(h70Var2, ((lk0) ue0Var.f9545b).a()), ((Integer) zzbe.zzc().a(zn.qc)).intValue(), (ScheduledExecutorService) this.f8052c.zzb());
            default:
                return new s71(((t61) this.f8051b).a(), ((Integer) zzbe.zzc().a(zn.Yb)).intValue(), (ScheduledExecutorService) this.f8052c.zzb());
        }
    }

    public /* synthetic */ pe0(ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f8050a = i6;
        this.f8051b = ca2Var;
        this.f8052c = ca2Var2;
    }
}
