package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tl0 extends pm0 implements al0, pl0 {

    /* renamed from: t, reason: collision with root package name */
    public final tb1 f9344t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f9345u;

    public tl0(Set set, tb1 tb1Var) {
        super(set);
        this.f9345u = new AtomicBoolean();
        this.f9344t = tb1Var;
    }

    public final void p0() {
        zzu zzuVar;
        if (((Boolean) zzbe.zzc().a(zn.I7)).booleanValue() && this.f9345u.compareAndSet(false, true) && (zzuVar = this.f9344t.f9180e0) != null && zzuVar.zza == 3) {
            o0(new ck1(3, zzuVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.pl0
    public final void zzg() {
        if (this.f9344t.f9173b == 1) {
            p0();
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        int i6 = this.f9344t.f9173b;
        if (i6 == 2 || i6 == 5 || i6 == 4 || i6 == 6 || i6 == 7) {
            p0();
        }
    }
}
