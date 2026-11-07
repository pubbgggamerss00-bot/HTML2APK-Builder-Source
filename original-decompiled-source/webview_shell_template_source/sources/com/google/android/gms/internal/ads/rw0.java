package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rw0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f8719a;

    /* renamed from: b, reason: collision with root package name */
    public final gf0 f8720b;

    /* renamed from: c, reason: collision with root package name */
    public final zx0 f8721c;

    public rw0(w92 w92Var, gf0 gf0Var, zx0 zx0Var) {
        this.f8719a = w92Var;
        this.f8720b = gf0Var;
        this.f8721c = zx0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qw0 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8719a.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        h70 h70Var2 = i70.f5587b;
        ih1.j(h70Var2);
        Context contextA = ((oc0) this.f8720b.f5025b).a();
        ih1.j(h70Var);
        return new qw0(scheduledExecutorService, h70Var, h70Var2, new cx0(contextA, h70Var), w92.a(new da2(this.f8721c)));
    }
}
