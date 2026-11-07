package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.kn0;
import com.google.android.gms.internal.ads.tn0;
import com.google.android.gms.internal.ads.x92;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbf implements x92 {
    private final ga2 zza;
    private final ga2 zzb;
    private final ga2 zzc;

    public zzbf(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3, ga2 ga2Var4) {
        this.zza = ga2Var;
        this.zzb = ga2Var2;
        this.zzc = ga2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        tn0 tn0Var = (zzw) this.zza.zzb();
        tn0 tn0Var2 = (zzbm) this.zzb.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            tn0Var = tn0Var2;
        }
        return new kn0(tn0Var, h70Var);
    }
}
