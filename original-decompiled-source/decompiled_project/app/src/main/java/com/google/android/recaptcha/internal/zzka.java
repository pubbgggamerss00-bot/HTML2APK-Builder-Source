package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzka(MessageDigest messageDigest, int i10, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i10;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    public final void zza(byte[] bArr, int i10, int i11) {
        zzc();
        this.zza.update(bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i10 = this.zzb;
        if (i10 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i11 = zzjv.zzb;
            return new zzju(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i10);
        int i12 = zzjv.zzb;
        return new zzju(bArrCopyOf);
    }
}
