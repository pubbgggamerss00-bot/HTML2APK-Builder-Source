package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class td0 implements su0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9231a;

    /* renamed from: b, reason: collision with root package name */
    public final uu f9232b;

    /* renamed from: c, reason: collision with root package name */
    public final kd0 f9233c;

    /* renamed from: d, reason: collision with root package name */
    public final td0 f9234d = this;

    /* renamed from: e, reason: collision with root package name */
    public final w92 f9235e;

    public /* synthetic */ td0(kd0 kd0Var, Context context, uu uuVar) {
        this.f9233c = kd0Var;
        this.f9231a = context;
        this.f9232b = uuVar;
        this.f9235e = w92.b(new th0(y92.a(this), new qi0(4, y92.a(uuVar)), 5));
    }

    @Override // com.google.android.gms.internal.ads.su0
    public final eu zzb() {
        eu euVar = new eu();
        euVar.f4395t = this.f9233c;
        euVar.f4396u = this.f9234d;
        return euVar;
    }
}
