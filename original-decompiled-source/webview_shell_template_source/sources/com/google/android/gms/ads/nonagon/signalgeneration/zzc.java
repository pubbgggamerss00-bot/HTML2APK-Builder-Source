package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.oc0;
import com.google.android.gms.internal.ads.x92;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzc implements x92 {
    private final ga2 zza;
    private final ga2 zzb;
    private final ga2 zzc;
    private final ga2 zzd;
    private final ga2 zze;

    public zzc(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3, ga2 ga2Var4, ga2 ga2Var5) {
        this.zza = ga2Var;
        this.zzb = ga2Var2;
        this.zzc = ga2Var3;
        this.zzd = ga2Var4;
        this.zze = ga2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzb(((oc0) this.zza).a(), ((Long) this.zzb.zzb()).longValue(), (PackageInfo) this.zzc.zzb(), (zzd) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb());
    }
}
