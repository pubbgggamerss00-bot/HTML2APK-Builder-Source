package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.gms.internal.ads.h20;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final e f11694b = this;

    /* renamed from: c, reason: collision with root package name */
    public final f f11695c;

    /* renamed from: d, reason: collision with root package name */
    public final y8 f11696d;

    /* renamed from: e, reason: collision with root package name */
    public final y8 f11697e;

    /* renamed from: f, reason: collision with root package name */
    public final y8 f11698f;

    /* renamed from: g, reason: collision with root package name */
    public final y8 f11699g;
    public final i h;

    /* renamed from: i, reason: collision with root package name */
    public final y8 f11700i;

    /* renamed from: j, reason: collision with root package name */
    public final y8 f11701j;

    public e(Application application) {
        f fVar = new f(3, application);
        this.f11695c = fVar;
        y8 y8VarA = y8.a(new com.google.android.gms.ads.internal.overlay.i(1, fVar));
        this.f11696d = y8VarA;
        y8 y8VarA2 = y8.a(d.f11670a);
        this.f11697e = y8VarA2;
        y8 y8VarA3 = y8.a(new com.google.android.gms.ads.internal.overlay.i(2, new com.google.android.gms.ads.nonagon.signalgeneration.d(this)));
        this.f11698f = y8VarA3;
        a5 a5Var = new a5(fVar, y8VarA, 1);
        y8 y8VarA4 = y8.a(new h2(6));
        this.f11699g = y8VarA4;
        i iVar = new i(fVar, y8VarA, y8.a(new a5(fVar, y8.a(new i2.h(fVar)), 0)));
        this.h = iVar;
        y8 y8VarA5 = y8.a(new androidx.camera.view.b(y8VarA2, fVar, y8.a(new b6.v(3, fVar)), 4, false));
        this.f11700i = y8VarA5;
        this.f11701j = y8.a(new p2.g(y8VarA, new d9(fVar, y8VarA2, y8VarA, y8VarA3, a5Var, new h20(y8VarA4, iVar, y8VarA, y8VarA5), y8VarA4, y8VarA5), y8VarA3, y8VarA5));
    }

    @Override // com.google.android.gms.internal.consent_sdk.a
    public final t3 b() {
        return (t3) this.f11701j.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.a
    public final r c() {
        return (r) this.f11698f.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.a
    public final g0 d() {
        return (g0) this.f11700i.zzb();
    }
}
