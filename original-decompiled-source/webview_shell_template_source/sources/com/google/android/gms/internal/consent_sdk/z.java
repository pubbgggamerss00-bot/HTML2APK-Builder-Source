package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z implements z8 {
    public final a9 s;

    /* renamed from: t, reason: collision with root package name */
    public final y8 f11955t;

    /* renamed from: u, reason: collision with root package name */
    public final a9 f11956u;

    /* renamed from: v, reason: collision with root package name */
    public final a9 f11957v;

    /* renamed from: w, reason: collision with root package name */
    public final o7 f11958w;

    /* renamed from: x, reason: collision with root package name */
    public final a9 f11959x;

    public z(f fVar, y8 y8Var, y8 y8Var2, i iVar, o7 o7Var, y8 y8Var3) {
        this.s = fVar;
        this.f11955t = y8Var;
        this.f11956u = y8Var2;
        this.f11957v = iVar;
        this.f11958w = o7Var;
        this.f11959x = y8Var3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y zzb() {
        Application application = (Application) this.s.zzb();
        w wVar = (w) this.f11955t.zzb();
        Handler handler = m0.f11819a;
        l2.a(handler);
        l0 l0Var = m0.f11820b;
        l2.a(l0Var);
        return new y(application, wVar, handler, l0Var, (b1) this.f11956u.zzb(), ((i) this.f11957v).zzb(), (n) this.f11958w.zzb(), (j) this.f11959x.zzb());
    }
}
