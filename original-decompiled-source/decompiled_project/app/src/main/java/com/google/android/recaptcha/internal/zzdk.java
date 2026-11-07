package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class zzdk extends vg.c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdt zzdtVar, tg.e eVar) {
        super(eVar);
        this.zzb = zzdtVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        return this.zzb.zzn(null, 0L, this);
    }
}
