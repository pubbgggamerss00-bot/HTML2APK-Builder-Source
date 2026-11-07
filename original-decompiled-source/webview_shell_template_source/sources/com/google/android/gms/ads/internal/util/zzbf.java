package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbf zza(String str, double d7, double d8) {
        int i6 = 0;
        while (i6 < this.zza.size()) {
            double dDoubleValue = ((Double) this.zzc.get(i6)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i6)).doubleValue();
            if (d7 < dDoubleValue || (dDoubleValue == d7 && d8 < dDoubleValue2)) {
                break;
            }
            i6++;
        }
        this.zza.add(i6, str);
        this.zzc.add(i6, Double.valueOf(d7));
        this.zzb.add(i6, Double.valueOf(d8));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
