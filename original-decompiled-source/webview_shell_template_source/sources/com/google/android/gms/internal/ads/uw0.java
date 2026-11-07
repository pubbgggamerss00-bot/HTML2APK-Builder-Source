package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uw0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f9642a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9643b;

    /* renamed from: c, reason: collision with root package name */
    public final eo0 f9644c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9645d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f9646e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f9647f;

    public uw0(oc0 oc0Var, lk0 lk0Var, eo0 eo0Var, w92 w92Var, w92 w92Var2, w92 w92Var3) {
        this.f9642a = oc0Var;
        this.f9643b = lk0Var;
        this.f9644c = eo0Var;
        this.f9645d = w92Var;
        this.f9646e = w92Var2;
        this.f9647f = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.f9642a).a();
        ec1 ec1VarA = ((lk0) this.f9643b).a();
        kw0 kw0VarA = this.f9644c.a();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new tw0(contextA, ec1VarA, kw0VarA, h70Var, (ScheduledExecutorService) this.f9645d.zzb(), (my0) this.f9646e.zzb(), (he1) this.f9647f.zzb());
    }
}
