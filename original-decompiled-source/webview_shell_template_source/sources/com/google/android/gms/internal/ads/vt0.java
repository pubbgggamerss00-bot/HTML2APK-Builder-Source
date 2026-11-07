package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vt0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f9932a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9933b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9934c;

    /* renamed from: d, reason: collision with root package name */
    public final rc0 f9935d;

    /* renamed from: e, reason: collision with root package name */
    public final qi0 f9936e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f9937f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f9938g;

    public vt0(oc0 oc0Var, w92 w92Var, w92 w92Var2, rc0 rc0Var, qi0 qi0Var, w92 w92Var3, x92 x92Var) {
        this.f9932a = oc0Var;
        this.f9933b = w92Var;
        this.f9934c = w92Var2;
        this.f9935d = rc0Var;
        this.f9936e = qi0Var;
        this.f9937f = w92Var3;
        this.f9938g = x92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.f9932a).a();
        oc1 oc1Var = (oc1) this.f9933b.zzb();
        cu0 cu0Var = (cu0) this.f9934c.zzb();
        ac1 ac1Var = (ac1) ((androidx.camera.view.b) this.f9935d.f8608b).f674t;
        ih1.j(ac1Var);
        return new ut0(contextA, oc1Var, cu0Var, ac1Var, this.f9936e.a(), (dz0) this.f9937f.zzb(), (String) this.f9938g.zzb());
    }
}
