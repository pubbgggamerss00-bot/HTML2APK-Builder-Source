package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbl;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zx0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11595a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f11596b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f11597c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f11598d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f11599e;

    /* renamed from: f, reason: collision with root package name */
    public final ca2 f11600f;

    public zx0(oc0 oc0Var, yc0 yc0Var, ue0 ue0Var, w92 w92Var, w92 w92Var2) {
        this.f11596b = oc0Var;
        this.f11597c = yc0Var;
        this.f11600f = ue0Var;
        this.f11598d = w92Var;
        this.f11599e = w92Var2;
    }

    public d11 a() {
        wh0 wh0Var = (wh0) ((y92) this.f11598d).f10908a;
        r01 r01VarA = ((au0) this.f11599e).a();
        qk0 qk0Var = (qk0) ((w92) this.f11600f).zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11596b.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new d11(wh0Var, r01VarA, qk0Var, scheduledExecutorService, h70Var, (zt0) this.f11597c.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f11595a) {
            case 0:
                Context contextA = ((oc0) this.f11596b).a();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                ed0 ed0Var = new ed0(14);
                hc0 hc0Var = (hc0) ((yc0) this.f11597c).f10917a.f10908a;
                ih1.j(hc0Var);
                xj1 xj1Var = new xj1(16, ((hd0) ((ue0) this.f11600f).f9545b).zzb());
                ArrayDeque arrayDeque = (ArrayDeque) this.f11598d.zzb();
                new f0(26);
                return new yx0(contextA, h70Var, ed0Var, hc0Var, xj1Var, arrayDeque, (ie1) this.f11599e.zzb());
            case 1:
                return a();
            default:
                return new e41((Context) this.f11596b.zzb(), (zzbl) ((so0) this.f11597c).f8984a.f8673t, ((lk0) this.f11598d).a(), ((ih0) ((rc0) this.f11600f).f8608b).zzb(), (cu0) this.f11599e.zzb());
        }
    }

    public zx0(w92 w92Var, so0 so0Var, lk0 lk0Var, rc0 rc0Var, w92 w92Var2) {
        this.f11596b = w92Var;
        this.f11597c = so0Var;
        this.f11598d = lk0Var;
        this.f11600f = rc0Var;
        this.f11599e = w92Var2;
    }

    public zx0(y92 y92Var, au0 au0Var, w92 w92Var, w92 w92Var2, w92 w92Var3) {
        this.f11598d = y92Var;
        this.f11599e = au0Var;
        this.f11600f = w92Var;
        this.f11596b = w92Var2;
        this.f11597c = w92Var3;
    }
}
