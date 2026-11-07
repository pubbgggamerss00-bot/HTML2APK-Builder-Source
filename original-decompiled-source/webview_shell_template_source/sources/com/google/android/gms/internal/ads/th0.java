package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class th0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9282a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9283b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9284c;

    public th0(w92 w92Var, y92 y92Var) {
        this.f9282a = 4;
        this.f9283b = w92Var;
        this.f9284c = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9282a) {
            case 0:
                return new s71(((li0) this.f9284c).a(), ((Integer) zzbe.zzc().a(zn.nc)).intValue(), (ScheduledExecutorService) this.f9283b.zzb());
            case 1:
                return new ei0(((nh0) this.f9284c).f7444b.f6734d, (Executor) this.f9283b.zzb());
            case 2:
                String str = (String) this.f9283b.zzb();
                e01 e01Var = ((jk0) this.f9284c).f6100f;
                return e01Var != null ? e01Var : new e01(str);
            case 3:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new wq0(h70Var, ((hr0) this.f9284c).zzb(), new kr0(h70Var, ((hr0) ((rc0) this.f9283b).f8608b).zzb()));
            case 4:
                return new qt0((kk) this.f9283b.zzb(), (cb1) ((y92) this.f9284c).f10908a);
            case 5:
                return new ru0((su0) ((y92) this.f9284c).f10908a, new qu0((uu) ((y92) ((qi0) this.f9283b).f8393b).f10908a));
            case 6:
                my0 my0Var = (my0) ((w92) this.f9284c).zzb();
                rg0 rg0Var = (rg0) this.f9283b;
                return new uy0(my0Var, new oy0(((ky0) rg0Var.f8629b).zzb(), ((lc0) rg0Var.f8630c).zzb(), 6, false));
            case 7:
                return new w21((Context) ((w92) this.f9284c).zzb(), (us0) ((y92) this.f9283b).f10908a);
            case 8:
                Context contextA = ((oc0) ((bi0) this.f9284c).f3184b).a();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new s71(new x61(contextA, h70Var2), ((Integer) zzbe.zzc().a(zn.ec)).intValue(), (ScheduledExecutorService) this.f9283b.zzb());
            default:
                return new s71(new n71(0, (sb1) ((ue0) this.f9284c).f9545b.zzb()), ((Integer) zzbe.zzc().a(zn.rc)).intValue(), (ScheduledExecutorService) this.f9283b.zzb());
        }
    }

    public /* synthetic */ th0(Object obj, ca2 ca2Var, int i6) {
        this.f9282a = i6;
        this.f9284c = obj;
        this.f9283b = ca2Var;
    }
}
