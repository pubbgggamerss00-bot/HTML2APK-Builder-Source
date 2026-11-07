package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ly0 implements jl0, rk0 {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f6876u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static int f6877v;
    public final zzg s;

    /* renamed from: t, reason: collision with root package name */
    public final ry0 f6878t;

    public ly0(ry0 ry0Var, zzj zzjVar) {
        this.f6878t = ry0Var;
        this.s = zzjVar;
    }

    public final void a(boolean z6) {
        int i6;
        int iIntValue;
        if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue() && !this.s.zzN()) {
            Object obj = f6876u;
            synchronized (obj) {
                i6 = f6877v;
                iIntValue = ((Integer) zzbe.zzc().a(zn.f11372c6)).intValue();
            }
            if (i6 < iIntValue) {
                ry0 ry0Var = this.f6878t;
                vd1 vd1VarA = ry0Var.f8735w.a(new Bundle());
                vd1VarA.addListener(new as1(0, vd1VarA, new qy0(ry0Var, z6)), i70.f5592g);
                synchronized (obj) {
                    f6877v++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        a(true);
    }
}
