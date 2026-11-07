package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ai0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final ca2 f2776c;

    /* renamed from: d, reason: collision with root package name */
    public final x92 f2777d;

    /* renamed from: e, reason: collision with root package name */
    public final ca2 f2778e;

    public ai0(oc0 oc0Var, qc0 qc0Var, vp0 vp0Var, pc0 pc0Var) {
        this.f2774a = 2;
        this.f2775b = oc0Var;
        this.f2776c = qc0Var;
        this.f2777d = vp0Var;
        this.f2778e = pc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2774a) {
            case 0:
                ae1 ae1Var = (ae1) ((w92) this.f2776c).zzb();
                hs1 hs1Var = (hs1) this.f2775b.zzb();
                pe0 pe0Var = (pe0) this.f2777d;
                return new o31(ae1Var, hs1Var, ((rj0) this.f2778e).a(), new x01((Context) ((w92) pe0Var.f8051b).zzb(), (wh0) ((y92) pe0Var.f8052c).f10908a));
            case 1:
                ct0 ct0Var = (ct0) this.f2775b.zzb();
                gs0 gs0Var = (gs0) ((j00) ((cd0) this.f2777d).f3521b).f5892u;
                ih1.j(gs0Var);
                sg0 sg0Var = (sg0) ((w92) this.f2776c).zzb();
                yo0 yo0Var = (yo0) ((sc0) this.f2778e).f8893b.zzb();
                ih1.j(yo0Var);
                return new bq0(ct0Var, gs0Var, sg0Var, yo0Var);
            case 2:
                return new vr0(((oc0) this.f2775b).a(), ((qc0) this.f2776c).a(), ((vp0) this.f2777d).a(), (fp0) ((pc0) this.f2778e).zzb());
            default:
                return new qf1((zf1) ((w92) this.f2776c).zzb(), new mf1((cu0) ((vc0) this.f2775b).f9807b.zzb()), ((oc0) this.f2777d).a(), (i3.a) ((w92) this.f2778e).zzb());
        }
    }

    public ai0(w92 w92Var, cd0 cd0Var, w92 w92Var2, sc0 sc0Var) {
        this.f2774a = 1;
        this.f2775b = w92Var;
        this.f2777d = cd0Var;
        this.f2776c = w92Var2;
        this.f2778e = sc0Var;
    }

    public /* synthetic */ ai0(w92 w92Var, ca2 ca2Var, x92 x92Var, ca2 ca2Var2, int i6) {
        this.f2774a = i6;
        this.f2776c = w92Var;
        this.f2775b = ca2Var;
        this.f2777d = x92Var;
        this.f2778e = ca2Var2;
    }
}
