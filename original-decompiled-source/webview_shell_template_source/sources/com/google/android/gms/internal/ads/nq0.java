package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nq0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final rc0 f7489a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f7490b;

    public nq0(rc0 rc0Var, w92 w92Var) {
        this.f7489a = rc0Var;
        this.f7490b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        return new kn0(new os0(((qc0) this.f7489a.f8608b).a()), (Executor) this.f7490b.zzb());
    }
}
