package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gf0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5024a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5025b;

    public gf0(bq bqVar, w92 w92Var) {
        this.f5024a = 4;
        this.f5025b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Object rp1Var;
        int i6 = this.f5024a;
        ga2 ga2Var = this.f5025b;
        switch (i6) {
            case 0:
                return new ff0(((oc0) ga2Var).a());
            case 1:
                return new lf0((sv0) ga2Var.zzb());
            case 2:
                final wl0 wl0Var = (wl0) ((oi0) ga2Var).f7778a.f7447t;
                return new kn0(new dm0() { // from class: com.google.android.gms.internal.ads.kh0
                    @Override // com.google.android.gms.internal.ads.dm0
                    public final void zza() {
                        wl0Var.zza();
                    }
                }, i70.f5592g);
            case 3:
                kn0 kn0Var = new kn0((kj0) ga2Var.zzb(), i70.f5592g);
                int i7 = go1.f5097u;
                return new rp1(kn0Var);
            case 4:
                ku0 ku0Var = (ku0) ga2Var.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setI = bq.i(ku0Var, h70Var);
                ih1.j(setI);
                return setI;
            case 5:
                Context contextA = ((oc0) ga2Var).a();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new cx0(contextA, h70Var2);
            case 6:
                return new z31((mt0) ga2Var.zzb());
            case 7:
                return new t41(1, ((lk0) ga2Var).a());
            default:
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                p61 p61Var = new p61(h70Var3);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ga2Var.zzb();
                if (((Boolean) zzbe.zzc().a(zn.g4)).booleanValue()) {
                    s71 s71Var = new s71(p61Var, ((Integer) zzbe.zzc().a(zn.f11405h4)).intValue(), scheduledExecutorService);
                    int i8 = go1.f5097u;
                    rp1Var = new rp1(s71Var);
                } else {
                    int i9 = go1.f5097u;
                    rp1Var = jp1.B;
                }
                ih1.j(rp1Var);
                return rp1Var;
        }
    }

    public /* synthetic */ gf0(ca2 ca2Var, int i6) {
        this.f5024a = i6;
        this.f5025b = ca2Var;
    }
}
