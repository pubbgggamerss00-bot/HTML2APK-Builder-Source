package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import p5.g0;

/* loaded from: classes2.dex */
public final class zzoh extends zzce {
    private final zzqd zza;

    public zzoh(zzqd zzqdVar) {
        this.zza = zzqdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzqd zzqdVar = ((zzoh) obj).zza;
        return this.zza.zza().zzd().equals(zzqdVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqdVar.zza().zzf()) && this.zza.zza().zze().equals(zzqdVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i10 = zzok.zza[this.zza.zza().zzd().ordinal()];
        return g0.a("(typeUrl=", strZzf, ", outputPrefixType=", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxu.RAW;
    }

    public final zzqd zzb() {
        return this.zza;
    }
}
