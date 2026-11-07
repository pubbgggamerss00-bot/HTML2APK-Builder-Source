package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzby extends vg.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzcb zzc;
    int zzd;
    zzcb zze;
    zzje zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzcb zzcbVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzcbVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return this.zzc.zza(null, this);
    }
}
