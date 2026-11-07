package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.ads.h20;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d9 implements z8 {
    public final f s;

    /* renamed from: t, reason: collision with root package name */
    public final y8 f11687t;

    /* renamed from: u, reason: collision with root package name */
    public final y8 f11688u;

    /* renamed from: v, reason: collision with root package name */
    public final y8 f11689v;

    /* renamed from: w, reason: collision with root package name */
    public final a5 f11690w;

    /* renamed from: x, reason: collision with root package name */
    public final h20 f11691x;

    /* renamed from: y, reason: collision with root package name */
    public final y8 f11692y;

    /* renamed from: z, reason: collision with root package name */
    public final y8 f11693z;

    public d9(f fVar, y8 y8Var, y8 y8Var2, y8 y8Var3, a5 a5Var, h20 h20Var, y8 y8Var4, y8 y8Var5) {
        this.s = fVar;
        this.f11687t = y8Var;
        this.f11688u = y8Var2;
        this.f11689v = y8Var3;
        this.f11690w = a5Var;
        this.f11691x = h20Var;
        this.f11692y = y8Var4;
        this.f11693z = y8Var5;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c9 zzb() {
        Application application = (Application) this.s.f11718t;
        Handler handler = m0.f11819a;
        l2.a(handler);
        l0 l0Var = m0.f11820b;
        l2.a(l0Var);
        return new c9(application, handler, l0Var, (j) this.f11688u.zzb(), (r) this.f11689v.zzb(), this.f11690w.a(), this.f11691x.zzb(), (b1) this.f11692y.zzb(), (g0) this.f11693z.zzb());
    }
}
