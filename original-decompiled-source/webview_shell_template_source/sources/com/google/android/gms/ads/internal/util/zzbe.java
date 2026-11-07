package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.k;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String str, double d7, double d8, double d9, int i6) {
        this.zza = str;
        this.zzc = d7;
        this.zzb = d8;
        this.zzd = d9;
        this.zze = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        return com.google.android.gms.common.internal.k.a(this.zza, zzbeVar.zza) && this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc && this.zze == zzbeVar.zze && Double.compare(this.zzd, zzbeVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        k.a aVar = new k.a(this);
        aVar.a("name", this.zza);
        aVar.a("minBound", Double.valueOf(this.zzc));
        aVar.a("maxBound", Double.valueOf(this.zzb));
        aVar.a("percent", Double.valueOf(this.zzd));
        aVar.a("count", Integer.valueOf(this.zze));
        return aVar.toString();
    }
}
