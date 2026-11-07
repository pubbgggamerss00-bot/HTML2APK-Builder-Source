package com.google.android.gms.internal.p002firebaseauthapi;

import i8.n;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaae {
    private final byte[] zza;

    private zzaae(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaae) {
            return Arrays.equals(((zzaae) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return n.d("Bytes(", zzzr.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzaae zza(byte[] bArr) {
        if (bArr != null) {
            return zza(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzaae zza(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i11 > bArr.length) {
                i11 = bArr.length;
            }
            return new zzaae(bArr, 0, i11);
        }
        throw new NullPointerException("data must be non-null");
    }
}
