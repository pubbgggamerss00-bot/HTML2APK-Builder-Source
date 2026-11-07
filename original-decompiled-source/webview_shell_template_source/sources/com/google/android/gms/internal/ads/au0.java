package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class au0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2847a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f2848b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f2849c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f2850d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f2851e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f2852f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f2853g;
    public final ga2 h;

    public au0(y92 y92Var, w92 w92Var, w92 w92Var2, w92 w92Var3, lk0 lk0Var, w92 w92Var4, w92 w92Var5) {
        this.f2852f = y92Var;
        this.f2848b = w92Var;
        this.f2849c = w92Var2;
        this.f2853g = w92Var3;
        this.f2850d = lk0Var;
        this.h = w92Var4;
        this.f2851e = w92Var5;
    }

    public r01 a() {
        return new r01((wh0) ((y92) this.f2852f).f10908a, (Context) this.f2848b.zzb(), (Executor) this.f2849c.zzb(), (ct0) ((w92) this.f2853g).zzb(), ((lk0) this.f2850d).a(), (pl1) ((w92) this.h).zzb(), (zt0) this.f2851e.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f2847a) {
            case 0:
                return new zt0(((oc0) this.f2849c).a(), (fu0) this.f2850d.zzb(), ((dd0) this.f2851e).zzb(), ((lk0) this.f2852f).a(), (String) this.f2848b.zzb(), (String) this.f2853g.zzb(), (zzk) this.h.zzb());
            default:
                return a();
        }
    }

    public au0(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3, lk0 lk0Var, w92 w92Var, ca2 ca2Var, ga2 ga2Var4) {
        this.f2849c = ga2Var;
        this.f2850d = ga2Var2;
        this.f2851e = ga2Var3;
        this.f2852f = lk0Var;
        this.f2848b = w92Var;
        this.f2853g = ca2Var;
        this.h = ga2Var4;
    }
}
