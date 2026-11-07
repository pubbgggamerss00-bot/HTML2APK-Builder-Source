package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements z8 {
    public final f s;

    /* renamed from: t, reason: collision with root package name */
    public final y8 f11771t;

    /* renamed from: u, reason: collision with root package name */
    public final y8 f11772u;

    public i(f fVar, y8 y8Var, y8 y8Var2) {
        this.s = fVar;
        this.f11771t = y8Var;
        this.f11772u = y8Var2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h zzb() {
        Application application = (Application) this.s.f11718t;
        j jVar = (j) this.f11771t.zzb();
        n4 n4Var = (n4) this.f11772u.zzb();
        l0 l0Var = m0.f11820b;
        l2.a(l0Var);
        return new h(application, jVar, n4Var, l0Var);
    }
}
