package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ki0 implements jl0, bi {
    public final tb1 s;

    /* renamed from: t, reason: collision with root package name */
    public final yk0 f6430t;

    /* renamed from: u, reason: collision with root package name */
    public final nl0 f6431u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f6432v = new AtomicBoolean();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f6433w = new AtomicBoolean();

    public ki0(tb1 tb1Var, yk0 yk0Var, nl0 nl0Var) {
        this.s = tb1Var;
        this.f6430t = yk0Var;
        this.f6431u = nl0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        if (this.s.f9179e == 1 && aiVar.f2772j && this.f6432v.compareAndSet(false, true)) {
            this.f6430t.zza();
        }
        if (aiVar.f2772j && this.f6433w.compareAndSet(false, true)) {
            nl0 nl0Var = this.f6431u;
            synchronized (nl0Var) {
                nl0Var.o0(new ed0(17));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final synchronized void t() {
        if (this.s.f9179e != 1) {
            if (this.f6432v.compareAndSet(false, true)) {
                this.f6430t.zza();
            }
        }
    }
}
