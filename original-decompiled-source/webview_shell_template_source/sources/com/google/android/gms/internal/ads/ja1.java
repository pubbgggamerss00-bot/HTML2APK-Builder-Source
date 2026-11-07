package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ja1 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final y92 f5994a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5995b;

    /* renamed from: c, reason: collision with root package name */
    public final y92 f5996c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final w92 f5998e;

    /* renamed from: f, reason: collision with root package name */
    public final w92 f5999f;

    /* renamed from: g, reason: collision with root package name */
    public final w92 f6000g;

    public ja1(y92 y92Var, w92 w92Var, y92 y92Var2, y92 y92Var3, w92 w92Var2, w92 w92Var3, w92 w92Var4) {
        this.f5994a = y92Var;
        this.f5995b = w92Var;
        this.f5996c = y92Var2;
        this.f5997d = y92Var3;
        this.f5998e = w92Var2;
        this.f5999f = w92Var3;
        this.f6000g = w92Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        return new ia1((Context) this.f5994a.f10908a, (Executor) this.f5995b.zzb(), (zzs) this.f5996c.f10908a, (hc0) this.f5997d.zzb(), (j41) this.f5998e.zzb(), (l41) this.f5999f.zzb(), new dc1(), (hm0) this.f6000g.zzb());
    }
}
