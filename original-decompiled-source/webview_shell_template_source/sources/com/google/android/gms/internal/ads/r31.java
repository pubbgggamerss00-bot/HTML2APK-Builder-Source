package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r31 implements zzg {
    public final nk0 s;

    /* renamed from: t, reason: collision with root package name */
    public final yk0 f8531t;

    /* renamed from: u, reason: collision with root package name */
    public final pn0 f8532u;

    /* renamed from: v, reason: collision with root package name */
    public final ln0 f8533v;

    /* renamed from: w, reason: collision with root package name */
    public final lg0 f8534w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f8535x = new AtomicBoolean(false);

    public r31(nk0 nk0Var, yk0 yk0Var, pn0 pn0Var, ln0 ln0Var, lg0 lg0Var) {
        this.s = nk0Var;
        this.f8531t = yk0Var;
        this.f8532u = pn0Var;
        this.f8533v = ln0Var;
        this.f8534w = lg0Var;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.f8535x.compareAndSet(false, true)) {
            this.f8534w.zzr();
            this.f8533v.p0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.f8535x.get()) {
            this.s.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.f8535x.get()) {
            this.f8531t.zza();
            this.f8532u.zza();
        }
    }
}
