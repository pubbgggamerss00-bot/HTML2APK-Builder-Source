package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ji0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6071a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final x92 f6072b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6073c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f6074d;

    /* renamed from: e, reason: collision with root package name */
    public final x92 f6075e;

    /* renamed from: f, reason: collision with root package name */
    public final ca2 f6076f;

    public ji0(oc0 oc0Var, nh0 nh0Var, qi0 qi0Var, bd0 bd0Var, w92 w92Var) {
        this.f6073c = oc0Var;
        this.f6075e = nh0Var;
        this.f6072b = qi0Var;
        this.f6074d = bd0Var;
        this.f6076f = w92Var;
    }

    public mk0 a() {
        return new mk0(((qi0) this.f6072b).a(), (String) ((androidx.camera.view.b) ((pc0) this.f6075e).f8025b).f676v, (e01) this.f6073c.zzb(), ((androidx.camera.view.b) ((qc0) this.f6076f).f8305b).a(), (String) this.f6074d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6071a) {
            case 0:
                return new ii0(((oc0) this.f6073c).a(), ((nh0) this.f6075e).f7444b.f6734d, ((qi0) this.f6072b).a(), ((bd0) this.f6074d).a(), (uz0) ((w92) this.f6076f).zzb());
            case 1:
                return a();
            default:
                t60 t60Var = new t60();
                Context contextA = ((oc0) this.f6073c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6074d.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new f91(t60Var, contextA, scheduledExecutorService, h70Var, ((q91) ((ad0) this.f6075e).f2655b).f8280b, ((q91) ((cd0) this.f6072b).f3521b).f8279a.D, ((q91) ((qi0) this.f6076f).f8393b).f8279a.C);
        }
    }

    public ji0(oc0 oc0Var, w92 w92Var, ad0 ad0Var, cd0 cd0Var, qi0 qi0Var) {
        this.f6073c = oc0Var;
        this.f6074d = w92Var;
        this.f6075e = ad0Var;
        this.f6072b = cd0Var;
        this.f6076f = qi0Var;
    }

    public ji0(qi0 qi0Var, pc0 pc0Var, w92 w92Var, qc0 qc0Var, w92 w92Var2) {
        this.f6072b = qi0Var;
        this.f6075e = pc0Var;
        this.f6073c = w92Var;
        this.f6076f = qc0Var;
        this.f6074d = w92Var2;
    }
}
