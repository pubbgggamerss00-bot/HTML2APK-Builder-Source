package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import k3.b;

/* loaded from: classes2.dex */
final class zzqj {
    private final Class<? extends zzqi> zza;
    private final zzaae zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza.equals(this.zza) && zzqjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return b.a(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqj(Class<? extends zzqi> cls, zzaae zzaaeVar) {
        this.zza = cls;
        this.zzb = zzaaeVar;
    }
}
