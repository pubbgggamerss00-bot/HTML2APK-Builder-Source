package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v90 extends s90 {
    @Override // com.google.android.gms.internal.ads.s90
    public final boolean p(String str) {
        String strZzf = zzf.zzf(str);
        p80 p80Var = (p80) this.f8853u.get();
        if (p80Var != null && strZzf != null) {
            p80Var.b0(strZzf, this);
        }
        zzo.zzj("VideoStreamNoopCache is doing nothing.");
        j(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void i() {
    }
}
