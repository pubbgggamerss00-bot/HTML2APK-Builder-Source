package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzcs extends vg.c {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzcv zzf;
    int zzg;
    String zzh;
    zzch zzi;
    zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcv zzcvVar, tg.e eVar) {
        super(eVar);
        this.zzf = zzcvVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= PKIFailureInfo.systemUnavail;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}
