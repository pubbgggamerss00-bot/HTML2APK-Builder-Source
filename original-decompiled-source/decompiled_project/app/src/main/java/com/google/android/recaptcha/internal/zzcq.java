package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import ph.h;
import ph.r2;

/* loaded from: classes2.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j10, tg.e eVar) throws RecaptchaException, r2, com.google.android.gms.common.api.b {
        return zzcv.zzh(zza(application), str, j10, null, null, null, eVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j10) throws RecaptchaException, r2, com.google.android.gms.common.api.b {
        return zzas.zza(h.a(zza(application).zzd().zza(), null, new zzco(application, str, j10, null), 3));
    }

    public static final Object zzd(Application application, String str, tg.e eVar) throws RecaptchaException, com.google.android.gms.common.api.b {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, eVar, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, com.google.android.gms.common.api.b {
        return zzas.zza(h.a(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
