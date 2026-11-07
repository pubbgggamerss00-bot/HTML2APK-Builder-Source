package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzq {
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzq(QueryInfo queryInfo, String str, long j6, int i6) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j6;
        this.zzd = i6;
    }

    public final int zza() {
        return this.zzd;
    }

    public final QueryInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        return this.zzc <= com.google.android.gms.ads.internal.zzv.zzC().a();
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}
