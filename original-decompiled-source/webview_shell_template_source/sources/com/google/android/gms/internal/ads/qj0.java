package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8400a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8401b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8402c;

    public /* synthetic */ qj0(w92 w92Var, w92 w92Var2, int i6) {
        this.f8400a = i6;
        this.f8401b = w92Var;
        this.f8402c = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8400a) {
            case 0:
                return new kn0((bm0) this.f8401b.zzb(), (Executor) this.f8402c.zzb());
            case 1:
                return new kn0((bm0) this.f8401b.zzb(), (Executor) this.f8402c.zzb());
            default:
                c5.a aVar = (c5.a) this.f8401b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new e51(aVar, h70Var, (ScheduledExecutorService) this.f8402c.zzb());
        }
    }
}
