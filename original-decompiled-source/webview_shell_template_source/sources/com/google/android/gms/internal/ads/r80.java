package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r80 implements Runnable {
    public final f80 s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8582t = false;

    public r80(f80 f80Var) {
        this.s = f80Var;
    }

    public final void a() {
        this.f8582t = true;
        this.s.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8582t) {
            return;
        }
        this.s.l();
        uj1 uj1Var = zzs.zza;
        uj1Var.removeCallbacks(this);
        uj1Var.postDelayed(this, 250L);
    }
}
