package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ph0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8071a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f8072b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8073c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f8074d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f8075e;

    public ph0(pc0 pc0Var, pc0 pc0Var2, qc0 qc0Var, w92 w92Var) {
        this.f8071a = 2;
        this.f8073c = pc0Var;
        this.f8074d = pc0Var2;
        this.f8075e = qc0Var;
        this.f8072b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8071a) {
            case 0:
                return new kn0(new jh0((Context) this.f8072b.zzb(), ((bd0) this.f8073c).a(), ((qi0) this.f8075e).a(), ((lk0) this.f8074d).a()), i70.f5592g);
            case 1:
                ae1 ae1Var = (ae1) ((w92) this.f8073c).zzb();
                hs1 hs1Var = (hs1) this.f8072b.zzb();
                xc0 xc0Var = (xc0) this.f8074d;
                return new o31(ae1Var, hs1Var, ((rj0) this.f8075e).a(), new q11((Context) ((w92) xc0Var.f10492b).zzb(), (go0) ((y92) xc0Var.f10493c).f10908a));
            case 2:
                return new wr0((String) ((androidx.camera.view.b) ((pc0) this.f8073c).f8025b).f676v, (fp0) ((pc0) this.f8074d).zzb(), ((qc0) this.f8075e).a(), (cu0) this.f8072b.zzb());
            case 3:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                zzu zzuVar = (zzu) this.f8072b.zzb();
                CsiParamDefaults csiParamDefaultsZzb = ((CsiParamDefaults_Factory) this.f8073c).zzb();
                fu0 fu0Var = new fu0(h70Var, zzuVar, ((CsiUrlBuilder_Factory) this.f8074d).zzb(), ((oc0) this.f8075e).a());
                csiParamDefaultsZzb.set(fu0Var.f5483a);
                return fu0Var;
            default:
                k81 k81VarZzb = ((m81) this.f8072b).zzb();
                n61 n61Var = (n61) this.f8073c.zzb();
                List list = (List) this.f8074d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8075e.zzb();
                if (list.contains("35")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.Wb)).intValue(), scheduledExecutorService);
                }
                return new s71(k81VarZzb, ((Integer) zzbe.zzc().a(zn.Wb)).intValue(), scheduledExecutorService);
        }
    }

    public ph0(lh0 lh0Var, w92 w92Var, bd0 bd0Var, qi0 qi0Var, lk0 lk0Var) {
        this.f8071a = 0;
        this.f8072b = w92Var;
        this.f8073c = bd0Var;
        this.f8075e = qi0Var;
        this.f8074d = lk0Var;
    }

    public ph0(w92 w92Var, w92 w92Var2, xc0 xc0Var, rj0 rj0Var) {
        this.f8071a = 1;
        this.f8073c = w92Var;
        this.f8072b = w92Var2;
        this.f8074d = xc0Var;
        this.f8075e = rj0Var;
    }

    public /* synthetic */ ph0(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, ca2 ca2Var4, int i6) {
        this.f8071a = i6;
        this.f8072b = ca2Var;
        this.f8073c = ca2Var2;
        this.f8074d = ca2Var3;
        this.f8075e = ca2Var4;
    }
}
