package com.google.android.recaptcha.internal;

import android.os.Build;
import pg.f0;
import qg.o;
import qg.p;

/* loaded from: classes2.dex */
public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(str);
        return (zzth) zztgVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, tg.e eVar) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        zztf zztfVarZzf = zzti.zzf();
        zzth zzthVarZzg = zzg(Build.MANUFACTURER);
        zzth zzthVarZzg2 = zzg(Build.MODEL);
        zzth zzthVarZzg3 = zzg(Build.DEVICE);
        zzth zzthVarZzg4 = zzg(Build.HARDWARE);
        zzth zzthVarZzg5 = zzg(Build.FINGERPRINT);
        zzth zzthVarZzg6 = zzg(Build.PRODUCT);
        zzth zzthVarZzg7 = zzg(Build.BOARD);
        zzth zzthVarZzg8 = zzg(Build.BRAND);
        zzth zzthVarZzg9 = zzg(o.x(56, Build.SUPPORTED_ABIS));
        long j10 = Build.TIME;
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzv(j10);
        zztfVarZzf.zze(p.j(zzthVarZzg, zzthVarZzg2, zzthVarZzg3, zzthVarZzg4, zzthVarZzg5, zzthVarZzg6, zzthVarZzg7, zzthVarZzg8, zzthVarZzg9, (zzth) zztgVarZzf.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)));
        zzenVarZzb.zza();
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, tg.e eVar) {
        zzz.zzc(this).zza();
        return f0.f21461a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
