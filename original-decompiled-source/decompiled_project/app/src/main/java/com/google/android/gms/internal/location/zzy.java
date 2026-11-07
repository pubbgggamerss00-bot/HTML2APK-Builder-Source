package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: classes2.dex */
final class zzy extends zzah {
    private final e<Status> zza;

    public zzy(e<Status> eVar) {
        this.zza = eVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        this.zza.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
