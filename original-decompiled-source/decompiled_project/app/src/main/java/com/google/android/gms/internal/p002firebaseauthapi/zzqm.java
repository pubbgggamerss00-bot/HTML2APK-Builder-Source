package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import k3.b;

/* loaded from: classes2.dex */
final class zzqm {
    private final Class<?> zza;
    private final Class<? extends zzqi> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqm)) {
            return false;
        }
        zzqm zzqmVar = (zzqm) obj;
        return zzqmVar.zza.equals(this.zza) && zzqmVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return b.a(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzqm(Class<?> cls, Class<? extends zzqi> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
