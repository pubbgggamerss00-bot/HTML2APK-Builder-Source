package com.google.android.gms.ads.internal.util;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbx {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbx(long j6) {
        this.zza = j6;
    }

    public final void zza(long j6) {
        synchronized (this.zzc) {
            this.zza = j6;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            try {
                long jB = com.google.android.gms.ads.internal.zzv.zzC().b();
                if (this.zzb + this.zza > jB) {
                    return false;
                }
                this.zzb = jB;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
