package com.google.android.gms.internal.location;

import android.os.DeadObjectException;

/* loaded from: classes2.dex */
final class zzh implements zzbg<zzam> {
    final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    public final zzam zza() throws DeadObjectException {
        return (zzam) this.zza.getService();
    }
}
