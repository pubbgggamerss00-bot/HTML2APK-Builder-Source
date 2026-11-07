package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dg0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f3916c;

    /* renamed from: d, reason: collision with root package name */
    public final rc0 f3917d;

    /* renamed from: e, reason: collision with root package name */
    public final qi0 f3918e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f3919f;

    /* renamed from: g, reason: collision with root package name */
    public final w92 f3920g;
    public final x92 h;

    /* renamed from: i, reason: collision with root package name */
    public final x92 f3921i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f3922j;

    /* renamed from: k, reason: collision with root package name */
    public final ga2 f3923k;

    /* renamed from: l, reason: collision with root package name */
    public final ga2 f3924l;

    /* renamed from: m, reason: collision with root package name */
    public final ga2 f3925m;

    public dg0(oc0 oc0Var, w92 w92Var, w92 w92Var2, rc0 rc0Var, qi0 qi0Var, w92 w92Var3, w92 w92Var4, x92 x92Var, x92 x92Var2, w92 w92Var5, w92 w92Var6, w92 w92Var7, kk0 kk0Var) {
        this.f3914a = oc0Var;
        this.f3915b = w92Var;
        this.f3916c = w92Var2;
        this.f3917d = rc0Var;
        this.f3918e = qi0Var;
        this.f3919f = w92Var3;
        this.f3920g = w92Var4;
        this.h = x92Var;
        this.f3921i = x92Var2;
        this.f3922j = w92Var5;
        this.f3923k = w92Var6;
        this.f3924l = w92Var7;
        this.f3925m = kk0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.f3914a).a();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        Executor executor = (Executor) this.f3915b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3916c.zzb();
        ac1 ac1Var = (ac1) ((androidx.camera.view.b) this.f3917d.f8608b).f674t;
        ih1.j(ac1Var);
        tb1 tb1VarA = this.f3918e.a();
        af1 af1Var = (af1) this.f3919f.zzb();
        kc1 kc1Var = (kc1) this.f3920g.zzb();
        View view = (View) this.h.zzb();
        xa0 xa0Var = (xa0) this.f3921i.zzb();
        mf mfVar = (mf) this.f3922j.zzb();
        cp cpVar = (cp) this.f3923k.zzb();
        new me0(14);
        return new cg0(contextA, h70Var, executor, scheduledExecutorService, ac1Var, tb1VarA, af1Var, kc1Var, view, xa0Var, mfVar, cpVar, ((kk0) this.f3925m).f6442a.f6099e);
    }
}
