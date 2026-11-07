package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements z8 {
    public final a9 s;

    /* renamed from: t, reason: collision with root package name */
    public final a9 f11852t;

    /* renamed from: u, reason: collision with root package name */
    public final y8 f11853u;

    /* renamed from: v, reason: collision with root package name */
    public final a9 f11854v;

    /* renamed from: w, reason: collision with root package name */
    public final f f11855w;

    /* renamed from: x, reason: collision with root package name */
    public final v f11856x;

    /* renamed from: y, reason: collision with root package name */
    public final a9 f11857y;

    public o(f fVar, y8 y8Var, y8 y8Var2, y8 y8Var3, f fVar2, v vVar, y8 y8Var4) {
        this.s = fVar;
        this.f11852t = y8Var;
        this.f11853u = y8Var2;
        this.f11854v = y8Var3;
        this.f11855w = fVar2;
        this.f11856x = vVar;
        this.f11857y = y8Var4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public final Object zzb() {
        Application application = (Application) this.s.zzb();
        return new n(application, (w) this.f11853u.zzb(), (j) this.f11854v.zzb(), (s) this.f11855w.f11718t, this.f11856x, (g0) this.f11857y.zzb());
    }
}
