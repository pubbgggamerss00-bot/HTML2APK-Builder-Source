package com.google.android.gms.internal.fido;

import i8.n;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzbs implements Serializable, zzbp {
    final Object zza;

    public zzbs(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbs) {
            return zzbk.zza(this.zza, ((zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return n.d("Suppliers.ofInstance(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        return this.zza;
    }
}
