package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cj0 implements zzr {
    public final fl0 s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f3602t = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f3603u = new AtomicBoolean(false);

    public cj0(fl0 fl0Var) {
        this.s = fl0Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        AtomicBoolean atomicBoolean = this.f3603u;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.s.o0(new y5(22));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.s.o0(new d0(18));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        this.f3602t.set(true);
        AtomicBoolean atomicBoolean = this.f3603u;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.s.o0(new y5(22));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }
}
