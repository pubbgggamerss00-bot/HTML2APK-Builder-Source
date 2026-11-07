package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a5 implements z8 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final f f11628t;

    /* renamed from: u, reason: collision with root package name */
    public final y8 f11629u;

    public /* synthetic */ a5(f fVar, y8 y8Var, int i6) {
        this.s = i6;
        this.f11628t = fVar;
        this.f11629u = y8Var;
    }

    public j5 a() {
        return new j5((Application) this.f11628t.f11718t, (j) this.f11629u.zzb());
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public final Object zzb() {
        switch (this.s) {
            case 0:
                return new n4((Application) this.f11628t.f11718t, (g) this.f11629u.zzb());
            default:
                return a();
        }
    }
}
