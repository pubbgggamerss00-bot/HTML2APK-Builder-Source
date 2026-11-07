package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a11 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2541a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f2542b;

    /* renamed from: c, reason: collision with root package name */
    public final y92 f2543c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f2544d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f2545e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f2546f;

    public a11(w92 w92Var, w92 w92Var2, y92 y92Var, w92 w92Var3, w92 w92Var4) {
        this.f2542b = w92Var;
        this.f2544d = w92Var2;
        this.f2543c = y92Var;
        this.f2545e = w92Var3;
        this.f2546f = w92Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2541a) {
            case 0:
                return new z01((Context) this.f2542b.zzb(), (Executor) this.f2544d.zzb(), (go0) this.f2543c.f10908a, (sb1) this.f2545e.zzb(), (cu0) this.f2546f.zzb());
            default:
                return new s31((Context) this.f2542b.zzb(), (wh0) this.f2543c.f10908a, (ae1) ((w92) this.f2545e).zzb(), (hs1) this.f2544d.zzb(), (to) ((v31) ((cd0) this.f2546f).f3521b).f9702t);
        }
    }

    public a11(w92 w92Var, y92 y92Var, w92 w92Var2, w92 w92Var3, cd0 cd0Var) {
        this.f2542b = w92Var;
        this.f2543c = y92Var;
        this.f2545e = w92Var2;
        this.f2544d = w92Var3;
        this.f2546f = cd0Var;
    }
}
