package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i10, int i11, Throwable th2) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th2;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i11);
        zztdVarZzf.zzr(i10);
        this.zzb = zztdVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
