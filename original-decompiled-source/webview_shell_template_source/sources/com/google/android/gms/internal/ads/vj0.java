package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9879a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9880b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9881c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9882d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f9883e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f9884f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f9885g;

    public /* synthetic */ vj0(x92 x92Var, x92 x92Var2, x92 x92Var3, x92 x92Var4, w92 w92Var, w92 w92Var2, int i6) {
        this.f9879a = i6;
        this.f9880b = x92Var;
        this.f9881c = x92Var2;
        this.f9882d = x92Var3;
        this.f9883e = x92Var4;
        this.f9884f = w92Var;
        this.f9885g = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9879a) {
            case 0:
                return new uj0(((oc0) this.f9880b).a(), ((lk0) this.f9881c).a(), ((bd0) this.f9882d).a(), ((lc0) this.f9883e).zzb(), (fv0) this.f9884f.zzb(), (ie1) this.f9885g.zzb());
            case 1:
                return new i21((hc0) this.f9880b.zzb(), ((jk0) ((qi0) this.f9881c).f8393b).a(), (v31) ((af0) this.f9882d).f2738b, ((tm0) this.f9883e).f9347b, (n21) ((w92) this.f9884f).zzb(), (e01) ((w92) this.f9885g).zzb());
            default:
                return new mb1((Context) ((y92) this.f9882d).f10908a, (Executor) this.f9880b.zzb(), (hc0) this.f9881c.zzb(), ((pj0) this.f9883e).b(), (hb1) ((w92) this.f9884f).zzb(), new dc1(), (bc1) ((w92) this.f9885g).zzb());
        }
    }

    public vj0(y92 y92Var, w92 w92Var, y92 y92Var2, pj0 pj0Var, w92 w92Var2, w92 w92Var3) {
        this.f9879a = 2;
        this.f9882d = y92Var;
        this.f9880b = w92Var;
        this.f9881c = y92Var2;
        this.f9883e = pj0Var;
        this.f9884f = w92Var2;
        this.f9885g = w92Var3;
    }
}
