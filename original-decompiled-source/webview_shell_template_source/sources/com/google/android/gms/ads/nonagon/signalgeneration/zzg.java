package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.bd0;
import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.oc0;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.x92;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzg implements x92 {
    private final ga2 zza;
    private final ga2 zzb;

    public zzg(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3, ga2 ga2Var4) {
        this.zza = ga2Var;
        this.zzb = ga2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.zza).a();
        ln lnVar = new ln();
        sn snVar = zn.f11349a;
        return new zzf(contextA, lnVar, com.google.android.gms.ads.internal.client.zzbe.zza().a(), ((bd0) this.zzb).a());
    }
}
