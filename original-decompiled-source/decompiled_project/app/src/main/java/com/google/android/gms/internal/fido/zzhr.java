package com.google.android.gms.internal.fido;

import org.bouncycastle.asn1.BERTags;

/* loaded from: classes2.dex */
public final class zzhr {
    private final byte zza;
    private final byte zzb;

    public zzhr(int i10) {
        this.zza = (byte) (i10 & BERTags.FLAGS);
        this.zzb = (byte) (i10 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
