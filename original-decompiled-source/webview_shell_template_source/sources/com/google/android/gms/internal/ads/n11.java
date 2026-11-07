package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n11 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7279a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f7280b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7281c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f7282d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f7283e;

    /* renamed from: f, reason: collision with root package name */
    public final y92 f7284f;

    /* renamed from: g, reason: collision with root package name */
    public final w92 f7285g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ga2 f7286i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f7287j;

    public /* synthetic */ n11(w92 w92Var, bd0 bd0Var, lk0 lk0Var, w92 w92Var2, y92 y92Var, w92 w92Var3, w92 w92Var4, w92 w92Var5, w92 w92Var6, int i6) {
        this.f7279a = i6;
        this.f7280b = w92Var;
        this.f7281c = bd0Var;
        this.f7282d = lk0Var;
        this.f7283e = w92Var2;
        this.f7284f = y92Var;
        this.f7285g = w92Var3;
        this.h = w92Var4;
        this.f7286i = w92Var5;
        this.f7287j = w92Var6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7279a) {
            case 0:
                return new l11((Context) this.f7280b.zzb(), ((bd0) this.f7281c).a(), ((lk0) this.f7282d).a(), (Executor) this.f7283e.zzb(), (go0) this.f7284f.f10908a, (ct0) this.f7285g.zzb(), new bu(), (oz0) this.h.zzb(), (zt0) this.f7286i.zzb(), (cu0) this.f7287j.zzb());
            default:
                return new e31((Context) this.f7280b.zzb(), ((bd0) this.f7281c).a(), ((lk0) this.f7282d).a(), (Executor) this.f7283e.zzb(), (us0) this.f7284f.f10908a, (ct0) this.f7285g.zzb(), new bu(), (oz0) this.h.zzb(), (zt0) this.f7286i.zzb(), (cu0) this.f7287j.zzb());
        }
    }
}
