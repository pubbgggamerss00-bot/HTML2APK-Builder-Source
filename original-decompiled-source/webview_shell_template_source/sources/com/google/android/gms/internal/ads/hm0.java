package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hm0 implements yl0 {
    public int s = ((Integer) zzbe.zzc().a(zn.f11454p1)).intValue();

    /* renamed from: t, reason: collision with root package name */
    public int f5446t = ((Integer) zzbe.zzc().a(zn.Ic)).intValue();

    @Override // com.google.android.gms.internal.ads.yl0
    public final synchronized void b0(ac1 ac1Var) {
        if (((Boolean) zzbe.zzc().a(zn.f11461q1)).booleanValue()) {
            try {
                vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
                this.s = vb1Var.f9775c;
                this.f5446t = vb1Var.f9776d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
    }
}
