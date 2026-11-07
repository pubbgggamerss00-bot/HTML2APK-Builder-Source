package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzdj extends vg.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, tg.e eVar) {
        super(eVar);
        this.zzc = zzdtVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return this.zzc.zzv(null, 0L, this);
    }
}
