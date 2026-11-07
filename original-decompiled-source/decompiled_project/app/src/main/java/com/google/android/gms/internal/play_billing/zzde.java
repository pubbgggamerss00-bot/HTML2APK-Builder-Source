package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcj;
import i8.n;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzde extends zzcq {
    private zzcz zzd;
    private ScheduledFuture zze;

    private zzde(zzcz zzczVar) {
        this.zzd = zzczVar;
    }

    public static zzcz zzs(zzcz zzczVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzde zzdeVar = new zzde(zzczVar);
        zzdb zzdbVar = new zzdb(zzdeVar);
        zzdeVar.zze = scheduledExecutorService.schedule(zzdbVar, 28500L, timeUnit);
        zzczVar.zzb(zzdbVar, zzcp.INSTANCE);
        return zzdeVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final String zzd() {
        zzcz zzczVar = this.zzd;
        ScheduledFuture scheduledFuture = this.zze;
        if (zzczVar == null) {
            return null;
        }
        String strD = n.d("inputFuture=[", zzczVar.toString(), "]");
        if (scheduledFuture == null) {
            return strD;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strD;
        }
        return strD + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final void zzg() {
        zzcz zzczVar = this.zzd;
        if ((this.valueField instanceof zzcj.zza) & (zzczVar != null)) {
            Object obj = this.valueField;
            zzczVar.cancel((obj instanceof zzcj.zza) && ((zzcj.zza) obj).zzc);
        }
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzd = null;
        this.zze = null;
    }
}
