package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oo0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final jj0 f7822a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f7823b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7824c;

    /* renamed from: d, reason: collision with root package name */
    public final co0 f7825d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f7826e;

    public oo0(jj0 jj0Var, oc0 oc0Var, w92 w92Var, co0 co0Var, x92 x92Var) {
        this.f7822a = jj0Var;
        this.f7823b = oc0Var;
        this.f7824c = w92Var;
        this.f7825d = co0Var;
        this.f7826e = x92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        jj0 jj0Var = this.f7822a;
        z50 z50Var = new z50(((oc0) jj0Var.f6084b).a(), ((lk0) jj0Var.f6085c).a().f4211f);
        Context contextA = ((oc0) this.f7823b).a();
        b60 b60Var = (b60) this.f7824c.zzb();
        xa0 xa0Var = this.f7825d.f3628b.f3235b;
        return new no0(z50Var, contextA, b60Var, xa0Var == null ? null : xa0Var.u(), (ok) this.f7826e.zzb());
    }
}
