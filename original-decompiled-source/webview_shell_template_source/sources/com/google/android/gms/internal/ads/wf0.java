package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wf0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10189a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10190b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10191c;

    /* renamed from: d, reason: collision with root package name */
    public final w92 f10192d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f10193e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f10194f;

    /* renamed from: g, reason: collision with root package name */
    public final ca2 f10195g;

    public wf0(oc0 oc0Var, lc0 lc0Var, w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4) {
        this.f10190b = oc0Var;
        this.f10191c = lc0Var;
        this.f10192d = w92Var;
        this.f10195g = w92Var2;
        this.f10193e = w92Var3;
        this.f10194f = w92Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10189a) {
            case 0:
                Context contextA = ((oc0) this.f10190b).a();
                zzj zzjVarZzb = ((lc0) this.f10191c).zzb();
                wz0 wz0Var = (wz0) this.f10192d.zzb();
                it0 it0Var = (it0) ((w92) this.f10195g).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new vf0(contextA, zzjVarZzb, wz0Var, it0Var, h70Var, (hs1) this.f10193e.zzb(), (ScheduledExecutorService) this.f10194f.zzb());
            default:
                hc0 hc0Var = (hc0) this.f10190b.zzb();
                ik0 ik0VarA = ((jk0) ((qi0) this.f10193e).f8393b).a();
                rm0 rm0Var = ((tm0) this.f10194f).f9347b;
                ro0 ro0Var = (ro0) ((ad0) this.f10195g).f2655b;
                wl0 wl0VarZzb = ((eh0) this.f10191c).zzb();
                n21 n21Var = (n21) this.f10192d.zzb();
                pd0 pd0VarF = hc0Var.f();
                pd0VarF.f8033w = new jk0(ik0VarA);
                pd0VarF.f8032v = rm0Var;
                pd0VarF.B = ro0Var;
                pd0VarF.f8034x = new v31(0, null);
                pd0VarF.f8035y = new ni0(0, wl0VarZzb, null);
                pd0VarF.A = new dh0(0, null);
                if (((Boolean) zzbe.zzc().a(zn.K3)).booleanValue()) {
                    xj0 xj0Var = new xj0(false);
                    xj0Var.f10617t = n21Var;
                    pd0VarF.f8036z = xj0Var;
                }
                wi0 wi0Var = (wi0) pd0VarF.zzh().M.zzb();
                ih1.j(wi0Var);
                return wi0Var;
        }
    }

    public wf0(y92 y92Var, qi0 qi0Var, tm0 tm0Var, ad0 ad0Var, eh0 eh0Var, w92 w92Var) {
        this.f10190b = y92Var;
        this.f10193e = qi0Var;
        this.f10194f = tm0Var;
        this.f10195g = ad0Var;
        this.f10191c = eh0Var;
        this.f10192d = w92Var;
    }
}
