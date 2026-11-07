package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import k3.b;

/* loaded from: classes2.dex */
final class zzqa {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa zzqaVar = (zzqa) obj;
        return zzqaVar.zza.equals(this.zza) && zzqaVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return b.a(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }

    private zzqa(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
