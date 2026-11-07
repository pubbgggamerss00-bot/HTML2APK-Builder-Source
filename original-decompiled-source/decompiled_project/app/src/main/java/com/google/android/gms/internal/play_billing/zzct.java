package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class zzct implements Runnable {
    final Future zza;
    final zzcs zzb;

    public zzct(Future future, zzcs zzcsVar) {
        this.zza = future;
        this.zzb = zzcsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzdf) && (thZza = zzdg.zza((zzdf) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(zzbj.zza("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            Future future2 = future;
            while (true) {
                try {
                    obj = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future2 = future2;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th3) {
            this.zzb.zza(th3);
        }
    }

    public final String toString() {
        zzbc zzbcVarZza = zzbe.zza(this);
        zzbcVarZza.zza(this.zzb);
        return zzbcVarZza.toString();
    }
}
