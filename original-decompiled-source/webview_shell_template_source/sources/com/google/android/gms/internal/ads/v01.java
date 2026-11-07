package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v01 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f9681b;

    /* renamed from: c, reason: collision with root package name */
    public final y92 f9682c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9683d;

    public v01(w92 w92Var, w92 w92Var2, y92 y92Var) {
        this.f9680a = 2;
        this.f9681b = w92Var;
        this.f9683d = w92Var2;
        this.f9682c = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9680a) {
            case 0:
                return new u01((Context) this.f9681b.zzb(), (wh0) this.f9682c.f10908a, (Executor) this.f9683d.zzb());
            case 1:
                return new x11((Context) this.f9681b.zzb(), (uo0) this.f9682c.f10908a, ((bd0) this.f9683d).a());
            default:
                return new i31((Context) this.f9681b.zzb(), (Executor) this.f9683d.zzb(), (us0) this.f9682c.f10908a);
        }
    }

    public /* synthetic */ v01(w92 w92Var, y92 y92Var, ca2 ca2Var, int i6) {
        this.f9680a = i6;
        this.f9681b = w92Var;
        this.f9682c = y92Var;
        this.f9683d = ca2Var;
    }
}
