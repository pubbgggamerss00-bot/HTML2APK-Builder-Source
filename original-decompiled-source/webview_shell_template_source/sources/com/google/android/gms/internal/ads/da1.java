package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class da1 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final y92 f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3822b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f3823c;

    /* renamed from: d, reason: collision with root package name */
    public final li0 f3824d;

    /* renamed from: e, reason: collision with root package name */
    public final w92 f3825e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f3826f;

    public da1(y92 y92Var, w92 w92Var, y92 y92Var2, li0 li0Var, w92 w92Var2, bd0 bd0Var) {
        this.f3821a = y92Var;
        this.f3822b = w92Var;
        this.f3823c = y92Var2;
        this.f3824d = li0Var;
        this.f3825e = w92Var2;
        this.f3826f = bd0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        return new ca1((Context) this.f3821a.f10908a, (Executor) this.f3822b.zzb(), (hc0) this.f3823c.zzb(), this.f3824d.c(), (ba1) this.f3825e.zzb(), new dc1(), ((bd0) this.f3826f).a());
    }
}
