package com.google.android.gms.internal.play_billing;

import i8.n;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    public zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : n.d("tag=[", String.valueOf(zzpVar.zza), "]");
    }
}
