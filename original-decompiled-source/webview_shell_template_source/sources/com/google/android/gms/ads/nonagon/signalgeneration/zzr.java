package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.oc0;
import com.google.android.gms.internal.ads.x92;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzr implements x92 {
    private final ga2 zza;
    private final ga2 zzb;

    public zzr(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3) {
        this.zza = ga2Var;
        this.zzb = ga2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.zza).a();
        fu0 fu0Var = (fu0) this.zzb.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new zzo(contextA, fu0Var, h70Var);
    }
}
