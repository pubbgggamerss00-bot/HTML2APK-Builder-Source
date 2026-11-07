package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8652b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8653c;

    public /* synthetic */ rj0(w92 w92Var, w92 w92Var2, int i6) {
        this.f8651a = i6;
        this.f8652b = w92Var;
        this.f8653c = w92Var2;
    }

    public k31 a() {
        return new k31((z31) this.f8652b.zzb(), (mt0) this.f8653c.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f8651a) {
            case 0:
                return new kn0((bm0) this.f8652b.zzb(), (Executor) this.f8653c.zzb());
            default:
                return a();
        }
    }
}
