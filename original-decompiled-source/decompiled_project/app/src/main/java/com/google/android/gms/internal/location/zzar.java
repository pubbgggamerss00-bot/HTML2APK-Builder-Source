package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import hb.f;
import hb.s;

/* loaded from: classes2.dex */
final class zzar extends s {
    private final l<f> zza;

    public zzar(l<f> lVar) {
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        l<f> lVar = this.zza;
        lVar.f6010b = null;
        lVar.f6011c = null;
    }

    @Override // hb.u
    public final void zzd(LocationResult locationResult) {
        this.zza.a(new zzap(this, locationResult));
    }

    @Override // hb.u
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.a(new zzaq(this, locationAvailability));
    }
}
