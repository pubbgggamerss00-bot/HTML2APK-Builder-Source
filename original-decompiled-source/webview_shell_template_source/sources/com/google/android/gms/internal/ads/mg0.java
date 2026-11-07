package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mg0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7144a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f7145b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7146c;

    /* renamed from: d, reason: collision with root package name */
    public final ca2 f7147d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7148e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f7149f;

    public mg0(oc0 oc0Var, bd0 bd0Var, qi0 qi0Var, x92 x92Var, w92 w92Var) {
        this.f7145b = oc0Var;
        this.f7146c = bd0Var;
        this.f7147d = qi0Var;
        this.f7148e = x92Var;
        this.f7149f = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7144a) {
            case 0:
                return new lg0((rx) ((w92) this.f7147d).zzb(), (hg0) ((w92) this.f7148e).zzb(), (Executor) this.f7145b.zzb(), (gg0) ((w92) this.f7149f).zzb(), (i3.a) this.f7146c.zzb());
            case 1:
                return new uz0(((oc0) this.f7145b).a(), ((bd0) this.f7146c).a(), ((qi0) this.f7147d).a(), (xa0) ((x92) this.f7148e).zzb(), (cu0) this.f7149f.zzb());
            default:
                i3.a aVar = (i3.a) this.f7145b.zzb();
                mn0 mn0Var = (mn0) this.f7149f;
                wv0 wv0Var = new wv0((oc1) mn0Var.f7191b.zzb(), (lt0) mn0Var.f7192c.zzb(), (cu0) mn0Var.f7193d.zzb());
                e01 e01Var = (e01) ((w92) this.f7147d).zzb();
                cf1 cf1Var = (cf1) this.f7146c.zzb();
                n21 n21Var = (n21) ((xj0) this.f7148e).f10617t;
                return n21Var != null ? n21Var : new n21(aVar, wv0Var, e01Var, cf1Var);
        }
    }

    public mg0(xj0 xj0Var, w92 w92Var, mn0 mn0Var, w92 w92Var2, w92 w92Var3) {
        this.f7148e = xj0Var;
        this.f7145b = w92Var;
        this.f7149f = mn0Var;
        this.f7147d = w92Var2;
        this.f7146c = w92Var3;
    }

    public mg0(w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4, w92 w92Var5) {
        this.f7147d = w92Var;
        this.f7148e = w92Var2;
        this.f7145b = w92Var3;
        this.f7149f = w92Var4;
        this.f7146c = w92Var5;
    }
}
